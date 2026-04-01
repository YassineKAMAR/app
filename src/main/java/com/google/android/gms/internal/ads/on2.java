package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class on2 implements j41, h61, ip2, i2.u, t61, x41, hc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final du2 f12564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f12565b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f12566c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f12567d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f12568e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f12569f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f12570g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private on2 f12571h = null;

    public on2(du2 du2Var) {
        this.f12564a = du2Var;
    }

    public static on2 a(on2 on2Var) {
        on2 on2Var2 = new on2(on2Var.f12564a);
        on2Var2.f12571h = on2Var;
        return on2Var2;
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final void A(final h2.z2 z2Var) {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.A(z2Var);
        } else {
            wo2.a(this.f12565b, new vo2() { // from class: com.google.android.gms.internal.ads.jn2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((rm) obj).R4(z2Var);
                }
            });
            wo2.a(this.f12565b, new vo2() { // from class: com.google.android.gms.internal.ads.kn2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((rm) obj).d(z2Var.f22383a);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void C() {
    }

    @Override // i2.u
    public final void G5() {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.G5();
            return;
        }
        wo2.a(this.f12569f, new vo2() { // from class: com.google.android.gms.internal.ads.nn2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((i2.u) obj).G5();
            }
        });
        wo2.a(this.f12567d, new vo2() { // from class: com.google.android.gms.internal.ads.an2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vm) obj).n();
            }
        });
        wo2.a(this.f12567d, new vo2() { // from class: com.google.android.gms.internal.ads.bn2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vm) obj).m();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.t61
    public final void b(final h2.y4 y4Var) {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.b(y4Var);
        } else {
            wo2.a(this.f12570g, new vo2() { // from class: com.google.android.gms.internal.ads.zm2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((h2.f2) obj).p4(y4Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.x41
    public final void e(final h2.z2 z2Var) {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.e(z2Var);
        } else {
            wo2.a(this.f12567d, new vo2() { // from class: com.google.android.gms.internal.ads.dn2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((vm) obj).F0(z2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void f0() {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.f0();
        } else {
            wo2.a(this.f12567d, new vo2() { // from class: com.google.android.gms.internal.ads.fn2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((vm) obj).k();
                }
            });
        }
    }

    public final void h() {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.h();
            return;
        }
        this.f12564a.a();
        wo2.a(this.f12566c, new vo2() { // from class: com.google.android.gms.internal.ads.gn2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((sm) obj).j();
            }
        });
        wo2.a(this.f12567d, new vo2() { // from class: com.google.android.gms.internal.ads.hn2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((vm) obj).l();
            }
        });
    }

    @Override // i2.u
    public final void h5() {
    }

    public final void j(final om omVar) {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.j(omVar);
        } else {
            wo2.a(this.f12565b, new vo2() { // from class: com.google.android.gms.internal.ads.en2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((rm) obj).g3(omVar);
                }
            });
        }
    }

    public final void k(i2.u uVar) {
        this.f12569f.set(uVar);
    }

    @Override // i2.u
    public final void k0() {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.k0();
        } else {
            wo2.a(this.f12569f, new vo2() { // from class: com.google.android.gms.internal.ads.cn2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((i2.u) obj).k0();
                }
            });
        }
    }

    public final void l(h2.f2 f2Var) {
        this.f12570g.set(f2Var);
    }

    public final void m(rm rmVar) {
        this.f12565b.set(rmVar);
    }

    public final void n(vm vmVar) {
        this.f12567d.set(vmVar);
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final void o(ip2 ip2Var) {
        this.f12571h = (on2) ip2Var;
    }

    @Override // com.google.android.gms.internal.ads.h61
    public final void q() {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.q();
        } else {
            wo2.a(this.f12568e, new vo2() { // from class: com.google.android.gms.internal.ads.ln2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((h61) obj).q();
                }
            });
        }
    }

    @Override // i2.u
    public final void q3() {
    }

    @Override // i2.u
    public final void v0(final int i8) {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.v0(i8);
        } else {
            wo2.a(this.f12569f, new vo2() { // from class: com.google.android.gms.internal.ads.in2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((i2.u) obj).v0(i8);
                }
            });
        }
    }

    @Override // i2.u
    public final void y4() {
        on2 on2Var = this.f12571h;
        if (on2Var != null) {
            on2Var.y4();
        } else {
            wo2.a(this.f12569f, new vo2() { // from class: com.google.android.gms.internal.ads.mn2
                @Override // com.google.android.gms.internal.ads.vo2
                public final void a(Object obj) {
                    ((i2.u) obj).y4();
                }
            });
        }
    }
}
