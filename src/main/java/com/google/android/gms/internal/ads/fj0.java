package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class fj0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qi0 f7772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7773b = false;

    fj0(qi0 qi0Var) {
        this.f7772a = qi0Var;
    }

    private final void c() {
        e53 e53Var = j2.k2.f23991k;
        e53Var.removeCallbacks(this);
        e53Var.postDelayed(this, 250L);
    }

    public final void a() {
        this.f7773b = true;
        this.f7772a.D();
    }

    public final void b() {
        this.f7773b = false;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7773b) {
            return;
        }
        this.f7772a.D();
        c();
    }
}
