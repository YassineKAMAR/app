package com.revenuecat.purchases.common;

import java.util.Date;
import kotlin.jvm.internal.q;
import x6.a;

/* JADX INFO: loaded from: classes.dex */
public final class DurationExtensionsKt {
    public static final long between(a.C0190a c0190a, Date startTime, Date endTime) {
        q.f(c0190a, "<this>");
        q.f(startTime, "startTime");
        q.f(endTime, "endTime");
        return x6.c.t(endTime.getTime() - startTime.getTime(), x6.d.f27333d);
    }
}
