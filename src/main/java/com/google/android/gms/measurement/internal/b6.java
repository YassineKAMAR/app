package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class b6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f19817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f19818b;

    b6(a6 a6Var, lb lbVar) {
        this.f19818b = a6Var;
        this.f19817a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19818b.f19787a.o0();
        this.f19818b.f19787a.Z(this.f19817a);
    }
}
