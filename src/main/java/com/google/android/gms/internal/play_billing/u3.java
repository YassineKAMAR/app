package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final u3 f19692f = new u3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f19694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f19695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19697e;

    private u3() {
        this(0, new int[8], new Object[8], true);
    }

    private u3(int i8, int[] iArr, Object[] objArr, boolean z7) {
        this.f19696d = -1;
        this.f19693a = i8;
        this.f19694b = iArr;
        this.f19695c = objArr;
        this.f19697e = z7;
    }

    public static u3 c() {
        return f19692f;
    }

    static u3 e(u3 u3Var, u3 u3Var2) {
        int i8 = u3Var.f19693a + u3Var2.f19693a;
        int[] iArrCopyOf = Arrays.copyOf(u3Var.f19694b, i8);
        System.arraycopy(u3Var2.f19694b, 0, iArrCopyOf, u3Var.f19693a, u3Var2.f19693a);
        Object[] objArrCopyOf = Arrays.copyOf(u3Var.f19695c, i8);
        System.arraycopy(u3Var2.f19695c, 0, objArrCopyOf, u3Var.f19693a, u3Var2.f19693a);
        return new u3(i8, iArrCopyOf, objArrCopyOf, true);
    }

    static u3 f() {
        return new u3(0, new int[8], new Object[8], true);
    }

    private final void l(int i8) {
        int[] iArr = this.f19694b;
        if (i8 > iArr.length) {
            int i9 = this.f19693a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f19694b = Arrays.copyOf(iArr, i8);
            this.f19695c = Arrays.copyOf(this.f19695c, i8);
        }
    }

    public final int a() {
        int iZ;
        int iY;
        int iY2;
        int i8 = this.f19696d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f19693a; i10++) {
            int i11 = this.f19694b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f19695c[i10]).longValue();
                    iY2 = v0.y(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    n0 n0Var = (n0) this.f19695c[i10];
                    int i15 = v0.f19701d;
                    int iG = n0Var.g();
                    iY2 = v0.y(i14) + v0.y(iG) + iG;
                } else if (i13 == 3) {
                    int i16 = i12 << 3;
                    int i17 = v0.f19701d;
                    iZ = ((u3) this.f19695c[i10]).a();
                    int iY3 = v0.y(i16);
                    iY = iY3 + iY3;
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(u1.a());
                    }
                    ((Integer) this.f19695c[i10]).intValue();
                    iY2 = v0.y(i12 << 3) + 4;
                }
                i9 += iY2;
            } else {
                int i18 = i12 << 3;
                iZ = v0.z(((Long) this.f19695c[i10]).longValue());
                iY = v0.y(i18);
            }
            iY2 = iY + iZ;
            i9 += iY2;
        }
        this.f19696d = i9;
        return i9;
    }

    public final int b() {
        int i8 = this.f19696d;
        if (i8 != -1) {
            return i8;
        }
        int iY = 0;
        for (int i9 = 0; i9 < this.f19693a; i9++) {
            int i10 = this.f19694b[i9] >>> 3;
            n0 n0Var = (n0) this.f19695c[i9];
            int i11 = v0.f19701d;
            int iG = n0Var.g();
            int iY2 = v0.y(iG) + iG;
            int iY3 = v0.y(16);
            int iY4 = v0.y(i10);
            int iY5 = v0.y(8);
            iY += iY5 + iY5 + iY3 + iY4 + v0.y(24) + iY2;
        }
        this.f19696d = iY;
        return iY;
    }

    final u3 d(u3 u3Var) {
        if (u3Var.equals(f19692f)) {
            return this;
        }
        g();
        int i8 = this.f19693a + u3Var.f19693a;
        l(i8);
        System.arraycopy(u3Var.f19694b, 0, this.f19694b, this.f19693a, u3Var.f19693a);
        System.arraycopy(u3Var.f19695c, 0, this.f19695c, this.f19693a, u3Var.f19693a);
        this.f19693a = i8;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        int i8 = this.f19693a;
        if (i8 == u3Var.f19693a) {
            int[] iArr = this.f19694b;
            int[] iArr2 = u3Var.f19694b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    Object[] objArr = this.f19695c;
                    Object[] objArr2 = u3Var.f19695c;
                    int i10 = this.f19693a;
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
        if (!this.f19697e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f19697e) {
            this.f19697e = false;
        }
    }

    public final int hashCode() {
        int i8 = this.f19693a;
        int i9 = i8 + 527;
        int[] iArr = this.f19694b;
        int iHashCode = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i9 * 31) + i10) * 31;
        Object[] objArr = this.f19695c;
        int i13 = this.f19693a;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return i12 + iHashCode;
    }

    final void i(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f19693a; i9++) {
            t2.b(sb, i8, String.valueOf(this.f19694b[i9] >>> 3), this.f19695c[i9]);
        }
    }

    final void j(int i8, Object obj) {
        g();
        l(this.f19693a + 1);
        int[] iArr = this.f19694b;
        int i9 = this.f19693a;
        iArr[i9] = i8;
        this.f19695c[i9] = obj;
        this.f19693a = i9 + 1;
    }

    public final void k(l4 l4Var) {
        if (this.f19693a != 0) {
            for (int i8 = 0; i8 < this.f19693a; i8++) {
                int i9 = this.f19694b[i8];
                Object obj = this.f19695c[i8];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    l4Var.q(i11, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    l4Var.d(i11, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    l4Var.n(i11, (n0) obj);
                } else if (i10 == 3) {
                    l4Var.b(i11);
                    ((u3) obj).k(l4Var);
                    l4Var.S(i11);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(u1.a());
                    }
                    l4Var.l(i11, ((Integer) obj).intValue());
                }
            }
        }
    }
}
