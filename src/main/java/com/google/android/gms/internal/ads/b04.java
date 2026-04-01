package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b04 implements v24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zz3 f5549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5552d = 0;

    private b04(zz3 zz3Var) {
        byte[] bArr = k14.f9887d;
        this.f5549a = zz3Var;
        zz3Var.f18532c = this;
    }

    private final void O(Object obj, e34 e34Var, m04 m04Var) {
        int i8 = this.f5551c;
        this.f5551c = ((this.f5550b >>> 3) << 3) | 4;
        try {
            e34Var.i(obj, this, m04Var);
            if (this.f5550b == this.f5551c) {
            } else {
                throw m14.g();
            }
        } finally {
            this.f5551c = i8;
        }
    }

    private final void P(Object obj, e34 e34Var, m04 m04Var) throws m14 {
        zz3 zz3Var = this.f5549a;
        int iS = zz3Var.s();
        if (zz3Var.f18530a >= zz3Var.f18531b) {
            throw new m14("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iL = this.f5549a.l(iS);
        this.f5549a.f18530a++;
        e34Var.i(obj, this, m04Var);
        this.f5549a.B(0);
        r4.f18530a--;
        this.f5549a.a(iL);
    }

    private final void Q(int i8) throws m14 {
        if (this.f5549a.k() != i8) {
            throw m14.j();
        }
    }

    private final void R(int i8) throws l14 {
        if ((this.f5550b & 7) != i8) {
            throw m14.a();
        }
    }

    private static final void S(int i8) throws m14 {
        if ((i8 & 3) != 0) {
            throw m14.g();
        }
    }

    private static final void T(int i8) throws m14 {
        if ((i8 & 7) != 0) {
            throw m14.g();
        }
    }

    public static b04 U(zz3 zz3Var) {
        b04 b04Var = zz3Var.f18532c;
        return b04Var != null ? b04Var : new b04(zz3Var);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void A(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof b14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 2) {
                int iS = this.f5549a.s();
                S(iS);
                int iK = this.f5549a.k() + iS;
                do {
                    list.add(Integer.valueOf(this.f5549a.n()));
                } while (this.f5549a.k() < iK);
                return;
            }
            if (i8 != 5) {
                throw m14.a();
            }
            do {
                list.add(Integer.valueOf(this.f5549a.n()));
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR = this.f5549a.r();
                }
            } while (iR == this.f5550b);
            this.f5552d = iR;
            return;
        }
        b14 b14Var = (b14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 2) {
            int iS2 = this.f5549a.s();
            S(iS2);
            int iK2 = this.f5549a.k() + iS2;
            do {
                b14Var.S(this.f5549a.n());
            } while (this.f5549a.k() < iK2);
            return;
        }
        if (i9 != 5) {
            throw m14.a();
        }
        do {
            b14Var.S(this.f5549a.n());
            if (this.f5549a.b()) {
                return;
            } else {
                iR2 = this.f5549a.r();
            }
        } while (iR2 == this.f5550b);
        this.f5552d = iR2;
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final String B() throws l14 {
        R(2);
        return this.f5549a.z();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final String C() throws l14 {
        R(2);
        return this.f5549a.A();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void D(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof y14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 0) {
                do {
                    list.add(Long.valueOf(this.f5549a.w()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            zz3 zz3Var = this.f5549a;
            int iK = zz3Var.k() + zz3Var.s();
            do {
                list.add(Long.valueOf(this.f5549a.w()));
            } while (this.f5549a.k() < iK);
            Q(iK);
            return;
        }
        y14 y14Var = (y14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 0) {
            do {
                y14Var.i(this.f5549a.w());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        zz3 zz3Var2 = this.f5549a;
        int iK2 = zz3Var2.k() + zz3Var2.s();
        do {
            y14Var.i(this.f5549a.w());
        } while (this.f5549a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void E(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof y14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 1) {
                do {
                    list.add(Long.valueOf(this.f5549a.t()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            int iS = this.f5549a.s();
            T(iS);
            int iK = this.f5549a.k() + iS;
            do {
                list.add(Long.valueOf(this.f5549a.t()));
            } while (this.f5549a.k() < iK);
            return;
        }
        y14 y14Var = (y14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 1) {
            do {
                y14Var.i(this.f5549a.t());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        int iS2 = this.f5549a.s();
        T(iS2);
        int iK2 = this.f5549a.k() + iS2;
        do {
            y14Var.i(this.f5549a.t());
        } while (this.f5549a.k() < iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void F(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof b14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5549a.q()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            zz3 zz3Var = this.f5549a;
            int iK = zz3Var.k() + zz3Var.s();
            do {
                list.add(Integer.valueOf(this.f5549a.q()));
            } while (this.f5549a.k() < iK);
            Q(iK);
            return;
        }
        b14 b14Var = (b14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 0) {
            do {
                b14Var.S(this.f5549a.q());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        zz3 zz3Var2 = this.f5549a;
        int iK2 = zz3Var2.k() + zz3Var2.s();
        do {
            b14Var.S(this.f5549a.q());
        } while (this.f5549a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void G(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof b14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5549a.s()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            zz3 zz3Var = this.f5549a;
            int iK = zz3Var.k() + zz3Var.s();
            do {
                list.add(Integer.valueOf(this.f5549a.s()));
            } while (this.f5549a.k() < iK);
            Q(iK);
            return;
        }
        b14 b14Var = (b14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 0) {
            do {
                b14Var.S(this.f5549a.s());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        zz3 zz3Var2 = this.f5549a;
        int iK2 = zz3Var2.k() + zz3Var2.s();
        do {
            b14Var.S(this.f5549a.s());
        } while (this.f5549a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final boolean H() throws l14 {
        R(0);
        return this.f5549a.c();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final boolean I() {
        int i8;
        if (this.f5549a.b() || (i8 = this.f5550b) == this.f5551c) {
            return false;
        }
        return this.f5549a.d(i8);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void J(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof fz3)) {
            int i8 = this.f5550b & 7;
            if (i8 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f5549a.c()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            zz3 zz3Var = this.f5549a;
            int iK = zz3Var.k() + zz3Var.s();
            do {
                list.add(Boolean.valueOf(this.f5549a.c()));
            } while (this.f5549a.k() < iK);
            Q(iK);
            return;
        }
        fz3 fz3Var = (fz3) list;
        int i9 = this.f5550b & 7;
        if (i9 == 0) {
            do {
                fz3Var.e(this.f5549a.c());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        zz3 zz3Var2 = this.f5549a;
        int iK2 = zz3Var2.k() + zz3Var2.s();
        do {
            fz3Var.e(this.f5549a.c());
        } while (this.f5549a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    @Deprecated
    public final void K(List list, e34 e34Var, m04 m04Var) throws l14 {
        int iR;
        int i8 = this.f5550b;
        if ((i8 & 7) != 3) {
            throw m14.a();
        }
        do {
            Object objM = e34Var.m();
            O(objM, e34Var, m04Var);
            e34Var.c(objM);
            list.add(objM);
            if (this.f5549a.b() || this.f5552d != 0) {
                return;
            } else {
                iR = this.f5549a.r();
            }
        } while (iR == i8);
        this.f5552d = iR;
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void L(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof t04)) {
            int i8 = this.f5550b & 7;
            if (i8 == 2) {
                int iS = this.f5549a.s();
                S(iS);
                int iK = this.f5549a.k() + iS;
                do {
                    list.add(Float.valueOf(this.f5549a.j()));
                } while (this.f5549a.k() < iK);
                return;
            }
            if (i8 != 5) {
                throw m14.a();
            }
            do {
                list.add(Float.valueOf(this.f5549a.j()));
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR = this.f5549a.r();
                }
            } while (iR == this.f5550b);
            this.f5552d = iR;
            return;
        }
        t04 t04Var = (t04) list;
        int i9 = this.f5550b & 7;
        if (i9 == 2) {
            int iS2 = this.f5549a.s();
            S(iS2);
            int iK2 = this.f5549a.k() + iS2;
            do {
                t04Var.e(this.f5549a.j());
            } while (this.f5549a.k() < iK2);
            return;
        }
        if (i9 != 5) {
            throw m14.a();
        }
        do {
            t04Var.e(this.f5549a.j());
            if (this.f5549a.b()) {
                return;
            } else {
                iR2 = this.f5549a.r();
            }
        } while (iR2 == this.f5550b);
        this.f5552d = iR2;
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void M(Object obj, e34 e34Var, m04 m04Var) throws m14 {
        R(2);
        P(obj, e34Var, m04Var);
    }

    public final void N(List list, boolean z7) throws l14 {
        int iR;
        int iR2;
        if ((this.f5550b & 7) != 2) {
            throw m14.a();
        }
        if (!(list instanceof r14) || z7) {
            do {
                list.add(z7 ? C() : B());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR = this.f5549a.r();
                }
            } while (iR == this.f5550b);
            this.f5552d = iR;
            return;
        }
        r14 r14Var = (r14) list;
        do {
            r14Var.s(y());
            if (this.f5549a.b()) {
                return;
            } else {
                iR2 = this.f5549a.r();
            }
        } while (iR2 == this.f5550b);
        this.f5552d = iR2;
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void a(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof b14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5549a.m()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            zz3 zz3Var = this.f5549a;
            int iK = zz3Var.k() + zz3Var.s();
            do {
                list.add(Integer.valueOf(this.f5549a.m()));
            } while (this.f5549a.k() < iK);
            Q(iK);
            return;
        }
        b14 b14Var = (b14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 0) {
            do {
                b14Var.S(this.f5549a.m());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        zz3 zz3Var2 = this.f5549a;
        int iK2 = zz3Var2.k() + zz3Var2.s();
        do {
            b14Var.S(this.f5549a.m());
        } while (this.f5549a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void b(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof y14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 0) {
                do {
                    list.add(Long.valueOf(this.f5549a.u()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            zz3 zz3Var = this.f5549a;
            int iK = zz3Var.k() + zz3Var.s();
            do {
                list.add(Long.valueOf(this.f5549a.u()));
            } while (this.f5549a.k() < iK);
            Q(iK);
            return;
        }
        y14 y14Var = (y14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 0) {
            do {
                y14Var.i(this.f5549a.u());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        zz3 zz3Var2 = this.f5549a;
        int iK2 = zz3Var2.k() + zz3Var2.s();
        do {
            y14Var.i(this.f5549a.u());
        } while (this.f5549a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void c(Object obj, e34 e34Var, m04 m04Var) throws l14 {
        R(3);
        O(obj, e34Var, m04Var);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void d(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof y14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 0) {
                do {
                    list.add(Long.valueOf(this.f5549a.x()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            zz3 zz3Var = this.f5549a;
            int iK = zz3Var.k() + zz3Var.s();
            do {
                list.add(Long.valueOf(this.f5549a.x()));
            } while (this.f5549a.k() < iK);
            Q(iK);
            return;
        }
        y14 y14Var = (y14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 0) {
            do {
                y14Var.i(this.f5549a.x());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        zz3 zz3Var2 = this.f5549a;
        int iK2 = zz3Var2.k() + zz3Var2.s();
        do {
            y14Var.i(this.f5549a.x());
        } while (this.f5549a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void e(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof j04)) {
            int i8 = this.f5550b & 7;
            if (i8 == 1) {
                do {
                    list.add(Double.valueOf(this.f5549a.i()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            int iS = this.f5549a.s();
            T(iS);
            int iK = this.f5549a.k() + iS;
            do {
                list.add(Double.valueOf(this.f5549a.i()));
            } while (this.f5549a.k() < iK);
            return;
        }
        j04 j04Var = (j04) list;
        int i9 = this.f5550b & 7;
        if (i9 == 1) {
            do {
                j04Var.e(this.f5549a.i());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        int iS2 = this.f5549a.s();
        T(iS2);
        int iK2 = this.f5549a.k() + iS2;
        do {
            j04Var.e(this.f5549a.i());
        } while (this.f5549a.k() < iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void f(List list) throws l14 {
        int iR;
        if ((this.f5550b & 7) != 2) {
            throw m14.a();
        }
        do {
            list.add(y());
            if (this.f5549a.b()) {
                return;
            } else {
                iR = this.f5549a.r();
            }
        } while (iR == this.f5550b);
        this.f5552d = iR;
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void g(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof b14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5549a.o()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            zz3 zz3Var = this.f5549a;
            int iK = zz3Var.k() + zz3Var.s();
            do {
                list.add(Integer.valueOf(this.f5549a.o()));
            } while (this.f5549a.k() < iK);
            Q(iK);
            return;
        }
        b14 b14Var = (b14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 0) {
            do {
                b14Var.S(this.f5549a.o());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        zz3 zz3Var2 = this.f5549a;
        int iK2 = zz3Var2.k() + zz3Var2.s();
        do {
            b14Var.S(this.f5549a.o());
        } while (this.f5549a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void h(List list, e34 e34Var, m04 m04Var) throws m14 {
        int iR;
        int i8 = this.f5550b;
        if ((i8 & 7) != 2) {
            throw m14.a();
        }
        do {
            Object objM = e34Var.m();
            P(objM, e34Var, m04Var);
            e34Var.c(objM);
            list.add(objM);
            if (this.f5549a.b() || this.f5552d != 0) {
                return;
            } else {
                iR = this.f5549a.r();
            }
        } while (iR == i8);
        this.f5552d = iR;
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void i(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof y14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 1) {
                do {
                    list.add(Long.valueOf(this.f5549a.v()));
                    if (this.f5549a.b()) {
                        return;
                    } else {
                        iR = this.f5549a.r();
                    }
                } while (iR == this.f5550b);
                this.f5552d = iR;
                return;
            }
            if (i8 != 2) {
                throw m14.a();
            }
            int iS = this.f5549a.s();
            T(iS);
            int iK = this.f5549a.k() + iS;
            do {
                list.add(Long.valueOf(this.f5549a.v()));
            } while (this.f5549a.k() < iK);
            return;
        }
        y14 y14Var = (y14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 1) {
            do {
                y14Var.i(this.f5549a.v());
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR2 = this.f5549a.r();
                }
            } while (iR2 == this.f5550b);
            this.f5552d = iR2;
            return;
        }
        if (i9 != 2) {
            throw m14.a();
        }
        int iS2 = this.f5549a.s();
        T(iS2);
        int iK2 = this.f5549a.k() + iS2;
        do {
            y14Var.i(this.f5549a.v());
        } while (this.f5549a.k() < iK2);
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final double j() throws l14 {
        R(1);
        return this.f5549a.i();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final float k() throws l14 {
        R(5);
        return this.f5549a.j();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final int l() {
        int iR = this.f5552d;
        if (iR != 0) {
            this.f5550b = iR;
            this.f5552d = 0;
        } else {
            iR = this.f5549a.r();
            this.f5550b = iR;
        }
        if (iR == 0 || iR == this.f5551c) {
            return Integer.MAX_VALUE;
        }
        return iR >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final int m() throws l14 {
        R(0);
        return this.f5549a.m();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final int n() throws l14 {
        R(5);
        return this.f5549a.n();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final int o() throws l14 {
        R(5);
        return this.f5549a.p();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final int p() {
        return this.f5550b;
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final int q() throws l14 {
        R(0);
        return this.f5549a.o();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final int r() throws l14 {
        R(0);
        return this.f5549a.q();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final long s() throws l14 {
        R(1);
        return this.f5549a.t();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final int t() throws l14 {
        R(0);
        return this.f5549a.s();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final long u() throws l14 {
        R(0);
        return this.f5549a.u();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final long v() throws l14 {
        R(0);
        return this.f5549a.w();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final long w() throws l14 {
        R(0);
        return this.f5549a.x();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final long x() throws l14 {
        R(1);
        return this.f5549a.v();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final rz3 y() throws l14 {
        R(2);
        return this.f5549a.y();
    }

    @Override // com.google.android.gms.internal.ads.v24
    public final void z(List list) throws m14 {
        int iR;
        int iR2;
        if (!(list instanceof b14)) {
            int i8 = this.f5550b & 7;
            if (i8 == 2) {
                int iS = this.f5549a.s();
                S(iS);
                int iK = this.f5549a.k() + iS;
                do {
                    list.add(Integer.valueOf(this.f5549a.p()));
                } while (this.f5549a.k() < iK);
                return;
            }
            if (i8 != 5) {
                throw m14.a();
            }
            do {
                list.add(Integer.valueOf(this.f5549a.p()));
                if (this.f5549a.b()) {
                    return;
                } else {
                    iR = this.f5549a.r();
                }
            } while (iR == this.f5550b);
            this.f5552d = iR;
            return;
        }
        b14 b14Var = (b14) list;
        int i9 = this.f5550b & 7;
        if (i9 == 2) {
            int iS2 = this.f5549a.s();
            S(iS2);
            int iK2 = this.f5549a.k() + iS2;
            do {
                b14Var.S(this.f5549a.p());
            } while (this.f5549a.k() < iK2);
            return;
        }
        if (i9 != 5) {
            throw m14.a();
        }
        do {
            b14Var.S(this.f5549a.p());
            if (this.f5549a.b()) {
                return;
            } else {
                iR2 = this.f5549a.r();
            }
        } while (iR2 == this.f5550b);
        this.f5552d = iR2;
    }
}
