package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f15475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f15476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f15477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f15478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15480h;

    public u40(JSONObject jSONObject) throws JSONException {
        if (qg0.j(2)) {
            j2.v1.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i8 = -1;
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                t40 t40Var = new t40(jSONArray.getJSONObject(i9));
                "banner".equalsIgnoreCase(t40Var.f14955v);
                arrayList.add(t40Var);
                if (i8 < 0) {
                    Iterator it = t40Var.f14936c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i8 = i9;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f15473a = Collections.unmodifiableList(arrayList);
        this.f15479g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject == null) {
            this.f15474b = null;
            this.f15475c = null;
            this.f15476d = null;
            this.f15477e = null;
            this.f15478f = null;
            this.f15480h = null;
            return;
        }
        jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        g2.t.i();
        this.f15474b = v40.a(jSONObjectOptJSONObject, "click_urls");
        g2.t.i();
        this.f15475c = v40.a(jSONObjectOptJSONObject, "imp_urls");
        g2.t.i();
        this.f15476d = v40.a(jSONObjectOptJSONObject, "downloaded_imp_urls");
        g2.t.i();
        this.f15477e = v40.a(jSONObjectOptJSONObject, "nofill_urls");
        g2.t.i();
        this.f15478f = v40.a(jSONObjectOptJSONObject, "remote_ping_urls");
        jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        jSONObjectOptJSONObject.optLong("refresh", -1L);
        bc0 bc0VarG = bc0.g(jSONObjectOptJSONObject.optJSONArray("rewards"));
        this.f15480h = bc0VarG != null ? bc0VarG.f5708a : null;
        jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
