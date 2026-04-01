package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ej2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2.x1 f7373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lg3 f7375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f7376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v22 f7377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ts2 f7378f;

    ej2(j2.x1 x1Var, Context context, lg3 lg3Var, ScheduledExecutorService scheduledExecutorService, v22 v22Var, ts2 ts2Var) {
        this.f7373a = x1Var;
        this.f7374b = context;
        this.f7375c = lg3Var;
        this.f7376d = scheduledExecutorService;
        this.f7377e = v22Var;
        this.f7378f = ts2Var;
    }

    final /* synthetic */ x3.d a(Throwable th) {
        o90.c(this.f7374b).a(th, "TopicsSignal.fetchTopicsSignal");
        return zf3.h(th instanceof SecurityException ? new gj2("", 2, null) : th instanceof IllegalStateException ? new gj2("", 3, null) : th instanceof IllegalArgumentException ? new gj2("", 4, null) : th instanceof TimeoutException ? new gj2("", 5, null) : new gj2("", 0, null));
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r5.f7378f.f15302d.f22276y != z1.v.b.DISABLED.a()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.oi2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x3.d k() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.C9
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L74
            j2.x1 r0 = r5.f7373a
            boolean r0 = r0.c()
            if (r0 == 0) goto L74
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.F9
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.ts2 r0 = r5.f7378f
            z1.v$b r1 = z1.v.b.DISABLED
            int r1 = r1.a()
            h2.r4 r0 = r0.f15302d
            int r0 = r0.f22276y
            if (r0 == r1) goto L74
        L3a:
            com.google.android.gms.internal.ads.v22 r0 = r5.f7377e
            r1 = 0
            x3.d r0 = r0.a(r1)
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.D9
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.f7376d
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            x3.d r0 = com.google.android.gms.internal.ads.zf3.o(r0, r1, r4, r3)
            com.google.android.gms.internal.ads.qf3 r0 = com.google.android.gms.internal.ads.qf3.C(r0)
            com.google.android.gms.internal.ads.lg3 r1 = r5.f7375c
            com.google.android.gms.internal.ads.cj2 r2 = new com.google.android.gms.internal.ads.gf3() { // from class: com.google.android.gms.internal.ads.cj2
                static {
                    /*
                        com.google.android.gms.internal.ads.cj2 r0 = new com.google.android.gms.internal.ads.cj2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.cj2) com.google.android.gms.internal.ads.cj2.a com.google.android.gms.internal.ads.cj2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cj2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cj2.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(java.lang.Object r6) {
                    /*
                        r5 = this;
                        androidx.privacysandbox.ads.adservices.topics.c r6 = (androidx.privacysandbox.ads.adservices.topics.c) r6
                        com.google.android.gms.internal.ads.u44 r0 = com.google.android.gms.internal.ads.v44.M()
                        java.util.List r6 = r6.a()
                        java.util.Iterator r6 = r6.iterator()
                    Le:
                        boolean r1 = r6.hasNext()
                        if (r1 == 0) goto L3d
                        java.lang.Object r1 = r6.next()
                        androidx.privacysandbox.ads.adservices.topics.e r1 = (androidx.privacysandbox.ads.adservices.topics.e) r1
                        com.google.android.gms.internal.ads.s44 r2 = com.google.android.gms.internal.ads.t44.M()
                        int r3 = r1.c()
                        r2.w(r3)
                        long r3 = r1.a()
                        r2.u(r3)
                        long r3 = r1.b()
                        r2.v(r3)
                        com.google.android.gms.internal.ads.z04 r1 = r2.q()
                        com.google.android.gms.internal.ads.t44 r1 = (com.google.android.gms.internal.ads.t44) r1
                        r0.u(r1)
                        goto Le
                    L3d:
                        com.google.android.gms.internal.ads.z04 r6 = r0.q()
                        com.google.android.gms.internal.ads.v44 r6 = (com.google.android.gms.internal.ads.v44) r6
                        byte[] r6 = r6.g()
                        r0 = 1
                        java.lang.String r6 = android.util.Base64.encodeToString(r6, r0)
                        com.google.android.gms.internal.ads.gj2 r1 = new com.google.android.gms.internal.ads.gj2
                        r2 = 0
                        r1.<init>(r6, r0, r2)
                        x3.d r6 = com.google.android.gms.internal.ads.zf3.h(r1)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cj2.a(java.lang.Object):x3.d");
                }
            }
            x3.d r0 = com.google.android.gms.internal.ads.zf3.n(r0, r2, r1)
            com.google.android.gms.internal.ads.dj2 r1 = new com.google.android.gms.internal.ads.dj2
            r1.<init>()
            com.google.android.gms.internal.ads.lg3 r2 = r5.f7375c
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            x3.d r0 = com.google.android.gms.internal.ads.zf3.f(r0, r3, r1, r2)
            return r0
        L74:
            com.google.android.gms.internal.ads.gj2 r0 = new com.google.android.gms.internal.ads.gj2
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            x3.d r0 = com.google.android.gms.internal.ads.zf3.h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ej2.k():x3.d");
    }
}
