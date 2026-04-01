package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class nk2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f11908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f11909b;

    public nk2(String str, int i8) {
        this.f11908a = str;
        this.f11909b = i8;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.f11908a) || this.f11909b == -1) {
            return;
        }
        try {
            JSONObject jSONObjectF = j2.y0.f(jSONObject, "pii");
            jSONObjectF.put("pvid", this.f11908a);
            jSONObjectF.put("pvid_s", this.f11909b);
        } catch (JSONException e8) {
            j2.v1.l("Failed putting gms core app set ID info.", e8);
        }
    }
}
