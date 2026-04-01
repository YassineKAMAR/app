package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ac4 implements yc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vm4 f5201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s11 f5202c;

    public ac4(Object obj, om4 om4Var) {
        this.f5200a = obj;
        this.f5201b = om4Var;
        this.f5202c = om4Var.u();
    }

    public final void a(s11 s11Var) {
        this.f5202c = s11Var;
    }

    @Override // com.google.android.gms.internal.ads.yc4
    public final s11 j() {
        return this.f5202c;
    }

    @Override // com.google.android.gms.internal.ads.yc4
    public final Object k() {
        return this.f5200a;
    }
}
