package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class qy2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ty2 f13801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f13803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private js2 f13804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h2.z2 f13805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Future f13806g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f13800a = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f13807h = 2;

    qy2(ty2 ty2Var) {
        this.f13801b = ty2Var;
    }

    public final synchronized qy2 a(ey2 ey2Var) {
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            List list = this.f13800a;
            ey2Var.r();
            list.add(ey2Var);
            Future future = this.f13806g;
            if (future != null) {
                future.cancel(false);
            }
            this.f13806g = eh0.f7325d.schedule(this, ((Integer) h2.y.c().b(ns.y8)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized qy2 b(String str) {
        if (((Boolean) bu.f6041c.e()).booleanValue() && py2.e(str)) {
            this.f13802c = str;
        }
        return this;
    }

    public final synchronized qy2 c(h2.z2 z2Var) {
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            this.f13805f = z2Var;
        }
        return this;
    }

    public final synchronized qy2 d(ArrayList arrayList) {
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            if (arrayList.contains("banner") || arrayList.contains(z1.b.BANNER.name())) {
                this.f13807h = 3;
            } else if (arrayList.contains("interstitial") || arrayList.contains(z1.b.INTERSTITIAL.name())) {
                this.f13807h = 4;
            } else if (arrayList.contains("native") || arrayList.contains(z1.b.NATIVE.name())) {
                this.f13807h = 8;
            } else if (arrayList.contains("rewarded") || arrayList.contains(z1.b.REWARDED.name())) {
                this.f13807h = 5;
            } else if (arrayList.contains("app_open_ad")) {
                this.f13807h = 7;
            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(z1.b.REWARDED_INTERSTITIAL.name())) {
                this.f13807h = 6;
            }
        }
        return this;
    }

    public final synchronized qy2 e(String str) {
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            this.f13803d = str;
        }
        return this;
    }

    public final synchronized qy2 f(js2 js2Var) {
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            this.f13804e = js2Var;
        }
        return this;
    }

    public final synchronized void g() {
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            Future future = this.f13806g;
            if (future != null) {
                future.cancel(false);
            }
            for (ey2 ey2Var : this.f13800a) {
                int i8 = this.f13807h;
                if (i8 != 2) {
                    ey2Var.a(i8);
                }
                if (!TextUtils.isEmpty(this.f13802c)) {
                    ey2Var.b(this.f13802c);
                }
                if (!TextUtils.isEmpty(this.f13803d) && !ey2Var.s()) {
                    ey2Var.h(this.f13803d);
                }
                js2 js2Var = this.f13804e;
                if (js2Var != null) {
                    ey2Var.D0(js2Var);
                } else {
                    h2.z2 z2Var = this.f13805f;
                    if (z2Var != null) {
                        ey2Var.w(z2Var);
                    }
                }
                this.f13801b.b(ey2Var.u());
            }
            this.f13800a.clear();
        }
    }

    public final synchronized qy2 h(int i8) {
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            this.f13807h = i8;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        g();
    }
}
