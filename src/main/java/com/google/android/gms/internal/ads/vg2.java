package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class vg2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oi2 f16260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f16262c;

    public vg2(oi2 oi2Var, long j8, ScheduledExecutorService scheduledExecutorService) {
        this.f16260a = oi2Var;
        this.f16261b = j8;
        this.f16262c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return this.f16260a.j();
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        x3.d dVarK = this.f16260a.k();
        long j8 = this.f16261b;
        if (j8 > 0) {
            dVarK = zf3.o(dVarK, j8, TimeUnit.MILLISECONDS, this.f16262c);
        }
        return zf3.f(dVarK, Throwable.class, new gf3() { // from class: com.google.android.gms.internal.ads.ug2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return zf3.h(null);
            }
        }, eh0.f7327f);
    }
}
