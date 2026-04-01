package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class jb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ub f9555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ac f9556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f9557c;

    public jb(ub ubVar, ac acVar, Runnable runnable) {
        this.f9555a = ubVar;
        this.f9556b = acVar;
        this.f9557c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9555a.C();
        ac acVar = this.f9556b;
        if (acVar.c()) {
            this.f9555a.u(acVar.f5190a);
        } else {
            this.f9555a.t(acVar.f5192c);
        }
        if (this.f9556b.f5193d) {
            this.f9555a.s("intermediate-response");
        } else {
            this.f9555a.v("done");
        }
        Runnable runnable = this.f9557c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
