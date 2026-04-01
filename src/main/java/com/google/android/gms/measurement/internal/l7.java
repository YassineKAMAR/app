package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class l7 implements x3.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ na f20196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f20197b;

    l7(b7 b7Var, na naVar) {
        this.f20197b = b7Var;
        this.f20196a = naVar;
    }

    @Override // x3.a
    public final void a(Object obj) {
        this.f20197b.i();
        this.f20197b.f19825i = false;
        this.f20197b.r0();
        this.f20197b.t().F().b("registerTriggerAsync ran. uri", this.f20196a.f20302a);
    }

    @Override // x3.a
    public final void b(Throwable th) {
        this.f20197b.i();
        this.f20197b.f19825i = false;
        this.f20197b.r0();
        this.f20197b.t().G().b("registerTriggerAsync failed with throwable", th);
    }
}
