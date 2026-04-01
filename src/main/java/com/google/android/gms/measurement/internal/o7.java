package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class o7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f20320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f20321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ b7 f20322e;

    o7(b7 b7Var, String str, String str2, Object obj, long j8) {
        this.f20322e = b7Var;
        this.f20318a = str;
        this.f20319b = str2;
        this.f20320c = obj;
        this.f20321d = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20322e.Y(this.f20318a, this.f20319b, this.f20320c, this.f20321d);
    }
}
