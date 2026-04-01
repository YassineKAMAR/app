package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ts1 implements j41, f71, a61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ft1 f15285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15287c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private z31 f15290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h2.z2 f15291g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JSONObject f15295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f15296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f15297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f15298n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f15292h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f15293i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f15294j = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15288d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private rs1 f15289e = rs1.AD_REQUESTED;

    ts1(ft1 ft1Var, ts2 ts2Var, String str) {
        this.f15285a = ft1Var;
        this.f15287c = str;
        this.f15286b = ts2Var.f15304f;
    }

    private static JSONObject f(h2.z2 z2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", z2Var.f22385c);
        jSONObject.put("errorCode", z2Var.f22383a);
        jSONObject.put("errorDescription", z2Var.f22384b);
        h2.z2 z2Var2 = z2Var.f22386d;
        jSONObject.put("underlyingError", z2Var2 == null ? null : f(z2Var2));
        return jSONObject;
    }

    private final JSONObject g(z31 z31Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", z31Var.q());
        jSONObject.put("responseSecsSinceEpoch", z31Var.l());
        jSONObject.put("responseId", z31Var.r());
        if (((Boolean) h2.y.c().b(ns.W8)).booleanValue()) {
            String strP = z31Var.p();
            if (!TextUtils.isEmpty(strP)) {
                qg0.b("Bidding data: ".concat(String.valueOf(strP)));
                jSONObject.put("biddingData", new JSONObject(strP));
            }
        }
        if (!TextUtils.isEmpty(this.f15292h)) {
            jSONObject.put("adRequestUrl", this.f15292h);
        }
        if (!TextUtils.isEmpty(this.f15293i)) {
            jSONObject.put("postBody", this.f15293i);
        }
        if (!TextUtils.isEmpty(this.f15294j)) {
            jSONObject.put("adResponseBody", this.f15294j);
        }
        Object obj = this.f15295k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        if (((Boolean) h2.y.c().b(ns.Z8)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f15298n);
        }
        JSONArray jSONArray = new JSONArray();
        for (h2.a5 a5Var : z31Var.t()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", a5Var.f22156a);
            jSONObject2.put("latencyMillis", a5Var.f22157b);
            if (((Boolean) h2.y.c().b(ns.X8)).booleanValue()) {
                jSONObject2.put("credentials", h2.v.b().l(a5Var.f22159d));
            }
            h2.z2 z2Var = a5Var.f22158c;
            jSONObject2.put("error", z2Var == null ? null : f(z2Var));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final void A(h2.z2 z2Var) {
        if (this.f15285a.p()) {
            this.f15289e = rs1.AD_LOAD_FAILED;
            this.f15291g = z2Var;
            if (((Boolean) h2.y.c().b(ns.d9)).booleanValue()) {
                this.f15285a.f(this.f15286b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void U(ks2 ks2Var) {
        if (this.f15285a.p()) {
            if (!ks2Var.f10323b.f9792a.isEmpty()) {
                this.f15288d = ((wr2) ks2Var.f10323b.f9792a.get(0)).f16867b;
            }
            if (!TextUtils.isEmpty(ks2Var.f10323b.f9793b.f5471k)) {
                this.f15292h = ks2Var.f10323b.f9793b.f5471k;
            }
            if (!TextUtils.isEmpty(ks2Var.f10323b.f9793b.f5472l)) {
                this.f15293i = ks2Var.f10323b.f9793b.f5472l;
            }
            if (((Boolean) h2.y.c().b(ns.Z8)).booleanValue()) {
                if (!this.f15285a.r()) {
                    this.f15298n = true;
                    return;
                }
                if (!TextUtils.isEmpty(ks2Var.f10323b.f9793b.f5473m)) {
                    this.f15294j = ks2Var.f10323b.f9793b.f5473m;
                }
                if (ks2Var.f10323b.f9793b.f5474n.length() > 0) {
                    this.f15295k = ks2Var.f10323b.f9793b.f5474n;
                }
                ft1 ft1Var = this.f15285a;
                JSONObject jSONObject = this.f15295k;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f15294j)) {
                    length += this.f15294j.length();
                }
                ft1Var.j(length);
            }
        }
    }

    public final String a() {
        return this.f15287c;
    }

    public final JSONObject b() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f15289e);
        jSONObject.put("format", wr2.a(this.f15288d));
        if (((Boolean) h2.y.c().b(ns.d9)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f15296l);
            if (this.f15296l) {
                jSONObject.put("shown", this.f15297m);
            }
        }
        z31 z31Var = this.f15290f;
        JSONObject jSONObjectG = null;
        if (z31Var != null) {
            jSONObjectG = g(z31Var);
        } else {
            h2.z2 z2Var = this.f15291g;
            if (z2Var != null && (iBinder = z2Var.f22387e) != null) {
                z31 z31Var2 = (z31) iBinder;
                jSONObjectG = g(z31Var2);
                if (z31Var2.t().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(f(this.f15291g));
                    jSONObjectG.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObjectG);
        return jSONObject;
    }

    public final void c() {
        this.f15296l = true;
    }

    public final void d() {
        this.f15297m = true;
    }

    public final boolean e() {
        return this.f15289e != rs1.AD_REQUESTED;
    }

    @Override // com.google.android.gms.internal.ads.a61
    public final void e0(nz0 nz0Var) {
        if (this.f15285a.p()) {
            this.f15290f = nz0Var.c();
            this.f15289e = rs1.AD_LOADED;
            if (((Boolean) h2.y.c().b(ns.d9)).booleanValue()) {
                this.f15285a.f(this.f15286b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void g0(ya0 ya0Var) {
        if (((Boolean) h2.y.c().b(ns.d9)).booleanValue() || !this.f15285a.p()) {
            return;
        }
        this.f15285a.f(this.f15286b, this);
    }
}
