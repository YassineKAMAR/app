package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class t42 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hy0 f14959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z32 f14960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lg3 f14961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i41 f14962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f14963e;

    public t42(hy0 hy0Var, z32 z32Var, i41 i41Var, ScheduledExecutorService scheduledExecutorService, lg3 lg3Var) {
        this.f14959a = hy0Var;
        this.f14960b = z32Var;
        this.f14962d = i41Var;
        this.f14963e = scheduledExecutorService;
        this.f14961c = lg3Var;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(final ks2 ks2Var, final wr2 wr2Var) {
        return this.f14961c.Z(new Callable() { // from class: com.google.android.gms.internal.ads.r42
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13897a.c(ks2Var, wr2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        return ks2Var.f10322a.f8947a.a() != null && this.f14960b.b(ks2Var, wr2Var);
    }

    final /* synthetic */ jx0 c(final ks2 ks2Var, final wr2 wr2Var) {
        return this.f14959a.b(new d01(ks2Var, wr2Var, null), new vy0(ks2Var.f10322a.f8947a.a(), new Runnable() { // from class: com.google.android.gms.internal.ads.q42
            @Override // java.lang.Runnable
            public final void run() {
                this.f13265a.f(ks2Var, wr2Var);
            }
        })).j();
    }

    final /* synthetic */ void f(ks2 ks2Var, wr2 wr2Var) {
        zf3.r(zf3.o(this.f14960b.a(ks2Var, wr2Var), wr2Var.T, TimeUnit.SECONDS, this.f14963e), new s42(this), this.f14961c);
    }
}
