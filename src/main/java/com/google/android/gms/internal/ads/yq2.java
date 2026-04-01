package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class yq2 implements r2.a, v51, j41, g41, x41, t61, ip2, hc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final du2 f17902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f17903b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f17904c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f17905d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f17906e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f17907f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f17908g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference f17909h = new AtomicReference();

    public yq2(du2 du2Var) {
        this.f17902a = du2Var;
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final void A(final h2.z2 z2Var) {
        final int i8 = z2Var.f22383a;
        wo2.a(this.f17904c, new vo2() { // from class: com.google.android.gms.internal.ads.rq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((pc0) obj).a(z2Var);
            }
        });
        wo2.a(this.f17904c, new vo2() { // from class: com.google.android.gms.internal.ads.sq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((pc0) obj).g(i8);
            }
        });
        wo2.a(this.f17906e, new vo2() { // from class: com.google.android.gms.internal.ads.tq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vb0) obj).F(i8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final void B() {
        wo2.a(this.f17904c, new vo2() { // from class: com.google.android.gms.internal.ads.kq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((pc0) obj).q();
            }
        });
        wo2.a(this.f17906e, new vo2() { // from class: com.google.android.gms.internal.ads.lq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vb0) obj).r();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void C() {
    }

    public final void D(lc0 lc0Var) {
        this.f17905d.set(lc0Var);
    }

    public final void E(pc0 pc0Var) {
        this.f17904c.set(pc0Var);
    }

    @Deprecated
    public final void G(vb0 vb0Var) {
        this.f17906e.set(vb0Var);
    }

    @Deprecated
    public final void J(pb0 pb0Var) {
        this.f17908g.set(pb0Var);
    }

    public final void K(qc0 qc0Var) {
        this.f17907f.set(qc0Var);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void a(final ob0 ob0Var, final String str, final String str2) {
        wo2.a(this.f17905d, new vo2() { // from class: com.google.android.gms.internal.ads.xq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ob0 ob0Var2 = ob0Var;
                ((lc0) obj).I1(new zc0(ob0Var2.l(), ob0Var2.k()));
            }
        });
        wo2.a(this.f17907f, new vo2() { // from class: com.google.android.gms.internal.ads.cq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ob0 ob0Var2 = ob0Var;
                ((qc0) obj).q3(new zc0(ob0Var2.l(), ob0Var2.k()), str, str2);
            }
        });
        wo2.a(this.f17906e, new vo2() { // from class: com.google.android.gms.internal.ads.eq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vb0) obj).g2(ob0Var);
            }
        });
        wo2.a(this.f17908g, new vo2() { // from class: com.google.android.gms.internal.ads.fq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((pb0) obj).q3(ob0Var, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.t61
    public final void b(final h2.y4 y4Var) {
        wo2.a(this.f17909h, new vo2() { // from class: com.google.android.gms.internal.ads.jq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f2) obj).p4(y4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.x41
    public final void e(final h2.z2 z2Var) {
        wo2.a(this.f17905d, new vo2() { // from class: com.google.android.gms.internal.ads.oq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((lc0) obj).w3(z2Var);
            }
        });
        wo2.a(this.f17905d, new vo2() { // from class: com.google.android.gms.internal.ads.pq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((lc0) obj).S(z2Var.f22383a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void f0() {
        wo2.a(this.f17905d, new vo2() { // from class: com.google.android.gms.internal.ads.nq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((lc0) obj).m();
            }
        });
    }

    @Override // r2.a
    public final void h() {
        wo2.a(this.f17903b, new vo2() { // from class: com.google.android.gms.internal.ads.mq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((r2.a) obj).h();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void j() {
        this.f17902a.a();
        wo2.a(this.f17905d, new vo2() { // from class: com.google.android.gms.internal.ads.uq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((lc0) obj).q();
            }
        });
        wo2.a(this.f17906e, new vo2() { // from class: com.google.android.gms.internal.ads.vq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vb0) obj).n();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void k() {
        wo2.a(this.f17906e, new vo2() { // from class: com.google.android.gms.internal.ads.wq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vb0) obj).o();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void l() {
        wo2.a(this.f17905d, new vo2() { // from class: com.google.android.gms.internal.ads.gq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((lc0) obj).t();
            }
        });
        wo2.a(this.f17906e, new vo2() { // from class: com.google.android.gms.internal.ads.hq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vb0) obj).t();
            }
        });
        wo2.a(this.f17905d, new vo2() { // from class: com.google.android.gms.internal.ads.iq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((lc0) obj).n();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void m() {
        wo2.a(this.f17906e, new vo2() { // from class: com.google.android.gms.internal.ads.qq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vb0) obj).s();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void n() {
        wo2.a(this.f17906e, new vo2() { // from class: com.google.android.gms.internal.ads.bq2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vb0) obj).u();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final void o(ip2 ip2Var) {
        throw null;
    }

    public final void q(r2.a aVar) {
        this.f17903b.set(aVar);
    }

    public final void w(h2.f2 f2Var) {
        this.f17909h.set(f2Var);
    }
}
