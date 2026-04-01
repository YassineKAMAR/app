package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class b9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f19836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f19837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ hb f19838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ v8 f19839d;

    b9(v8 v8Var, lb lbVar, boolean z7, hb hbVar) {
        this.f19839d = v8Var;
        this.f19836a = lbVar;
        this.f19837b = z7;
        this.f19838c = hbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        p3.i iVar = this.f19839d.f20564d;
        if (iVar == null) {
            this.f19839d.t().G().a("Discarding data. Failed to set user property");
            return;
        }
        a3.o.j(this.f19836a);
        this.f19839d.T(iVar, this.f19837b ? null : this.f19838c, this.f19836a);
        this.f19839d.g0();
    }
}
