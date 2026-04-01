package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class d6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f19901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f19902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f19903c;

    d6(a6 a6Var, d dVar, lb lbVar) {
        this.f19903c = a6Var;
        this.f19901a = dVar;
        this.f19902b = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19903c.f19787a.o0();
        if (this.f19901a.f19879c.g() == null) {
            this.f19903c.f19787a.q(this.f19901a, this.f19902b);
        } else {
            this.f19903c.f19787a.T(this.f19901a, this.f19902b);
        }
    }
}
