package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a7 implements p0, q1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final w0 f5046x = new w0() { // from class: com.google.android.gms.internal.ads.y6
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new a7(0)};
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private dq2 f5058l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5062p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long[][] f5065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5066t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f5067u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5068v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b5 f5069w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5054h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c7 f5052f = new c7();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f5053g = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dq2 f5050d = new dq2(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f5051e = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f5047a = new dq2(sd3.f14624a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f5048b = new dq2(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dq2 f5049c = new dq2();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5059m = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private s0 f5063q = s0.K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private z6[] f5064r = new z6[0];

    public a7(int i8) {
    }

    private static int b(int i8) {
        if (i8 != 1751476579) {
            return i8 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int c(h7 h7Var, long j8) {
        int iA = h7Var.a(j8);
        return iA == -1 ? h7Var.b(j8) : iA;
    }

    private static long d(h7 h7Var, long j8, long j9) {
        int iC = c(h7Var, j8);
        return iC == -1 ? j9 : Math.min(h7Var.f8656c[iC], j9);
    }

    private final void i() {
        this.f5054h = 0;
        this.f5057k = 0;
    }

    private final void k(long j8) throws yh0 {
        td0 td0Var;
        long j9;
        List list;
        int i8;
        int i9;
        td0 td0Var2;
        int i10;
        g1 g1Var;
        while (!this.f5051e.isEmpty() && ((e6) this.f5051e.peek()).f7134b == j8) {
            e6 e6Var = (e6) this.f5051e.pop();
            if (e6Var.f8224a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i11 = this.f5068v;
                g1 g1Var2 = new g1();
                f6 f6VarD = e6Var.d(1969517665);
                if (f6VarD != null) {
                    td0 td0VarB = p6.b(f6VarD);
                    g1Var2.b(td0VarB);
                    td0Var = td0VarB;
                } else {
                    td0Var = null;
                }
                e6 e6VarC = e6Var.c(1835365473);
                td0 td0VarA = e6VarC != null ? p6.a(e6VarC) : null;
                tc0[] tc0VarArr = new tc0[1];
                f6 f6VarD2 = e6Var.d(1836476516);
                f6VarD2.getClass();
                boolean z7 = i11 == 1;
                tc0VarArr[0] = p6.c(f6VarD2.f7629b);
                td0 td0Var3 = new td0(-9223372036854775807L, tc0VarArr);
                td0 td0Var4 = td0Var;
                long j10 = -9223372036854775807L;
                List listD = p6.d(e6Var, g1Var2, -9223372036854775807L, null, false, z7, new z73() { // from class: com.google.android.gms.internal.ads.x6
                    @Override // com.google.android.gms.internal.ads.z73
                    public final Object apply(Object obj) {
                        e7 e7Var = (e7) obj;
                        w0 w0Var = a7.f5046x;
                        return e7Var;
                    }
                });
                int size = listD.size();
                long j11 = -9223372036854775807L;
                int size2 = -1;
                int i12 = 0;
                while (true) {
                    j9 = 0;
                    if (i12 >= size) {
                        break;
                    }
                    h7 h7Var = (h7) listD.get(i12);
                    if (h7Var.f8655b == 0) {
                        list = listD;
                        i8 = size;
                        g1Var = g1Var2;
                    } else {
                        e7 e7Var = h7Var.f8654a;
                        list = listD;
                        long j12 = e7Var.f7153e;
                        if (j12 == j10) {
                            j12 = h7Var.f8661h;
                        }
                        long jMax = Math.max(j11, j12);
                        i8 = size;
                        z6 z6Var = new z6(e7Var, h7Var, this.f5063q.f(i12, e7Var.f7150b));
                        int i13 = "audio/true-hd".equals(e7Var.f7154f.f11793l) ? h7Var.f8658e * 16 : h7Var.f8658e + 30;
                        l9 l9VarB = e7Var.f7154f.b();
                        l9VarB.n(i13);
                        if (e7Var.f7150b != 2 || j12 <= 0) {
                            i9 = 1;
                        } else {
                            int i14 = h7Var.f8655b;
                            i9 = 1;
                            if (i14 > 1) {
                                l9VarB.g(i14 / (j12 / 1000000.0f));
                            }
                        }
                        int i15 = e7Var.f7150b;
                        String[] strArr = w6.f16646a;
                        if (i15 == i9 && g1Var2.a()) {
                            l9VarB.e(g1Var2.f8153a);
                            l9VarB.f(g1Var2.f8154b);
                        }
                        int i16 = e7Var.f7150b;
                        td0[] td0VarArr = new td0[3];
                        if (this.f5053g.isEmpty()) {
                            i10 = 0;
                            td0Var2 = null;
                        } else {
                            td0Var2 = new td0(this.f5053g);
                            i10 = 0;
                        }
                        td0VarArr[i10] = td0Var2;
                        td0VarArr[i9] = td0Var4;
                        td0VarArr[2] = td0Var3;
                        g1Var = g1Var2;
                        td0 td0Var5 = new td0(-9223372036854775807L, new tc0[i10]);
                        if (td0VarA != null) {
                            for (int i17 = 0; i17 < td0VarA.b(); i17++) {
                                tc0 tc0VarC = td0VarA.c(i17);
                                if (tc0VarC instanceof r33) {
                                    r33 r33Var = (r33) tc0VarC;
                                    if (!r33Var.f13883a.equals("com.android.capture.fps")) {
                                        td0Var5 = td0Var5.d(r33Var);
                                    } else if (i16 == 2) {
                                        td0Var5 = td0Var5.d(r33Var);
                                    }
                                }
                            }
                        }
                        for (int i18 = 0; i18 < 3; i18++) {
                            td0Var5 = td0Var5.e(td0VarArr[i18]);
                        }
                        if (td0Var5.b() > 0) {
                            l9VarB.o(td0Var5);
                        }
                        z6Var.f18035c.e(l9VarB.D());
                        if (e7Var.f7150b == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(z6Var);
                        j11 = jMax;
                    }
                    i12++;
                    g1Var2 = g1Var;
                    listD = list;
                    size = i8;
                    j10 = -9223372036854775807L;
                }
                this.f5066t = size2;
                this.f5067u = j11;
                z6[] z6VarArr = (z6[]) arrayList.toArray(new z6[0]);
                this.f5064r = z6VarArr;
                int length = z6VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i19 = 0; i19 < z6VarArr.length; i19++) {
                    jArr[i19] = new long[z6VarArr[i19].f18034b.f8655b];
                    jArr2[i19] = z6VarArr[i19].f18034b.f8659f[0];
                }
                int i20 = 0;
                while (i20 < z6VarArr.length) {
                    long j13 = Long.MAX_VALUE;
                    int i21 = -1;
                    for (int i22 = 0; i22 < z6VarArr.length; i22++) {
                        if (!zArr[i22]) {
                            long j14 = jArr2[i22];
                            if (j14 <= j13) {
                                i21 = i22;
                                j13 = j14;
                            }
                        }
                    }
                    int i23 = iArr[i21];
                    long[] jArr3 = jArr[i21];
                    jArr3[i23] = j9;
                    h7 h7Var2 = z6VarArr[i21].f18034b;
                    j9 += (long) h7Var2.f8657d[i23];
                    int i24 = i23 + 1;
                    iArr[i21] = i24;
                    if (i24 < jArr3.length) {
                        jArr2[i21] = h7Var2.f8659f[i24];
                    } else {
                        zArr[i21] = true;
                        i20++;
                    }
                }
                this.f5065s = jArr;
                this.f5063q.d();
                this.f5063q.r(this);
                this.f5051e.clear();
                this.f5054h = 2;
            } else if (!this.f5051e.isEmpty()) {
                ((e6) this.f5051e.peek()).e(e6Var);
            }
        }
        if (this.f5054h != 2) {
            i();
        }
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        this.f5051e.clear();
        this.f5057k = 0;
        this.f5059m = -1;
        this.f5060n = 0;
        this.f5061o = 0;
        this.f5062p = 0;
        if (j8 == 0) {
            i();
            return;
        }
        for (z6 z6Var : this.f5064r) {
            h7 h7Var = z6Var.f18034b;
            int iA = h7Var.a(j9);
            if (iA == -1) {
                iA = h7Var.b(j9);
            }
            z6Var.f18037e = iA;
            x1 x1Var = z6Var.f18036d;
            if (x1Var != null) {
                x1Var.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(com.google.android.gms.internal.ads.q0 r33, com.google.android.gms.internal.ads.n1 r34) throws com.google.android.gms.internal.ads.yh0 {
        /*
            Method dump skipped, instruction units count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a7.f(com.google.android.gms.internal.ads.q0, com.google.android.gms.internal.ads.n1):int");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) {
        return d7.b(q0Var, false);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f5063q = s0Var;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f5067u;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        long j9;
        long j10;
        int iB;
        z6[] z6VarArr = this.f5064r;
        if (z6VarArr.length == 0) {
            r1 r1Var = r1.f13855c;
            return new o1(r1Var, r1Var);
        }
        int i8 = this.f5066t;
        long jD = -1;
        if (i8 != -1) {
            h7 h7Var = z6VarArr[i8].f18034b;
            int iC = c(h7Var, j8);
            if (iC == -1) {
                r1 r1Var2 = r1.f13855c;
                return new o1(r1Var2, r1Var2);
            }
            long j11 = h7Var.f8659f[iC];
            j9 = h7Var.f8656c[iC];
            if (j11 >= j8 || iC >= h7Var.f8655b - 1 || (iB = h7Var.b(j8)) == -1 || iB == iC) {
                j10 = -9223372036854775807L;
            } else {
                j10 = h7Var.f8659f[iB];
                jD = h7Var.f8656c[iB];
            }
            j8 = j11;
        } else {
            j9 = Long.MAX_VALUE;
            j10 = -9223372036854775807L;
        }
        int i9 = 0;
        while (true) {
            z6[] z6VarArr2 = this.f5064r;
            if (i9 >= z6VarArr2.length) {
                break;
            }
            if (i9 != this.f5066t) {
                h7 h7Var2 = z6VarArr2[i9].f18034b;
                long jD2 = d(h7Var2, j8, j9);
                if (j10 != -9223372036854775807L) {
                    jD = d(h7Var2, j10, jD);
                }
                j9 = jD2;
            }
            i9++;
        }
        r1 r1Var3 = new r1(j8, j9);
        return j10 == -9223372036854775807L ? new o1(r1Var3, r1Var3) : new o1(r1Var3, new r1(j10, jD));
    }
}
