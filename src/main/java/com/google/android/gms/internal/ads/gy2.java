package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class gy2 implements ey2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8548a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f8562o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f8549b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8550c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8551d = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8563p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8564q = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8552e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f8553f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f8554g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f8555h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8556i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8557j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f8558k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f8559l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8560m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8561n = false;

    gy2(Context context, int i8) {
        this.f8548a = context;
        this.f8562o = i8;
    }

    public final synchronized gy2 A(String str) {
        if (((Boolean) h2.y.c().b(ns.A8)).booleanValue()) {
            this.f8559l = str;
        }
        return this;
    }

    public final synchronized gy2 B(String str) {
        this.f8555h = str;
        return this;
    }

    public final synchronized gy2 C(String str) {
        this.f8556i = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final /* bridge */ /* synthetic */ ey2 C0(boolean z7) {
        D(z7);
        return this;
    }

    public final synchronized gy2 D(boolean z7) {
        this.f8551d = z7;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final /* bridge */ /* synthetic */ ey2 D0(js2 js2Var) {
        z(js2Var);
        return this;
    }

    public final synchronized gy2 E(Throwable th) {
        if (((Boolean) h2.y.c().b(ns.A8)).booleanValue()) {
            this.f8558k = o90.f(th);
            this.f8557j = (String) z83.c(w73.c('\n')).d(o90.e(th)).iterator().next();
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final /* bridge */ /* synthetic */ ey2 E0(Throwable th) {
        E(th);
        return this;
    }

    public final synchronized gy2 F() {
        Configuration configuration;
        this.f8552e = g2.t.s().l(this.f8548a);
        Resources resources = this.f8548a.getResources();
        int i8 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i8 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f8564q = i8;
        this.f8549b = g2.t.b().b();
        this.f8561n = true;
        return this;
    }

    public final synchronized gy2 G() {
        this.f8550c = g2.t.b().b();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final /* bridge */ /* synthetic */ ey2 a(int i8) {
        l(i8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final /* bridge */ /* synthetic */ ey2 b(String str) {
        C(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final /* bridge */ /* synthetic */ ey2 e(String str) {
        A(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final /* bridge */ /* synthetic */ ey2 h(String str) {
        B(str);
        return this;
    }

    public final synchronized gy2 l(int i8) {
        this.f8563p = i8;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final /* bridge */ /* synthetic */ ey2 o() {
        F();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final /* bridge */ /* synthetic */ ey2 r() {
        G();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final boolean s() {
        return !TextUtils.isEmpty(this.f8555h);
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final synchronized boolean t() {
        return this.f8561n;
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final synchronized iy2 u() {
        hy2 hy2Var = null;
        if (this.f8560m) {
            return null;
        }
        this.f8560m = true;
        if (!this.f8561n) {
            F();
        }
        if (this.f8550c < 0) {
            G();
        }
        return new iy2(this, hy2Var);
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final /* bridge */ /* synthetic */ ey2 w(h2.z2 z2Var) {
        y(z2Var);
        return this;
    }

    public final synchronized gy2 y(h2.z2 z2Var) {
        IBinder iBinder = z2Var.f22387e;
        if (iBinder == null) {
            return this;
        }
        z31 z31Var = (z31) iBinder;
        String strS = z31Var.s();
        if (!TextUtils.isEmpty(strS)) {
            this.f8553f = strS;
        }
        String strR = z31Var.r();
        if (!TextUtils.isEmpty(strR)) {
            this.f8554g = strR;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r2.f8554g = r0.f16872d0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.gy2 z(com.google.android.gms.internal.ads.js2 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.as2 r0 = r3.f9793b     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.f5462b     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.as2 r0 = r3.f9793b     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.f5462b     // Catch: java.lang.Throwable -> L31
            r2.f8553f = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.f9792a     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.wr2 r0 = (com.google.android.gms.internal.ads.wr2) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.f16872d0     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.f16872d0     // Catch: java.lang.Throwable -> L31
            r2.f8554g = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gy2.z(com.google.android.gms.internal.ads.js2):com.google.android.gms.internal.ads.gy2");
    }
}
