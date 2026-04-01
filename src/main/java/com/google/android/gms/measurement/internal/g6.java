package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class g6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f20029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f20030b;

    g6(a6 a6Var, d dVar) {
        this.f20030b = a6Var;
        this.f20029a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20030b.f19787a.o0();
        if (this.f20029a.f19879c.g() == null) {
            this.f20030b.f19787a.o(this.f20029a);
        } else {
            this.f20030b.f19787a.S(this.f20029a);
        }
    }
}
