package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class r01 {
    private static final String A;
    private static final String B;
    private static final String C;
    private static final String D;
    private static final String E;
    public static final cf4 F;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f13823p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f13824q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final c50 f13825r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f13826s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f13827t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f13828u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f13829v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f13830w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f13831x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f13832y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f13833z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public Object f13835b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public boolean f13842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public iv f13843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13848o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13834a = f13823p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c50 f13836c = f13825r;

    static {
        rg rgVar = new rg();
        rgVar.a("androidx.media3.common.Timeline");
        rgVar.b(Uri.EMPTY);
        f13825r = rgVar.c();
        f13826s = Integer.toString(1, 36);
        f13827t = Integer.toString(2, 36);
        f13828u = Integer.toString(3, 36);
        f13829v = Integer.toString(4, 36);
        f13830w = Integer.toString(5, 36);
        f13831x = Integer.toString(6, 36);
        f13832y = Integer.toString(7, 36);
        f13833z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = new cf4() { // from class: com.google.android.gms.internal.ads.qz0
        };
    }

    public final r01 a(Object obj, c50 c50Var, Object obj2, long j8, long j9, long j10, boolean z7, boolean z8, iv ivVar, long j11, long j12, int i8, int i9, long j13) {
        this.f13834a = obj;
        this.f13836c = c50Var == null ? f13825r : c50Var;
        this.f13835b = null;
        this.f13837d = -9223372036854775807L;
        this.f13838e = -9223372036854775807L;
        this.f13839f = -9223372036854775807L;
        this.f13840g = z7;
        this.f13841h = z8;
        this.f13842i = ivVar != null;
        this.f13843j = ivVar;
        this.f13845l = 0L;
        this.f13846m = j12;
        this.f13847n = 0;
        this.f13848o = 0;
        this.f13844k = false;
        return this;
    }

    public final boolean b() {
        uu1.f(this.f13842i == (this.f13843j != null));
        return this.f13843j != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r01.class.equals(obj.getClass())) {
            r01 r01Var = (r01) obj;
            if (nz2.e(this.f13834a, r01Var.f13834a) && nz2.e(this.f13836c, r01Var.f13836c) && nz2.e(null, null) && nz2.e(this.f13843j, r01Var.f13843j) && this.f13837d == r01Var.f13837d && this.f13838e == r01Var.f13838e && this.f13839f == r01Var.f13839f && this.f13840g == r01Var.f13840g && this.f13841h == r01Var.f13841h && this.f13844k == r01Var.f13844k && this.f13846m == r01Var.f13846m && this.f13847n == r01Var.f13847n && this.f13848o == r01Var.f13848o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f13834a.hashCode() + 217) * 31) + this.f13836c.hashCode();
        iv ivVar = this.f13843j;
        int iHashCode2 = ((iHashCode * 961) + (ivVar == null ? 0 : ivVar.hashCode())) * 31;
        long j8 = this.f13837d;
        int i8 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f13838e;
        int i9 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f13839f;
        int i10 = ((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f13840g ? 1 : 0)) * 31) + (this.f13841h ? 1 : 0)) * 31) + (this.f13844k ? 1 : 0);
        long j11 = this.f13846m;
        return ((((((i10 * 961) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f13847n) * 31) + this.f13848o) * 31;
    }
}
