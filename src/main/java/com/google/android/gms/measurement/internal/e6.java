package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class e6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f19984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f19985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f19986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f19987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ a6 f19988e;

    e6(a6 a6Var, String str, String str2, String str3, long j8) {
        this.f19988e = a6Var;
        this.f19984a = str;
        this.f19985b = str2;
        this.f19986c = str3;
        this.f19987d = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f19984a;
        if (str == null) {
            this.f19988e.f19787a.D(this.f19985b, null);
        } else {
            this.f19988e.f19787a.D(this.f19985b, new p8(this.f19986c, str, this.f19987d));
        }
    }
}
