package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ld4 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final tm4 f10623t = new tm4(new Object(), -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s11 f10624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tm4 f10625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ja4 f10629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final to4 f10631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pq4 f10632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f10633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final tm4 f10634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dm0 f10637n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10638o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f10639p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f10640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f10641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f10642s;

    public ld4(s11 s11Var, tm4 tm4Var, long j8, long j9, int i8, ja4 ja4Var, boolean z7, to4 to4Var, pq4 pq4Var, List list, tm4 tm4Var2, boolean z8, int i9, dm0 dm0Var, long j10, long j11, long j12, long j13, boolean z9) {
        this.f10624a = s11Var;
        this.f10625b = tm4Var;
        this.f10626c = j8;
        this.f10627d = j9;
        this.f10628e = i8;
        this.f10629f = ja4Var;
        this.f10630g = z7;
        this.f10631h = to4Var;
        this.f10632i = pq4Var;
        this.f10633j = list;
        this.f10634k = tm4Var2;
        this.f10635l = z8;
        this.f10636m = i9;
        this.f10637n = dm0Var;
        this.f10639p = j10;
        this.f10640q = j11;
        this.f10641r = j12;
        this.f10642s = j13;
        this.f10638o = z9;
    }

    public static ld4 i(pq4 pq4Var) {
        s11 s11Var = s11.f14453a;
        tm4 tm4Var = f10623t;
        return new ld4(s11Var, tm4Var, -9223372036854775807L, 0L, 1, null, false, to4.f15200d, pq4Var, jb3.z(), tm4Var, false, 0, dm0.f6807d, 0L, 0L, 0L, 0L, false);
    }

    public static tm4 j() {
        return f10623t;
    }

    public final long a() {
        long j8;
        long j9;
        if (!k()) {
            return this.f10641r;
        }
        do {
            j8 = this.f10642s;
            j9 = this.f10641r;
        } while (j8 != this.f10642s);
        return nz2.C(nz2.E(j9) + ((long) ((SystemClock.elapsedRealtime() - j8) * this.f10637n.f6811a)));
    }

    public final ld4 b() {
        return new ld4(this.f10624a, this.f10625b, this.f10626c, this.f10627d, this.f10628e, this.f10629f, this.f10630g, this.f10631h, this.f10632i, this.f10633j, this.f10634k, this.f10635l, this.f10636m, this.f10637n, this.f10639p, this.f10640q, a(), SystemClock.elapsedRealtime(), this.f10638o);
    }

    public final ld4 c(tm4 tm4Var) {
        return new ld4(this.f10624a, this.f10625b, this.f10626c, this.f10627d, this.f10628e, this.f10629f, this.f10630g, this.f10631h, this.f10632i, this.f10633j, tm4Var, this.f10635l, this.f10636m, this.f10637n, this.f10639p, this.f10640q, this.f10641r, this.f10642s, this.f10638o);
    }

    public final ld4 d(tm4 tm4Var, long j8, long j9, long j10, long j11, to4 to4Var, pq4 pq4Var, List list) {
        tm4 tm4Var2 = this.f10634k;
        boolean z7 = this.f10635l;
        int i8 = this.f10636m;
        dm0 dm0Var = this.f10637n;
        long j12 = this.f10639p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z8 = this.f10638o;
        return new ld4(this.f10624a, tm4Var, j9, j10, this.f10628e, this.f10629f, this.f10630g, to4Var, pq4Var, list, tm4Var2, z7, i8, dm0Var, j12, j11, j8, jElapsedRealtime, z8);
    }

    public final ld4 e(boolean z7, int i8) {
        return new ld4(this.f10624a, this.f10625b, this.f10626c, this.f10627d, this.f10628e, this.f10629f, this.f10630g, this.f10631h, this.f10632i, this.f10633j, this.f10634k, z7, i8, this.f10637n, this.f10639p, this.f10640q, this.f10641r, this.f10642s, this.f10638o);
    }

    public final ld4 f(ja4 ja4Var) {
        return new ld4(this.f10624a, this.f10625b, this.f10626c, this.f10627d, this.f10628e, ja4Var, this.f10630g, this.f10631h, this.f10632i, this.f10633j, this.f10634k, this.f10635l, this.f10636m, this.f10637n, this.f10639p, this.f10640q, this.f10641r, this.f10642s, this.f10638o);
    }

    public final ld4 g(int i8) {
        return new ld4(this.f10624a, this.f10625b, this.f10626c, this.f10627d, i8, this.f10629f, this.f10630g, this.f10631h, this.f10632i, this.f10633j, this.f10634k, this.f10635l, this.f10636m, this.f10637n, this.f10639p, this.f10640q, this.f10641r, this.f10642s, this.f10638o);
    }

    public final ld4 h(s11 s11Var) {
        return new ld4(s11Var, this.f10625b, this.f10626c, this.f10627d, this.f10628e, this.f10629f, this.f10630g, this.f10631h, this.f10632i, this.f10633j, this.f10634k, this.f10635l, this.f10636m, this.f10637n, this.f10639p, this.f10640q, this.f10641r, this.f10642s, this.f10638o);
    }

    public final boolean k() {
        return this.f10628e == 3 && this.f10635l && this.f10636m == 0;
    }
}
