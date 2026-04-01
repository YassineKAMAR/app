package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class r94 extends s11 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final oo4 f13994g;

    public r94(boolean z7, oo4 oo4Var) {
        this.f13994g = oo4Var;
        this.f13993f = oo4Var.c();
    }

    private final int w(int i8, boolean z7) {
        if (z7) {
            return this.f13994g.d(i8);
        }
        if (i8 >= this.f13993f - 1) {
            return -1;
        }
        return i8 + 1;
    }

    private final int x(int i8, boolean z7) {
        if (z7) {
            return this.f13994g.e(i8);
        }
        if (i8 <= 0) {
            return -1;
        }
        return i8 - 1;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iP = p(obj2);
        if (iP == -1 || (iA = u(iP).a(obj3)) == -1) {
            return -1;
        }
        return s(iP) + iA;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final py0 d(int i8, py0 py0Var, boolean z7) {
        int iQ = q(i8);
        int iT = t(iQ);
        u(iQ).d(i8 - s(iQ), py0Var, z7);
        py0Var.f13191c += iT;
        if (z7) {
            Object objV = v(iQ);
            Object obj = py0Var.f13190b;
            obj.getClass();
            py0Var.f13190b = Pair.create(objV, obj);
        }
        return py0Var;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final r01 e(int i8, r01 r01Var, long j8) {
        int iR = r(i8);
        int iT = t(iR);
        int iS = s(iR);
        u(iR).e(i8 - iT, r01Var, j8);
        Object objV = v(iR);
        if (!r01.f13823p.equals(r01Var.f13834a)) {
            objV = Pair.create(objV, r01Var.f13834a);
        }
        r01Var.f13834a = objV;
        r01Var.f13847n += iS;
        r01Var.f13848o += iS;
        return r01Var;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final Object f(int i8) {
        int iQ = q(i8);
        return Pair.create(v(iQ), u(iQ).f(i8 - s(iQ)));
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int g(boolean z7) {
        if (this.f13993f == 0) {
            return -1;
        }
        int iA = z7 ? this.f13994g.a() : 0;
        while (u(iA).o()) {
            iA = w(iA, z7);
            if (iA == -1) {
                return -1;
            }
        }
        return t(iA) + u(iA).g(z7);
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int h(boolean z7) {
        int i8 = this.f13993f;
        if (i8 == 0) {
            return -1;
        }
        int iB = z7 ? this.f13994g.b() : i8 - 1;
        while (u(iB).o()) {
            iB = x(iB, z7);
            if (iB == -1) {
                return -1;
            }
        }
        return t(iB) + u(iB).h(z7);
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int j(int i8, int i9, boolean z7) {
        int iR = r(i8);
        int iT = t(iR);
        int iJ = u(iR).j(i8 - iT, i9 == 2 ? 0 : i9, z7);
        if (iJ != -1) {
            return iT + iJ;
        }
        int iW = w(iR, z7);
        while (iW != -1 && u(iW).o()) {
            iW = w(iW, z7);
        }
        if (iW != -1) {
            return t(iW) + u(iW).g(z7);
        }
        if (i9 == 2) {
            return g(z7);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int k(int i8, int i9, boolean z7) {
        int iR = r(i8);
        int iT = t(iR);
        int iK = u(iR).k(i8 - iT, 0, false);
        if (iK != -1) {
            return iT + iK;
        }
        int iX = x(iR, false);
        while (iX != -1 && u(iX).o()) {
            iX = x(iX, false);
        }
        if (iX != -1) {
            return t(iX) + u(iX).h(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final py0 n(Object obj, py0 py0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iP = p(obj2);
        int iT = t(iP);
        u(iP).n(obj3, py0Var);
        py0Var.f13191c += iT;
        py0Var.f13190b = obj;
        return py0Var;
    }

    protected abstract int p(Object obj);

    protected abstract int q(int i8);

    protected abstract int r(int i8);

    protected abstract int s(int i8);

    protected abstract int t(int i8);

    protected abstract s11 u(int i8);

    protected abstract Object v(int i8);
}
