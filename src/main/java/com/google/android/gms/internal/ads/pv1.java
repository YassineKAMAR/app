package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bo0 f13153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f13154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wg0 f13155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts2 f13156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f13157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f13158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qy2 f13159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ht2 f13160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final zp1 f13161i;

    public pv1(bo0 bo0Var, Context context, wg0 wg0Var, ts2 ts2Var, Executor executor, String str, qy2 qy2Var, zp1 zp1Var) {
        this.f13153a = bo0Var;
        this.f13154b = context;
        this.f13155c = wg0Var;
        this.f13156d = ts2Var;
        this.f13157e = executor;
        this.f13158f = str;
        this.f13159g = qy2Var;
        this.f13160h = bo0Var.A();
        this.f13161i = zp1Var;
    }

    private final x3.d c(final String str, final String str2) {
        ey2 ey2VarA = dy2.a(this.f13154b, 11);
        ey2VarA.o();
        c40 c40VarA = g2.t.h().a(this.f13154b, this.f13155c, this.f13153a.D());
        v30 v30Var = y30.f17575b;
        final r30 r30VarA = c40VarA.a("google.afma.response.normalize", v30Var, v30Var);
        x3.d dVarN = zf3.n(zf3.n(zf3.n(zf3.h(""), new gf3() { // from class: com.google.android.gms.internal.ads.mv1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zf3.h(jSONObject);
                } catch (JSONException e8) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e8.getCause())));
                }
            }
        }, this.f13157e), new gf3() { // from class: com.google.android.gms.internal.ads.nv1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return r30VarA.b((JSONObject) obj);
            }
        }, this.f13157e), new gf3() { // from class: com.google.android.gms.internal.ads.ov1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f12649a.b((JSONObject) obj);
            }
        }, this.f13157e);
        py2.a(dVarN, this.f13159g, ey2VarA);
        return dVarN;
    }

    private final String d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f13158f));
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            qg0.g("Failed to update the ad types for rendering. ".concat(e8.toString()));
            return str;
        }
    }

    private static final String e(String str) {
        try {
            return new JSONObject(str).optString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final x3.d a() {
        String strB = this.f13156d.f15302d.f22275x;
        if (!TextUtils.isEmpty(strB)) {
            if (((Boolean) h2.y.c().b(ns.T6)).booleanValue()) {
                String strE = e(strB);
                fs fsVar = ns.f12074f7;
                if (((Boolean) h2.y.c().b(fsVar)).booleanValue() && strE.isEmpty()) {
                    int iLastIndexOf = strB.lastIndexOf("&request_id=");
                    strE = iLastIndexOf != -1 ? strB.substring(iLastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(strE)) {
                    return zf3.g(new y62(15, "Invalid ad string."));
                }
                String strB2 = this.f13153a.s().b(strE, this.f13161i);
                if (((Boolean) h2.y.c().b(fsVar)).booleanValue()) {
                    zp1 zp1Var = this.f13161i;
                    if (!TextUtils.isEmpty(strB2)) {
                        Boolean bool = new JSONObject(strB2).optString("is_gbid").equals(com.amazon.a.a.o.b.ac) ? Boolean.TRUE : Boolean.FALSE;
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strB.lastIndexOf("&");
                            String string = null;
                            String strSubstring = iLastIndexOf2 != -1 ? strB.substring(0, iLastIndexOf2) : null;
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                    byte[] bytes = strE.getBytes("UTF-8");
                                    try {
                                        string = new JSONObject(strB2).getString("arek");
                                    } catch (JSONException e8) {
                                        j2.v1.k("Failed to get key from QueryJSONMap".concat(e8.toString()));
                                        g2.t.q().u(e8, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    strB = ht2.b(bArrDecode, bytes, string, zp1Var);
                                } catch (UnsupportedEncodingException e9) {
                                    j2.v1.k("Failed to decode the adResponse. ".concat(e9.toString()));
                                    g2.t.q().u(e9, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strB2)) {
                    return c(strB, d(strB2));
                }
            }
        }
        h2.y0 y0Var = this.f13156d.f15302d.f22270s;
        if (y0Var != null) {
            if (((Boolean) h2.y.c().b(ns.R6)).booleanValue()) {
                String str = y0Var.f22374a;
                String str2 = y0Var.f22375b;
                String strE2 = e(str);
                String strE3 = e(str2);
                if (TextUtils.isEmpty(strE3) || !strE2.equals(strE3)) {
                    this.f13161i.a().put("ridmm", com.amazon.a.a.o.b.ac);
                } else {
                    this.f13153a.s().f(strE2);
                    this.f13161i.a().put("rid", strE2);
                }
            }
            return c(y0Var.f22374a, d(y0Var.f22375b));
        }
        return zf3.g(new y62(14, "Mismatch request IDs."));
    }

    final /* synthetic */ x3.d b(JSONObject jSONObject) {
        return zf3.h(new ks2(new hs2(this.f13156d), js2.a(new StringReader(jSONObject.toString()))));
    }
}
