package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseHistoryRecordExtensionsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import e6.i0;
import j1.o;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class QueryPurchaseHistoryUseCase extends BillingClientUseCase<List<? extends PurchaseHistoryRecord>> {
    private final l<PurchasesError, i0> onError;
    private final l<List<? extends PurchaseHistoryRecord>, i0> onReceive;
    private final QueryPurchaseHistoryUseCaseParams useCaseParams;
    private final l<l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<com.android.billingclient.api.b, i0> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(AtomicBoolean hasResponded, QueryPurchaseHistoryUseCase this$0, Date requestStartTime, com.android.billingclient.api.f billingResult, List list) {
            q.f(hasResponded, "$hasResponded");
            q.f(this$0, "this$0");
            q.f(requestStartTime, "$requestStartTime");
            q.f(billingResult, "billingResult");
            if (!hasResponded.getAndSet(true)) {
                this$0.trackGoogleQueryPurchaseHistoryRequestIfNeeded(this$0.useCaseParams.getProductType(), billingResult, requestStartTime);
                BillingClientUseCase.processResult$default(this$0, billingResult, list, null, null, 12, null);
            } else {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                String str = String.format(RestoreStrings.EXTRA_QUERY_PURCHASE_HISTORY_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(billingResult.b())}, 1));
                q.e(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            }
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.b bVar) {
            invoke2(bVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.b invoke) {
            i0 i0Var;
            q.f(invoke, "$this$invoke");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final Date now = QueryPurchaseHistoryUseCase.this.useCaseParams.getDateProvider().getNow();
            o oVarBuildQueryPurchaseHistoryParams = BillingClientParamBuildersKt.buildQueryPurchaseHistoryParams(QueryPurchaseHistoryUseCase.this.useCaseParams.getProductType());
            if (oVarBuildQueryPurchaseHistoryParams != null) {
                final QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase = QueryPurchaseHistoryUseCase.this;
                invoke.j(oVarBuildQueryPurchaseHistoryParams, new j1.l() { // from class: com.revenuecat.purchases.google.usecase.f
                    @Override // j1.l
                    public final void a(com.android.billingclient.api.f fVar, List list) {
                        QueryPurchaseHistoryUseCase.AnonymousClass1.invoke$lambda$1$lambda$0(atomicBoolean, queryPurchaseHistoryUseCase, now, fVar, list);
                    }
                });
                i0Var = i0.f21430a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase2 = QueryPurchaseHistoryUseCase.this;
                String str = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchaseHistory"}, 1));
                q.e(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.c().c(5).a();
                q.e(fVarA, "newBuilder()\n           …                 .build()");
                BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase2, fVarA, null, null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QueryPurchaseHistoryUseCase(QueryPurchaseHistoryUseCaseParams useCaseParams, l<? super List<? extends PurchaseHistoryRecord>, i0> onReceive, l<? super PurchasesError, i0> onError, l<? super l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient, p<? super Long, ? super l<? super PurchasesError, i0>, i0> executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        q.f(useCaseParams, "useCaseParams");
        q.f(onReceive, "onReceive");
        q.f(onError, "onError");
        q.f(withConnectedClient, "withConnectedClient");
        q.f(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackGoogleQueryPurchaseHistoryRequestIfNeeded(String str, com.android.billingclient.api.f fVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iB = fVar.b();
            String strA = fVar.a();
            q.e(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m16trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(str, iB, strA, DurationExtensionsKt.between(x6.a.f27324b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error receiving purchase history";
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<List<? extends PurchaseHistoryRecord>, i0> getOnReceive() {
        return this.onReceive;
    }

    public final l<l<? super com.android.billingclient.api.b, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(List<? extends PurchaseHistoryRecord> list) {
        i0 i0Var = null;
        List<? extends PurchaseHistoryRecord> list2 = !(list == null || list.isEmpty()) ? list : null;
        if (list2 != null) {
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                LogIntent logIntent = LogIntent.RC_PURCHASE_SUCCESS;
                String str = String.format(RestoreStrings.PURCHASE_HISTORY_RETRIEVED, Arrays.copyOf(new Object[]{PurchaseHistoryRecordExtensionsKt.toHumanReadableDescription(purchaseHistoryRecord)}, 1));
                q.e(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            }
            i0Var = i0.f21430a;
        }
        if (i0Var == null) {
            LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.PURCHASE_HISTORY_EMPTY);
        }
        l<List<? extends PurchaseHistoryRecord>, i0> lVar = this.onReceive;
        if (list == null) {
            list = f6.o.d();
        }
        lVar.invoke(list);
    }
}
