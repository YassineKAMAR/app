package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n30 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f11650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wg0 f11652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ty2 f11653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j2.f0 f11654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j2.f0 f11655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m30 f11656h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11649a = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11657i = 1;

    public n30(Context context, wg0 wg0Var, String str, j2.f0 f0Var, j2.f0 f0Var2, ty2 ty2Var) {
        this.f11651c = str;
        this.f11650b = context.getApplicationContext();
        this.f11652d = wg0Var;
        this.f11653e = ty2Var;
        this.f11654f = f0Var;
        this.f11655g = f0Var2;
    }

    public final h30 b(gh ghVar) {
        synchronized (this.f11649a) {
            synchronized (this.f11649a) {
                m30 m30Var = this.f11656h;
                if (m30Var != null && this.f11657i == 0) {
                    m30Var.e(new nh0() { // from class: com.google.android.gms.internal.ads.s20
                        @Override // com.google.android.gms.internal.ads.nh0
                        public final void a(Object obj) {
                            this.f14476a.k((h20) obj);
                        }
                    }, new lh0() { // from class: com.google.android.gms.internal.ads.t20
                        @Override // com.google.android.gms.internal.ads.lh0
                        public final void j() {
                        }
                    });
                }
            }
            m30 m30Var2 = this.f11656h;
            if (m30Var2 != null && m30Var2.a() != -1) {
                int i8 = this.f11657i;
                if (i8 == 0) {
                    return this.f11656h.f();
                }
                if (i8 != 1) {
                    return this.f11656h.f();
                }
                this.f11657i = 2;
                d(null);
                return this.f11656h.f();
            }
            this.f11657i = 2;
            m30 m30VarD = d(null);
            this.f11656h = m30VarD;
            return m30VarD.f();
        }
    }

    protected final m30 d(gh ghVar) {
        ey2 ey2VarA = dy2.a(this.f11650b, 6);
        ey2VarA.o();
        final m30 m30Var = new m30(this.f11655g);
        final gh ghVar2 = null;
        eh0.f7326e.execute(new Runnable(ghVar2, m30Var) { // from class: com.google.android.gms.internal.ads.w20

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m30 f16594b;

            {
                this.f16594b = m30Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f16593a.j(null, this.f16594b);
            }
        });
        m30Var.e(new c30(this, m30Var, ey2VarA), new d30(this, m30Var, ey2VarA));
        return m30Var;
    }

    final /* synthetic */ void i(m30 m30Var, final h20 h20Var, ArrayList arrayList, long j8) {
        synchronized (this.f11649a) {
            if (m30Var.a() != -1 && m30Var.a() != 1) {
                m30Var.c();
                eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.u20
                    @Override // java.lang.Runnable
                    public final void run() {
                        h20Var.l();
                    }
                });
                j2.v1.k("Could not receive /jsLoaded in " + String.valueOf(h2.y.c().b(ns.f12039c)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + m30Var.a() + ". Update status(onEngLoadedTimeout) is " + this.f11657i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (g2.t.b().a() - j8) + " ms. Rejecting.");
            }
        }
    }

    final /* synthetic */ void j(gh ghVar, m30 m30Var) {
        long jA = g2.t.b().a();
        ArrayList arrayList = new ArrayList();
        try {
            p20 p20Var = new p20(this.f11650b, this.f11652d, null, null);
            p20Var.e0(new v20(this, arrayList, jA, m30Var, p20Var));
            p20Var.D("/jsLoaded", new x20(this, jA, m30Var, p20Var));
            j2.f1 f1Var = new j2.f1();
            y20 y20Var = new y20(this, null, p20Var, f1Var);
            f1Var.b(y20Var);
            p20Var.D("/requestReload", y20Var);
            if (this.f11651c.endsWith(".js")) {
                p20Var.d0(this.f11651c);
            } else if (this.f11651c.startsWith("<html>")) {
                p20Var.O(this.f11651c);
            } else {
                p20Var.g0(this.f11651c);
            }
            j2.k2.f23991k.postDelayed(new b30(this, m30Var, p20Var, arrayList, jA), ((Integer) h2.y.c().b(ns.f12048d)).intValue());
        } catch (Throwable th) {
            qg0.e("Error creating webview.", th);
            g2.t.q().u(th, "SdkJavascriptFactory.loadJavascriptEngine");
            m30Var.c();
        }
    }

    final /* synthetic */ void k(h20 h20Var) {
        if (h20Var.r()) {
            this.f11657i = 1;
        }
    }
}
