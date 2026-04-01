package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ha f20126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ da f20127b;

    ia(da daVar) {
        this.f20127b = daVar;
    }

    final void a() {
        this.f20127b.i();
        if (this.f20126a != null) {
            this.f20127b.f19915c.removeCallbacks(this.f20126a);
        }
        this.f20127b.e().f20713s.a(false);
        this.f20127b.D(false);
    }

    final void b(long j8) {
        this.f20126a = new ha(this, this.f20127b.k().a(), j8);
        this.f20127b.f19915c.postDelayed(this.f20126a, 2000L);
    }
}
