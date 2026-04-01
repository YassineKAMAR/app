package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class jr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f9757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f9760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f9762f;

    /* synthetic */ jr1(String str, ir1 ir1Var) {
        this.f9758b = str;
    }

    static /* bridge */ /* synthetic */ String a(jr1 jr1Var) {
        String str = (String) h2.y.c().b(ns.r9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", jr1Var.f9757a);
            jSONObject.put("eventCategory", jr1Var.f9758b);
            jSONObject.putOpt("event", jr1Var.f9759c);
            jSONObject.putOpt("errorCode", jr1Var.f9760d);
            jSONObject.putOpt("rewardType", jr1Var.f9761e);
            jSONObject.putOpt("rewardAmount", jr1Var.f9762f);
        } catch (JSONException unused) {
            qg0.g("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
