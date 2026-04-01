package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class od2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final zf0 f12447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    u2.b f12448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f12449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lg3 f12450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f12451e;

    od2(Context context, zf0 zf0Var, ScheduledExecutorService scheduledExecutorService, lg3 lg3Var) {
        if (!((Boolean) h2.y.c().b(ns.D2)).booleanValue()) {
            this.f12448b = u2.a.a(context);
        }
        this.f12451e = context;
        this.f12447a = zf0Var;
        this.f12449c = scheduledExecutorService;
        this.f12450d = lg3Var;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        if (((Boolean) h2.y.c().b(ns.f12243z2)).booleanValue()) {
            if (!((Boolean) h2.y.c().b(ns.E2)).booleanValue()) {
                if (!((Boolean) h2.y.c().b(ns.A2)).booleanValue()) {
                    return zf3.m(n53.a(this.f12448b.a()), new z73() { // from class: com.google.android.gms.internal.ads.kd2
                        @Override // com.google.android.gms.internal.ads.z73
                        public final Object apply(Object obj) {
                            u2.c cVar = (u2.c) obj;
                            return new pd2(cVar.a(), cVar.b());
                        }
                    }, eh0.f7327f);
                }
                s3.h<u2.c> hVarA = ((Boolean) h2.y.c().b(ns.D2)).booleanValue() ? yt2.a(this.f12451e) : this.f12448b.a();
                if (hVarA == null) {
                    return zf3.h(new pd2(null, -1));
                }
                x3.d dVarN = zf3.n(n53.a(hVarA), new gf3() { // from class: com.google.android.gms.internal.ads.ld2
                    @Override // com.google.android.gms.internal.ads.gf3
                    public final x3.d a(Object obj) {
                        u2.c cVar = (u2.c) obj;
                        return cVar == null ? zf3.h(new pd2(null, -1)) : zf3.h(new pd2(cVar.a(), cVar.b()));
                    }
                }, eh0.f7327f);
                if (((Boolean) h2.y.c().b(ns.B2)).booleanValue()) {
                    dVarN = zf3.o(dVarN, ((Long) h2.y.c().b(ns.C2)).longValue(), TimeUnit.MILLISECONDS, this.f12449c);
                }
                return zf3.e(dVarN, Exception.class, new z73() { // from class: com.google.android.gms.internal.ads.md2
                    @Override // com.google.android.gms.internal.ads.z73
                    public final Object apply(Object obj) {
                        this.f11240a.f12447a.u((Exception) obj, "AppSetIdInfoSignal");
                        return new pd2(null, -1);
                    }
                }, this.f12450d);
            }
        }
        return zf3.h(new pd2(null, -1));
    }
}
