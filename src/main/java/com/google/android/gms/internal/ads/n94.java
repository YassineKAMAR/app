package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class n94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f11746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f11747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f11749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f11750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f11754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m94 f11755j;

    public n94() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f11754i = cryptoInfo;
        this.f11755j = nz2.f12300a >= 24 ? new m94(cryptoInfo, null) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return this.f11754i;
    }

    public final void b(int i8) {
        if (i8 == 0) {
            return;
        }
        if (this.f11749d == null) {
            int[] iArr = new int[1];
            this.f11749d = iArr;
            this.f11754i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f11749d;
        iArr2[0] = iArr2[0] + i8;
    }

    public final void c(int i8, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i9, int i10, int i11) {
        this.f11751f = i8;
        this.f11749d = iArr;
        this.f11750e = iArr2;
        this.f11747b = bArr;
        this.f11746a = bArr2;
        this.f11748c = i9;
        this.f11752g = i10;
        this.f11753h = i11;
        MediaCodec.CryptoInfo cryptoInfo = this.f11754i;
        cryptoInfo.numSubSamples = i8;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i9;
        if (nz2.f12300a >= 24) {
            m94 m94Var = this.f11755j;
            m94Var.getClass();
            m94.a(m94Var, i10, i11);
        }
    }
}
