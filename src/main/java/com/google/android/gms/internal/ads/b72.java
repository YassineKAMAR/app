package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b72 implements gf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bx2 f5626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i41 f5627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fz2 f5628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jz2 f5629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f5630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f5631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rz0 f5632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v62 f5633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c32 f5634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f5635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final qy2 f5636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e62 f5637l;

    b72(Context context, bx2 bx2Var, v62 v62Var, i41 i41Var, fz2 fz2Var, jz2 jz2Var, rz0 rz0Var, Executor executor, ScheduledExecutorService scheduledExecutorService, c32 c32Var, qy2 qy2Var, e62 e62Var) {
        this.f5635j = context;
        this.f5626a = bx2Var;
        this.f5633h = v62Var;
        this.f5627b = i41Var;
        this.f5628c = fz2Var;
        this.f5629d = jz2Var;
        this.f5632g = rz0Var;
        this.f5630e = executor;
        this.f5631f = scheduledExecutorService;
        this.f5634i = c32Var;
        this.f5636k = qy2Var;
        this.f5637l = e62Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String d(com.google.android.gms.internal.ads.ks2 r5) {
        /*
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.f12180r5
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.js2 r2 = r5.f10323b
            com.google.android.gms.internal.ads.as2 r2 = r2.f9793b
            int r2 = r2.f5465e
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.fs r2 = com.google.android.gms.internal.ads.ns.f12171q5
            com.google.android.gms.internal.ads.ls r3 = h2.y.c()
            java.lang.Object r2 = r3.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L57
            goto L58
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L58
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L58
        L57:
            r1 = r0
        L58:
            com.google.android.gms.internal.ads.js2 r5 = r5.f10323b
            com.google.android.gms.internal.ads.as2 r5 = r5.f9793b
            com.google.android.gms.internal.ads.yr2 r5 = r5.f5469i
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.a()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b72.d(com.google.android.gms.internal.ads.ks2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    @Override // com.google.android.gms.internal.ads.gf3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ x3.d a(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b72.a(java.lang.Object):x3.d");
    }

    final /* synthetic */ x3.d c(wr2 wr2Var, ks2 ks2Var, x22 x22Var, Throwable th) {
        ey2 ey2VarA = dy2.a(this.f5635j, 12);
        ey2VarA.h(wr2Var.G);
        ey2VarA.o();
        x3.d dVarO = zf3.o(x22Var.a(ks2Var, wr2Var), wr2Var.T, TimeUnit.MILLISECONDS, this.f5631f);
        this.f5633h.f(ks2Var, wr2Var, dVarO, this.f5628c);
        py2.a(dVarO, this.f5636k, ey2VarA);
        return dVarO;
    }
}
