package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f11835a = new byte[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11837c;

    public nf(byte[] bArr) {
        for (int i8 = 0; i8 < 256; i8++) {
            this.f11835a[i8] = (byte) i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            byte[] bArr2 = this.f11835a;
            byte b8 = bArr2[i10];
            i9 = (i9 + b8 + bArr[i10 % bArr.length]) & 255;
            bArr2[i10] = bArr2[i9];
            bArr2[i9] = b8;
        }
        this.f11836b = 0;
        this.f11837c = 0;
    }

    public final void a(byte[] bArr) {
        int i8 = this.f11836b;
        int i9 = this.f11837c;
        for (int i10 = 0; i10 < 256; i10++) {
            byte[] bArr2 = this.f11835a;
            i8 = (i8 + 1) & 255;
            byte b8 = bArr2[i8];
            i9 = (i9 + b8) & 255;
            bArr2[i8] = bArr2[i9];
            bArr2[i9] = b8;
            bArr[i10] = (byte) (bArr2[(bArr2[i8] + b8) & 255] ^ bArr[i10]);
        }
        this.f11836b = i8;
        this.f11837c = i9;
    }
}
