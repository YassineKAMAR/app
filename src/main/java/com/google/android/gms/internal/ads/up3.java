package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class up3 implements yp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wy3 f15796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bw3 f15797b;

    private up3(bw3 bw3Var, wy3 wy3Var) {
        this.f15797b = bw3Var;
        this.f15796a = wy3Var;
    }

    public static up3 a(bw3 bw3Var) {
        return new up3(bw3Var, iq3.a(bw3Var.R()));
    }

    public final bw3 b() {
        return this.f15797b;
    }

    @Override // com.google.android.gms.internal.ads.yp3
    public final wy3 p() {
        throw null;
    }
}
