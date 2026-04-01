package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class va2 implements a2.e, f71, v51, j41, b51, h2.a, g41, t61, x41, hc1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final mx2 f16096i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f16088a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f16089b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f16090c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f16091d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f16092e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f16093f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f16094g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f16095h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final BlockingQueue f16097j = new ArrayBlockingQueue(((Integer) h2.y.c().b(ns.C8)).intValue());

    public va2(mx2 mx2Var) {
        this.f16096i = mx2Var;
    }

    private final void K() {
        if (this.f16094g.get() && this.f16095h.get()) {
            for (final Pair pair : this.f16097j) {
                wo2.a(this.f16089b, new vo2() { // from class: com.google.android.gms.internal.ads.fa2
                    @Override // com.google.android.gms.internal.ads.vo2
                    public final void a(Object obj) {
                        Pair pair2 = pair;
                        ((h2.a1) obj).B0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f16097j.clear();
            this.f16093f.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final void A(final h2.z2 z2Var) {
        wo2.a(this.f16088a, new vo2() { // from class: com.google.android.gms.internal.ads.ga2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f0) obj).a(z2Var);
            }
        });
        wo2.a(this.f16088a, new vo2() { // from class: com.google.android.gms.internal.ads.ha2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f0) obj).g(z2Var.f22383a);
            }
        });
        wo2.a(this.f16091d, new vo2() { // from class: com.google.android.gms.internal.ads.ia2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.i0) obj).z0(z2Var);
            }
        });
        this.f16093f.set(false);
        this.f16097j.clear();
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final synchronized void B() {
        wo2.a(this.f16088a, new vo2() { // from class: com.google.android.gms.internal.ads.ja2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f0) obj).r();
            }
        });
        wo2.a(this.f16091d, new vo2() { // from class: com.google.android.gms.internal.ads.la2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.i0) obj).l();
            }
        });
        this.f16095h.set(true);
        K();
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void C() {
        wo2.a(this.f16088a, new vo2() { // from class: com.google.android.gms.internal.ads.pa2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f0) obj).s();
            }
        });
    }

    public final void D(h2.i0 i0Var) {
        this.f16091d.set(i0Var);
    }

    public final void E(h2.f2 f2Var) {
        this.f16090c.set(f2Var);
    }

    public final void G(h2.a1 a1Var) {
        this.f16089b.set(a1Var);
        this.f16094g.set(true);
        K();
    }

    public final void J(h2.h1 h1Var) {
        this.f16092e.set(h1Var);
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void U(ks2 ks2Var) {
        this.f16093f.set(true);
        this.f16095h.set(false);
    }

    @Override // h2.a
    public final void Z() {
        if (((Boolean) h2.y.c().b(ns.U9)).booleanValue()) {
            return;
        }
        wo2.a(this.f16088a, ta2.f15023a);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void a(ob0 ob0Var, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.t61
    public final void b(final h2.y4 y4Var) {
        wo2.a(this.f16090c, new vo2() { // from class: com.google.android.gms.internal.ads.ua2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f2) obj).p4(y4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.x41
    public final void e(final h2.z2 z2Var) {
        wo2.a(this.f16092e, new vo2() { // from class: com.google.android.gms.internal.ads.ma2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.h1) obj).F0(z2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void f0() {
        if (((Boolean) h2.y.c().b(ns.U9)).booleanValue()) {
            wo2.a(this.f16088a, ta2.f15023a);
        }
        wo2.a(this.f16092e, new vo2() { // from class: com.google.android.gms.internal.ads.ea2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.h1) obj).k();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void g0(ya0 ya0Var) {
    }

    public final synchronized h2.f0 h() {
        return (h2.f0) this.f16088a.get();
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void j() {
        wo2.a(this.f16088a, new vo2() { // from class: com.google.android.gms.internal.ads.ca2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f0) obj).p();
            }
        });
        wo2.a(this.f16092e, new vo2() { // from class: com.google.android.gms.internal.ads.da2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.h1) obj).l();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void k() {
        wo2.a(this.f16088a, new vo2() { // from class: com.google.android.gms.internal.ads.oa2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f0) obj).o();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void l() {
        wo2.a(this.f16088a, new vo2() { // from class: com.google.android.gms.internal.ads.qa2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f0) obj).t();
            }
        });
        wo2.a(this.f16092e, new vo2() { // from class: com.google.android.gms.internal.ads.ra2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.h1) obj).n();
            }
        });
        wo2.a(this.f16092e, new vo2() { // from class: com.google.android.gms.internal.ads.sa2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.h1) obj).m();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void n() {
    }

    public final synchronized h2.a1 o() {
        return (h2.a1) this.f16089b.get();
    }

    public final void q(h2.f0 f0Var) {
        this.f16088a.set(f0Var);
    }

    @Override // a2.e
    public final synchronized void w(final String str, final String str2) {
        if (!this.f16093f.get()) {
            wo2.a(this.f16089b, new vo2() { // from class: com.google.android.gms.internal.ads.na2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((h2.a1) obj).B0(str, str2);
                }
            });
            return;
        }
        if (!this.f16097j.offer(new Pair(str, str2))) {
            qg0.b("The queue for app events is full, dropping the new event.");
            mx2 mx2Var = this.f16096i;
            if (mx2Var != null) {
                lx2 lx2VarB = lx2.b("dae_action");
                lx2VarB.a("dae_name", str);
                lx2VarB.a("dae_data", str2);
                mx2Var.a(lx2VarB);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final void z() {
        wo2.a(this.f16088a, new vo2() { // from class: com.google.android.gms.internal.ads.ba2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f0) obj).q();
            }
        });
    }
}
