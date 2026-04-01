package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class s8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p8 f20482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p8 f20483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f20484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f20485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ o8 f20486e;

    s8(o8 o8Var, p8 p8Var, p8 p8Var2, long j8, boolean z7) {
        this.f20486e = o8Var;
        this.f20482a = p8Var;
        this.f20483b = p8Var2;
        this.f20484c = j8;
        this.f20485d = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20486e.N(this.f20482a, this.f20483b, this.f20484c, this.f20485d, null);
    }
}
