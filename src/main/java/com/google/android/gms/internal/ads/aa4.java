package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class aa4 implements sd4, ud4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5172b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private vd4 f5174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private pg4 f5176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private vv1 f5177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private lo4 f5179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private nb[] f5180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5182l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private td4 f5186p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5171a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nc4 f5173c = new nc4();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5183m = Long.MIN_VALUE;

    public aa4(int i8) {
        this.f5172b = i8;
    }

    private final void F(long j8, boolean z7) {
        this.f5184n = false;
        this.f5182l = j8;
        this.f5183m = j8;
        W(j8, z7);
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final void A() {
        lo4 lo4Var = this.f5179i;
        lo4Var.getClass();
        lo4Var.p();
    }

    protected abstract void B(nb[] nbVarArr, long j8, long j9);

    @Override // com.google.android.gms.internal.ads.sd4
    public /* synthetic */ void C() {
    }

    protected final boolean D() {
        if (H()) {
            return this.f5184n;
        }
        lo4 lo4Var = this.f5179i;
        lo4Var.getClass();
        return lo4Var.m();
    }

    protected final nb[] E() {
        nb[] nbVarArr = this.f5180j;
        nbVarArr.getClass();
        return nbVarArr;
    }

    protected final int G(nc4 nc4Var, q94 q94Var, int i8) {
        lo4 lo4Var = this.f5179i;
        lo4Var.getClass();
        int iA = lo4Var.a(nc4Var, q94Var, i8);
        if (iA == -4) {
            if (q94Var.f()) {
                this.f5183m = Long.MIN_VALUE;
                return this.f5184n ? -4 : -3;
            }
            long j8 = q94Var.f13364f + this.f5181k;
            q94Var.f13364f = j8;
            this.f5183m = Math.max(this.f5183m, j8);
        } else if (iA == -5) {
            nb nbVar = nc4Var.f11825a;
            nbVar.getClass();
            long j9 = nbVar.f11797p;
            if (j9 != Long.MAX_VALUE) {
                l9 l9VarB = nbVar.b();
                l9VarB.y(j9 + this.f5181k);
                nc4Var.f11825a = l9VarB.D();
                return -5;
            }
        }
        return iA;
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final boolean H() {
        return this.f5183m == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final boolean I() {
        return this.f5184n;
    }

    protected final int J(long j8) {
        lo4 lo4Var = this.f5179i;
        lo4Var.getClass();
        return lo4Var.b(j8 - this.f5181k);
    }

    protected final long K() {
        return this.f5182l;
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final void L() {
        uu1.f(this.f5178h == 1);
        this.f5178h = 2;
        v();
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final void M() {
        uu1.f(this.f5178h == 2);
        this.f5178h = 1;
        x();
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final void N() {
        uu1.f(this.f5178h == 0);
        Y();
    }

    protected final vv1 O() {
        vv1 vv1Var = this.f5177g;
        vv1Var.getClass();
        return vv1Var;
    }

    protected final ja4 P(Throwable th, nb nbVar, boolean z7, int i8) {
        int i9;
        if (nbVar == null || this.f5185o) {
            i9 = 4;
        } else {
            this.f5185o = true;
            try {
                int iO = o(nbVar) & 7;
                this.f5185o = false;
                i9 = iO;
            } catch (ja4 unused) {
                this.f5185o = false;
                i9 = 4;
            } catch (Throwable th2) {
                this.f5185o = false;
                throw th2;
            }
        }
        return ja4.b(th, c(), this.f5175e, nbVar, i9, z7, i8);
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final void Q() {
        this.f5184n = true;
    }

    protected final nc4 R() {
        nc4 nc4Var = this.f5173c;
        nc4Var.f11826b = null;
        nc4Var.f11825a = null;
        return nc4Var;
    }

    protected final vd4 S() {
        vd4 vd4Var = this.f5174d;
        vd4Var.getClass();
        return vd4Var;
    }

    protected final pg4 T() {
        pg4 pg4Var = this.f5176f;
        pg4Var.getClass();
        return pg4Var;
    }

    protected abstract void U();

    protected void V(boolean z7, boolean z8) {
    }

    protected abstract void W(long j8, boolean z7);

    @Override // com.google.android.gms.internal.ads.sd4
    public final void X() {
        uu1.f(this.f5178h == 0);
        nc4 nc4Var = this.f5173c;
        nc4Var.f11826b = null;
        nc4Var.f11825a = null;
        t();
    }

    protected void Y() {
    }

    @Override // com.google.android.gms.internal.ads.nd4
    public void a(int i8, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public /* synthetic */ void b(float f8, float f9) {
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final int e() {
        return this.f5178h;
    }

    @Override // com.google.android.gms.internal.ads.ud4
    public final void f(td4 td4Var) {
        synchronized (this.f5171a) {
            this.f5186p = td4Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final void g(nb[] nbVarArr, lo4 lo4Var, long j8, long j9) {
        uu1.f(!this.f5184n);
        this.f5179i = lo4Var;
        if (this.f5183m == Long.MIN_VALUE) {
            this.f5183m = j8;
        }
        this.f5180j = nbVarArr;
        this.f5181k = j9;
        B(nbVarArr, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final void h(int i8, pg4 pg4Var, vv1 vv1Var) {
        this.f5175e = i8;
        this.f5176f = pg4Var;
        this.f5177g = vv1Var;
    }

    @Override // com.google.android.gms.internal.ads.sd4, com.google.android.gms.internal.ads.ud4
    public final int k() {
        return this.f5172b;
    }

    @Override // com.google.android.gms.internal.ads.ud4
    public int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final void n(long j8) {
        F(j8, false);
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final void p(vd4 vd4Var, nb[] nbVarArr, lo4 lo4Var, long j8, boolean z7, boolean z8, long j9, long j10) {
        uu1.f(this.f5178h == 0);
        this.f5174d = vd4Var;
        this.f5178h = 1;
        V(z7, z8);
        g(nbVarArr, lo4Var, j9, j10);
        F(j9, z7);
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final long r() {
        return this.f5183m;
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public tc4 s() {
        return null;
    }

    protected void t() {
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final ud4 u() {
        return this;
    }

    protected void v() {
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final lo4 w() {
        return this.f5179i;
    }

    protected void x() {
    }

    @Override // com.google.android.gms.internal.ads.ud4
    public final void y() {
        synchronized (this.f5171a) {
            this.f5186p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.sd4
    public final void z() {
        uu1.f(this.f5178h == 1);
        nc4 nc4Var = this.f5173c;
        nc4Var.f11826b = null;
        nc4Var.f11825a = null;
        this.f5178h = 0;
        this.f5179i = null;
        this.f5180j = null;
        this.f5184n = false;
        U();
    }
}
