package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class r5 {
    private long A;
    private long B;
    private long C;
    private long D;
    private long E;
    private long F;
    private long G;
    private String H;
    private boolean I;
    private long J;
    private long K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w5 f20428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f20430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f20431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f20437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f20438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f20439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f20440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f20441n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20442o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f20443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f20444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Boolean f20445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f20446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<String> f20447t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f20448u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f20449v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f20450w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f20451x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f20452y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f20453z;

    r5(w5 w5Var, String str) {
        a3.o.j(w5Var);
        a3.o.f(str);
        this.f20428a = w5Var;
        this.f20429b = str;
        w5Var.u().i();
    }

    public final void A(long j8) {
        this.f20428a.u().i();
        this.I |= this.J != j8;
        this.J = j8;
    }

    public final void B(String str) {
        this.f20428a.u().i();
        this.I |= !p3.l.a(this.f20439l, str);
        this.f20439l = str;
    }

    public final void C(boolean z7) {
        this.f20428a.u().i();
        this.I |= this.f20449v != z7;
        this.f20449v = z7;
    }

    public final long D() {
        this.f20428a.u().i();
        return this.A;
    }

    public final void E(long j8) {
        this.f20428a.u().i();
        this.I |= this.E != j8;
        this.E = j8;
    }

    public final void F(String str) {
        this.f20428a.u().i();
        this.I |= !p3.l.a(this.f20437j, str);
        this.f20437j = str;
    }

    public final void G(boolean z7) {
        this.f20428a.u().i();
        this.I |= this.f20453z != z7;
        this.f20453z = z7;
    }

    public final long H() {
        this.f20428a.u().i();
        return this.J;
    }

    public final void I(long j8) {
        this.f20428a.u().i();
        this.I |= this.F != j8;
        this.F = j8;
    }

    public final void J(String str) {
        this.f20428a.u().i();
        this.I |= !p3.l.a(this.f20433f, str);
        this.f20433f = str;
    }

    public final long K() {
        this.f20428a.u().i();
        return this.E;
    }

    public final void L(long j8) {
        this.f20428a.u().i();
        this.I |= this.D != j8;
        this.D = j8;
    }

    public final void M(String str) {
        this.f20428a.u().i();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !p3.l.a(this.f20431d, str);
        this.f20431d = str;
    }

    public final long N() {
        this.f20428a.u().i();
        return this.F;
    }

    public final void O(long j8) {
        this.f20428a.u().i();
        this.I |= this.C != j8;
        this.C = j8;
    }

    public final void P(String str) {
        this.f20428a.u().i();
        this.I |= !p3.l.a(this.H, str);
        this.H = str;
    }

    public final long Q() {
        this.f20428a.u().i();
        return this.D;
    }

    public final void R(long j8) {
        this.f20428a.u().i();
        this.I |= this.G != j8;
        this.G = j8;
    }

    public final void S(String str) {
        this.f20428a.u().i();
        this.I |= !p3.l.a(this.f20432e, str);
        this.f20432e = str;
    }

    public final long T() {
        this.f20428a.u().i();
        return this.C;
    }

    public final void U(long j8) {
        this.f20428a.u().i();
        this.I |= this.B != j8;
        this.B = j8;
    }

    public final void V(String str) {
        this.f20428a.u().i();
        this.I |= !p3.l.a(this.f20448u, str);
        this.f20448u = str;
    }

    public final long W() {
        this.f20428a.u().i();
        return this.G;
    }

    public final void X(long j8) {
        this.f20428a.u().i();
        this.I |= this.f20441n != j8;
        this.f20441n = j8;
    }

    public final long Y() {
        this.f20428a.u().i();
        return this.B;
    }

    public final void Z(long j8) {
        this.f20428a.u().i();
        this.I |= this.f20446s != j8;
        this.f20446s = j8;
    }

    public final int a() {
        this.f20428a.u().i();
        return this.f20452y;
    }

    public final long a0() {
        this.f20428a.u().i();
        return this.f20441n;
    }

    public final void b(int i8) {
        this.f20428a.u().i();
        this.I |= this.f20452y != i8;
        this.f20452y = i8;
    }

    public final void b0(long j8) {
        this.f20428a.u().i();
        this.I |= this.K != j8;
        this.K = j8;
    }

    public final void c(long j8) {
        this.f20428a.u().i();
        this.I |= this.f20438k != j8;
        this.f20438k = j8;
    }

    public final long c0() {
        this.f20428a.u().i();
        return this.f20446s;
    }

    public final void d(Boolean bool) {
        this.f20428a.u().i();
        this.I |= !p3.l.a(this.f20445r, bool);
        this.f20445r = bool;
    }

    public final void d0(long j8) {
        this.f20428a.u().i();
        this.I |= this.f20440m != j8;
        this.f20440m = j8;
    }

    public final void e(String str) {
        this.f20428a.u().i();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !p3.l.a(this.f20444q, str);
        this.f20444q = str;
    }

    public final long e0() {
        this.f20428a.u().i();
        return this.K;
    }

    public final void f(List<String> list) {
        this.f20428a.u().i();
        if (p3.l.a(this.f20447t, list)) {
            return;
        }
        this.I = true;
        this.f20447t = list != null ? new ArrayList(list) : null;
    }

    public final void f0(long j8) {
        this.f20428a.u().i();
        this.I |= this.f20436i != j8;
        this.f20436i = j8;
    }

    public final void g(boolean z7) {
        this.f20428a.u().i();
        this.I |= this.f20443p != z7;
        this.f20443p = z7;
    }

    public final long g0() {
        this.f20428a.u().i();
        return this.f20440m;
    }

    public final String h() {
        this.f20428a.u().i();
        return this.f20437j;
    }

    public final void h0(long j8) {
        a3.o.a(j8 >= 0);
        this.f20428a.u().i();
        this.I = (this.f20434g != j8) | this.I;
        this.f20434g = j8;
    }

    public final String i() {
        this.f20428a.u().i();
        return this.f20433f;
    }

    public final long i0() {
        this.f20428a.u().i();
        return this.f20436i;
    }

    public final String j() {
        this.f20428a.u().i();
        return this.f20431d;
    }

    public final void j0(long j8) {
        this.f20428a.u().i();
        this.I |= this.f20435h != j8;
        this.f20435h = j8;
    }

    public final String k() {
        this.f20428a.u().i();
        return this.H;
    }

    public final long k0() {
        this.f20428a.u().i();
        return this.f20434g;
    }

    public final String l() {
        this.f20428a.u().i();
        return this.f20432e;
    }

    public final void l0(long j8) {
        this.f20428a.u().i();
        this.I |= this.f20451x != j8;
        this.f20451x = j8;
    }

    public final String m() {
        this.f20428a.u().i();
        return this.f20448u;
    }

    public final long m0() {
        this.f20428a.u().i();
        return this.f20435h;
    }

    public final List<String> n() {
        this.f20428a.u().i();
        return this.f20447t;
    }

    public final void n0(long j8) {
        this.f20428a.u().i();
        this.I |= this.f20450w != j8;
        this.f20450w = j8;
    }

    public final void o() {
        this.f20428a.u().i();
        this.I = false;
    }

    public final long o0() {
        this.f20428a.u().i();
        return this.f20451x;
    }

    public final void p() {
        this.f20428a.u().i();
        long j8 = this.f20434g + 1;
        if (j8 > 2147483647L) {
            this.f20428a.t().L().b("Bundle index overflow. appId", n4.v(this.f20429b));
            j8 = 0;
        }
        this.I = true;
        this.f20434g = j8;
    }

    public final long p0() {
        this.f20428a.u().i();
        return this.f20450w;
    }

    public final boolean q() {
        this.f20428a.u().i();
        return this.f20443p;
    }

    public final Boolean q0() {
        this.f20428a.u().i();
        return this.f20445r;
    }

    public final boolean r() {
        this.f20428a.u().i();
        return this.f20442o;
    }

    public final String r0() {
        this.f20428a.u().i();
        return this.f20444q;
    }

    public final boolean s() {
        this.f20428a.u().i();
        return this.I;
    }

    public final String s0() {
        this.f20428a.u().i();
        String str = this.H;
        P(null);
        return str;
    }

    public final boolean t() {
        this.f20428a.u().i();
        return this.f20449v;
    }

    public final String t0() {
        this.f20428a.u().i();
        return this.f20429b;
    }

    public final boolean u() {
        this.f20428a.u().i();
        return this.f20453z;
    }

    public final String u0() {
        this.f20428a.u().i();
        return this.f20430c;
    }

    public final long v() {
        this.f20428a.u().i();
        return 0L;
    }

    public final String v0() {
        this.f20428a.u().i();
        return this.f20439l;
    }

    public final void w(long j8) {
        this.f20428a.u().i();
        this.I |= this.A != j8;
        this.A = j8;
    }

    public final void x(String str) {
        this.f20428a.u().i();
        this.I |= !p3.l.a(this.f20430c, str);
        this.f20430c = str;
    }

    public final void y(boolean z7) {
        this.f20428a.u().i();
        this.I |= this.f20442o != z7;
        this.f20442o = z7;
    }

    public final long z() {
        this.f20428a.u().i();
        return this.f20438k;
    }
}
