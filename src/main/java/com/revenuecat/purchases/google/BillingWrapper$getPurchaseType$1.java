package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import e6.i0;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class BillingWrapper$getPurchaseType$1 extends r implements l<Boolean, i0> {
    final /* synthetic */ l<ProductType, i0> $listener;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getPurchaseType$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<Boolean, i0> {
        final /* synthetic */ l<ProductType, i0> $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super ProductType, i0> lVar) {
            super(1);
            this.$listener = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return i0.f21430a;
        }

        public final void invoke(boolean z7) {
            l<ProductType, i0> lVar;
            ProductType productType;
            if (z7) {
                lVar = this.$listener;
                productType = ProductType.INAPP;
            } else {
                lVar = this.$listener;
                productType = ProductType.UNKNOWN;
            }
            lVar.invoke(productType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BillingWrapper$getPurchaseType$1(l<? super ProductType, i0> lVar, BillingWrapper billingWrapper, String str) {
        super(1);
        this.$listener = lVar;
        this.this$0 = billingWrapper;
        this.$purchaseToken = str;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return i0.f21430a;
    }

    public final void invoke(boolean z7) {
        if (z7) {
            this.$listener.invoke(ProductType.SUBS);
            return;
        }
        BillingWrapper billingWrapper = this.this$0;
        String str = this.$purchaseToken;
        l<ProductType, i0> lVar = this.$listener;
        billingWrapper.queryPurchaseType("inapp", str, lVar, new AnonymousClass1(lVar));
    }
}
