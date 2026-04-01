package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yk2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f17800a;

    public yk2(JSONObject jSONObject) {
        this.f17800a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f17800a);
        } catch (JSONException unused) {
            j2.v1.k("Unable to get cache_state");
        }
    }
}
