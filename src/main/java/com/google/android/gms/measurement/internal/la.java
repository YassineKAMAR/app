package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.yf;
import com.google.android.gms.internal.measurement.zd;

/* JADX INFO: loaded from: classes.dex */
final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ da f20209a;

    la(da daVar) {
        this.f20209a = daVar;
    }

    private final void c(long j8, boolean z7) {
        this.f20209a.i();
        if (this.f20209a.f20556a.m()) {
            this.f20209a.e().f20710p.b(j8);
            this.f20209a.t().K().b("Session started, time", Long.valueOf(this.f20209a.k().b()));
            Long lValueOf = Long.valueOf(j8 / 1000);
            this.f20209a.o().Y("auto", "_sid", lValueOf, j8);
            this.f20209a.e().f20711q.b(lValueOf.longValue());
            this.f20209a.e().f20706l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (this.f20209a.a().q(e0.f19948m0) && z7) {
                bundle.putLong("_aib", 1L);
            }
            this.f20209a.o().S("auto", "_s", j8, bundle);
            if (zd.a() && this.f20209a.a().q(e0.f19954p0)) {
                String strA = this.f20209a.e().f20716v.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                this.f20209a.o().S("auto", "_ssr", j8, bundle2);
            }
        }
    }

    final void a() {
        this.f20209a.i();
        if (this.f20209a.e().y(this.f20209a.k().a())) {
            this.f20209a.e().f20706l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f20209a.t().K().a("Detected application was in foreground");
                c(this.f20209a.k().a(), false);
            }
        }
    }

    final void b(long j8, boolean z7) {
        this.f20209a.i();
        this.f20209a.G();
        if (this.f20209a.e().y(j8)) {
            this.f20209a.e().f20706l.a(true);
            if (yf.a() && this.f20209a.a().q(e0.f19970x0)) {
                this.f20209a.m().I();
            }
        }
        this.f20209a.e().f20710p.b(j8);
        if (this.f20209a.e().f20706l.b()) {
            c(j8, z7);
        }
    }
}
