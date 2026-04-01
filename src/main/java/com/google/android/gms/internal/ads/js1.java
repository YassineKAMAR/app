package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class js1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f9780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f9781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final xn1 f9782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f9783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Executor f9784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f9785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final oq1 f9786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final wg0 f9787m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final jb1 f9789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ty2 f9790p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9775a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9776b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9777c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jh0 f9779e = new jh0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f9788n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f9791q = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9778d = g2.t.b().b();

    public js1(Executor executor, Context context, WeakReference weakReference, Executor executor2, xn1 xn1Var, ScheduledExecutorService scheduledExecutorService, oq1 oq1Var, wg0 wg0Var, jb1 jb1Var, ty2 ty2Var) {
        this.f9782h = xn1Var;
        this.f9780f = context;
        this.f9781g = weakReference;
        this.f9783i = executor2;
        this.f9785k = scheduledExecutorService;
        this.f9784j = executor;
        this.f9786l = oq1Var;
        this.f9787m = wg0Var;
        this.f9789o = jb1Var;
        this.f9790p = ty2Var;
        v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void j(final js1 js1Var, String str) {
        int i8 = 5;
        final ey2 ey2VarA = dy2.a(js1Var.f9780f, 5);
        ey2VarA.o();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final ey2 ey2VarA2 = dy2.a(js1Var.f9780f, i8);
                ey2VarA2.o();
                ey2VarA2.h(next);
                final Object obj = new Object();
                final jh0 jh0Var = new jh0();
                x3.d dVarO = zf3.o(jh0Var, ((Long) h2.y.c().b(ns.M1)).longValue(), TimeUnit.SECONDS, js1Var.f9785k);
                js1Var.f9786l.c(next);
                js1Var.f9789o.e(next);
                final long jB = g2.t.b().b();
                dVarO.c(new Runnable() { // from class: com.google.android.gms.internal.ads.as1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5455a.q(obj, jh0Var, next, jB, ey2VarA2);
                    }
                }, js1Var.f9783i);
                arrayList.add(dVarO);
                final is1 is1Var = new is1(js1Var, obj, next, jB, ey2VarA2, jh0Var);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i9 = 0;
                        while (i9 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new p10(strOptString, bundle));
                            i9++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                js1Var.v(next, false, "", 0);
                try {
                    try {
                        final qt2 qt2VarC = js1Var.f9782h.c(next, new JSONObject());
                        js1Var.f9784j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.es1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f7479a.n(next, is1Var, qt2VarC, arrayList2);
                            }
                        });
                    } catch (ys2 unused2) {
                        is1Var.b("Failed to create Adapter.");
                    }
                } catch (RemoteException e8) {
                    qg0.e("", e8);
                }
                i8 = 5;
            }
            zf3.a(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.bs1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f6019a.f(ey2VarA);
                    return null;
                }
            }, js1Var.f9783i);
        } catch (JSONException e9) {
            j2.v1.l("Malformed CLD response", e9);
            js1Var.f9789o.a("MalformedJson");
            js1Var.f9786l.a("MalformedJson");
            js1Var.f9779e.e(e9);
            g2.t.q().u(e9, "AdapterInitializer.updateAdapterStatus");
            ty2 ty2Var = js1Var.f9790p;
            ey2VarA.E0(e9);
            ey2VarA.C0(false);
            ty2Var.b(ey2VarA.u());
        }
    }

    private final synchronized x3.d u() {
        String strC = g2.t.q().h().o().c();
        if (!TextUtils.isEmpty(strC)) {
            return zf3.h(strC);
        }
        final jh0 jh0Var = new jh0();
        g2.t.q().h().d(new Runnable() { // from class: com.google.android.gms.internal.ads.cs1
            @Override // java.lang.Runnable
            public final void run() {
                this.f6463a.o(jh0Var);
            }
        });
        return jh0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str, boolean z7, String str2, int i8) {
        this.f9788n.put(str, new f10(str, z7, i8, str2));
    }

    final /* synthetic */ Object f(ey2 ey2Var) {
        this.f9779e.d(Boolean.TRUE);
        ey2Var.C0(true);
        this.f9790p.b(ey2Var.u());
        return null;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f9788n.keySet()) {
            f10 f10Var = (f10) this.f9788n.get(str);
            arrayList.add(new f10(str, f10Var.f7568b, f10Var.f7569c, f10Var.f7570d));
        }
        return arrayList;
    }

    public final void l() {
        this.f9791q = false;
    }

    final /* synthetic */ void m() {
        synchronized (this) {
            if (this.f9777c) {
                return;
            }
            v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (g2.t.b().b() - this.f9778d));
            this.f9786l.b("com.google.android.gms.ads.MobileAds", "timeout");
            this.f9789o.b("com.google.android.gms.ads.MobileAds", "timeout");
            this.f9779e.e(new Exception());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
    
        if (r2.equals("com.google.ads.mediation.admob.AdMobAdapter") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void n(java.lang.String r2, com.google.android.gms.internal.ads.j10 r3, com.google.android.gms.internal.ads.qt2 r4, java.util.List r5) {
        /*
            r1 = this;
            java.lang.String r0 = "com.google.ads.mediation.admob.AdMobAdapter"
            if (r2 == r0) goto L1d
            if (r2 == 0) goto Lc
            boolean r0 = r2.equals(r0)     // Catch: android.os.RemoteException -> L21 com.google.android.gms.internal.ads.ys2 -> L28
            if (r0 != 0) goto L1d
        Lc:
            java.lang.ref.WeakReference r0 = r1.f9781g     // Catch: android.os.RemoteException -> L21 com.google.android.gms.internal.ads.ys2 -> L28
            java.lang.Object r0 = r0.get()     // Catch: android.os.RemoteException -> L21 com.google.android.gms.internal.ads.ys2 -> L28
            android.content.Context r0 = (android.content.Context) r0     // Catch: android.os.RemoteException -> L21 com.google.android.gms.internal.ads.ys2 -> L28
            if (r0 == 0) goto L17
            goto L19
        L17:
            android.content.Context r0 = r1.f9780f     // Catch: android.os.RemoteException -> L21 com.google.android.gms.internal.ads.ys2 -> L28
        L19:
            r4.n(r0, r3, r5)     // Catch: android.os.RemoteException -> L21 com.google.android.gms.internal.ads.ys2 -> L28
            return
        L1d:
            r3.n()     // Catch: android.os.RemoteException -> L21 com.google.android.gms.internal.ads.ys2 -> L28
            return
        L21:
            r2 = move-exception
            com.google.android.gms.internal.ads.g93 r3 = new com.google.android.gms.internal.ads.g93
            r3.<init>(r2)
            throw r3
        L28:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L42
            r4.<init>()     // Catch: android.os.RemoteException -> L42
            java.lang.String r5 = "Failed to initialize adapter. "
            r4.append(r5)     // Catch: android.os.RemoteException -> L42
            r4.append(r2)     // Catch: android.os.RemoteException -> L42
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch: android.os.RemoteException -> L42
            java.lang.String r2 = r4.toString()     // Catch: android.os.RemoteException -> L42
            r3.b(r2)     // Catch: android.os.RemoteException -> L42
            return
        L42:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.qg0.e(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.js1.n(java.lang.String, com.google.android.gms.internal.ads.j10, com.google.android.gms.internal.ads.qt2, java.util.List):void");
    }

    final /* synthetic */ void o(final jh0 jh0Var) {
        this.f9783i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zr1
            @Override // java.lang.Runnable
            public final void run() {
                String strC = g2.t.q().h().o().c();
                boolean zIsEmpty = TextUtils.isEmpty(strC);
                jh0 jh0Var2 = jh0Var;
                if (zIsEmpty) {
                    jh0Var2.e(new Exception());
                } else {
                    jh0Var2.d(strC);
                }
            }
        });
    }

    final /* synthetic */ void p() {
        this.f9786l.e();
        this.f9789o.m();
        this.f9776b = true;
    }

    final /* synthetic */ void q(Object obj, jh0 jh0Var, String str, long j8, ey2 ey2Var) {
        synchronized (obj) {
            if (!jh0Var.isDone()) {
                v(str, false, "Timeout.", (int) (g2.t.b().b() - j8));
                this.f9786l.b(str, "timeout");
                this.f9789o.b(str, "timeout");
                ty2 ty2Var = this.f9790p;
                ey2Var.e("Timeout");
                ey2Var.C0(false);
                ty2Var.b(ey2Var.u());
                jh0Var.d(Boolean.FALSE);
            }
        }
    }

    public final void r() {
        if (!((Boolean) pu.f13128a.e()).booleanValue()) {
            if (this.f9787m.f16725c >= ((Integer) h2.y.c().b(ns.L1)).intValue() && this.f9791q) {
                if (this.f9775a) {
                    return;
                }
                synchronized (this) {
                    if (this.f9775a) {
                        return;
                    }
                    this.f9786l.f();
                    this.f9789o.n();
                    this.f9779e.c(new Runnable() { // from class: com.google.android.gms.internal.ads.fs1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8014a.p();
                        }
                    }, this.f9783i);
                    this.f9775a = true;
                    x3.d dVarU = u();
                    this.f9785k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.yr1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f17911a.m();
                        }
                    }, ((Long) h2.y.c().b(ns.N1)).longValue(), TimeUnit.SECONDS);
                    zf3.r(dVarU, new hs1(this), this.f9783i);
                    return;
                }
            }
        }
        if (this.f9775a) {
            return;
        }
        v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f9779e.d(Boolean.FALSE);
        this.f9775a = true;
        this.f9776b = true;
    }

    public final void s(final m10 m10Var) {
        this.f9779e.c(new Runnable() { // from class: com.google.android.gms.internal.ads.ds1
            @Override // java.lang.Runnable
            public final void run() {
                js1 js1Var = this.f6996a;
                try {
                    m10Var.v4(js1Var.g());
                } catch (RemoteException e8) {
                    qg0.e("", e8);
                }
            }
        }, this.f9784j);
    }

    public final boolean t() {
        return this.f9776b;
    }
}
