package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class kz3 extends nz3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f10394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f10395g;

    kz3(byte[] bArr, int i8, int i9) {
        super(bArr);
        rz3.E(i8, i8 + i9, bArr.length);
        this.f10394f = i8;
        this.f10395g = i9;
    }

    @Override // com.google.android.gms.internal.ads.nz3
    protected final int R() {
        return this.f10394f;
    }

    @Override // com.google.android.gms.internal.ads.nz3, com.google.android.gms.internal.ads.rz3
    public final byte e(int i8) {
        rz3.O(i8, this.f10395g);
        return this.f12315e[this.f10394f + i8];
    }

    @Override // com.google.android.gms.internal.ads.nz3, com.google.android.gms.internal.ads.rz3
    final byte g(int i8) {
        return this.f12315e[this.f10394f + i8];
    }

    @Override // com.google.android.gms.internal.ads.nz3, com.google.android.gms.internal.ads.rz3
    public final int n() {
        return this.f10395g;
    }

    @Override // com.google.android.gms.internal.ads.nz3, com.google.android.gms.internal.ads.rz3
    protected final void p(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f12315e, this.f10394f + i8, bArr, i9, i10);
    }
}
