package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ag0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f5256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j2.x1 f5257h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f5250a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f5251b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f5252c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5253d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f5254e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f5255f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f5258i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f5259j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f5260k = 0;

    public ag0(String str, j2.x1 x1Var) {
        this.f5256g = str;
        this.f5257h = x1Var;
    }

    private final void i() {
        if (((Boolean) qu.f13764a.e()).booleanValue()) {
            synchronized (this.f5255f) {
                this.f5252c--;
                this.f5253d--;
            }
        }
    }

    public final int a() {
        int i8;
        synchronized (this.f5255f) {
            i8 = this.f5260k;
        }
        return i8;
    }

    public final Bundle b(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.f5255f) {
            bundle = new Bundle();
            if (!this.f5257h.F0()) {
                bundle.putString("session_id", this.f5256g);
            }
            bundle.putLong("basets", this.f5251b);
            bundle.putLong("currts", this.f5250a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f5252c);
            bundle.putInt("preqs_in_session", this.f5253d);
            bundle.putLong("time_in_session", this.f5254e);
            bundle.putInt("pclick", this.f5258i);
            bundle.putInt("pimp", this.f5259j);
            Context contextA = mb0.a(context);
            int identifier = contextA.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z7 = false;
            if (identifier == 0) {
                str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
            } else {
                try {
                    if (identifier == contextA.getPackageManager().getActivityInfo(new ComponentName(contextA.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z7 = true;
                    } else {
                        qg0.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    qg0.g("Fail to fetch AdActivity theme");
                    str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                    qg0.f(str2);
                }
                bundle.putBoolean("support_transparent_background", z7);
                bundle.putInt("consent_form_action_identifier", a());
            }
            qg0.f(str2);
            bundle.putBoolean("support_transparent_background", z7);
            bundle.putInt("consent_form_action_identifier", a());
        }
        return bundle;
    }

    public final void c() {
        synchronized (this.f5255f) {
            this.f5258i++;
        }
    }

    public final void d() {
        synchronized (this.f5255f) {
            this.f5259j++;
        }
    }

    public final void e() {
        i();
    }

    public final void f() {
        i();
    }

    public final void g(h2.r4 r4Var, long j8) {
        Bundle bundle;
        synchronized (this.f5255f) {
            long jP = this.f5257h.p();
            long jA = g2.t.b().a();
            if (this.f5251b == -1) {
                if (jA - jP > ((Long) h2.y.c().b(ns.S0)).longValue()) {
                    this.f5253d = -1;
                } else {
                    this.f5253d = this.f5257h.l();
                }
                this.f5251b = j8;
            }
            this.f5250a = j8;
            if (!((Boolean) h2.y.c().b(ns.f12169q3)).booleanValue() && (bundle = r4Var.f22254c) != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.f5252c++;
            int i8 = this.f5253d + 1;
            this.f5253d = i8;
            if (i8 == 0) {
                this.f5254e = 0L;
                this.f5257h.K(jA);
            } else {
                this.f5254e = jA - this.f5257h.m();
            }
        }
    }

    public final void h() {
        synchronized (this.f5255f) {
            this.f5260k++;
        }
    }
}
