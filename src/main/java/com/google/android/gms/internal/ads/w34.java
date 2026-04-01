package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w34 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final w34 f16617f = new w34(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f16619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f16620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f16622e;

    private w34() {
        this(0, new int[8], new Object[8], true);
    }

    private w34(int i8, int[] iArr, Object[] objArr, boolean z7) {
        this.f16621d = -1;
        this.f16618a = i8;
        this.f16619b = iArr;
        this.f16620c = objArr;
        this.f16622e = z7;
    }

    public static w34 c() {
        return f16617f;
    }

    static w34 e(w34 w34Var, w34 w34Var2) {
        int i8 = w34Var.f16618a + w34Var2.f16618a;
        int[] iArrCopyOf = Arrays.copyOf(w34Var.f16619b, i8);
        System.arraycopy(w34Var2.f16619b, 0, iArrCopyOf, w34Var.f16618a, w34Var2.f16618a);
        Object[] objArrCopyOf = Arrays.copyOf(w34Var.f16620c, i8);
        System.arraycopy(w34Var2.f16620c, 0, objArrCopyOf, w34Var.f16618a, w34Var2.f16618a);
        return new w34(i8, iArrCopyOf, objArrCopyOf, true);
    }

    static w34 f() {
        return new w34(0, new int[8], new Object[8], true);
    }

    private final void l(int i8) {
        int[] iArr = this.f16619b;
        if (i8 > iArr.length) {
            int i9 = this.f16618a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f16619b = Arrays.copyOf(iArr, i8);
            this.f16620c = Arrays.copyOf(this.f16620c, i8);
        }
    }

    public final int a() {
        int iC;
        int iB;
        int iB2;
        int i8 = this.f16621d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f16618a; i10++) {
            int i11 = this.f16619b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f16620c[i10]).longValue();
                    iB2 = h04.b(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    rz3 rz3Var = (rz3) this.f16620c[i10];
                    int i15 = h04.f8589d;
                    int iN = rz3Var.n();
                    iB2 = h04.b(i14) + h04.b(iN) + iN;
                } else if (i13 == 3) {
                    int i16 = i12 << 3;
                    int i17 = h04.f8589d;
                    iC = ((w34) this.f16620c[i10]).a();
                    int iB3 = h04.b(i16);
                    iB = iB3 + iB3;
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(m14.a());
                    }
                    ((Integer) this.f16620c[i10]).intValue();
                    iB2 = h04.b(i12 << 3) + 4;
                }
                i9 += iB2;
            } else {
                int i18 = i12 << 3;
                iC = h04.c(((Long) this.f16620c[i10]).longValue());
                iB = h04.b(i18);
            }
            iB2 = iB + iC;
            i9 += iB2;
        }
        this.f16621d = i9;
        return i9;
    }

    public final int b() {
        int i8 = this.f16621d;
        if (i8 != -1) {
            return i8;
        }
        int iB = 0;
        for (int i9 = 0; i9 < this.f16618a; i9++) {
            int i10 = this.f16619b[i9] >>> 3;
            rz3 rz3Var = (rz3) this.f16620c[i9];
            int i11 = h04.f8589d;
            int iN = rz3Var.n();
            int iB2 = h04.b(iN) + iN;
            int iB3 = h04.b(16);
            int iB4 = h04.b(i10);
            int iB5 = h04.b(8);
            iB += iB5 + iB5 + iB3 + iB4 + h04.b(24) + iB2;
        }
        this.f16621d = iB;
        return iB;
    }

    final w34 d(w34 w34Var) {
        if (w34Var.equals(f16617f)) {
            return this;
        }
        g();
        int i8 = this.f16618a + w34Var.f16618a;
        l(i8);
        System.arraycopy(w34Var.f16619b, 0, this.f16619b, this.f16618a, w34Var.f16618a);
        System.arraycopy(w34Var.f16620c, 0, this.f16620c, this.f16618a, w34Var.f16618a);
        this.f16618a = i8;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w34)) {
            return false;
        }
        w34 w34Var = (w34) obj;
        int i8 = this.f16618a;
        if (i8 == w34Var.f16618a) {
            int[] iArr = this.f16619b;
            int[] iArr2 = w34Var.f16619b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    Object[] objArr = this.f16620c;
                    Object[] objArr2 = w34Var.f16620c;
                    int i10 = this.f16618a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (objArr[i11].equals(objArr2[i11])) {
                        }
                    }
                    return true;
                }
                if (iArr[i9] != iArr2[i9]) {
                    break;
                }
                i9++;
            }
        }
        return false;
    }

    final void g() {
        if (!this.f16622e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f16622e) {
            this.f16622e = false;
        }
    }

    public final int hashCode() {
        int i8 = this.f16618a;
        int i9 = i8 + 527;
        int[] iArr = this.f16619b;
        int iHashCode = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i9 * 31) + i10) * 31;
        Object[] objArr = this.f16620c;
        int i13 = this.f16618a;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return i12 + iHashCode;
    }

    final void i(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f16618a; i9++) {
            m24.b(sb, i8, String.valueOf(this.f16619b[i9] >>> 3), this.f16620c[i9]);
        }
    }

    final void j(int i8, Object obj) {
        g();
        l(this.f16618a + 1);
        int[] iArr = this.f16619b;
        int i9 = this.f16618a;
        iArr[i9] = i8;
        this.f16620c[i9] = obj;
        this.f16618a = i9 + 1;
    }

    public final void k(i04 i04Var) {
        if (this.f16618a != 0) {
            for (int i8 = 0; i8 < this.f16618a; i8++) {
                int i9 = this.f16619b[i8];
                Object obj = this.f16620c[i8];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    i04Var.E(i11, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    i04Var.x(i11, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    i04Var.o(i11, (rz3) obj);
                } else if (i10 == 3) {
                    i04Var.e(i11);
                    ((w34) obj).k(i04Var);
                    i04Var.s(i11);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(m14.a());
                    }
                    i04Var.v(i11, ((Integer) obj).intValue());
                }
            }
        }
    }
}
