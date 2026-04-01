package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import e6.i0;
import java.util.Arrays;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class PurchasesOrchestrator$1$onConnected$1 extends r implements l<String, i0> {
    public static final PurchasesOrchestrator$1$onConnected$1 INSTANCE = new PurchasesOrchestrator$1$onConnected$1();

    PurchasesOrchestrator$1$onConnected$1() {
        super(1);
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(String str) {
        invoke2(str);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String countryCode) {
        q.f(countryCode, "countryCode");
        String str = String.format(BillingStrings.BILLING_COUNTRY_CODE, Arrays.copyOf(new Object[]{countryCode}, 1));
        q.e(str, "format(this, *args)");
        LogUtilsKt.debugLog(str);
    }
}
