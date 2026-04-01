package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fl2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7806b;

    public fl2(String str, String str2) {
        this.f7805a = str;
        this.f7806b = str2;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject jSONObjectF = j2.y0.f((JSONObject) obj, "pii");
            jSONObjectF.put("doritos", this.f7805a);
            jSONObjectF.put("doritos_v2", this.f7806b);
        } catch (JSONException unused) {
            j2.v1.k("Failed putting doritos string.");
        }
    }
}
