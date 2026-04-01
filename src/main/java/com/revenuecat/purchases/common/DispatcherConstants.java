package com.revenuecat.purchases.common;

import x6.a;

/* JADX INFO: loaded from: classes.dex */
public final class DispatcherConstants {
    public static final DispatcherConstants INSTANCE = new DispatcherConstants();
    private static final long jitterDelay;
    private static final long jitterLongDelay;

    static {
        a.C0190a c0190a = x6.a.f27324b;
        x6.d dVar = x6.d.f27333d;
        jitterDelay = x6.c.t(5000L, dVar);
        jitterLongDelay = x6.c.t(10000L, dVar);
    }

    private DispatcherConstants() {
    }

    /* JADX INFO: renamed from: getJitterDelay-UwyO8pc, reason: not valid java name */
    public final long m11getJitterDelayUwyO8pc() {
        return jitterDelay;
    }

    /* JADX INFO: renamed from: getJitterLongDelay-UwyO8pc, reason: not valid java name */
    public final long m12getJitterLongDelayUwyO8pc() {
        return jitterLongDelay;
    }
}
