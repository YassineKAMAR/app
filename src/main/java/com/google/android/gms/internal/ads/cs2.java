package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f6467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f6468d;

    cs2(JsonReader jsonReader) {
        JSONObject jSONObjectH = j2.y0.h(jsonReader);
        this.f6468d = jSONObjectH;
        this.f6465a = jSONObjectH.optString("ad_html", null);
        this.f6466b = jSONObjectH.optString("ad_base_url", null);
        this.f6467c = jSONObjectH.optJSONObject("ad_json");
    }
}
