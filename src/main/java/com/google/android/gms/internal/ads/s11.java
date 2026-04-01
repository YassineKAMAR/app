package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class s11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s11 f14453a = new nw0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f14454b = Integer.toString(0, 36);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f14455c = Integer.toString(1, 36);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f14456d = Integer.toString(2, 36);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final cf4 f14457e = new cf4() { // from class: com.google.android.gms.internal.ads.mv0
    };

    protected s11() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract py0 d(int i8, py0 py0Var, boolean z7);

    public abstract r01 e(int i8, r01 r01Var, long j8);

    public final boolean equals(Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s11)) {
            return false;
        }
        s11 s11Var = (s11) obj;
        if (s11Var.c() == c() && s11Var.b() == b()) {
            r01 r01Var = new r01();
            py0 py0Var = new py0();
            r01 r01Var2 = new r01();
            py0 py0Var2 = new py0();
            for (int i8 = 0; i8 < c(); i8++) {
                if (!e(i8, r01Var, 0L).equals(s11Var.e(i8, r01Var2, 0L))) {
                    return false;
                }
            }
            for (int i9 = 0; i9 < b(); i9++) {
                if (!d(i9, py0Var, true).equals(s11Var.d(i9, py0Var2, true))) {
                    return false;
                }
            }
            int iG = g(true);
            if (iG == s11Var.g(true) && (iH = h(true)) == s11Var.h(true)) {
                while (iG != iH) {
                    int iJ = j(iG, 0, true);
                    if (iJ != s11Var.j(iG, 0, true)) {
                        return false;
                    }
                    iG = iJ;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i8);

    public int g(boolean z7) {
        return o() ? -1 : 0;
    }

    public int h(boolean z7) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i8;
        r01 r01Var = new r01();
        py0 py0Var = new py0();
        int iC = c() + 217;
        int i9 = 0;
        while (true) {
            i8 = iC * 31;
            if (i9 >= c()) {
                break;
            }
            iC = i8 + e(i9, r01Var, 0L).hashCode();
            i9++;
        }
        int iB = i8 + b();
        for (int i10 = 0; i10 < b(); i10++) {
            iB = (iB * 31) + d(i10, py0Var, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final int i(int i8, py0 py0Var, r01 r01Var, int i9, boolean z7) {
        int i10 = d(i8, py0Var, false).f13191c;
        if (e(i10, r01Var, 0L).f13848o != i8) {
            return i8 + 1;
        }
        int iJ = j(i10, i9, z7);
        if (iJ == -1) {
            return -1;
        }
        return e(iJ, r01Var, 0L).f13847n;
    }

    public int j(int i8, int i9, boolean z7) {
        if (i9 == 0) {
            if (i8 == h(z7)) {
                return -1;
            }
            return i8 + 1;
        }
        if (i9 == 1) {
            return i8;
        }
        if (i9 == 2) {
            return i8 == h(z7) ? g(z7) : i8 + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i8, int i9, boolean z7) {
        if (i8 == g(false)) {
            return -1;
        }
        return i8 - 1;
    }

    public final Pair l(r01 r01Var, py0 py0Var, int i8, long j8) {
        Pair pairM = m(r01Var, py0Var, i8, j8, 0L);
        pairM.getClass();
        return pairM;
    }

    public final Pair m(r01 r01Var, py0 py0Var, int i8, long j8, long j9) {
        uu1.a(i8, 0, c());
        e(i8, r01Var, j9);
        if (j8 == -9223372036854775807L) {
            long j10 = r01Var.f13845l;
            j8 = 0;
        }
        int i9 = r01Var.f13847n;
        d(i9, py0Var, false);
        while (i9 < r01Var.f13848o) {
            long j11 = py0Var.f13193e;
            if (j8 == 0) {
                break;
            }
            int i10 = i9 + 1;
            long j12 = d(i10, py0Var, false).f13193e;
            if (j8 < 0) {
                break;
            }
            i9 = i10;
        }
        d(i9, py0Var, true);
        long j13 = py0Var.f13193e;
        long j14 = py0Var.f13192d;
        if (j14 != -9223372036854775807L) {
            j8 = Math.min(j8, j14 - 1);
        }
        long jMax = Math.max(0L, j8);
        Object obj = py0Var.f13190b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public py0 n(Object obj, py0 py0Var) {
        return d(a(obj), py0Var, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
