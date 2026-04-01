package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e41 f7822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fc1 f7823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o51 f7824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c61 f7825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o61 f7826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g91 f7827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f7828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ac1 f7829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ew0 f7830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g2.b f7831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final nd0 f7832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final gh f7833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w81 f7834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q12 f7835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final jz2 f7836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final eq1 f7837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final mx2 f7838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final gv0 f7839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ln1 f7840s;

    public fn1(e41 e41Var, o51 o51Var, c61 c61Var, o61 o61Var, g91 g91Var, Executor executor, ac1 ac1Var, ew0 ew0Var, g2.b bVar, nd0 nd0Var, gh ghVar, w81 w81Var, q12 q12Var, jz2 jz2Var, eq1 eq1Var, mx2 mx2Var, fc1 fc1Var, gv0 gv0Var, ln1 ln1Var) {
        this.f7822a = e41Var;
        this.f7824c = o51Var;
        this.f7825d = c61Var;
        this.f7826e = o61Var;
        this.f7827f = g91Var;
        this.f7828g = executor;
        this.f7829h = ac1Var;
        this.f7830i = ew0Var;
        this.f7831j = bVar;
        this.f7832k = nd0Var;
        this.f7833l = ghVar;
        this.f7834m = w81Var;
        this.f7835n = q12Var;
        this.f7836o = jz2Var;
        this.f7837p = eq1Var;
        this.f7838q = mx2Var;
        this.f7823b = fc1Var;
        this.f7839r = gv0Var;
        this.f7840s = ln1Var;
    }

    public static final x3.d j(fm0 fm0Var, String str, String str2) {
        final jh0 jh0Var = new jh0();
        fm0Var.H().y0(new rn0() { // from class: com.google.android.gms.internal.ads.wm1
            @Override // com.google.android.gms.internal.ads.rn0
            public final void a(boolean z7, int i8, String str3, String str4) {
                jh0 jh0Var2 = jh0Var;
                if (z7) {
                    jh0Var2.d(null);
                    return;
                }
                jh0Var2.e(new Exception("Ad Web View failed to load. Error code: " + i8 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        fm0Var.g1(str, str2, null);
        return jh0Var;
    }

    final /* synthetic */ void c() {
        this.f7822a.Z();
    }

    final /* synthetic */ void d(String str, String str2) {
        this.f7827f.b(str, str2);
    }

    final /* synthetic */ void e() {
        this.f7824c.k();
    }

    final /* synthetic */ void f(View view) {
        this.f7831j.a();
    }

    final /* synthetic */ void g(fm0 fm0Var, fm0 fm0Var2, Map map) {
        this.f7830i.e(fm0Var);
    }

    final /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        if (((Boolean) h2.y.c().b(ns.u9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.f7840s.b(motionEvent);
        }
        this.f7831j.a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(final fm0 fm0Var, boolean z7, sz szVar) {
        tn0 tn0VarH = fm0Var.H();
        h2.a aVar = new h2.a() { // from class: com.google.android.gms.internal.ads.xm1
            @Override // h2.a
            public final void Z() {
                this.f17367a.c();
            }
        };
        hy hyVar = new hy() { // from class: com.google.android.gms.internal.ads.ym1
            @Override // com.google.android.gms.internal.ads.hy
            public final void b(String str, String str2) {
                this.f17854a.d(str, str2);
            }
        };
        i2.f0 f0Var = new i2.f0() { // from class: com.google.android.gms.internal.ads.zm1
            @Override // i2.f0
            public final void q() {
                this.f18289a.e();
            }
        };
        en1 en1Var = new en1(this);
        nd0 nd0Var = this.f7832k;
        q12 q12Var = this.f7835n;
        jz2 jz2Var = this.f7836o;
        eq1 eq1Var = this.f7837p;
        tn0VarH.S(aVar, this.f7825d, this.f7826e, hyVar, f0Var, z7, szVar, this.f7831j, en1Var, nd0Var, q12Var, jz2Var, eq1Var, this.f7838q, null, this.f7823b, null, null, this.f7839r);
        fm0Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.an1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f5346a.h(view, motionEvent);
                return false;
            }
        });
        fm0Var.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.bn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5902a.f(view);
            }
        });
        if (((Boolean) h2.y.c().b(ns.f12186s2)).booleanValue()) {
            this.f7833l.c().a((View) fm0Var);
        }
        this.f7829h.w0(fm0Var, this.f7828g);
        this.f7829h.w0(new tk() { // from class: com.google.android.gms.internal.ads.cn1
            @Override // com.google.android.gms.internal.ads.tk
            public final void b0(sk skVar) {
                tn0 tn0VarH2 = fm0Var.H();
                Rect rect = skVar.f14723d;
                tn0VarH2.s0(rect.left, rect.top, false);
            }
        }, this.f7828g);
        this.f7829h.A0((View) fm0Var);
        fm0Var.f1("/trackActiveViewUnit", new qz() { // from class: com.google.android.gms.internal.ads.dn1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                this.f6824a.g(fm0Var, (fm0) obj, map);
            }
        });
        this.f7830i.h(fm0Var);
    }
}
