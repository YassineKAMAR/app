package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f19699b = Logger.getLogger(v0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f19700c = d4.C();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19701d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    w0 f19702a;

    private v0() {
    }

    /* synthetic */ v0(u0 u0Var) {
    }

    public static v0 A(byte[] bArr, int i8, int i9) {
        return new s0(bArr, 0, i9);
    }

    @Deprecated
    static int u(int i8, r2 r2Var, b3 b3Var) {
        int iA = ((x) r2Var).a(b3Var);
        int iY = y(i8 << 3);
        return iY + iY + iA;
    }

    public static int v(int i8) {
        if (i8 >= 0) {
            return y(i8);
        }
        return 10;
    }

    static int w(r2 r2Var, b3 b3Var) {
        int iA = ((x) r2Var).a(b3Var);
        return y(iA) + iA;
    }

    public static int x(String str) {
        int length;
        try {
            length = i4.c(str);
        } catch (h4 unused) {
            length = str.getBytes(s1.f19669b).length;
        }
        return y(length) + length;
    }

    public static int y(int i8) {
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

    public static int z(long j8) {
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
            j8 >>>= 14;
            i8 += 2;
        }
        return (j8 & (-16384)) != 0 ? i8 + 1 : i8;
    }

    public final void a() {
        if (d() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void b(String str, h4 h4Var) throws t0 {
        f19699b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) h4Var);
        byte[] bytes = str.getBytes(s1.f19669b);
        try {
            int length = bytes.length;
            r(length);
            n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new t0(e8);
        }
    }

    public abstract int d();

    public abstract void e(byte b8);

    public abstract void f(int i8, boolean z7);

    public abstract void g(int i8, n0 n0Var);

    public abstract void h(int i8, int i9);

    public abstract void i(int i8);

    public abstract void j(int i8, long j8);

    public abstract void k(long j8);

    public abstract void l(int i8, int i9);

    public abstract void m(int i8);

    public abstract void n(byte[] bArr, int i8, int i9);

    public abstract void o(int i8, String str);

    public abstract void p(int i8, int i9);

    public abstract void q(int i8, int i9);

    public abstract void r(int i8);

    public abstract void s(int i8, long j8);

    public abstract void t(long j8);
}
