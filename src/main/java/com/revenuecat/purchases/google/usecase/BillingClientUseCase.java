package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResponse;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import e6.i0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class BillingClientUseCase<T> {
    private final boolean backoffForNetworkErrors;
    private final p<Long, l<? super PurchasesError, i0>, i0> executeRequestOnUIThread;
    private final int maxRetries;
    private final l<PurchasesError, i0> onError;
    private int retryAttempt;
    private long retryBackoffMilliseconds;
    private final UseCaseParams useCaseParams;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$processResult$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends o implements l<T, i0> {
        AnonymousClass1(Object obj) {
            super(1, obj, BillingClientUseCase.class, "onOk", "onOk(Ljava/lang/Object;)V", 0);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Object obj) {
            invoke2(obj);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(T t7) {
            ((BillingClientUseCase) this.receiver).onOk(t7);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$processResult$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends o implements l<com.android.billingclient.api.f, i0> {
        AnonymousClass2(Object obj) {
            super(1, obj, BillingClientUseCase.class, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V", 0);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.f fVar) {
            invoke2(fVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.f p02) {
            q.f(p02, "p0");
            ((BillingClientUseCase) this.receiver).forwardError(p02);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$run$1, reason: invalid class name and case insensitive filesystem */
    static final class C02701 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ BillingClientUseCase<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02701(BillingClientUseCase<T> billingClientUseCase) {
            super(1);
            this.this$0 = billingClientUseCase;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                this.this$0.executeAsync();
            } else {
                ((BillingClientUseCase) this.this$0).onError.invoke(purchasesError);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BillingClientUseCase(UseCaseParams useCaseParams, l<? super PurchasesError, i0> onError, p<? super Long, ? super l<? super PurchasesError, i0>, i0> executeRequestOnUIThread) {
        q.f(useCaseParams, "useCaseParams");
        q.f(onError, "onError");
        q.f(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onError = onError;
        this.executeRequestOnUIThread = executeRequestOnUIThread;
        this.maxRetries = 3;
        this.retryBackoffMilliseconds = 878L;
    }

    private final void backoffOrErrorIfUseInSession(l<? super com.android.billingclient.api.f, i0> lVar, com.android.billingclient.api.f fVar) {
        if (this.useCaseParams.getAppInBackground()) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, BillingStrings.BILLING_SERVICE_UNAVAILABLE_BACKGROUND);
            if (this.retryBackoffMilliseconds < BillingClientUseCaseKt.RETRY_TIMER_MAX_TIME_MILLISECONDS) {
                retryWithBackoff();
                return;
            }
        } else {
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, BillingStrings.BILLING_SERVICE_UNAVAILABLE_FOREGROUND);
        }
        lVar.invoke(fVar);
    }

    private final void backoffOrRetryNetworkError(l<? super com.android.billingclient.api.f, i0> lVar, com.android.billingclient.api.f fVar) {
        int i8;
        if (getBackoffForNetworkErrors() && this.retryBackoffMilliseconds < BillingClientUseCaseKt.RETRY_TIMER_MAX_TIME_MILLISECONDS) {
            retryWithBackoff();
        } else if (getBackoffForNetworkErrors() || (i8 = this.retryAttempt) >= this.maxRetries) {
            lVar.invoke(fVar);
        } else {
            this.retryAttempt = i8 + 1;
            executeAsync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardError(com.android.billingclient.api.f fVar) {
        String str = getErrorMessage() + " - " + BillingResultExtensionsKt.toHumanReadableDescription(fVar);
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, str);
        l<PurchasesError, i0> lVar = this.onError;
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(fVar.b(), str);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        lVar.invoke(purchasesErrorBillingResponseToPurchasesError);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        q.e(string, "stringWriter.toString()");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void processResult$default(BillingClientUseCase billingClientUseCase, com.android.billingclient.api.f fVar, Object obj, l lVar, l lVar2, int i8, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processResult");
        }
        if ((i8 & 4) != 0) {
            lVar = new AnonymousClass1(billingClientUseCase);
        }
        if ((i8 & 8) != 0) {
            lVar2 = new AnonymousClass2(billingClientUseCase);
        }
        billingClientUseCase.processResult(fVar, obj, lVar, lVar2);
    }

    private final void retryWithBackoff() {
        long j8 = this.retryBackoffMilliseconds;
        this.retryBackoffMilliseconds = Math.min(((long) 2) * j8, BillingClientUseCaseKt.RETRY_TIMER_MAX_TIME_MILLISECONDS);
        run(j8);
    }

    public static /* synthetic */ void run$default(BillingClientUseCase billingClientUseCase, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        if ((i8 & 1) != 0) {
            j8 = 0;
        }
        billingClientUseCase.run(j8);
    }

    public abstract void executeAsync();

    protected boolean getBackoffForNetworkErrors() {
        return this.backoffForNetworkErrors;
    }

    public abstract String getErrorMessage();

    public final p<Long, l<? super PurchasesError, i0>, i0> getExecuteRequestOnUIThread() {
        return this.executeRequestOnUIThread;
    }

    public abstract void onOk(T t7);

    public final void processResult(com.android.billingclient.api.f billingResult, T t7, l<? super T, i0> onSuccess, l<? super com.android.billingclient.api.f, i0> onError) {
        q.f(billingResult, "billingResult");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        BillingResponse billingResponseFromCode = BillingResponse.Companion.fromCode(billingResult.b());
        if (q.b(billingResponseFromCode, BillingResponse.OK.INSTANCE)) {
            this.retryBackoffMilliseconds = 878L;
            onSuccess.invoke(t7);
            return;
        }
        if (q.b(billingResponseFromCode, BillingResponse.ServiceDisconnected.INSTANCE)) {
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, BillingStrings.BILLING_SERVICE_DISCONNECTED);
            run$default(this, 0L, 1, null);
        } else {
            if (q.b(billingResponseFromCode, BillingResponse.ServiceUnavailable.INSTANCE)) {
                backoffOrErrorIfUseInSession(onError, billingResult);
                return;
            }
            if (q.b(billingResponseFromCode, BillingResponse.NetworkError.INSTANCE) ? true : q.b(billingResponseFromCode, BillingResponse.Error.INSTANCE)) {
                backoffOrRetryNetworkError(onError, billingResult);
            } else {
                onError.invoke(billingResult);
            }
        }
    }

    public final void run(long j8) {
        this.executeRequestOnUIThread.invoke(Long.valueOf(j8), new C02701(this));
    }

    protected final void withConnectedClient(com.android.billingclient.api.b bVar, l<? super com.android.billingclient.api.b, i0> receivingFunction) {
        q.f(receivingFunction, "receivingFunction");
        i0 i0Var = null;
        if (bVar != null) {
            if (!bVar.f()) {
                bVar = null;
            }
            if (bVar != null) {
                receivingFunction.invoke(bVar);
                i0Var = i0.f21430a;
            }
        }
        if (i0Var == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            String str = String.format(BillingStrings.BILLING_CLIENT_DISCONNECTED, Arrays.copyOf(new Object[]{getStackTrace()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }
}
