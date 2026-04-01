package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z5 implements p0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final w0 f18010q = new w0() { // from class: com.google.android.gms.internal.ads.x5
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new z5(0)};
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final l4 f18011r = new l4() { // from class: com.google.android.gms.internal.ads.y5
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f18012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f18013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g1 f18014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i1 f18015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w1 f18016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s0 f18017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w1 f18018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w1 f18019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f18020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private td0 f18021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f18022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f18023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f18024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b6 f18026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18027p;

    public z5() {
        this(0);
    }

    public z5(int i8) {
        this.f18012a = new dq2(10);
        this.f18013b = new k1();
        this.f18014c = new g1();
        this.f18022k = -9223372036854775807L;
        this.f18015d = new i1();
        o0 o0Var = new o0();
        this.f18016e = o0Var;
        this.f18019h = o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int b(com.google.android.gms.internal.ads.q0 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z5.b(com.google.android.gms.internal.ads.q0):int");
    }

    private final long c(long j8) {
        return this.f18022k + ((j8 * 1000000) / ((long) this.f18013b.f9867d));
    }

    private final b6 d(q0 q0Var, boolean z7) {
        ((f0) q0Var).L(this.f18012a.i(), 0, 4, false);
        this.f18012a.g(0);
        this.f18013b.a(this.f18012a.o());
        return new u5(q0Var.p(), q0Var.n(), this.f18013b, false);
    }

    private static boolean i(int i8, long j8) {
        return ((long) (i8 & (-128000))) == (j8 & (-128000));
    }

    private final boolean j(q0 q0Var) {
        b6 b6Var = this.f18026o;
        if (b6Var != null) {
            long jL = b6Var.l();
            if (jL != -1 && q0Var.m() > jL - 4) {
                return true;
            }
        }
        try {
            return !q0Var.L(this.f18012a.i(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean k(q0 q0Var, boolean z7) throws Throwable {
        int i8;
        int iM;
        int iB;
        q0Var.t();
        if (q0Var.n() == 0) {
            td0 td0VarA = this.f18015d.a(q0Var, null);
            this.f18021j = td0VarA;
            if (td0VarA != null) {
                this.f18014c.b(td0VarA);
            }
            iM = (int) q0Var.m();
            if (!z7) {
                ((f0) q0Var).d(iM, false);
            }
            i8 = 0;
        } else {
            i8 = 0;
            iM = 0;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (!j(q0Var)) {
                this.f18012a.g(0);
                int iO = this.f18012a.o();
                if ((i8 == 0 || i(iO, i8)) && (iB = l1.b(iO)) != -1) {
                    i9++;
                    if (i9 != 1) {
                        if (i9 == 4) {
                            break;
                        }
                    } else {
                        this.f18013b.a(iO);
                        i8 = iO;
                    }
                    ((f0) q0Var).c(iB - 4, false);
                } else {
                    int i11 = i10 + 1;
                    if (i10 == (true != z7 ? 131072 : 32768)) {
                        if (z7) {
                            return false;
                        }
                        throw yh0.a("Searched too many bytes.", null);
                    }
                    if (z7) {
                        q0Var.t();
                        ((f0) q0Var).c(iM + i11, false);
                    } else {
                        ((f0) q0Var).d(1, false);
                    }
                    i10 = i11;
                    i8 = 0;
                    i9 = 0;
                }
            } else if (i9 <= 0) {
                throw new EOFException();
            }
        }
        if (z7) {
            ((f0) q0Var).d(iM + i10, false);
        } else {
            q0Var.t();
        }
        this.f18020i = i8;
        return true;
    }

    public final void a() {
        this.f18027p = true;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        this.f18020i = 0;
        this.f18022k = -9223372036854775807L;
        this.f18023l = 0L;
        this.f18025n = 0;
        b6 b6Var = this.f18026o;
        if (b6Var instanceof v5) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final int f(q0 q0Var, n1 n1Var) throws Throwable {
        uu1.b(this.f18018g);
        int i8 = nz2.f12300a;
        int iB = b(q0Var);
        if (iB == -1 && (this.f18026o instanceof v5)) {
            if (this.f18026o.j() != c(this.f18023l)) {
                throw null;
            }
        }
        return iB;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) {
        return k(q0Var, true);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f18017f = s0Var;
        w1 w1VarF = s0Var.f(0, 1);
        this.f18018g = w1VarF;
        this.f18019h = w1VarF;
        this.f18017f.d();
    }
}
