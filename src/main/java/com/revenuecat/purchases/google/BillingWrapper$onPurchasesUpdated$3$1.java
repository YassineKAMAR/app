package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class BillingWrapper$onPurchasesUpdated$3$1 extends r implements l<Purchase, CharSequence> {
    public static final BillingWrapper$onPurchasesUpdated$3$1 INSTANCE = new BillingWrapper$onPurchasesUpdated$3$1();

    BillingWrapper$onPurchasesUpdated$3$1() {
        super(1);
    }

    @Override // p6.l
    public final CharSequence invoke(Purchase it) {
        q.f(it, "it");
        return PurchaseExtensionsKt.toHumanReadableDescription(it);
    }
}
