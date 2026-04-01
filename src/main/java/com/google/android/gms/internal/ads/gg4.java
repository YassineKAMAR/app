package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gg4 implements de4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vv1 f8313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final py0 f8314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r01 f8315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fg4 f8316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f8317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private mc2 f8318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private lu0 f8319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g62 f8320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8321i;

    public gg4(vv1 vv1Var) {
        vv1Var.getClass();
        this.f8313a = vv1Var;
        this.f8318f = new mc2(nz2.I(), vv1Var, new ka2() { // from class: com.google.android.gms.internal.ads.if4
            @Override // com.google.android.gms.internal.ads.ka2
            public final void a(Object obj, i6 i6Var) {
            }
        });
        py0 py0Var = new py0();
        this.f8314b = py0Var;
        this.f8315c = new r01();
        this.f8316d = new fg4(py0Var);
        this.f8317e = new SparseArray();
    }

    public static /* synthetic */ void Z(gg4 gg4Var) {
        final ee4 ee4VarW = gg4Var.W();
        gg4Var.b0(ee4VarW, 1028, new j92() { // from class: com.google.android.gms.internal.ads.ie4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
        gg4Var.f8318f.e();
    }

    private final ee4 c0(tm4 tm4Var) {
        this.f8319g.getClass();
        s11 s11VarA = tm4Var == null ? null : this.f8316d.a(tm4Var);
        if (tm4Var != null && s11VarA != null) {
            return X(s11VarA, s11VarA.n(tm4Var.f15161a, this.f8314b).f13191c, tm4Var);
        }
        int iP = this.f8319g.p();
        s11 s11VarV = this.f8319g.v();
        if (iP >= s11VarV.c()) {
            s11VarV = s11.f14453a;
        }
        return X(s11VarV, iP, null);
    }

    private final ee4 d0(int i8, tm4 tm4Var) {
        lu0 lu0Var = this.f8319g;
        lu0Var.getClass();
        if (tm4Var != null) {
            return this.f8316d.a(tm4Var) != null ? c0(tm4Var) : X(s11.f14453a, i8, tm4Var);
        }
        s11 s11VarV = lu0Var.v();
        if (i8 >= s11VarV.c()) {
            s11VarV = s11.f14453a;
        }
        return X(s11VarV, i8, null);
    }

    private final ee4 e0() {
        return c0(this.f8316d.d());
    }

    private final ee4 f0() {
        return c0(this.f8316d.e());
    }

    private final ee4 g0(bk0 bk0Var) {
        tm4 tm4Var;
        return (!(bk0Var instanceof ja4) || (tm4Var = ((ja4) bk0Var).f9553n) == null) ? W() : c0(tm4Var);
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void A(final long j8, final int i8) {
        final ee4 ee4VarE0 = e0();
        b0(ee4VarE0, 1021, new j92(j8, i8) { // from class: com.google.android.gms.internal.ads.jf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void B(final int i8, final int i9) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 24, new j92(i8, i9) { // from class: com.google.android.gms.internal.ads.cg4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void C(int i8, tm4 tm4Var, final km4 km4Var, final pm4 pm4Var) {
        final ee4 ee4VarD0 = d0(i8, tm4Var);
        b0(ee4VarD0, 1002, new j92() { // from class: com.google.android.gms.internal.ads.lf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void D(int i8, tm4 tm4Var, final pm4 pm4Var) {
        final ee4 ee4VarD0 = d0(i8, tm4Var);
        b0(ee4VarD0, 1004, new j92() { // from class: com.google.android.gms.internal.ads.kf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ge4) obj).k(ee4VarD0, pm4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void E() {
        if (this.f8321i) {
            return;
        }
        final ee4 ee4VarW = W();
        this.f8321i = true;
        b0(ee4VarW, -1, new j92() { // from class: com.google.android.gms.internal.ads.tf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void F(int i8, tm4 tm4Var, final km4 km4Var, final pm4 pm4Var, final IOException iOException, final boolean z7) {
        final ee4 ee4VarD0 = d0(i8, tm4Var);
        b0(ee4VarD0, 1003, new j92() { // from class: com.google.android.gms.internal.ads.ve4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ge4) obj).f(ee4VarD0, km4Var, pm4Var, iOException, z7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void G(final int i8, final long j8) {
        final ee4 ee4VarE0 = e0();
        b0(ee4VarE0, 1018, new j92() { // from class: com.google.android.gms.internal.ads.ff4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ge4) obj).q(ee4VarE0, i8, j8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void H() {
        g62 g62Var = this.f8320h;
        uu1.b(g62Var);
        g62Var.h(new Runnable() { // from class: com.google.android.gms.internal.ads.xf4
            @Override // java.lang.Runnable
            public final void run() {
                gg4.Z(this.f17208a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void I(final String str) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1012, new j92() { // from class: com.google.android.gms.internal.ads.le4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void J(final ba4 ba4Var) {
        final ee4 ee4VarE0 = e0();
        b0(ee4VarE0, 1020, new j92() { // from class: com.google.android.gms.internal.ads.rf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ge4) obj).d(ee4VarE0, ba4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void K(final float f8) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 22, new j92(f8) { // from class: com.google.android.gms.internal.ads.se4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void L(final boolean z7, final int i8) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, -1, new j92(z7, i8) { // from class: com.google.android.gms.internal.ads.xe4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void M(final int i8, final long j8, final long j9) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1011, new j92(i8, j8, j9) { // from class: com.google.android.gms.internal.ads.ue4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void N(final String str, final long j8, final long j9) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1008, new j92(str, j9, j8) { // from class: com.google.android.gms.internal.ads.bf4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f5775b;

            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.vq4
    public final void O(final int i8, final long j8, final long j9) {
        final ee4 ee4VarC0 = c0(this.f8316d.c());
        b0(ee4VarC0, 1006, new j92() { // from class: com.google.android.gms.internal.ads.re4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ge4) obj).b(ee4VarC0, i8, j8, j9);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void P(final c50 c50Var, final int i8) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, 1, new j92(c50Var, i8) { // from class: com.google.android.gms.internal.ads.pe4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c50 f12844b;

            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void Q(final nb nbVar, final ca4 ca4Var) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1017, new j92() { // from class: com.google.android.gms.internal.ads.qf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ge4) obj).l(ee4VarF0, nbVar, ca4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void R(final bk0 bk0Var) {
        final ee4 ee4VarG0 = g0(bk0Var);
        b0(ee4VarG0, 10, new j92() { // from class: com.google.android.gms.internal.ads.gf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void S(final int i8) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, 4, new j92() { // from class: com.google.android.gms.internal.ads.of4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ge4) obj).c(ee4VarW, i8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void T(final Exception exc) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1014, new j92() { // from class: com.google.android.gms.internal.ads.bg4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void U(final Exception exc) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1029, new j92() { // from class: com.google.android.gms.internal.ads.zf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void V(ge4 ge4Var) {
        this.f8318f.f(ge4Var);
    }

    protected final ee4 W() {
        return c0(this.f8316d.b());
    }

    protected final ee4 X(s11 s11Var, int i8, tm4 tm4Var) {
        tm4 tm4Var2 = true == s11Var.o() ? null : tm4Var;
        long j8 = this.f8313a.j();
        boolean z7 = s11Var.equals(this.f8319g.v()) && i8 == this.f8319g.p();
        long jE = 0;
        if (tm4Var2 == null || !tm4Var2.b()) {
            if (z7) {
                jE = this.f8319g.t();
            } else if (!s11Var.o()) {
                long j9 = s11Var.e(i8, this.f8315c, 0L).f13845l;
                jE = nz2.E(0L);
            }
        } else if (z7 && this.f8319g.k() == tm4Var2.f15162b && this.f8319g.l() == tm4Var2.f15163c) {
            jE = this.f8319g.s();
        }
        return new ee4(j8, s11Var, i8, tm4Var2, jE, this.f8319g.v(), this.f8319g.p(), this.f8316d.b(), this.f8319g.s(), this.f8319g.x());
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void Y(final boolean z7) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 23, new j92(z7) { // from class: com.google.android.gms.internal.ads.qe4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void a(final long j8) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1010, new j92(j8) { // from class: com.google.android.gms.internal.ads.ye4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    final /* synthetic */ void a0(lu0 lu0Var, ge4 ge4Var, i6 i6Var) {
        ge4Var.h(lu0Var, new fe4(i6Var, this.f8317e));
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void b(final boolean z7) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, 7, new j92(z7) { // from class: com.google.android.gms.internal.ads.ze4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    protected final void b0(ee4 ee4Var, int i8, j92 j92Var) {
        this.f8317e.put(i8, ee4Var);
        mc2 mc2Var = this.f8318f;
        mc2Var.d(i8, j92Var);
        mc2Var.c();
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void c(final boolean z7) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, 3, new j92(z7) { // from class: com.google.android.gms.internal.ads.ke4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void d(final dm0 dm0Var) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, 12, new j92() { // from class: com.google.android.gms.internal.ads.he4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void e(final jj1 jj1Var) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 25, new j92() { // from class: com.google.android.gms.internal.ads.sf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ee4 ee4Var = ee4VarF0;
                jj1 jj1Var2 = jj1Var;
                ((ge4) obj).g(ee4Var, jj1Var2);
                int i8 = jj1Var2.f9655a;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void f(final ba4 ba4Var) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1007, new j92() { // from class: com.google.android.gms.internal.ads.je4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void g(s11 s11Var, final int i8) {
        lu0 lu0Var = this.f8319g;
        lu0Var.getClass();
        this.f8316d.i(lu0Var);
        final ee4 ee4VarW = W();
        b0(ee4VarW, 0, new j92(i8) { // from class: com.google.android.gms.internal.ads.oe4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void h(int i8, tm4 tm4Var, final km4 km4Var, final pm4 pm4Var) {
        final ee4 ee4VarD0 = d0(i8, tm4Var);
        b0(ee4VarD0, 1000, new j92() { // from class: com.google.android.gms.internal.ads.me4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void i(final int i8) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, 6, new j92(i8) { // from class: com.google.android.gms.internal.ads.df4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void j(ge4 ge4Var) {
        this.f8318f.b(ge4Var);
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void k(final nb nbVar, final ca4 ca4Var) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1009, new j92() { // from class: com.google.android.gms.internal.ads.uf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ge4) obj).a(ee4VarF0, nbVar, ca4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void l(final ba4 ba4Var) {
        final ee4 ee4VarE0 = e0();
        b0(ee4VarE0, 1013, new j92() { // from class: com.google.android.gms.internal.ads.nf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void m(final String str) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1019, new j92() { // from class: com.google.android.gms.internal.ads.ef4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void n(final ra0 ra0Var) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, 14, new j92() { // from class: com.google.android.gms.internal.ads.eg4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void o(List list, tm4 tm4Var) {
        lu0 lu0Var = this.f8319g;
        lu0Var.getClass();
        this.f8316d.h(list, tm4Var, lu0Var);
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void p(int i8, tm4 tm4Var, final km4 km4Var, final pm4 pm4Var) {
        final ee4 ee4VarD0 = d0(i8, tm4Var);
        b0(ee4VarD0, 1001, new j92() { // from class: com.google.android.gms.internal.ads.pf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void q(final String str, final long j8, final long j9) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1016, new j92(str, j9, j8) { // from class: com.google.android.gms.internal.ads.ag4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f5265b;

            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void r(final hq0 hq0Var) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, 13, new j92() { // from class: com.google.android.gms.internal.ads.ne4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void s(final Object obj, final long j8) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 26, new j92() { // from class: com.google.android.gms.internal.ads.yf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj2) {
                ((ge4) obj2).o(ee4VarF0, obj, j8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void t(final ed1 ed1Var) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, 2, new j92() { // from class: com.google.android.gms.internal.ads.af4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void u(final Exception exc) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1030, new j92() { // from class: com.google.android.gms.internal.ads.te4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void v(final lu0 lu0Var, Looper looper) {
        boolean z7 = true;
        if (this.f8319g != null && !this.f8316d.f7755b.isEmpty()) {
            z7 = false;
        }
        uu1.f(z7);
        lu0Var.getClass();
        this.f8319g = lu0Var;
        this.f8320h = this.f8313a.a(looper, null);
        this.f8318f = this.f8318f.a(looper, new ka2() { // from class: com.google.android.gms.internal.ads.we4
            @Override // com.google.android.gms.internal.ads.ka2
            public final void a(Object obj, i6 i6Var) {
                this.f16708a.a0(lu0Var, (ge4) obj, i6Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void w(final bk0 bk0Var) {
        final ee4 ee4VarG0 = g0(bk0Var);
        b0(ee4VarG0, 10, new j92() { // from class: com.google.android.gms.internal.ads.mf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ge4) obj).n(ee4VarG0, bk0Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.de4
    public final void x(final ba4 ba4Var) {
        final ee4 ee4VarF0 = f0();
        b0(ee4VarF0, 1015, new j92() { // from class: com.google.android.gms.internal.ads.wf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void y(final boolean z7, final int i8) {
        final ee4 ee4VarW = W();
        b0(ee4VarW, 5, new j92(z7, i8) { // from class: com.google.android.gms.internal.ads.hf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ir0
    public final void z(final kt0 kt0Var, final kt0 kt0Var2, final int i8) {
        if (i8 == 1) {
            this.f8321i = false;
            i8 = 1;
        }
        fg4 fg4Var = this.f8316d;
        lu0 lu0Var = this.f8319g;
        lu0Var.getClass();
        fg4Var.g(lu0Var);
        final ee4 ee4VarW = W();
        b0(ee4VarW, 11, new j92() { // from class: com.google.android.gms.internal.ads.vf4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ge4) obj).p(ee4VarW, kt0Var, kt0Var2, i8);
            }
        });
    }
}
