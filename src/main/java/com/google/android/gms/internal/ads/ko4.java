package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ko4 implements w1 {
    private boolean B;
    private tj4 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eo4 f10194a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sj4 f10197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lj4 f10198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private jo4 f10199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private nb f10200g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f10208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f10209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f10210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10211r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10215v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private nb f10218y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private nb f10219z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final go4 f10195b = new go4();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10201h = 1000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long[] f10202i = new long[1000];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f10203j = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f10206m = new long[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f10205l = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f10204k = new int[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private v1[] f10207n = new v1[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qo4 f10196c = new qo4(new zy1() { // from class: com.google.android.gms.internal.ads.fo4
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f10212s = Long.MIN_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f10213t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f10214u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10217x = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10216w = true;
    private boolean A = true;

    protected ko4(xq4 xq4Var, sj4 sj4Var, lj4 lj4Var) {
        this.f10197d = sj4Var;
        this.f10198e = lj4Var;
        this.f10194a = new eo4(xq4Var);
    }

    static /* synthetic */ void D(io4 io4Var) {
        rj4 rj4Var = io4Var.f9315b;
        int i8 = qj4.f13535a;
    }

    private final int h(int i8, int i9, long j8, boolean z7) {
        int i10 = -1;
        for (int i11 = 0; i11 < i9; i11++) {
            long j9 = this.f10206m[i8];
            if (j9 > j8) {
                break;
            }
            if (!z7 || (this.f10205l[i8] & 1) != 0) {
                i10 = i11;
                if (j9 == j8) {
                    break;
                }
            }
            i8++;
            if (i8 == this.f10201h) {
                i8 = 0;
            }
        }
        return i10;
    }

    private final int i(int i8) {
        int i9 = this.f10210q + i8;
        int i10 = this.f10201h;
        return i9 < i10 ? i9 : i9 - i10;
    }

    private final synchronized int j(nc4 nc4Var, q94 q94Var, boolean z7, boolean z8, go4 go4Var) {
        q94Var.f13363e = false;
        if (!r()) {
            if (!z8 && !this.f10215v) {
                nb nbVar = this.f10219z;
                if (nbVar == null || (!z7 && nbVar == this.f10200g)) {
                    return -3;
                }
                o(nbVar, nc4Var);
                return -5;
            }
            q94Var.c(4);
            q94Var.f13364f = Long.MIN_VALUE;
            return -4;
        }
        nb nbVar2 = ((io4) this.f10196c.a(this.f10209p + this.f10211r)).f9314a;
        if (!z7 && nbVar2 == this.f10200g) {
            int i8 = i(this.f10211r);
            if (!s(i8)) {
                q94Var.f13363e = true;
                return -3;
            }
            q94Var.c(this.f10205l[i8]);
            if (this.f10211r == this.f10208o - 1 && (z8 || this.f10215v)) {
                q94Var.a(536870912);
            }
            long j8 = this.f10206m[i8];
            q94Var.f13364f = j8;
            if (j8 < this.f10212s) {
                q94Var.a(Integer.MIN_VALUE);
            }
            go4Var.f8442a = this.f10204k[i8];
            go4Var.f8443b = this.f10203j[i8];
            go4Var.f8444c = this.f10207n[i8];
            return -4;
        }
        o(nbVar2, nc4Var);
        return -5;
    }

    private final synchronized long k(long j8, boolean z7, boolean z8) {
        int i8;
        int i9 = this.f10208o;
        if (i9 != 0) {
            long[] jArr = this.f10206m;
            int i10 = this.f10210q;
            if (j8 >= jArr[i10]) {
                if (z8 && (i8 = this.f10211r) != i9) {
                    i9 = i8 + 1;
                }
                int iH = h(i10, i9, j8, false);
                if (iH == -1) {
                    return -1L;
                }
                return m(iH);
            }
        }
        return -1L;
    }

    private final synchronized long l() {
        int i8 = this.f10208o;
        if (i8 == 0) {
            return -1L;
        }
        return m(i8);
    }

    private final long m(int i8) {
        long j8 = this.f10213t;
        long jMax = Long.MIN_VALUE;
        if (i8 != 0) {
            int i9 = i(i8 - 1);
            for (int i10 = 0; i10 < i8; i10++) {
                jMax = Math.max(jMax, this.f10206m[i9]);
                if ((this.f10205l[i9] & 1) != 0) {
                    break;
                }
                i9--;
                if (i9 == -1) {
                    i9 = this.f10201h - 1;
                }
            }
        }
        this.f10213t = Math.max(j8, jMax);
        this.f10208o -= i8;
        int i11 = this.f10209p + i8;
        this.f10209p = i11;
        int i12 = this.f10210q + i8;
        this.f10210q = i12;
        int i13 = this.f10201h;
        if (i12 >= i13) {
            this.f10210q = i12 - i13;
        }
        int i14 = this.f10211r - i8;
        this.f10211r = i14;
        if (i14 < 0) {
            this.f10211r = 0;
        }
        this.f10196c.e(i11);
        if (this.f10208o != 0) {
            return this.f10203j[this.f10210q];
        }
        int i15 = this.f10210q;
        if (i15 == 0) {
            i15 = this.f10201h;
        }
        int i16 = i15 - 1;
        return this.f10203j[i16] + ((long) this.f10204k[i16]);
    }

    private final synchronized void n(long j8, int i8, long j9, int i9, v1 v1Var) {
        int i10 = this.f10208o;
        if (i10 > 0) {
            int i11 = i(i10 - 1);
            uu1.d(this.f10203j[i11] + ((long) this.f10204k[i11]) <= j9);
        }
        this.f10215v = (536870912 & i8) != 0;
        this.f10214u = Math.max(this.f10214u, j8);
        int i12 = i(this.f10208o);
        this.f10206m[i12] = j8;
        this.f10203j[i12] = j9;
        this.f10204k[i12] = i9;
        this.f10205l[i12] = i8;
        this.f10207n[i12] = v1Var;
        this.f10202i[i12] = 0;
        if (this.f10196c.f() || !((io4) this.f10196c.b()).f9314a.equals(this.f10219z)) {
            nb nbVar = this.f10219z;
            nbVar.getClass();
            this.f10196c.c(this.f10209p + this.f10208o, new io4(nbVar, rj4.f14163a, null));
        }
        int i13 = this.f10208o + 1;
        this.f10208o = i13;
        int i14 = this.f10201h;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            v1[] v1VarArr = new v1[i15];
            int i16 = this.f10210q;
            int i17 = i14 - i16;
            System.arraycopy(this.f10203j, i16, jArr2, 0, i17);
            System.arraycopy(this.f10206m, this.f10210q, jArr3, 0, i17);
            System.arraycopy(this.f10205l, this.f10210q, iArr, 0, i17);
            System.arraycopy(this.f10204k, this.f10210q, iArr2, 0, i17);
            System.arraycopy(this.f10207n, this.f10210q, v1VarArr, 0, i17);
            System.arraycopy(this.f10202i, this.f10210q, jArr, 0, i17);
            int i18 = this.f10210q;
            System.arraycopy(this.f10203j, 0, jArr2, i17, i18);
            System.arraycopy(this.f10206m, 0, jArr3, i17, i18);
            System.arraycopy(this.f10205l, 0, iArr, i17, i18);
            System.arraycopy(this.f10204k, 0, iArr2, i17, i18);
            System.arraycopy(this.f10207n, 0, v1VarArr, i17, i18);
            System.arraycopy(this.f10202i, 0, jArr, i17, i18);
            this.f10203j = jArr2;
            this.f10206m = jArr3;
            this.f10205l = iArr;
            this.f10204k = iArr2;
            this.f10207n = v1VarArr;
            this.f10202i = jArr;
            this.f10210q = 0;
            this.f10201h = i15;
        }
    }

    private final void o(nb nbVar, nc4 nc4Var) {
        nb nbVar2 = this.f10200g;
        e2 e2Var = nbVar2 == null ? null : nbVar2.f11796o;
        this.f10200g = nbVar;
        e2 e2Var2 = nbVar.f11796o;
        nc4Var.f11825a = nbVar.c(this.f10197d.b(nbVar));
        nc4Var.f11826b = this.C;
        if (nbVar2 == null || !nz2.e(e2Var, e2Var2)) {
            tj4 tj4Var = nbVar.f11796o != null ? new tj4(new jj4(new vj4(1), 6001)) : null;
            this.C = tj4Var;
            nc4Var.f11826b = tj4Var;
        }
    }

    private final void p() {
        if (this.C != null) {
            this.C = null;
            this.f10200g = null;
        }
    }

    private final synchronized void q() {
        this.f10211r = 0;
        this.f10194a.g();
    }

    private final boolean r() {
        return this.f10211r != this.f10208o;
    }

    private final boolean s(int i8) {
        if (this.C != null) {
            return (this.f10205l[i8] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean t(nb nbVar) {
        this.f10217x = false;
        if (nz2.e(nbVar, this.f10219z)) {
            return false;
        }
        if (!this.f10196c.f() && ((io4) this.f10196c.b()).f9314a.equals(nbVar)) {
            nbVar = ((io4) this.f10196c.b()).f9314a;
        }
        this.f10219z = nbVar;
        boolean z7 = this.A;
        nb nbVar2 = this.f10219z;
        this.A = z7 & xg0.e(nbVar2.f11793l, nbVar2.f11790i);
        this.B = false;
        return true;
    }

    public final synchronized nb A() {
        if (this.f10217x) {
            return null;
        }
        return this.f10219z;
    }

    public final void B(long j8, boolean z7, boolean z8) {
        this.f10194a.c(k(j8, false, z8));
    }

    public final void C() {
        this.f10194a.c(l());
    }

    public final void E() throws jj4 {
        tj4 tj4Var = this.C;
        if (tj4Var != null) {
            throw tj4Var.a();
        }
    }

    public final void F() {
        C();
        p();
    }

    public final void G() {
        H(true);
        p();
    }

    public final void H(boolean z7) {
        this.f10194a.f();
        this.f10208o = 0;
        this.f10209p = 0;
        this.f10210q = 0;
        this.f10211r = 0;
        this.f10216w = true;
        this.f10212s = Long.MIN_VALUE;
        this.f10213t = Long.MIN_VALUE;
        this.f10214u = Long.MIN_VALUE;
        this.f10215v = false;
        this.f10196c.d();
        if (z7) {
            this.f10218y = null;
            this.f10219z = null;
            this.f10217x = true;
            this.A = true;
        }
    }

    public final void I(long j8) {
        this.f10212s = j8;
    }

    public final void J(jo4 jo4Var) {
        this.f10199f = jo4Var;
    }

    public final synchronized void K(int i8) {
        boolean z7 = false;
        if (i8 >= 0) {
            try {
                if (this.f10211r + i8 <= this.f10208o) {
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        uu1.d(z7);
        this.f10211r += i8;
    }

    public final synchronized boolean L() {
        return this.f10215v;
    }

    public final synchronized boolean M(boolean z7) {
        boolean z8 = true;
        if (r()) {
            if (((io4) this.f10196c.a(this.f10209p + this.f10211r)).f9314a != this.f10200g) {
                return true;
            }
            return s(i(this.f10211r));
        }
        if (!z7 && !this.f10215v) {
            nb nbVar = this.f10219z;
            if (nbVar == null) {
                z8 = false;
            } else if (nbVar == this.f10200g) {
                return false;
            }
        }
        return z8;
    }

    public final synchronized boolean N(int i8) {
        boolean z7;
        q();
        int i9 = this.f10209p;
        if (i8 < i9 || i8 > this.f10208o + i9) {
            z7 = false;
        } else {
            this.f10212s = Long.MIN_VALUE;
            this.f10211r = i8 - i9;
            z7 = true;
        }
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final void a(long j8, int i8, int i9, int i10, v1 v1Var) {
        if (this.f10216w) {
            if ((i8 & 1) == 0) {
                return;
            } else {
                this.f10216w = false;
            }
        }
        if (this.A) {
            if (j8 < this.f10212s) {
                return;
            }
            if ((i8 & 1) == 0) {
                if (!this.B) {
                    pf2.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f10219z)));
                    this.B = true;
                }
                i8 |= 1;
            }
        }
        n(j8, i8, (this.f10194a.b() - ((long) i9)) - ((long) i10), i9, v1Var);
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final int b(wl4 wl4Var, int i8, boolean z7, int i9) {
        return this.f10194a.a(wl4Var, i8, z7);
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final void c(dq2 dq2Var, int i8, int i9) {
        this.f10194a.h(dq2Var, i8);
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final /* synthetic */ void d(dq2 dq2Var, int i8) {
        u1.b(this, dq2Var, i8);
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final void e(nb nbVar) {
        this.f10218y = nbVar;
        boolean zT = t(nbVar);
        jo4 jo4Var = this.f10199f;
        if (jo4Var == null || !zT) {
            return;
        }
        jo4Var.n(nbVar);
    }

    @Override // com.google.android.gms.internal.ads.w1
    public final /* synthetic */ int f(wl4 wl4Var, int i8, boolean z7) {
        return u1.a(this, wl4Var, i8, z7);
    }

    public final synchronized boolean g(long j8, boolean z7) {
        int iH;
        q();
        int i8 = this.f10211r;
        int i9 = i(i8);
        if (r() && j8 >= this.f10206m[i9]) {
            if (j8 > this.f10214u) {
                if (z7) {
                    z7 = true;
                }
            }
            if (this.A) {
                iH = this.f10208o - i8;
                int i10 = 0;
                while (true) {
                    if (i10 < iH) {
                        if (this.f10206m[i9] >= j8) {
                            iH = i10;
                            break;
                        }
                        i9++;
                        if (i9 == this.f10201h) {
                            i9 = 0;
                        }
                        i10++;
                    } else if (!z7) {
                        iH = -1;
                    }
                }
            } else {
                iH = h(i9, this.f10208o - i8, j8, true);
            }
            if (iH == -1) {
                return false;
            }
            this.f10212s = j8;
            this.f10211r += iH;
            return true;
        }
        return false;
    }

    public final int u() {
        return this.f10209p;
    }

    public final int v() {
        return this.f10209p + this.f10211r;
    }

    public final synchronized int w(long j8, boolean z7) {
        int i8 = this.f10211r;
        int i9 = i(i8);
        if (r() && j8 >= this.f10206m[i9]) {
            if (j8 > this.f10214u && z7) {
                return this.f10208o - i8;
            }
            int iH = h(i9, this.f10208o - i8, j8, true);
            if (iH == -1) {
                return 0;
            }
            return iH;
        }
        return 0;
    }

    public final int x() {
        return this.f10209p + this.f10208o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int y(com.google.android.gms.internal.ads.nc4 r9, com.google.android.gms.internal.ads.q94 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.android.gms.internal.ads.go4 r7 = r8.f10195b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.j(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.f()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.eo4 r9 = r8.f10194a
            com.google.android.gms.internal.ads.go4 r11 = r8.f10195b
            r9.d(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.eo4 r9 = r8.f10194a
            com.google.android.gms.internal.ads.go4 r11 = r8.f10195b
            r9.e(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.f10211r
            int r9 = r9 + r1
            r8.f10211r = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ko4.y(com.google.android.gms.internal.ads.nc4, com.google.android.gms.internal.ads.q94, int, boolean):int");
    }

    public final synchronized long z() {
        return this.f10214u;
    }
}
