package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.revenuecat.purchases.common.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class yk0 extends pk0 implements si0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ti0 f17790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f17791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private hk0 f17794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f17795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f17796j;

    public yk0(dj0 dj0Var, cj0 cj0Var) {
        super(dj0Var);
        rl0 rl0Var = new rl0(dj0Var.getContext(), cj0Var, (dj0) this.f12920c.get(), null);
        qg0.f("ExoPlayerAdapter initialized.");
        this.f17790d = rl0Var;
        rl0Var.C(this);
    }

    private static String B(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + exc.getMessage();
    }

    private final void C(long j8) {
        j2.k2.f23991k.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.xk0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f17315a.y();
            }
        }, j8);
    }

    protected static final String z(String str) {
        return "cache:".concat(String.valueOf(jg0.i(str)));
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void A() {
        qg0.g("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void a(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void b(String str, Exception exc) {
        qg0.h("Precache exception", exc);
        g2.t.q().t(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void c(final boolean z7, final long j8) {
        final dj0 dj0Var = (dj0) this.f12920c.get();
        if (dj0Var != null) {
            eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wk0
                @Override // java.lang.Runnable
                public final void run() {
                    dj0Var.w0(z7, j8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void d(String str, Exception exc) {
        qg0.h("Precache error", exc);
        g2.t.q().t(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void f(int i8, int i9) {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void h() {
        synchronized (this) {
            this.f17792f = true;
            notify();
            release();
        }
        String str = this.f17791e;
        if (str != null) {
            k(this.f17791e, z(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void q(int i8) {
        this.f17790d.A(i8);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void r(int i8) {
        this.f17790d.B(i8);
    }

    @Override // com.google.android.gms.internal.ads.pk0, y2.h
    public final void release() {
        ti0 ti0Var = this.f17790d;
        if (ti0Var != null) {
            ti0Var.C(null);
            this.f17790d.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void s(int i8) {
        this.f17790d.D(i8);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void t(int i8) {
        this.f17790d.E(i8);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final boolean u(String str) {
        return v(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.dj0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.pk0, com.google.android.gms.internal.ads.yk0] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.yk0] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [long] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.pk0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.pk0
    public final boolean v(String str, String[] strArr) throws Throwable {
        ?? r62;
        String str2;
        ?? r52;
        long j8;
        long j9;
        long j10;
        ?? r12;
        long j11;
        long j12;
        String str3;
        long j13;
        ?? r13;
        ?? r15 = this;
        ?? r132 = str;
        r15.f17791e = r132;
        ?? r17 = "error";
        String strZ = z(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i8 = 0; i8 < strArr.length; i8++) {
                uriArr[i8] = Uri.parse(strArr[i8]);
            }
            r15.f17790d.w(uriArr, r15.f12919b);
            ?? r02 = (dj0) r15.f12920c.get();
            if (r02 != 0) {
                r02.y(strZ, r15);
            }
            e3.e eVarB = g2.t.b();
            long jA = eVarB.a();
            long jLongValue = ((Long) h2.y.c().b(ns.f12232y)).longValue();
            long jLongValue2 = ((Long) h2.y.c().b(ns.f12224x)).longValue() * 1000;
            long jIntValue = ((Integer) h2.y.c().b(ns.f12216w)).intValue();
            boolean zBooleanValue = ((Boolean) h2.y.c().b(ns.O1)).booleanValue();
            ?? r14 = -1;
            long j14 = jIntValue;
            r132 = r132;
            r15 = r15;
            while (true) {
                synchronized (this) {
                    try {
                        if (eVarB.a() - jA > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (r15.f17792f) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (r15.f17793g) {
                            break;
                        }
                        if (!r15.f17790d.M()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jV = r15.f17790d.V();
                        if (jV > 0) {
                            long jR = r15.f17790d.R();
                            if (jR != r14) {
                                try {
                                    j11 = j14;
                                    long j15 = jV;
                                    j9 = jLongValue2;
                                    j12 = jLongValue;
                                    str3 = strZ;
                                    try {
                                        p(str, strZ, jR, j15, jR > 0, zBooleanValue ? r15.f17790d.r() : -1L, zBooleanValue ? r15.f17790d.T() : -1L, zBooleanValue ? r15.f17790d.s() : -1L, ti0.O(), ti0.Q());
                                        r13 = jR;
                                        j13 = jV;
                                        r62 = j15;
                                    } catch (Throwable th) {
                                        th = th;
                                        r52 = this;
                                        r62 = str;
                                        str2 = str3;
                                        try {
                                            throw th;
                                        } catch (Exception e8) {
                                            e = e8;
                                            ?? r16 = r17;
                                            qg0.g("Failed to preload url " + r62 + " Exception: " + e.getMessage());
                                            g2.t.q().t(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            r52.k(r62, str2, r16, B(r16, e));
                                            return false;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r52 = this;
                                    r62 = str;
                                    str2 = strZ;
                                }
                            } else {
                                j11 = j14;
                                j9 = jLongValue2;
                                j12 = jLongValue;
                                str3 = strZ;
                                j13 = jV;
                                r13 = r14;
                                r62 = j14;
                            }
                            r52 = (jR > j13 ? 1 : (jR == j13 ? 0 : -1));
                            if (r52 >= 0) {
                                n(str, str3, j13);
                                break;
                            }
                            try {
                                yk0 yk0Var = this;
                                r62 = str;
                                str2 = str3;
                                if (yk0Var.f17790d.S() >= j11 && jR > 0) {
                                    break;
                                }
                                j10 = j12;
                                r12 = r13;
                                r52 = yk0Var;
                                j8 = j11;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } else {
                            j8 = j14;
                            j9 = jLongValue2;
                            r62 = r132;
                            str2 = strZ;
                            r52 = r15;
                            j10 = jLongValue;
                            r12 = r14;
                        }
                        try {
                            try {
                                r52.wait(j10);
                            } catch (Throwable th4) {
                                th = th4;
                                r17 = r12;
                                throw th;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r62 = r132;
                        str2 = strZ;
                        r52 = r15;
                    }
                }
                jLongValue = j10;
                r15 = r52;
                r132 = r62;
                strZ = str2;
                j14 = j8;
                jLongValue2 = j9;
                r14 = r12;
            }
            return true;
        } catch (Exception e9) {
            e = e9;
            r62 = r132;
            str2 = strZ;
            r52 = r15;
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final boolean w(String str, String[] strArr, hk0 hk0Var) {
        this.f17791e = str;
        this.f17794h = hk0Var;
        String strZ = z(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i8 = 0; i8 < strArr.length; i8++) {
                uriArr[i8] = Uri.parse(strArr[i8]);
            }
            this.f17790d.w(uriArr, this.f12919b);
            dj0 dj0Var = (dj0) this.f12920c.get();
            if (dj0Var != null) {
                dj0Var.y(strZ, this);
            }
            this.f17795i = g2.t.b().a();
            this.f17796j = -1L;
            C(0L);
            return true;
        } catch (Exception e8) {
            qg0.g("Failed to preload url " + str + " Exception: " + e8.getMessage());
            g2.t.q().t(e8, "VideoStreamExoPlayerCache.preload");
            release();
            k(str, strZ, "error", B("error", e8));
            return false;
        }
    }

    public final ti0 x() {
        synchronized (this) {
            this.f17793g = true;
            notify();
        }
        this.f17790d.C(null);
        ti0 ti0Var = this.f17790d;
        this.f17790d = null;
        return ti0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.pk0, com.google.android.gms.internal.ads.yk0] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.yk0] */
    /* JADX WARN: Type inference failed for: r2v30 */
    final /* synthetic */ void y() throws Throwable {
        String str;
        yk0 yk0VarBooleanValue;
        yk0 yk0Var;
        ls lsVarC;
        long jLongValue;
        long jIntValue;
        yk0 yk0Var2;
        long j8;
        long j9;
        String str2;
        long j10;
        String strZ = z(this.f17791e);
        Object obj = "error";
        try {
            fs fsVar = ns.f12224x;
            lsVarC = h2.y.c();
            jLongValue = ((Long) lsVarC.b(fsVar)).longValue() * 1000;
            jIntValue = ((Integer) h2.y.c().b(ns.f12216w)).intValue();
            yk0VarBooleanValue = ((Boolean) h2.y.c().b(ns.O1)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e8) {
            e = e8;
            str = strZ;
            yk0VarBooleanValue = this;
        }
        synchronized (this) {
            try {
                int i8 = ((g2.t.b().a() - this.f17795i) > jLongValue ? 1 : ((g2.t.b().a() - this.f17795i) == jLongValue ? 0 : -1));
                if (i8 <= 0) {
                    try {
                        if (this.f17792f) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.f17793g) {
                            if (!this.f17790d.M()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jV = this.f17790d.V();
                            if (jV > 0) {
                                long jR = this.f17790d.R();
                                if (jR != this.f17796j) {
                                    try {
                                        j9 = jIntValue;
                                        str2 = strZ;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        yk0VarBooleanValue = this;
                                        str = strZ;
                                        throw th;
                                    }
                                    try {
                                        p(this.f17791e, strZ, jR, jV, jR > 0, yk0VarBooleanValue != 0 ? this.f17790d.r() : -1L, yk0VarBooleanValue != 0 ? this.f17790d.T() : -1L, yk0VarBooleanValue != 0 ? this.f17790d.s() : -1L, ti0.O(), ti0.Q());
                                        yk0VarBooleanValue = this;
                                        j8 = jR;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        yk0VarBooleanValue = this;
                                        str = str2;
                                        throw th;
                                    }
                                    try {
                                        yk0VarBooleanValue.f17796j = j8;
                                        j10 = jV;
                                        yk0VarBooleanValue = yk0VarBooleanValue;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str = str2;
                                        throw th;
                                    }
                                } else {
                                    j8 = jR;
                                    j9 = jIntValue;
                                    str2 = strZ;
                                    yk0VarBooleanValue = this;
                                    j10 = jV;
                                }
                                if (j8 >= j10) {
                                    yk0VarBooleanValue.n(yk0VarBooleanValue.f17791e, str2, j10);
                                } else {
                                    long jS = yk0VarBooleanValue.f17790d.S();
                                    yk0Var2 = yk0VarBooleanValue;
                                    if (jS >= j9) {
                                        yk0Var2 = yk0VarBooleanValue;
                                        if (j8 > 0) {
                                        }
                                    }
                                }
                                yk0Var = yk0VarBooleanValue;
                            } else {
                                yk0Var2 = this;
                            }
                            yk0Var2.C(((Long) h2.y.c().b(ns.f12232y)).longValue());
                            return;
                        }
                        yk0Var = this;
                        g2.t.A().g(yk0Var.f17794h);
                    } catch (Throwable th5) {
                        th = th5;
                        obj = lsVarC;
                        str = i8;
                    }
                } else {
                    str = strZ;
                    yk0VarBooleanValue = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        obj = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = strZ;
                yk0VarBooleanValue = this;
            }
            try {
                throw th;
            } catch (Exception e9) {
                e = e9;
                String str3 = obj;
                qg0.g("Failed to preload url " + yk0VarBooleanValue.f17791e + " Exception: " + e.getMessage());
                g2.t.q().t(e, "VideoStreamExoPlayerCache.preload");
                release();
                yk0VarBooleanValue.k(yk0VarBooleanValue.f17791e, str, str3, B(str3, e));
                yk0Var = yk0VarBooleanValue;
                g2.t.A().g(yk0Var.f17794h);
            }
        }
    }
}
