package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ug1 extends vg1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f15649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f15653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f15654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f15655h;

    public ug1(wr2 wr2Var, JSONObject jSONObject) {
        super(wr2Var);
        this.f15649b = j2.y0.g(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f15650c = j2.y0.k(false, jSONObject, "allow_pub_owned_ad_view");
        this.f15651d = j2.y0.k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f15652e = j2.y0.k(false, jSONObject, "enable_omid");
        this.f15654g = j2.y0.b("", jSONObject, "watermark_overlay_png_base64");
        this.f15653f = jSONObject.optJSONObject("overlay") != null;
        this.f15655h = ((Boolean) h2.y.c().b(ns.W4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.vg1
    public final ws2 a() {
        JSONObject jSONObject = this.f15655h;
        return jSONObject != null ? new ws2(jSONObject) : this.f16259a.X;
    }

    @Override // com.google.android.gms.internal.ads.vg1
    public final String b() {
        return this.f15654g;
    }

    @Override // com.google.android.gms.internal.ads.vg1
    public final JSONObject c() {
        JSONObject jSONObject = this.f15649b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f16259a.B);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vg1
    public final boolean d() {
        return this.f15652e;
    }

    @Override // com.google.android.gms.internal.ads.vg1
    public final boolean e() {
        return this.f15650c;
    }

    @Override // com.google.android.gms.internal.ads.vg1
    public final boolean f() {
        return this.f15651d;
    }

    @Override // com.google.android.gms.internal.ads.vg1
    public final boolean g() {
        return this.f15653f;
    }
}
