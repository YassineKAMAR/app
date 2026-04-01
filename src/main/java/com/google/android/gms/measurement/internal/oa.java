package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.e f20339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20340b;

    public oa(e3.e eVar) {
        a3.o.j(eVar);
        this.f20339a = eVar;
    }

    public final void a() {
        this.f20340b = 0L;
    }

    public final boolean b(long j8) {
        return this.f20340b == 0 || this.f20339a.b() - this.f20340b >= 3600000;
    }

    public final void c() {
        this.f20340b = this.f20339a.b();
    }
}
