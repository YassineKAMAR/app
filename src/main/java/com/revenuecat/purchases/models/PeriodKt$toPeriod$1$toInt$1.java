package com.revenuecat.purchases.models;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import w6.u;
import w6.y;

/* JADX INFO: loaded from: classes.dex */
final class PeriodKt$toPeriod$1$toInt$1 extends r implements l<String, Integer> {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    @Override // p6.l
    public final Integer invoke(String part) {
        q.f(part, "part");
        Integer numI = u.i(y.t0(part, 1));
        return Integer.valueOf(numI != null ? numI.intValue() : 0);
    }
}
