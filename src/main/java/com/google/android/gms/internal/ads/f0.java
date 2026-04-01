package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wl4 f7555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7557d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7560g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f7558e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f7554a = new byte[4096];

    static {
        c60.b("media3.extractor");
    }

    public f0(wl4 wl4Var, long j8, long j9) {
        this.f7555b = wl4Var;
        this.f7557d = j8;
        this.f7556c = j9;
    }

    private final int e(byte[] bArr, int i8, int i9) {
        int i10 = this.f7560g;
        if (i10 == 0) {
            return 0;
        }
        int iMin = Math.min(i10, i9);
        System.arraycopy(this.f7558e, 0, bArr, i8, iMin);
        j(iMin);
        return iMin;
    }

    private final int f(byte[] bArr, int i8, int i9, int i10, boolean z7) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iH = this.f7555b.H(bArr, i8 + i10, i9 - i10);
        if (iH != -1) {
            return i10 + iH;
        }
        if (i10 == 0 && z7) {
            return -1;
        }
        throw new EOFException();
    }

    private final int g(int i8) {
        int iMin = Math.min(this.f7560g, i8);
        j(iMin);
        return iMin;
    }

    private final void h(int i8) {
        if (i8 != -1) {
            this.f7557d += (long) i8;
        }
    }

    private final void i(int i8) {
        int i9 = this.f7559f + i8;
        int length = this.f7558e.length;
        if (i9 > length) {
            this.f7558e = Arrays.copyOf(this.f7558e, Math.max(65536 + i9, Math.min(length + length, i9 + 524288)));
        }
    }

    private final void j(int i8) {
        int i9 = this.f7560g - i8;
        this.f7560g = i9;
        this.f7559f = 0;
        byte[] bArr = this.f7558e;
        byte[] bArr2 = i9 < bArr.length + (-524288) ? new byte[65536 + i9] : bArr;
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        this.f7558e = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final void F(int i8) throws EOFException, InterruptedIOException {
        c(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final int G(int i8) throws EOFException, InterruptedIOException {
        int iG = g(1);
        if (iG == 0) {
            iG = f(this.f7554a, 0, Math.min(1, 4096), 0, true);
        }
        h(iG);
        return iG;
    }

    @Override // com.google.android.gms.internal.ads.q0, com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) throws EOFException, InterruptedIOException {
        int iE = e(bArr, i8, i9);
        if (iE == 0) {
            iE = f(bArr, i8, i9, 0, true);
        }
        h(iE);
        return iE;
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final void I(int i8) throws EOFException, InterruptedIOException {
        d(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final boolean J(byte[] bArr, int i8, int i9, boolean z7) throws EOFException, InterruptedIOException {
        int iE = e(bArr, i8, i9);
        while (iE < i9 && iE != -1) {
            iE = f(bArr, i8, i9, iE, z7);
        }
        h(iE);
        return iE != -1;
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final int K(byte[] bArr, int i8, int i9) throws EOFException, InterruptedIOException {
        int iMin;
        i(i9);
        int i10 = this.f7560g;
        int i11 = this.f7559f;
        int i12 = i10 - i11;
        if (i12 == 0) {
            iMin = f(this.f7558e, i11, i9, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f7560g += iMin;
        } else {
            iMin = Math.min(i9, i12);
        }
        System.arraycopy(this.f7558e, this.f7559f, bArr, i8, iMin);
        this.f7559f += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final boolean L(byte[] bArr, int i8, int i9, boolean z7) {
        if (!c(i9, z7)) {
            return false;
        }
        System.arraycopy(this.f7558e, this.f7559f - i9, bArr, i8, i9);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final void M(byte[] bArr, int i8, int i9) throws EOFException, InterruptedIOException {
        J(bArr, i8, i9, false);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final void N(byte[] bArr, int i8, int i9) {
        L(bArr, i8, i9, false);
    }

    public final boolean c(int i8, boolean z7) throws EOFException, InterruptedIOException {
        i(i8);
        int iF = this.f7560g - this.f7559f;
        while (iF < i8) {
            iF = f(this.f7558e, this.f7559f, i8, iF, z7);
            if (iF == -1) {
                return false;
            }
            this.f7560g = this.f7559f + iF;
        }
        this.f7559f += i8;
        return true;
    }

    public final boolean d(int i8, boolean z7) throws EOFException, InterruptedIOException {
        int iG = g(i8);
        while (iG < i8 && iG != -1) {
            iG = f(this.f7554a, -iG, Math.min(i8, iG + 4096), iG, false);
        }
        h(iG);
        return iG != -1;
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final long m() {
        return this.f7557d + ((long) this.f7559f);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final long n() {
        return this.f7557d;
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final long p() {
        return this.f7556c;
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final void t() {
        this.f7559f = 0;
    }
}
