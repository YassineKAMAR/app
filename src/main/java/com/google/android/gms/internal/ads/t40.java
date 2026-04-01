package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class t40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f14939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f14940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f14941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f14942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f14943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f14944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f14945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f14946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f14947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f14948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f14949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f14950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f14951r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f14952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f14953t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f14954u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f14955v;

    public t40(JSONObject jSONObject) throws JSONException {
        List listA;
        this.f14935b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            arrayList.add(jSONArray.getString(i8));
        }
        this.f14936c = Collections.unmodifiableList(arrayList);
        this.f14937d = jSONObject.optString("allocation_id", null);
        g2.t.i();
        this.f14939f = v40.a(jSONObject, "clickurl");
        g2.t.i();
        this.f14940g = v40.a(jSONObject, "imp_urls");
        g2.t.i();
        this.f14941h = v40.a(jSONObject, "downloaded_imp_urls");
        g2.t.i();
        this.f14943j = v40.a(jSONObject, "fill_urls");
        g2.t.i();
        this.f14945l = v40.a(jSONObject, "video_start_urls");
        g2.t.i();
        this.f14947n = v40.a(jSONObject, "video_complete_urls");
        g2.t.i();
        this.f14946m = v40.a(jSONObject, "video_reward_urls");
        this.f14948o = jSONObject.optString("transaction_id");
        this.f14949p = jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            g2.t.i();
            listA = v40.a(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listA = null;
        }
        this.f14942i = listA;
        this.f14934a = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f14944k = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.f14938e = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.f14950q = jSONObject.optString("html_template", null);
        this.f14951r = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.f14952s = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        g2.t.i();
        this.f14953t = v40.a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f14954u = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.f14955v = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
