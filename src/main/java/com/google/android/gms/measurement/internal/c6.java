package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class c6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f19863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f19864b;

    c6(a6 a6Var, lb lbVar) {
        this.f19864b = a6Var;
        this.f19863a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19864b.f19787a.o0();
        va vaVar = this.f19864b.f19787a;
        lb lbVar = this.f19863a;
        vaVar.u().i();
        vaVar.p0();
        a3.o.f(lbVar.f20210a);
        vaVar.d(lbVar);
    }
}
