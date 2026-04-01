package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class sy1 implements u30 {
    sy1() {
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final /* bridge */ /* synthetic */ JSONObject b(Object obj) throws JSONException {
        ty1 ty1Var = (ty1) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) h2.y.c().b(ns.Y8)).booleanValue()) {
            jSONObject2.put("ad_request_url", ty1Var.f15385c.e());
            jSONObject2.put("ad_request_post_body", ty1Var.f15385c.d());
        }
        jSONObject2.put("base_url", ty1Var.f15385c.b());
        jSONObject2.put("signals", ty1Var.f15384b);
        jSONObject3.put("body", ty1Var.f15383a.f9422c);
        jSONObject3.put("headers", h2.v.b().m(ty1Var.f15383a.f9421b));
        jSONObject3.put(DiagnosticsTracker.RESPONSE_CODE_KEY, ty1Var.f15383a.f9420a);
        jSONObject3.put("latency", ty1Var.f15383a.f9423d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", ty1Var.f15385c.g());
        return jSONObject;
    }
}
