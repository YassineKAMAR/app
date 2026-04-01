package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class m6 implements k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dq2 f11184c;

    public m6(f6 f6Var, nb nbVar) {
        dq2 dq2Var = f6Var.f7629b;
        this.f11184c = dq2Var;
        dq2Var.g(12);
        int iX = dq2Var.x();
        if ("audio/raw".equals(nbVar.f11793l)) {
            int iX2 = nz2.x(nbVar.A, nbVar.f11806y);
            if (iX == 0 || iX % iX2 != 0) {
                pf2.f("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iX2 + ", stsz sample size: " + iX);
                iX = iX2;
            }
        }
        this.f11182a = iX == 0 ? -1 : iX;
        this.f11183b = dq2Var.x();
    }

    @Override // com.google.android.gms.internal.ads.k6
    public final int j() {
        return this.f11182a;
    }

    @Override // com.google.android.gms.internal.ads.k6
    public final int k() {
        return this.f11183b;
    }

    @Override // com.google.android.gms.internal.ads.k6
    public final int l() {
        int i8 = this.f11182a;
        return i8 == -1 ? this.f11184c.x() : i8;
    }
}
