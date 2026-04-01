package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class m30 extends qh0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j2.f0 f11143d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f11142c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11144e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11145f = 0;

    public m30(j2.f0 f0Var) {
        this.f11143d = f0Var;
    }

    public final h30 f() {
        h30 h30Var = new h30(this);
        synchronized (this.f11142c) {
            e(new i30(this, h30Var), new j30(this, h30Var));
            a3.o.m(this.f11145f >= 0);
            this.f11145f++;
        }
        return h30Var;
    }

    public final void g() {
        synchronized (this.f11142c) {
            a3.o.m(this.f11145f >= 0);
            j2.v1.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f11144e = true;
            h();
        }
    }

    protected final void h() {
        synchronized (this.f11142c) {
            a3.o.m(this.f11145f >= 0);
            if (this.f11144e && this.f11145f == 0) {
                j2.v1.k("No reference is left (including root). Cleaning up engine.");
                e(new l30(this), new mh0());
            } else {
                j2.v1.k("There are still references to the engine. Not destroying.");
            }
        }
    }

    protected final void i() {
        synchronized (this.f11142c) {
            a3.o.m(this.f11145f > 0);
            j2.v1.k("Releasing 1 reference for JS Engine");
            this.f11145f--;
            h();
        }
    }
}
