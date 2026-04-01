package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class mk2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zf0 f11351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f11353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lg3 f11354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xm f11355e;

    mk2(String str, xm xmVar, zf0 zf0Var, ScheduledExecutorService scheduledExecutorService, lg3 lg3Var) {
        this.f11352b = str;
        this.f11355e = xmVar;
        this.f11351a = zf0Var;
        this.f11353c = scheduledExecutorService;
        this.f11354d = lg3Var;
    }

    final /* synthetic */ nk2 a(Exception exc) {
        this.f11351a.u(exc, "AppSetIdInfoGmscoreSignal");
        return new nk2(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        if (((Boolean) h2.y.c().b(ns.f12243z2)).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.E2)).booleanValue()) {
                x3.d dVarN = zf3.n(n53.a(s3.k.e(null)), new gf3() { // from class: com.google.android.gms.internal.ads.kk2
                    @Override // com.google.android.gms.internal.ads.gf3
                    public final x3.d a(Object obj) {
                        u2.c cVar = (u2.c) obj;
                        return cVar == null ? zf3.h(new nk2(null, -1)) : zf3.h(new nk2(cVar.a(), cVar.b()));
                    }
                }, this.f11354d);
                if (((Boolean) xt.f17458a.e()).booleanValue()) {
                    dVarN = zf3.o(dVarN, ((Long) xt.f17459b.e()).longValue(), TimeUnit.MILLISECONDS, this.f11353c);
                }
                return zf3.e(dVarN, Exception.class, new z73() { // from class: com.google.android.gms.internal.ads.lk2
                    @Override // com.google.android.gms.internal.ads.z73
                    public final Object apply(Object obj) {
                        return this.f10761a.a((Exception) obj);
                    }
                }, this.f11354d);
            }
        }
        return zf3.h(new nk2(null, -1));
    }
}
