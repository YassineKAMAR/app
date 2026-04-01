package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bm2 {
    public static oi2 a(el2 el2Var, mg2 mg2Var, ScheduledExecutorService scheduledExecutorService, int i8) {
        return i8 == 0 ? new vg2(mg2Var, 0L, scheduledExecutorService) : new vg2(el2Var, 0L, scheduledExecutorService);
    }

    public static oi2 b(ol2 ol2Var, ScheduledExecutorService scheduledExecutorService) {
        return new vg2(ol2Var, ((Long) h2.y.c().b(ns.V3)).longValue(), scheduledExecutorService);
    }

    public static oi2 c(km2 km2Var, ScheduledExecutorService scheduledExecutorService) {
        return new vg2(km2Var, 0L, scheduledExecutorService);
    }
}
