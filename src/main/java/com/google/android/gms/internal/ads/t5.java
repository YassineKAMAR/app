package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
final class t5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f14965d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f14966a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14968c;

    public static int b(int i8) {
        int i9 = 0;
        while (i9 < 8) {
            int i10 = i9 + 1;
            if ((f14965d[i9] & ((long) i8)) != 0) {
                return i10;
            }
            i9 = i10;
        }
        return -1;
    }

    public static long c(byte[] bArr, int i8, boolean z7) {
        long j8 = ((long) bArr[0]) & 255;
        if (z7) {
            j8 &= ~f14965d[i8 - 1];
        }
        for (int i9 = 1; i9 < i8; i9++) {
            j8 = (j8 << 8) | (((long) bArr[i9]) & 255);
        }
        return j8;
    }

    public final int a() {
        return this.f14968c;
    }

    public final long d(q0 q0Var, boolean z7, boolean z8, int i8) throws EOFException, InterruptedIOException {
        if (this.f14967b == 0) {
            if (!q0Var.J(this.f14966a, 0, 1, z7)) {
                return -1L;
            }
            int iB = b(this.f14966a[0] & 255);
            this.f14968c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f14967b = 1;
        }
        int i9 = this.f14968c;
        if (i9 > i8) {
            this.f14967b = 0;
            return -2L;
        }
        if (i9 != 1) {
            ((f0) q0Var).J(this.f14966a, 1, i9 - 1, false);
        }
        this.f14967b = 0;
        return c(this.f14966a, this.f14968c, z8);
    }

    public final void e() {
        this.f14967b = 0;
        this.f14968c = 0;
    }
}
