package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.sf;

/* JADX INFO: loaded from: classes.dex */
final class ha implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f20067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f20068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ia f20069c;

    ha(ia iaVar, long j8, long j9) {
        this.f20069c = iaVar;
        this.f20067a = j8;
        this.f20068b = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20069c.f20127b.u().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.ka
            @Override // java.lang.Runnable
            public final void run() {
                ha haVar = this.f20185a;
                ia iaVar = haVar.f20069c;
                long j8 = haVar.f20067a;
                long j9 = haVar.f20068b;
                iaVar.f20127b.i();
                iaVar.f20127b.t().F().a("Application going to the background");
                iaVar.f20127b.e().f20713s.a(true);
                iaVar.f20127b.D(true);
                if (!iaVar.f20127b.a().Q()) {
                    iaVar.f20127b.f19918f.e(j9);
                    iaVar.f20127b.E(false, false, j9);
                }
                if (sf.a() && iaVar.f20127b.a().q(e0.K0)) {
                    iaVar.f20127b.t().J().b("Application backgrounded at: timestamp_millis", Long.valueOf(j8));
                } else {
                    iaVar.f20127b.o().S("auto", "_ab", j8, new Bundle());
                }
            }
        });
    }
}
