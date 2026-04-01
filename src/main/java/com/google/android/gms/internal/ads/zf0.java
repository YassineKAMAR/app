package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18182a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2.a2 f18183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg0 f18184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f18186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private wg0 f18187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f18188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private vs f18189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f18190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicInteger f18191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final yf0 f18192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f18193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private x3.d f18194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f18195n;

    public zf0() {
        j2.a2 a2Var = new j2.a2();
        this.f18183b = a2Var;
        this.f18184c = new dg0(h2.v.d(), a2Var);
        this.f18185d = false;
        this.f18189h = null;
        this.f18190i = null;
        this.f18191j = new AtomicInteger(0);
        this.f18192k = new yf0(null);
        this.f18193l = new Object();
        this.f18195n = new AtomicBoolean();
    }

    public final int a() {
        return this.f18191j.get();
    }

    public final Context c() {
        return this.f18186e;
    }

    public final Resources d() {
        if (this.f18187f.f16726d) {
            return this.f18186e.getResources();
        }
        try {
            if (((Boolean) h2.y.c().b(ns.W9)).booleanValue()) {
                return ug0.a(this.f18186e).getResources();
            }
            ug0.a(this.f18186e).getResources();
            return null;
        } catch (tg0 e8) {
            qg0.h("Cannot load resource from dynamite apk or local jar", e8);
            return null;
        }
    }

    public final vs f() {
        vs vsVar;
        synchronized (this.f18182a) {
            vsVar = this.f18189h;
        }
        return vsVar;
    }

    public final dg0 g() {
        return this.f18184c;
    }

    public final j2.x1 h() {
        j2.a2 a2Var;
        synchronized (this.f18182a) {
            a2Var = this.f18183b;
        }
        return a2Var;
    }

    public final x3.d j() {
        if (this.f18186e != null) {
            if (!((Boolean) h2.y.c().b(ns.f12235y2)).booleanValue()) {
                synchronized (this.f18193l) {
                    x3.d dVar = this.f18194m;
                    if (dVar != null) {
                        return dVar;
                    }
                    x3.d dVarZ = eh0.f7322a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.sf0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f14648a.n();
                        }
                    });
                    this.f18194m = dVarZ;
                    return dVarZ;
                }
            }
        }
        return zf3.h(new ArrayList());
    }

    public final Boolean k() {
        Boolean bool;
        synchronized (this.f18182a) {
            bool = this.f18190i;
        }
        return bool;
    }

    public final String m() {
        return this.f18188g;
    }

    final /* synthetic */ ArrayList n() {
        Context contextA = mb0.a(this.f18186e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfoF = f3.e.a(contextA).f(contextA.getApplicationInfo().packageName, 4096);
            if (packageInfoF.requestedPermissions != null && packageInfoF.requestedPermissionsFlags != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr = packageInfoF.requestedPermissions;
                    if (i8 >= strArr.length) {
                        break;
                    }
                    if ((packageInfoF.requestedPermissionsFlags[i8] & 2) != 0) {
                        arrayList.add(strArr[i8]);
                    }
                    i8++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void p() {
        this.f18192k.a();
    }

    public final void q() {
        this.f18191j.decrementAndGet();
    }

    public final void r() {
        this.f18191j.incrementAndGet();
    }

    @TargetApi(23)
    public final void s(Context context, wg0 wg0Var) {
        vs vsVar;
        synchronized (this.f18182a) {
            if (!this.f18185d) {
                this.f18186e = context.getApplicationContext();
                this.f18187f = wg0Var;
                g2.t.d().c(this.f18184c);
                this.f18183b.F(this.f18186e);
                o90.d(this.f18186e, this.f18187f);
                g2.t.g();
                if (((Boolean) cu.f6483c.e()).booleanValue()) {
                    vsVar = new vs();
                } else {
                    j2.v1.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    vsVar = null;
                }
                this.f18189h = vsVar;
                if (vsVar != null) {
                    hh0.a(new tf0(this).b(), "AppState.registerCsiReporter");
                }
                if (e3.m.i()) {
                    if (((Boolean) h2.y.c().b(ns.h8)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new uf0(this));
                    }
                }
                this.f18185d = true;
                j();
            }
        }
        g2.t.r().D(context, wg0Var.f16723a);
    }

    public final void t(Throwable th, String str) {
        o90.d(this.f18186e, this.f18187f).b(th, str, ((Double) su.f14832g.e()).floatValue());
    }

    public final void u(Throwable th, String str) {
        o90.d(this.f18186e, this.f18187f).a(th, str);
    }

    public final void v(Boolean bool) {
        synchronized (this.f18182a) {
            this.f18190i = bool;
        }
    }

    public final void w(String str) {
        this.f18188g = str;
    }

    public final boolean x(Context context) {
        if (e3.m.i()) {
            if (((Boolean) h2.y.c().b(ns.h8)).booleanValue()) {
                return this.f18195n.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
