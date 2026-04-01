package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gm2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zf0 f8399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f8402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lg3 f8403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mf0 f8405g;

    gm2(zf0 zf0Var, boolean z7, boolean z8, mf0 mf0Var, lg3 lg3Var, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f8399a = zf0Var;
        this.f8400b = z7;
        this.f8401c = z8;
        this.f8405g = mf0Var;
        this.f8403e = lg3Var;
        this.f8404f = str;
        this.f8402d = scheduledExecutorService;
    }

    final /* synthetic */ hm2 a(Exception exc) {
        this.f8399a.u(exc, "TrustlessTokenSignal");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        if ((!((Boolean) h2.y.c().b(ns.f12065e7)).booleanValue() || !this.f8401c) && this.f8400b) {
            return zf3.e(zf3.o(zf3.m(zf3.h(null), new z73() { // from class: com.google.android.gms.internal.ads.em2
                @Override // com.google.android.gms.internal.ads.z73
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    if (str == null) {
                        return null;
                    }
                    return new hm2(str);
                }
            }, this.f8403e), ((Long) xu.f17465c.e()).longValue(), TimeUnit.MILLISECONDS, this.f8402d), Exception.class, new z73() { // from class: com.google.android.gms.internal.ads.fm2
                @Override // com.google.android.gms.internal.ads.z73
                public final Object apply(Object obj) {
                    this.f7814a.a((Exception) obj);
                    return null;
                }
            }, this.f8403e);
        }
        return zf3.h(null);
    }
}
