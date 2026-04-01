package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import e6.i0;
import java.util.Arrays;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class BillingWrapper$consumePurchase$1 extends r implements l<PurchasesError, i0> {
    public static final BillingWrapper$consumePurchase$1 INSTANCE = new BillingWrapper$consumePurchase$1();

    BillingWrapper$consumePurchase$1() {
        super(1);
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError error) {
        q.f(error, "error");
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        String str = String.format(PurchaseStrings.CONSUMING_PURCHASE_ERROR, Arrays.copyOf(new Object[]{error.getUnderlyingErrorMessage()}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
    }
}
