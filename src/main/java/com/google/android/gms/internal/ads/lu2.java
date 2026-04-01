package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class lu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ku2 f11049a = new ku2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11054f;

    lu2() {
    }

    public final ku2 a() {
        ku2 ku2Var = this.f11049a;
        ku2 ku2VarClone = ku2Var.clone();
        ku2Var.f10358a = false;
        ku2Var.f10359b = false;
        return ku2VarClone;
    }

    public final String b() {
        return "\n\tPool does not exist: " + this.f11052d + "\n\tNew pools created: " + this.f11050b + "\n\tPools removed: " + this.f11051c + "\n\tEntries added: " + this.f11054f + "\n\tNo entries retrieved: " + this.f11053e + "\n";
    }

    public final void c() {
        this.f11054f++;
    }

    public final void d() {
        this.f11050b++;
        this.f11049a.f10358a = true;
    }

    public final void e() {
        this.f11053e++;
    }

    public final void f() {
        this.f11052d++;
    }

    public final void g() {
        this.f11051c++;
        this.f11049a.f10359b = true;
    }
}
