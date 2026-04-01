package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f5693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f5699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f5700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f5701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f5702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final JSONObject f5703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f5704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f5705m;

    public bb0(JSONObject jSONObject) {
        this.f5701i = jSONObject.optString("url");
        this.f5694b = jSONObject.optString("base_uri");
        this.f5695c = jSONObject.optString("post_parameters");
        this.f5697e = j(jSONObject.optString("drt_include"));
        this.f5698f = j(jSONObject.optString("cookies_include", com.amazon.a.a.o.b.ac));
        this.f5699g = jSONObject.optString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID);
        this.f5696d = jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f5693a = strOptString == null ? null : Arrays.asList(strOptString.split(com.amazon.a.a.o.b.f.f3942a));
        this.f5702j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f5700h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f5703k = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f5704l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f5705m = jSONObject.optString("pool_key");
    }

    private static boolean j(String str) {
        return str != null && (str.equals("1") || str.equals(com.amazon.a.a.o.b.ac));
    }

    public final int a() {
        return this.f5702j;
    }

    public final String b() {
        return this.f5694b;
    }

    public final String c() {
        return this.f5705m;
    }

    public final String d() {
        return this.f5695c;
    }

    public final String e() {
        return this.f5701i;
    }

    public final List f() {
        return this.f5693a;
    }

    public final JSONObject g() {
        return this.f5703k;
    }

    public final boolean h() {
        return this.f5698f;
    }

    public final boolean i() {
        return this.f5697e;
    }
}
