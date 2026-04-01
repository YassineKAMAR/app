package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f13403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f13404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f13405c;

    public qc4() {
        this.f13403a = -9223372036854775807L;
        this.f13404b = -3.4028235E38f;
        this.f13405c = -9223372036854775807L;
    }

    /* synthetic */ qc4(sc4 sc4Var, pc4 pc4Var) {
        this.f13403a = sc4Var.f14605a;
        this.f13404b = sc4Var.f14606b;
        this.f13405c = sc4Var.f14607c;
    }

    public final qc4 d(long j8) {
        boolean z7 = true;
        if (j8 < 0) {
            if (j8 == -9223372036854775807L) {
                j8 = -9223372036854775807L;
            } else {
                z7 = false;
            }
        }
        uu1.d(z7);
        this.f13405c = j8;
        return this;
    }

    public final qc4 e(long j8) {
        this.f13403a = j8;
        return this;
    }

    public final qc4 f(float f8) {
        boolean z7 = true;
        if (f8 <= 0.0f && f8 != -3.4028235E38f) {
            z7 = false;
        }
        uu1.d(z7);
        this.f13404b = f8;
        return this;
    }

    public final sc4 g() {
        return new sc4(this, null);
    }
}
