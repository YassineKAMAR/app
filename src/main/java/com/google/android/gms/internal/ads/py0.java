package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class py0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f13183h = Integer.toString(0, 36);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f13184i = Integer.toString(1, 36);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f13185j = Integer.toString(2, 36);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f13186k = Integer.toString(3, 36);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f13187l = Integer.toString(4, 36);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final cf4 f13188m = new cf4() { // from class: com.google.android.gms.internal.ads.ox0
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x61 f13195g = x61.f17055e;

    public final int a(int i8) {
        return this.f13195g.a(i8).f16140b;
    }

    public final int b() {
        int i8 = this.f13195g.f17062a;
        return 0;
    }

    public final int c(long j8) {
        return -1;
    }

    public final int d(long j8) {
        this.f13195g.b(-1);
        return -1;
    }

    public final int e(int i8) {
        return this.f13195g.a(i8).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && py0.class.equals(obj.getClass())) {
            py0 py0Var = (py0) obj;
            if (nz2.e(this.f13189a, py0Var.f13189a) && nz2.e(this.f13190b, py0Var.f13190b) && this.f13191c == py0Var.f13191c && this.f13192d == py0Var.f13192d && this.f13194f == py0Var.f13194f && nz2.e(this.f13195g, py0Var.f13195g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i8, int i9) {
        return this.f13195g.a(i8).a(i9);
    }

    public final int g() {
        int i8 = this.f13195g.f17064c;
        return 0;
    }

    public final long h(int i8, int i9) {
        vf0 vf0VarA = this.f13195g.a(i8);
        if (vf0VarA.f16140b != -1) {
            return vf0VarA.f16143e[i9];
        }
        return -9223372036854775807L;
    }

    public final int hashCode() {
        Object obj = this.f13189a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f13190b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f13191c;
        long j8 = this.f13192d;
        return (((((iHashCode2 * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 961) + (this.f13194f ? 1 : 0)) * 31) + this.f13195g.hashCode();
    }

    public final long i(int i8) {
        long j8 = this.f13195g.a(i8).f16139a;
        return 0L;
    }

    public final long j() {
        long j8 = this.f13195g.f17063b;
        return 0L;
    }

    public final long k(int i8) {
        long j8 = this.f13195g.a(i8).f16144f;
        return 0L;
    }

    public final py0 l(Object obj, Object obj2, int i8, long j8, long j9, x61 x61Var, boolean z7) {
        this.f13189a = obj;
        this.f13190b = obj2;
        this.f13191c = i8;
        this.f13192d = j8;
        this.f13193e = 0L;
        this.f13195g = x61Var;
        this.f13194f = z7;
        return this;
    }

    public final boolean m(int i8) {
        b();
        if (i8 != -1) {
            return false;
        }
        this.f13195g.b(-1);
        return false;
    }

    public final boolean n(int i8) {
        boolean z7 = this.f13195g.a(i8).f16145g;
        return false;
    }
}
