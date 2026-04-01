package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class h8 extends p7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f18773b = Logger.getLogger(h8.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f18774c = jc.w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    k8 f18775a;

    private static class a extends h8 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f18776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f18777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f18778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18779g;

        a(byte[] bArr, int i8, int i9) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i9 | 0 | (bArr.length - i9)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i9)));
            }
            this.f18776d = bArr;
            this.f18777e = 0;
            this.f18779g = 0;
            this.f18778f = i9;
        }

        private final void E0(byte[] bArr, int i8, int i9) throws b {
            try {
                System.arraycopy(bArr, i8, this.f18776d, this.f18779g, i9);
                this.f18779g += i9;
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18779g), Integer.valueOf(this.f18778f), Integer.valueOf(i9)), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void L(int i8) {
            if (i8 >= 0) {
                Y(i8);
            } else {
                R(i8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void O(int i8, int i9) {
            Z(i8, 0);
            L(i9);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void P(int i8, long j8) {
            Z(i8, 0);
            R(j8);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void Q(int i8, o7 o7Var) {
            Z(1, 3);
            f0(2, i8);
            p(3, o7Var);
            Z(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void R(long j8) throws b {
            if (h8.f18774c && b() >= 10) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.f18776d;
                    int i8 = this.f18779g;
                    this.f18779g = i8 + 1;
                    jc.m(bArr, i8, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.f18776d;
                int i9 = this.f18779g;
                this.f18779g = i9 + 1;
                jc.m(bArr2, i9, (byte) j8);
                return;
            }
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f18776d;
                    int i10 = this.f18779g;
                    this.f18779g = i10 + 1;
                    bArr3[i10] = (byte) ((((int) j8) & 127) | 128);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18779g), Integer.valueOf(this.f18778f), 1), e8);
                }
            }
            byte[] bArr4 = this.f18776d;
            int i11 = this.f18779g;
            this.f18779g = i11 + 1;
            bArr4[i11] = (byte) j8;
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void Y(int i8) throws b {
            while ((i8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f18776d;
                    int i9 = this.f18779g;
                    this.f18779g = i9 + 1;
                    bArr[i9] = (byte) ((i8 & 127) | 128);
                    i8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18779g), Integer.valueOf(this.f18778f), 1), e8);
                }
            }
            byte[] bArr2 = this.f18776d;
            int i10 = this.f18779g;
            this.f18779g = i10 + 1;
            bArr2[i10] = (byte) i8;
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void Z(int i8, int i9) {
            Y((i8 << 3) | i9);
        }

        @Override // com.google.android.gms.internal.measurement.p7
        public final void a(byte[] bArr, int i8, int i9) throws b {
            E0(bArr, i8, i9);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final int b() {
            return this.f18778f - this.f18779g;
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void f0(int i8, int i9) {
            Z(i8, 0);
            Y(i9);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void l(byte b8) throws b {
            try {
                byte[] bArr = this.f18776d;
                int i8 = this.f18779g;
                this.f18779g = i8 + 1;
                bArr[i8] = b8;
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18779g), Integer.valueOf(this.f18778f), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void m(int i8) throws b {
            try {
                byte[] bArr = this.f18776d;
                int i9 = this.f18779g;
                int i10 = i9 + 1;
                bArr[i9] = (byte) i8;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (i8 >> 8);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i8 >> 16);
                this.f18779g = i12 + 1;
                bArr[i12] = (byte) (i8 >>> 24);
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18779g), Integer.valueOf(this.f18778f), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void n(int i8, int i9) {
            Z(i8, 5);
            m(i9);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void o(int i8, long j8) {
            Z(i8, 1);
            u(j8);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void p(int i8, o7 o7Var) {
            Z(i8, 2);
            v(o7Var);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void q(int i8, ma maVar) {
            Z(1, 3);
            f0(2, i8);
            Z(3, 2);
            w(maVar);
            Z(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        final void r(int i8, ma maVar, eb ebVar) {
            Z(i8, 2);
            Y(((f7) maVar).a(ebVar));
            ebVar.c(maVar, this.f18775a);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void s(int i8, String str) {
            Z(i8, 2);
            x(str);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void t(int i8, boolean z7) {
            Z(i8, 0);
            l(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void u(long j8) throws b {
            try {
                byte[] bArr = this.f18776d;
                int i8 = this.f18779g;
                int i9 = i8 + 1;
                bArr[i8] = (byte) j8;
                int i10 = i9 + 1;
                bArr[i9] = (byte) (j8 >> 8);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (j8 >> 16);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (j8 >> 24);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (j8 >> 32);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (j8 >> 40);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (j8 >> 48);
                this.f18779g = i15 + 1;
                bArr[i15] = (byte) (j8 >> 56);
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18779g), Integer.valueOf(this.f18778f), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void v(o7 o7Var) {
            Y(o7Var.y());
            o7Var.w(this);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void w(ma maVar) {
            Y(maVar.o0());
            maVar.n0(this);
        }

        @Override // com.google.android.gms.internal.measurement.h8
        public final void x(String str) throws b {
            int i8 = this.f18779g;
            try {
                int iZ0 = h8.z0(str.length() * 3);
                int iZ02 = h8.z0(str.length());
                if (iZ02 != iZ0) {
                    Y(kc.a(str));
                    this.f18779g = kc.b(str, this.f18776d, this.f18779g, b());
                    return;
                }
                int i9 = i8 + iZ02;
                this.f18779g = i9;
                int iB = kc.b(str, this.f18776d, i9, b());
                this.f18779g = i8;
                Y((iB - i8) - iZ02);
                this.f18779g = iB;
            } catch (nc e8) {
                this.f18779g = i8;
                y(str, e8);
            } catch (IndexOutOfBoundsException e9) {
                throw new b(e9);
            }
        }
    }

    public static class b extends IOException {
        b(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private h8() {
    }

    public static int A(int i8, ma maVar) {
        return (z0(8) << 1) + A0(2, i8) + z0(24) + X(maVar);
    }

    public static int A0(int i8, int i9) {
        return z0(i8 << 3) + z0(i9);
    }

    @Deprecated
    static int B(int i8, ma maVar, eb ebVar) {
        return (z0(i8 << 3) << 1) + ((f7) maVar).a(ebVar);
    }

    public static int C(int i8, String str) {
        return z0(i8 << 3) + G(str);
    }

    public static int D(int i8, boolean z7) {
        return z0(i8 << 3) + 1;
    }

    private static int D0(int i8) {
        return (i8 >> 31) ^ (i8 << 1);
    }

    public static int E(o7 o7Var) {
        int iY = o7Var.y();
        return z0(iY) + iY;
    }

    @Deprecated
    public static int F(ma maVar) {
        return maVar.o0();
    }

    public static int G(String str) {
        int length;
        try {
            length = kc.a(str);
        } catch (nc unused) {
            length = str.getBytes(a9.f18546b).length;
        }
        return z0(length) + length;
    }

    public static h8 H(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int T(int i8, long j8) {
        return z0(i8 << 3) + 8;
    }

    public static int U(int i8, o7 o7Var) {
        int iZ0 = z0(i8 << 3);
        int iY = o7Var.y();
        return iZ0 + z0(iY) + iY;
    }

    static int V(int i8, ma maVar, eb ebVar) {
        return z0(i8 << 3) + i(maVar, ebVar);
    }

    public static int W(long j8) {
        return 8;
    }

    public static int X(ma maVar) {
        int iO0 = maVar.o0();
        return z0(iO0) + iO0;
    }

    public static int b0(int i8) {
        return k0(i8);
    }

    public static int c(double d8) {
        return 8;
    }

    public static int c0(int i8, long j8) {
        return z0(i8 << 3) + r0(j8);
    }

    public static int d(float f8) {
        return 4;
    }

    public static int d0(int i8, o7 o7Var) {
        return (z0(8) << 1) + A0(2, i8) + U(3, o7Var);
    }

    public static int e(int i8, double d8) {
        return z0(i8 << 3) + 8;
    }

    public static int e0(long j8) {
        return r0(j8);
    }

    public static int f(int i8, float f8) {
        return z0(i8 << 3) + 4;
    }

    public static int g(int i8, p9 p9Var) {
        return (z0(8) << 1) + A0(2, i8) + z(3, p9Var);
    }

    public static int g0(int i8) {
        return 4;
    }

    public static int h(p9 p9Var) {
        int iB = p9Var.b();
        return z0(iB) + iB;
    }

    public static int h0(int i8, int i9) {
        return z0(i8 << 3) + k0(i9);
    }

    static int i(ma maVar, eb ebVar) {
        int iA = ((f7) maVar).a(ebVar);
        return z0(iA) + iA;
    }

    public static int i0(int i8, long j8) {
        return z0(i8 << 3) + 8;
    }

    public static int j(boolean z7) {
        return 1;
    }

    public static int j0(long j8) {
        return 8;
    }

    public static int k(byte[] bArr) {
        int length = bArr.length;
        return z0(length) + length;
    }

    public static int k0(int i8) {
        if (i8 >= 0) {
            return z0(i8);
        }
        return 10;
    }

    public static int l0(int i8, int i9) {
        return z0(i8 << 3) + 4;
    }

    public static int m0(int i8, long j8) {
        return z0(i8 << 3) + r0(y0(j8));
    }

    public static int n0(long j8) {
        return r0(y0(j8));
    }

    public static int o0(int i8) {
        return 4;
    }

    public static int p0(int i8, int i9) {
        return z0(i8 << 3) + k0(i9);
    }

    public static int q0(int i8, long j8) {
        return z0(i8 << 3) + r0(j8);
    }

    public static int r0(long j8) {
        int i8;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            i8 = 6;
            j8 >>>= 28;
        } else {
            i8 = 2;
        }
        if (((-2097152) & j8) != 0) {
            i8 += 2;
            j8 >>>= 14;
        }
        return (j8 & (-16384)) != 0 ? i8 + 1 : i8;
    }

    public static int s0(int i8) {
        return z0(D0(i8));
    }

    public static int t0(int i8, int i9) {
        return z0(i8 << 3) + 4;
    }

    public static int w0(int i8) {
        return z0(i8 << 3);
    }

    public static int x0(int i8, int i9) {
        return z0(i8 << 3) + z0(D0(i9));
    }

    private static long y0(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static int z(int i8, p9 p9Var) {
        int iZ0 = z0(i8 << 3);
        int iB = p9Var.b();
        return iZ0 + z0(iB) + iB;
    }

    public static int z0(int i8) {
        if ((i8 & (-128)) == 0) {
            return 1;
        }
        if ((i8 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i8) == 0) {
            return 3;
        }
        return (i8 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void B0(int i8) {
        Y(D0(i8));
    }

    public final void C0(int i8, int i9) {
        f0(i8, D0(i9));
    }

    public final void I() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void J(double d8) {
        u(Double.doubleToRawLongBits(d8));
    }

    public final void K(float f8) {
        m(Float.floatToRawIntBits(f8));
    }

    public abstract void L(int i8);

    public final void M(int i8, double d8) {
        o(i8, Double.doubleToRawLongBits(d8));
    }

    public final void N(int i8, float f8) {
        n(i8, Float.floatToRawIntBits(f8));
    }

    public abstract void O(int i8, int i9);

    public abstract void P(int i8, long j8);

    public abstract void Q(int i8, o7 o7Var);

    public abstract void R(long j8);

    public final void S(boolean z7) {
        l(z7 ? (byte) 1 : (byte) 0);
    }

    public abstract void Y(int i8);

    public abstract void Z(int i8, int i9);

    public abstract int b();

    public abstract void f0(int i8, int i9);

    public abstract void l(byte b8);

    public abstract void m(int i8);

    public abstract void n(int i8, int i9);

    public abstract void o(int i8, long j8);

    public abstract void p(int i8, o7 o7Var);

    public abstract void q(int i8, ma maVar);

    abstract void r(int i8, ma maVar, eb ebVar);

    public abstract void s(int i8, String str);

    public abstract void t(int i8, boolean z7);

    public abstract void u(long j8);

    public final void u0(int i8, long j8) {
        P(i8, y0(j8));
    }

    public abstract void v(o7 o7Var);

    public final void v0(long j8) {
        R(y0(j8));
    }

    public abstract void w(ma maVar);

    public abstract void x(String str);

    final void y(String str, nc ncVar) throws b {
        f18773b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ncVar);
        byte[] bytes = str.getBytes(a9.f18546b);
        try {
            Y(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e8) {
            throw new b(e8);
        }
    }
}
