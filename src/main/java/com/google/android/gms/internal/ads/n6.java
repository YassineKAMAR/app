package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class n6 implements k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f11692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11696e;

    public n6(f6 f6Var) {
        dq2 dq2Var = f6Var.f7629b;
        this.f11692a = dq2Var;
        dq2Var.g(12);
        this.f11694c = dq2Var.x() & 255;
        this.f11693b = dq2Var.x();
    }

    @Override // com.google.android.gms.internal.ads.k6
    public final int j() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.k6
    public final int k() {
        return this.f11693b;
    }

    @Override // com.google.android.gms.internal.ads.k6
    public final int l() {
        int i8 = this.f11694c;
        if (i8 == 8) {
            return this.f11692a.u();
        }
        if (i8 == 16) {
            return this.f11692a.y();
        }
        int i9 = this.f11695d;
        this.f11695d = i9 + 1;
        if (i9 % 2 != 0) {
            return this.f11696e & 15;
        }
        int iU = this.f11692a.u();
        this.f11696e = iU;
        return (iU & 240) >> 4;
    }
}
