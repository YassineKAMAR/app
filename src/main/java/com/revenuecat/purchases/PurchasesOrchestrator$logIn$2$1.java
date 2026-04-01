package com.revenuecat.purchases;

import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.interfaces.LogInCallback;
import e6.i0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
final class PurchasesOrchestrator$logIn$2$1 extends r implements p<CustomerInfo, Boolean, i0> {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements p6.a<i0> {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ boolean $created;
        final /* synthetic */ CustomerInfo $customerInfo;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo, boolean z7, PurchasesOrchestrator purchasesOrchestrator) {
            super(0);
            this.$callback = logInCallback;
            this.$customerInfo = customerInfo;
            this.$created = z7;
            this.this$0 = purchasesOrchestrator;
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LogInCallback logInCallback = this.$callback;
            if (logInCallback != null) {
                logInCallback.onReceived(this.$customerInfo, this.$created);
            }
            this.this$0.customerInfoUpdateHandler.notifyListeners(this.$customerInfo);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$logIn$2$1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
        super(2);
        this.this$0 = purchasesOrchestrator;
        this.$newAppUserID = str;
        this.$callback = logInCallback;
    }

    @Override // p6.p
    public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo, Boolean bool) {
        invoke(customerInfo, bool.booleanValue());
        return i0.f21430a;
    }

    public final void invoke(CustomerInfo customerInfo, boolean z7) {
        q.f(customerInfo, "customerInfo");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        purchasesOrchestrator.dispatch(new AnonymousClass1(this.$callback, customerInfo, z7, purchasesOrchestrator));
        OfferingsManager.fetchAndCacheOfferings$default(this.this$0.offeringsManager, this.$newAppUserID, this.this$0.getState$purchases_defaultsRelease().getAppInBackground(), null, null, 12, null);
    }
}
