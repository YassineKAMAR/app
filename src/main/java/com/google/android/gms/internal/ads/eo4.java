package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class eo4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f7453a = new dq2(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private do4 f7454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private do4 f7455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private do4 f7456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final xq4 f7458f;

    public eo4(xq4 xq4Var) {
        this.f7458f = xq4Var;
        do4 do4Var = new do4(0L, 65536);
        this.f7454b = do4Var;
        this.f7455c = do4Var;
        this.f7456d = do4Var;
    }

    private final int i(int i8) {
        do4 do4Var = this.f7456d;
        if (do4Var.f6846c == null) {
            qq4 qq4VarB = this.f7458f.b();
            do4 do4Var2 = new do4(this.f7456d.f6845b, 65536);
            do4Var.f6846c = qq4VarB;
            do4Var.f6847d = do4Var2;
        }
        return Math.min(i8, (int) (this.f7456d.f6845b - this.f7457e));
    }

    private static do4 j(do4 do4Var, long j8) {
        while (j8 >= do4Var.f6845b) {
            do4Var = do4Var.f6847d;
        }
        return do4Var;
    }

    private static do4 k(do4 do4Var, long j8, ByteBuffer byteBuffer, int i8) {
        do4 do4VarJ = j(do4Var, j8);
        while (i8 > 0) {
            int iMin = Math.min(i8, (int) (do4VarJ.f6845b - j8));
            byteBuffer.put(do4VarJ.f6846c.f13733a, do4VarJ.a(j8), iMin);
            i8 -= iMin;
            j8 += (long) iMin;
            if (j8 == do4VarJ.f6845b) {
                do4VarJ = do4VarJ.f6847d;
            }
        }
        return do4VarJ;
    }

    private static do4 l(do4 do4Var, long j8, byte[] bArr, int i8) {
        do4 do4VarJ = j(do4Var, j8);
        int i9 = i8;
        while (i9 > 0) {
            int iMin = Math.min(i9, (int) (do4VarJ.f6845b - j8));
            System.arraycopy(do4VarJ.f6846c.f13733a, do4VarJ.a(j8), bArr, i8 - i9, iMin);
            i9 -= iMin;
            j8 += (long) iMin;
            if (j8 == do4VarJ.f6845b) {
                do4VarJ = do4VarJ.f6847d;
            }
        }
        return do4VarJ;
    }

    private static do4 m(do4 do4Var, q94 q94Var, go4 go4Var, dq2 dq2Var) {
        do4 do4VarL;
        int iY;
        if (q94Var.k()) {
            long j8 = go4Var.f8443b;
            dq2Var.d(1);
            do4 do4VarL2 = l(do4Var, j8, dq2Var.i(), 1);
            long j9 = j8 + 1;
            byte b8 = dq2Var.i()[0];
            int i8 = b8 & 128;
            int i9 = b8 & 127;
            n94 n94Var = q94Var.f13361c;
            byte[] bArr = n94Var.f11746a;
            if (bArr == null) {
                n94Var.f11746a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z7 = i8 != 0;
            do4VarL = l(do4VarL2, j9, n94Var.f11746a, i9);
            long j10 = j9 + ((long) i9);
            if (z7) {
                dq2Var.d(2);
                do4VarL = l(do4VarL, j10, dq2Var.i(), 2);
                j10 += 2;
                iY = dq2Var.y();
            } else {
                iY = 1;
            }
            int[] iArr = n94Var.f11749d;
            if (iArr == null || iArr.length < iY) {
                iArr = new int[iY];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = n94Var.f11750e;
            if (iArr3 == null || iArr3.length < iY) {
                iArr3 = new int[iY];
            }
            int[] iArr4 = iArr3;
            if (z7) {
                int i10 = iY * 6;
                dq2Var.d(i10);
                do4VarL = l(do4VarL, j10, dq2Var.i(), i10);
                j10 += (long) i10;
                dq2Var.g(0);
                for (int i11 = 0; i11 < iY; i11++) {
                    iArr2[i11] = dq2Var.y();
                    iArr4[i11] = dq2Var.x();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = go4Var.f8442a - ((int) (j10 - go4Var.f8443b));
            }
            v1 v1Var = go4Var.f8444c;
            int i12 = nz2.f12300a;
            n94Var.c(iY, iArr2, iArr4, v1Var.f15953b, n94Var.f11746a, v1Var.f15952a, v1Var.f15954c, v1Var.f15955d);
            long j11 = go4Var.f8443b;
            int i13 = (int) (j10 - j11);
            go4Var.f8443b = j11 + ((long) i13);
            go4Var.f8442a -= i13;
        } else {
            do4VarL = do4Var;
        }
        if (!q94Var.e()) {
            q94Var.i(go4Var.f8442a);
            return k(do4VarL, go4Var.f8443b, q94Var.f13362d, go4Var.f8442a);
        }
        dq2Var.d(4);
        do4 do4VarL3 = l(do4VarL, go4Var.f8443b, dq2Var.i(), 4);
        int iX = dq2Var.x();
        go4Var.f8443b += 4;
        go4Var.f8442a -= 4;
        q94Var.i(iX);
        do4 do4VarK = k(do4VarL3, go4Var.f8443b, q94Var.f13362d, iX);
        go4Var.f8443b += (long) iX;
        int i14 = go4Var.f8442a - iX;
        go4Var.f8442a = i14;
        ByteBuffer byteBuffer = q94Var.f13365g;
        if (byteBuffer == null || byteBuffer.capacity() < i14) {
            q94Var.f13365g = ByteBuffer.allocate(i14);
        } else {
            q94Var.f13365g.clear();
        }
        return k(do4VarK, go4Var.f8443b, q94Var.f13365g, go4Var.f8442a);
    }

    private final void n(int i8) {
        long j8 = this.f7457e + ((long) i8);
        this.f7457e = j8;
        do4 do4Var = this.f7456d;
        if (j8 == do4Var.f6845b) {
            this.f7456d = do4Var.f6847d;
        }
    }

    public final int a(wl4 wl4Var, int i8, boolean z7) throws EOFException {
        int i9 = i(i8);
        do4 do4Var = this.f7456d;
        int iH = wl4Var.H(do4Var.f6846c.f13733a, do4Var.a(this.f7457e), i9);
        if (iH != -1) {
            n(iH);
            return iH;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    public final long b() {
        return this.f7457e;
    }

    public final void c(long j8) {
        do4 do4Var;
        if (j8 != -1) {
            while (true) {
                do4Var = this.f7454b;
                if (j8 < do4Var.f6845b) {
                    break;
                }
                this.f7458f.c(do4Var.f6846c);
                this.f7454b = this.f7454b.b();
            }
            if (this.f7455c.f6844a < do4Var.f6844a) {
                this.f7455c = do4Var;
            }
        }
    }

    public final void d(q94 q94Var, go4 go4Var) {
        m(this.f7455c, q94Var, go4Var, this.f7453a);
    }

    public final void e(q94 q94Var, go4 go4Var) {
        this.f7455c = m(this.f7455c, q94Var, go4Var, this.f7453a);
    }

    public final void f() {
        do4 do4Var = this.f7454b;
        if (do4Var.f6846c != null) {
            this.f7458f.d(do4Var);
            do4Var.b();
        }
        this.f7454b.c(0L, 65536);
        do4 do4Var2 = this.f7454b;
        this.f7455c = do4Var2;
        this.f7456d = do4Var2;
        this.f7457e = 0L;
        this.f7458f.g();
    }

    public final void g() {
        this.f7455c = this.f7454b;
    }

    public final void h(dq2 dq2Var, int i8) {
        while (i8 > 0) {
            int i9 = i(i8);
            do4 do4Var = this.f7456d;
            dq2Var.c(do4Var.f6846c.f13733a, do4Var.a(this.f7457e), i9);
            i8 -= i9;
            n(i9);
        }
    }
}
