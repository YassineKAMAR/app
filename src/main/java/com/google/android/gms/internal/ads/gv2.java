package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class gv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8528a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8530c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fv2 f8529b = new fv2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8531d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8532e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8533f = 0;

    public gv2() {
        long jA = g2.t.b().a();
        this.f8528a = jA;
        this.f8530c = jA;
    }

    public final int a() {
        return this.f8531d;
    }

    public final long b() {
        return this.f8528a;
    }

    public final long c() {
        return this.f8530c;
    }

    public final fv2 d() {
        fv2 fv2Var = this.f8529b;
        fv2 fv2VarClone = fv2Var.clone();
        fv2Var.f8085a = false;
        fv2Var.f8086b = 0;
        return fv2VarClone;
    }

    public final String e() {
        return "Created: " + this.f8528a + " Last accessed: " + this.f8530c + " Accesses: " + this.f8531d + "\nEntries retrieved: Valid: " + this.f8532e + " Stale: " + this.f8533f;
    }

    public final void f() {
        this.f8530c = g2.t.b().a();
        this.f8531d++;
    }

    public final void g() {
        this.f8533f++;
        this.f8529b.f8086b++;
    }

    public final void h() {
        this.f8532e++;
        this.f8529b.f8085a = true;
    }
}
