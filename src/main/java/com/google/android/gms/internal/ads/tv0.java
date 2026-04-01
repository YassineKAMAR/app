package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class tv0 implements g41, v51, b51, h2.a, x41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f15337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f15338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f15339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ks2 f15340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wr2 f15341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fz2 f15342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final dt2 f15343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final gh f15344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final rt f15345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final qy2 f15346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final WeakReference f15347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final WeakReference f15348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final h31 f15349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f15350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f15351p = new AtomicBoolean();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final tt f15352q;

    tv0(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, ks2 ks2Var, wr2 wr2Var, fz2 fz2Var, dt2 dt2Var, View view, fm0 fm0Var, gh ghVar, rt rtVar, tt ttVar, qy2 qy2Var, h31 h31Var) {
        this.f15336a = context;
        this.f15337b = executor;
        this.f15338c = executor2;
        this.f15339d = scheduledExecutorService;
        this.f15340e = ks2Var;
        this.f15341f = wr2Var;
        this.f15342g = fz2Var;
        this.f15343h = dt2Var;
        this.f15344i = ghVar;
        this.f15347l = new WeakReference(view);
        this.f15348m = new WeakReference(fm0Var);
        this.f15345j = rtVar;
        this.f15352q = ttVar;
        this.f15346k = qy2Var;
        this.f15349n = h31Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        String strG;
        int i8;
        List list;
        if (((Boolean) h2.y.c().b(ns.Ea)).booleanValue() && ((list = this.f15341f.f16871d) == null || list.isEmpty())) {
            return;
        }
        if (((Boolean) h2.y.c().b(ns.f12133m3)).booleanValue()) {
            strG = this.f15344i.c().g(this.f15336a, (View) this.f15347l.get(), null);
        } else {
            strG = null;
        }
        if ((((Boolean) h2.y.c().b(ns.f12139n0)).booleanValue() && this.f15340e.f10323b.f9793b.f5467g) || !((Boolean) iu.f9362h.e()).booleanValue()) {
            dt2 dt2Var = this.f15343h;
            fz2 fz2Var = this.f15342g;
            ks2 ks2Var = this.f15340e;
            wr2 wr2Var = this.f15341f;
            dt2Var.a(fz2Var.d(ks2Var, wr2Var, false, strG, null, wr2Var.f16871d));
            return;
        }
        if (((Boolean) iu.f9361g.e()).booleanValue() && ((i8 = this.f15341f.f16867b) == 1 || i8 == 2 || i8 == 5)) {
        }
        zf3.r((qf3) zf3.o(qf3.C(zf3.h(null)), ((Long) h2.y.c().b(ns.U0)).longValue(), TimeUnit.MILLISECONDS, this.f15339d), new sv0(this, strG), this.f15337b);
    }

    private final void G(final int i8, final int i9) {
        View view;
        if (i8 <= 0 || !((view = (View) this.f15347l.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            E();
        } else {
            this.f15339d.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.qv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13774a.D(i8, i9);
                }
            }, i9, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final synchronized void B() {
        dt2 dt2Var;
        List listC;
        h31 h31Var;
        if (this.f15350o) {
            ArrayList arrayList = new ArrayList(this.f15341f.f16871d);
            arrayList.addAll(this.f15341f.f16877g);
            dt2Var = this.f15343h;
            listC = this.f15342g.d(this.f15340e, this.f15341f, true, null, null, arrayList);
        } else {
            dt2 dt2Var2 = this.f15343h;
            fz2 fz2Var = this.f15342g;
            ks2 ks2Var = this.f15340e;
            wr2 wr2Var = this.f15341f;
            dt2Var2.a(fz2Var.c(ks2Var, wr2Var, wr2Var.f16893o));
            if (((Boolean) h2.y.c().b(ns.f12178r3)).booleanValue() && (h31Var = this.f15349n) != null) {
                List listH = fz2.h(fz2.g(h31Var.b().f16893o, h31Var.a().g()), this.f15349n.a().a());
                dt2 dt2Var3 = this.f15343h;
                fz2 fz2Var2 = this.f15342g;
                h31 h31Var2 = this.f15349n;
                dt2Var3.a(fz2Var2.c(h31Var2.c(), h31Var2.b(), listH));
            }
            dt2Var = this.f15343h;
            fz2 fz2Var3 = this.f15342g;
            ks2 ks2Var2 = this.f15340e;
            wr2 wr2Var2 = this.f15341f;
            listC = fz2Var3.c(ks2Var2, wr2Var2, wr2Var2.f16877g);
        }
        dt2Var.a(listC);
        this.f15350o = true;
    }

    final /* synthetic */ void C(int i8, int i9) {
        G(i8 - 1, i9);
    }

    final /* synthetic */ void D(final int i8, final int i9) {
        this.f15337b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ov0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12646a.C(i8, i9);
            }
        });
    }

    @Override // h2.a
    public final void Z() {
        if (!(((Boolean) h2.y.c().b(ns.f12139n0)).booleanValue() && this.f15340e.f10323b.f9793b.f5467g) && ((Boolean) iu.f9358d.e()).booleanValue()) {
            zf3.r(zf3.e(qf3.C(this.f15345j.a()), Throwable.class, new z73() { // from class: com.google.android.gms.internal.ads.nv0
                @Override // com.google.android.gms.internal.ads.z73
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, eh0.f7327f), new rv0(this), this.f15337b);
            return;
        }
        dt2 dt2Var = this.f15343h;
        fz2 fz2Var = this.f15342g;
        ks2 ks2Var = this.f15340e;
        wr2 wr2Var = this.f15341f;
        dt2Var.c(fz2Var.c(ks2Var, wr2Var, wr2Var.f16869c), true == g2.t.q().x(this.f15336a) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void a(ob0 ob0Var, String str, String str2) {
        fz2 fz2Var = this.f15342g;
        wr2 wr2Var = this.f15341f;
        this.f15343h.a(fz2Var.e(wr2Var, wr2Var.f16883j, ob0Var));
    }

    @Override // com.google.android.gms.internal.ads.x41
    public final void e(h2.z2 z2Var) {
        if (((Boolean) h2.y.c().b(ns.f12194t1)).booleanValue()) {
            this.f15343h.a(this.f15342g.c(this.f15340e, this.f15341f, fz2.f(2, z2Var.f22383a, this.f15341f.f16897q)));
        }
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void l() {
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void m() {
        fz2 fz2Var = this.f15342g;
        ks2 ks2Var = this.f15340e;
        wr2 wr2Var = this.f15341f;
        this.f15343h.a(fz2Var.c(ks2Var, wr2Var, wr2Var.f16885k));
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void n() {
        fz2 fz2Var = this.f15342g;
        ks2 ks2Var = this.f15340e;
        wr2 wr2Var = this.f15341f;
        this.f15343h.a(fz2Var.c(ks2Var, wr2Var, wr2Var.f16881i));
    }

    final /* synthetic */ void x() {
        this.f15337b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pv0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13152a.E();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final void z() {
        if (this.f15351p.compareAndSet(false, true)) {
            int iIntValue = ((Integer) h2.y.c().b(ns.f12212v3)).intValue();
            if (iIntValue > 0) {
                G(iIntValue, ((Integer) h2.y.c().b(ns.f12220w3)).intValue());
                return;
            }
            if (((Boolean) h2.y.c().b(ns.f12204u3)).booleanValue()) {
                this.f15338c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11065a.x();
                    }
                });
            } else {
                E();
            }
        }
    }
}
