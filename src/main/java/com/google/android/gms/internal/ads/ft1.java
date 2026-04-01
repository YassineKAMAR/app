package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ft1 implements eu1, ps1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nt1 f8017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fu1 f8018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qs1 f8019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final at1 f8020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final os1 f8021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final au1 f8022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8024h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private JSONObject f8029m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f8034r;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f8025i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f8026j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f8027k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f8028l = "{}";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f8030n = Long.MAX_VALUE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private bt1 f8031o = bt1.NONE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private et1 f8035s = et1.UNKNOWN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f8036t = 0;

    ft1(nt1 nt1Var, fu1 fu1Var, qs1 qs1Var, Context context, wg0 wg0Var, at1 at1Var, au1 au1Var, String str) {
        this.f8017a = nt1Var;
        this.f8018b = fu1Var;
        this.f8019c = qs1Var;
        this.f8021e = new os1(context);
        this.f8023g = wg0Var.f16723a;
        this.f8024h = str;
        this.f8020d = at1Var;
        this.f8022f = au1Var;
        g2.t.u().g(this);
    }

    private final synchronized JSONObject s() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.f8025i.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (ts1 ts1Var : (List) entry.getValue()) {
                if (ts1Var.e()) {
                    jSONArray.put(ts1Var.b());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void t() {
        this.f8034r = true;
        this.f8020d.c();
        this.f8017a.c(this);
        this.f8018b.c(this);
        this.f8019c.c(this);
        this.f8022f.R5(this);
        z(g2.t.q().h().w());
    }

    private final void u() {
        g2.t.q().h().N(d());
    }

    private final synchronized void v(bt1 bt1Var, boolean z7) {
        if (this.f8031o == bt1Var) {
            return;
        }
        if (p()) {
            x();
        }
        this.f8031o = bt1Var;
        if (p()) {
            y();
        }
        if (z7) {
            u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void w(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f8032p     // Catch: java.lang.Throwable -> L3d
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.f8032p = r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.ads.fs r2 = com.google.android.gms.internal.ads.ns.U8     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.ls r0 = h2.y.c()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r0.b(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L27
            j2.z r2 = g2.t.u()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.l()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
        L27:
            r1.y()     // Catch: java.lang.Throwable -> L3d
            goto L34
        L2b:
            boolean r2 = r1.p()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L34
            r1.x()     // Catch: java.lang.Throwable -> L3d
        L34:
            if (r3 == 0) goto L3b
            r1.u()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
            return
        L3b:
            monitor-exit(r1)
            return
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ft1.w(boolean, boolean):void");
    }

    private final synchronized void x() {
        bt1 bt1Var = bt1.NONE;
        int iOrdinal = this.f8031o.ordinal();
        if (iOrdinal == 1) {
            this.f8018b.a();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f8019c.a();
        }
    }

    private final synchronized void y() {
        bt1 bt1Var = bt1.NONE;
        int iOrdinal = this.f8031o.ordinal();
        if (iOrdinal == 1) {
            this.f8018b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f8019c.b();
        }
    }

    private final synchronized void z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            w(jSONObject.optBoolean("isTestMode", false), false);
            v((bt1) Enum.valueOf(bt1.class, jSONObject.optString("gesture", "NONE")), false);
            this.f8028l = jSONObject.optString("networkExtras", "{}");
            this.f8030n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final bt1 a() {
        return this.f8031o;
    }

    public final synchronized x3.d b(String str) {
        jh0 jh0Var;
        jh0Var = new jh0();
        if (this.f8026j.containsKey(str)) {
            jh0Var.d((ts1) this.f8026j.get(str));
        } else {
            if (!this.f8027k.containsKey(str)) {
                this.f8027k.put(str, new ArrayList());
            }
            ((List) this.f8027k.get(str)).add(jh0Var);
        }
        return jh0Var;
    }

    public final synchronized String c() {
        if (((Boolean) h2.y.c().b(ns.F8)).booleanValue() && p()) {
            if (this.f8030n < g2.t.b().a() / 1000) {
                this.f8028l = "{}";
                this.f8030n = Long.MAX_VALUE;
                return "";
            }
            if (this.f8028l.equals("{}")) {
                return "";
            }
            return this.f8028l;
        }
        return "";
    }

    public final synchronized String d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f8032p);
            jSONObject.put("gesture", this.f8031o);
            if (this.f8030n > g2.t.b().a() / 1000) {
                jSONObject.put("networkExtras", this.f8028l);
                jSONObject.put("networkExtrasExpirationSecs", this.f8030n);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject e() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            if (!TextUtils.isEmpty(this.f8024h)) {
                jSONObject.put(com.amazon.a.a.o.b.I, "afma-sdk-a-v" + this.f8024h);
            }
            jSONObject.put("internalSdkVersion", this.f8023g);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.f8020d.a());
            if (((Boolean) h2.y.c().b(ns.f9)).booleanValue()) {
                String strM = g2.t.q().m();
                if (!TextUtils.isEmpty(strM)) {
                    jSONObject.put("plugin", strM);
                }
            }
            if (this.f8030n < g2.t.b().a() / 1000) {
                this.f8028l = "{}";
            }
            jSONObject.put("networkExtras", this.f8028l);
            jSONObject.put("adSlots", s());
            jSONObject.put("appInfo", this.f8021e.a());
            String strC = g2.t.q().h().o().c();
            if (!TextUtils.isEmpty(strC)) {
                jSONObject.put("cld", new JSONObject(strC));
            }
            if (((Boolean) h2.y.c().b(ns.V8)).booleanValue() && (jSONObject2 = this.f8029m) != null) {
                qg0.b("Server data: " + jSONObject2.toString());
                jSONObject.put("serverData", this.f8029m);
            }
            if (((Boolean) h2.y.c().b(ns.U8)).booleanValue()) {
                jSONObject.put("openAction", this.f8035s);
                jSONObject.put("gesture", this.f8031o);
            }
        } catch (JSONException e8) {
            g2.t.q().t(e8, "Inspector.toJson");
            qg0.h("Ad inspector encountered an error", e8);
        }
        return jSONObject;
    }

    public final synchronized void f(String str, ts1 ts1Var) {
        if (((Boolean) h2.y.c().b(ns.F8)).booleanValue() && p()) {
            if (this.f8033q >= ((Integer) h2.y.c().b(ns.H8)).intValue()) {
                qg0.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f8025i.containsKey(str)) {
                this.f8025i.put(str, new ArrayList());
            }
            this.f8033q++;
            ((List) this.f8025i.get(str)).add(ts1Var);
            if (((Boolean) h2.y.c().b(ns.d9)).booleanValue()) {
                String strA = ts1Var.a();
                this.f8026j.put(strA, ts1Var);
                if (this.f8027k.containsKey(strA)) {
                    List list = (List) this.f8027k.get(strA);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((jh0) it.next()).d(ts1Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void g() {
        if (((Boolean) h2.y.c().b(ns.F8)).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.U8)).booleanValue() && g2.t.q().h().P()) {
                t();
                return;
            }
            String strW = g2.t.q().h().w();
            if (TextUtils.isEmpty(strW)) {
                return;
            }
            try {
                if (new JSONObject(strW).optBoolean("isTestMode", false)) {
                    t();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void h(h2.z1 z1Var, et1 et1Var) {
        if (!p()) {
            try {
                z1Var.Z0(vt2.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                qg0.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) h2.y.c().b(ns.F8)).booleanValue()) {
            this.f8035s = et1Var;
            this.f8017a.e(z1Var, new k00(this), new c00(this.f8022f));
            return;
        } else {
            try {
                z1Var.Z0(vt2.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                qg0.g("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void i(String str, long j8) {
        this.f8028l = str;
        this.f8030n = j8;
        u();
    }

    public final synchronized void j(long j8) {
        this.f8036t += j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f8034r
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.t()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.f8032p
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.y()
            return
        L15:
            boolean r2 = r1.p()
            if (r2 != 0) goto L1e
            r1.x()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ft1.k(boolean):void");
    }

    public final void l(bt1 bt1Var) {
        v(bt1Var, true);
    }

    public final synchronized void m(JSONObject jSONObject) {
        this.f8029m = jSONObject;
    }

    public final void n(boolean z7) {
        if (!this.f8034r && z7) {
            t();
        }
        w(z7, true);
    }

    public final boolean o() {
        return this.f8029m != null;
    }

    public final synchronized boolean p() {
        if (((Boolean) h2.y.c().b(ns.U8)).booleanValue()) {
            return this.f8032p || g2.t.u().l();
        }
        return this.f8032p;
    }

    public final synchronized boolean q() {
        return this.f8032p;
    }

    public final boolean r() {
        return this.f8036t < ((Long) h2.y.c().b(ns.a9)).longValue();
    }
}
