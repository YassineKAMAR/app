package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class h04 extends gz3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f8587b = Logger.getLogger(h04.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f8588c = g44.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8589d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i04 f8590a;

    private h04() {
    }

    /* synthetic */ h04(g04 g04Var) {
    }

    public static int A(int i8) {
        if (i8 >= 0) {
            return b(i8);
        }
        return 10;
    }

    static int B(k24 k24Var, e34 e34Var) {
        int iB = ((az3) k24Var).b(e34Var);
        return b(iB) + iB;
    }

    public static int C(String str) {
        int length;
        try {
            length = l44.e(str);
        } catch (k44 unused) {
            length = str.getBytes(k14.f9885b).length;
        }
        return b(length) + length;
    }

    public static int b(int i8) {
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

    public static int c(long j8) {
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

    public static h04 d(byte[] bArr, int i8, int i9) {
        return new d04(bArr, 0, i9);
    }

    @Deprecated
    static int z(int i8, k24 k24Var, e34 e34Var) {
        int iB = ((az3) k24Var).b(e34Var);
        int iB2 = b(i8 << 3);
        return iB2 + iB2 + iB;
    }

    @Override // com.google.android.gms.internal.ads.gz3
    public abstract void a(byte[] bArr, int i8, int i9);

    public final void e() {
        if (l() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void f(String str, k44 k44Var) throws e04 {
        f8587b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) k44Var);
        byte[] bytes = str.getBytes(k14.f9885b);
        try {
            int length = bytes.length;
            w(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new e04(e8);
        }
    }

    public abstract void h();

    public abstract void i(byte b8);

    public abstract void j(int i8, boolean z7);

    public abstract void k(int i8, rz3 rz3Var);

    public abstract int l();

    public abstract void m(int i8, int i9);

    public abstract void n(int i8);

    public abstract void o(int i8, long j8);

    public abstract void p(long j8);

    public abstract void q(int i8, int i9);

    public abstract void r(int i8);

    abstract void s(int i8, k24 k24Var, e34 e34Var);

    public abstract void t(int i8, String str);

    public abstract void u(int i8, int i9);

    public abstract void v(int i8, int i9);

    public abstract void w(int i8);

    public abstract void x(int i8, long j8);

    public abstract void y(long j8);
}
