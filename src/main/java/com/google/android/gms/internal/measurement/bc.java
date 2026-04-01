package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bc {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final bc f18597f = new bc(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f18599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f18600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18602e;

    private bc() {
        this(0, new int[8], new Object[8], true);
    }

    private bc(int i8, int[] iArr, Object[] objArr, boolean z7) {
        this.f18601d = -1;
        this.f18598a = i8;
        this.f18599b = iArr;
        this.f18600c = objArr;
        this.f18602e = z7;
    }

    static bc c(bc bcVar, bc bcVar2) {
        int i8 = bcVar.f18598a + bcVar2.f18598a;
        int[] iArrCopyOf = Arrays.copyOf(bcVar.f18599b, i8);
        System.arraycopy(bcVar2.f18599b, 0, iArrCopyOf, bcVar.f18598a, bcVar2.f18598a);
        Object[] objArrCopyOf = Arrays.copyOf(bcVar.f18600c, i8);
        System.arraycopy(bcVar2.f18600c, 0, objArrCopyOf, bcVar.f18598a, bcVar2.f18598a);
        return new bc(i8, iArrCopyOf, objArrCopyOf, true);
    }

    private final void d(int i8) {
        int[] iArr = this.f18599b;
        if (i8 > iArr.length) {
            int i9 = this.f18598a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f18599b = Arrays.copyOf(iArr, i8);
            this.f18600c = Arrays.copyOf(this.f18600c, i8);
        }
    }

    private static void f(int i8, Object obj, zc zcVar) {
        int i9 = i8 >>> 3;
        int i10 = i8 & 7;
        if (i10 == 0) {
            zcVar.m(i9, ((Long) obj).longValue());
            return;
        }
        if (i10 == 1) {
            zcVar.c(i9, ((Long) obj).longValue());
            return;
        }
        if (i10 == 2) {
            zcVar.A(i9, (o7) obj);
            return;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new RuntimeException(k9.a());
            }
            zcVar.n(i9, ((Integer) obj).intValue());
        } else if (zcVar.j() == cd.f18627a) {
            zcVar.d(i9);
            ((bc) obj).j(zcVar);
            zcVar.b(i9);
        } else {
            zcVar.b(i9);
            ((bc) obj).j(zcVar);
            zcVar.d(i9);
        }
    }

    public static bc k() {
        return f18597f;
    }

    static bc l() {
        return new bc();
    }

    private final void n() {
        if (!this.f18602e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        int iQ0;
        int i8 = this.f18601d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f18598a; i10++) {
            int i11 = this.f18599b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                iQ0 = h8.q0(i12, ((Long) this.f18600c[i10]).longValue());
            } else if (i13 == 1) {
                iQ0 = h8.T(i12, ((Long) this.f18600c[i10]).longValue());
            } else if (i13 == 2) {
                iQ0 = h8.U(i12, (o7) this.f18600c[i10]);
            } else if (i13 == 3) {
                iQ0 = (h8.w0(i12) << 1) + ((bc) this.f18600c[i10]).a();
            } else {
                if (i13 != 5) {
                    throw new IllegalStateException(k9.a());
                }
                iQ0 = h8.l0(i12, ((Integer) this.f18600c[i10]).intValue());
            }
            i9 += iQ0;
        }
        this.f18601d = i9;
        return i9;
    }

    final bc b(bc bcVar) {
        if (bcVar.equals(f18597f)) {
            return this;
        }
        n();
        int i8 = this.f18598a + bcVar.f18598a;
        d(i8);
        System.arraycopy(bcVar.f18599b, 0, this.f18599b, this.f18598a, bcVar.f18598a);
        System.arraycopy(bcVar.f18600c, 0, this.f18600c, this.f18598a, bcVar.f18598a);
        this.f18598a = i8;
        return this;
    }

    final void e(int i8, Object obj) {
        n();
        d(this.f18598a + 1);
        int[] iArr = this.f18599b;
        int i9 = this.f18598a;
        iArr[i9] = i8;
        this.f18600c[i9] = obj;
        this.f18598a = i9 + 1;
    }

    public final boolean equals(Object obj) {
        boolean z7;
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        int i8 = this.f18598a;
        if (i8 == bcVar.f18598a) {
            int[] iArr = this.f18599b;
            int[] iArr2 = bcVar.f18599b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    z7 = true;
                    break;
                }
                if (iArr[i9] != iArr2[i9]) {
                    z7 = false;
                    break;
                }
                i9++;
            }
            if (z7) {
                Object[] objArr = this.f18600c;
                Object[] objArr2 = bcVar.f18600c;
                int i10 = this.f18598a;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        z8 = true;
                        break;
                    }
                    if (!objArr[i11].equals(objArr2[i11])) {
                        z8 = false;
                        break;
                    }
                    i11++;
                }
                if (z8) {
                    return true;
                }
            }
        }
        return false;
    }

    final void g(zc zcVar) {
        if (zcVar.j() == cd.f18628b) {
            for (int i8 = this.f18598a - 1; i8 >= 0; i8--) {
                zcVar.s(this.f18599b[i8] >>> 3, this.f18600c[i8]);
            }
            return;
        }
        for (int i9 = 0; i9 < this.f18598a; i9++) {
            zcVar.s(this.f18599b[i9] >>> 3, this.f18600c[i9]);
        }
    }

    final void h(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f18598a; i9++) {
            ra.d(sb, i8, String.valueOf(this.f18599b[i9] >>> 3), this.f18600c[i9]);
        }
    }

    public final int hashCode() {
        int i8 = this.f18598a;
        int i9 = (i8 + 527) * 31;
        int[] iArr = this.f18599b;
        int iHashCode = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i9 + i10) * 31;
        Object[] objArr = this.f18600c;
        int i13 = this.f18598a;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return i12 + iHashCode;
    }

    public final int i() {
        int i8 = this.f18601d;
        if (i8 != -1) {
            return i8;
        }
        int iD0 = 0;
        for (int i9 = 0; i9 < this.f18598a; i9++) {
            iD0 += h8.d0(this.f18599b[i9] >>> 3, (o7) this.f18600c[i9]);
        }
        this.f18601d = iD0;
        return iD0;
    }

    public final void j(zc zcVar) {
        if (this.f18598a == 0) {
            return;
        }
        if (zcVar.j() == cd.f18627a) {
            for (int i8 = 0; i8 < this.f18598a; i8++) {
                f(this.f18599b[i8], this.f18600c[i8], zcVar);
            }
            return;
        }
        for (int i9 = this.f18598a - 1; i9 >= 0; i9--) {
            f(this.f18599b[i9], this.f18600c[i9], zcVar);
        }
    }

    public final void m() {
        if (this.f18602e) {
            this.f18602e = false;
        }
    }
}
