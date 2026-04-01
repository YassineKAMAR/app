package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class mm4 extends hm4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f11413i = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f11414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f11415h;

    private mm4(s11 s11Var, Object obj, Object obj2) {
        super(s11Var);
        this.f11414g = obj;
        this.f11415h = obj2;
    }

    public static mm4 q(c50 c50Var) {
        return new mm4(new nm4(c50Var), r01.f13823p, f11413i);
    }

    public static mm4 r(s11 s11Var, Object obj, Object obj2) {
        return new mm4(s11Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.hm4, com.google.android.gms.internal.ads.s11
    public final int a(Object obj) {
        Object obj2;
        if (f11413i.equals(obj) && (obj2 = this.f11415h) != null) {
            obj = obj2;
        }
        return this.f8831f.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.hm4, com.google.android.gms.internal.ads.s11
    public final py0 d(int i8, py0 py0Var, boolean z7) {
        this.f8831f.d(i8, py0Var, z7);
        if (nz2.e(py0Var.f13190b, this.f11415h) && z7) {
            py0Var.f13190b = f11413i;
        }
        return py0Var;
    }

    @Override // com.google.android.gms.internal.ads.hm4, com.google.android.gms.internal.ads.s11
    public final r01 e(int i8, r01 r01Var, long j8) {
        this.f8831f.e(i8, r01Var, j8);
        if (nz2.e(r01Var.f13834a, this.f11414g)) {
            r01Var.f13834a = r01.f13823p;
        }
        return r01Var;
    }

    @Override // com.google.android.gms.internal.ads.hm4, com.google.android.gms.internal.ads.s11
    public final Object f(int i8) {
        Object objF = this.f8831f.f(i8);
        return nz2.e(objF, this.f11415h) ? f11413i : objF;
    }

    public final mm4 p(s11 s11Var) {
        return new mm4(s11Var, this.f11414g, this.f11415h);
    }
}
