package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import e6.i0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class AcknowledgePurchaseUseCase extends BillingClientUseCase<String> {
    private final l<PurchasesError, i0> onError;
    private final l<String, i0> onReceive;
    private final AcknowledgePurchaseUseCaseParams useCaseParams;
    private final l<l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostReceiptInitiationSource.values().length];
            try {
                iArr[PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<com.android.billingclient.api.b, i0> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(AcknowledgePurchaseUseCase this$0, com.android.billingclient.api.f billingResult) {
            q.f(this$0, "this$0");
            q.f(billingResult, "billingResult");
            BillingClientUseCase.processResult$default(this$0, billingResult, this$0.useCaseParams.getPurchaseToken(), null, null, 12, null);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.b bVar) {
            invoke2(bVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.b invoke) {
            q.f(invoke, "$this$invoke");
            j1.a aVarA = j1.a.b().b(AcknowledgePurchaseUseCase.this.useCaseParams.getPurchaseToken()).a();
            q.e(aVarA, "newBuilder()\n           …\n                .build()");
            final AcknowledgePurchaseUseCase acknowledgePurchaseUseCase = AcknowledgePurchaseUseCase.this;
            invoke.a(aVarA, new j1.b() { // from class: com.revenuecat.purchases.google.usecase.a
                @Override // j1.b
                public final void a(com.android.billingclient.api.f fVar) {
                    AcknowledgePurchaseUseCase.AnonymousClass1.invoke$lambda$0(acknowledgePurchaseUseCase, fVar);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AcknowledgePurchaseUseCase(AcknowledgePurchaseUseCaseParams useCaseParams, l<? super String, i0> onReceive, l<? super PurchasesError, i0> onError, l<? super l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient, p<? super Long, ? super l<? super PurchasesError, i0>, i0> executeRequestOnUIThread) {
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

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    protected boolean getBackoffForNetworkErrors() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.useCaseParams.getInitiationSource().ordinal()];
        if (i8 == 1 || i8 == 2) {
            return false;
        }
        if (i8 == 3) {
            return true;
        }
        throw new e6.p();
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error acknowledging purchase";
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<String, i0> getOnReceive() {
        return this.onReceive;
    }

    public final l<l<? super com.android.billingclient.api.b, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(String received) {
        q.f(received, "received");
        this.onReceive.invoke(received);
    }
}
