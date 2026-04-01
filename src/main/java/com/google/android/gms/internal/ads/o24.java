package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class o24 implements e34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k24 f12352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v34 f12353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n04 f12355d;

    private o24(v34 v34Var, n04 n04Var, k24 k24Var) {
        this.f12353b = v34Var;
        this.f12354c = n04Var.h(k24Var);
        this.f12355d = n04Var;
        this.f12352a = k24Var;
    }

    static o24 j(v34 v34Var, n04 n04Var, k24 k24Var) {
        return new o24(v34Var, n04Var, k24Var);
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final int a(Object obj) {
        v34 v34Var = this.f12353b;
        int iB = v34Var.b(v34Var.d(obj));
        if (!this.f12354c) {
            return iB;
        }
        this.f12355d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final int b(Object obj) {
        int iHashCode = this.f12353b.d(obj).hashCode();
        if (!this.f12354c) {
            return iHashCode;
        }
        this.f12355d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final void c(Object obj) {
        this.f12353b.m(obj);
        this.f12355d.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final boolean d(Object obj) {
        this.f12355d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final void e(Object obj, Object obj2) {
        g34.x(this.f12353b, obj, obj2);
        if (this.f12354c) {
            this.f12355d.a(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final boolean f(Object obj, Object obj2) {
        v34 v34Var = this.f12353b;
        if (!v34Var.d(obj).equals(v34Var.d(obj2))) {
            return false;
        }
        if (!this.f12354c) {
            return true;
        }
        this.f12355d.a(obj);
        this.f12355d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final void g(Object obj, byte[] bArr, int i8, int i9, dz3 dz3Var) {
        z04 z04Var = (z04) obj;
        if (z04Var.zzc == w34.c()) {
            z04Var.zzc = w34.f();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final void h(Object obj, i04 i04Var) {
        this.f12355d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final void i(Object obj, v24 v24Var, m04 m04Var) {
        boolean zI;
        v34 v34Var = this.f12353b;
        Object objC = v34Var.c(obj);
        n04 n04Var = this.f12355d;
        r04 r04VarB = n04Var.b(obj);
        while (v24Var.l() != Integer.MAX_VALUE) {
            try {
                int iP = v24Var.p();
                if (iP != 11) {
                    if ((iP & 7) == 2) {
                        Object objC2 = n04Var.c(m04Var, this.f12352a, iP >>> 3);
                        if (objC2 != null) {
                            n04Var.f(v24Var, objC2, m04Var, r04VarB);
                        } else {
                            zI = v34Var.p(objC, v24Var);
                        }
                    } else {
                        zI = v24Var.I();
                    }
                    if (!zI) {
                        return;
                    }
                } else {
                    int iT = 0;
                    Object objC3 = null;
                    rz3 rz3VarY = null;
                    while (v24Var.l() != Integer.MAX_VALUE) {
                        int iP2 = v24Var.p();
                        if (iP2 == 16) {
                            iT = v24Var.t();
                            objC3 = n04Var.c(m04Var, this.f12352a, iT);
                        } else if (iP2 == 26) {
                            if (objC3 != null) {
                                n04Var.f(v24Var, objC3, m04Var, r04VarB);
                            } else {
                                rz3VarY = v24Var.y();
                            }
                        } else if (!v24Var.I()) {
                            break;
                        }
                    }
                    if (v24Var.p() != 12) {
                        throw m14.b();
                    }
                    if (rz3VarY != null) {
                        if (objC3 != null) {
                            n04Var.g(rz3VarY, objC3, m04Var, r04VarB);
                        } else {
                            v34Var.k(objC, iT, rz3VarY);
                        }
                    }
                }
            } finally {
                v34Var.n(obj, objC);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e34
    public final Object m() {
        k24 k24Var = this.f12352a;
        return k24Var instanceof z04 ? ((z04) k24Var).o() : k24Var.k().a();
    }
}
