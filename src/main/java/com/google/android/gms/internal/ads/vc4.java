package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class vc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tm4 f16104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f16111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16112i;

    vc4(tm4 tm4Var, long j8, long j9, long j10, long j11, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11 = true;
        uu1.d(!z10 || z8);
        if (z9 && !z8) {
            z11 = false;
        }
        uu1.d(z11);
        this.f16104a = tm4Var;
        this.f16105b = j8;
        this.f16106c = j9;
        this.f16107d = j10;
        this.f16108e = j11;
        this.f16109f = false;
        this.f16110g = z8;
        this.f16111h = z9;
        this.f16112i = z10;
    }

    public final vc4 a(long j8) {
        return j8 == this.f16106c ? this : new vc4(this.f16104a, this.f16105b, j8, this.f16107d, this.f16108e, false, this.f16110g, this.f16111h, this.f16112i);
    }

    public final vc4 b(long j8) {
        return j8 == this.f16105b ? this : new vc4(this.f16104a, j8, this.f16106c, this.f16107d, this.f16108e, false, this.f16110g, this.f16111h, this.f16112i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vc4.class == obj.getClass()) {
            vc4 vc4Var = (vc4) obj;
            if (this.f16105b == vc4Var.f16105b && this.f16106c == vc4Var.f16106c && this.f16107d == vc4Var.f16107d && this.f16108e == vc4Var.f16108e && this.f16110g == vc4Var.f16110g && this.f16111h == vc4Var.f16111h && this.f16112i == vc4Var.f16112i && nz2.e(this.f16104a, vc4Var.f16104a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f16104a.hashCode() + 527;
        long j8 = this.f16108e;
        long j9 = this.f16107d;
        return (((((((((((((iHashCode * 31) + ((int) this.f16105b)) * 31) + ((int) this.f16106c)) * 31) + ((int) j9)) * 31) + ((int) j8)) * 961) + (this.f16110g ? 1 : 0)) * 31) + (this.f16111h ? 1 : 0)) * 31) + (this.f16112i ? 1 : 0);
    }
}
