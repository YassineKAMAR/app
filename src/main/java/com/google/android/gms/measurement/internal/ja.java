package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.me;

/* JADX INFO: loaded from: classes.dex */
final class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f20158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f20159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f20160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ da f20161d;

    public ja(da daVar) {
        this.f20161d = daVar;
        this.f20160c = new ma(this, daVar.f20556a);
        long jB = daVar.k().b();
        this.f20158a = jB;
        this.f20159b = jB;
    }

    static /* synthetic */ void c(ja jaVar) {
        jaVar.f20161d.i();
        jaVar.d(false, false, jaVar.f20161d.k().b());
        jaVar.f20161d.l().v(jaVar.f20161d.k().b());
    }

    final long a(long j8) {
        long j9 = j8 - this.f20159b;
        this.f20159b = j8;
        return j9;
    }

    final void b() {
        this.f20160c.a();
        this.f20158a = 0L;
        this.f20159b = 0L;
    }

    public final boolean d(boolean z7, boolean z8, long j8) {
        this.f20161d.i();
        this.f20161d.v();
        if (!me.a() || !this.f20161d.a().q(e0.f19956q0) || this.f20161d.f20556a.m()) {
            this.f20161d.e().f20710p.b(this.f20161d.k().a());
        }
        long jA = j8 - this.f20158a;
        if (!z7 && jA < 1000) {
            this.f20161d.t().K().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jA));
            return false;
        }
        if (!z8) {
            jA = a(j8);
        }
        this.f20161d.t().K().b("Recording user engagement, ms", Long.valueOf(jA));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jA);
        ib.W(this.f20161d.q().C(!this.f20161d.a().Q()), bundle, true);
        if (!z8) {
            this.f20161d.o().z0("auto", "_e", bundle);
        }
        this.f20158a = j8;
        this.f20160c.a();
        this.f20160c.b(3600000L);
        return true;
    }

    final void e(long j8) {
        this.f20160c.a();
    }

    final void f(long j8) {
        this.f20161d.i();
        this.f20160c.a();
        this.f20158a = j8;
        this.f20159b = j8;
    }
}
