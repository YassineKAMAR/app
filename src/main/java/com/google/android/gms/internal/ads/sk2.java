package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class sk2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zf0 f14738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f14739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f14740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final of0 f14742f;

    public sk2(of0 of0Var, int i8, Context context, zf0 zf0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f14742f = of0Var;
        this.f14737a = context;
        this.f14738b = zf0Var;
        this.f14739c = scheduledExecutorService;
        this.f14740d = executor;
        this.f14741e = str;
    }

    final /* synthetic */ tk2 a(Exception exc) {
        this.f14738b.u(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return zf3.e((qf3) zf3.o(zf3.m(qf3.C(zf3.k(new ef3() { // from class: com.google.android.gms.internal.ads.pk2
            @Override // com.google.android.gms.internal.ads.ef3
            public final x3.d j() {
                return zf3.h(null);
            }
        }, this.f14740d)), new z73() { // from class: com.google.android.gms.internal.ads.qk2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new tk2(str);
            }
        }, this.f14740d), ((Long) h2.y.c().b(ns.U0)).longValue(), TimeUnit.MILLISECONDS, this.f14739c), Exception.class, new z73() { // from class: com.google.android.gms.internal.ads.rk2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                this.f14175a.a((Exception) obj);
                return null;
            }
        }, rg3.b());
    }
}
