package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class bl2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f5871a;

    bl2(Context context) {
        this.f5871a = ib0.c(context);
    }

    final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f5871a);
        } catch (JSONException unused) {
            j2.v1.k("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return zf3.h(new ni2() { // from class: com.google.android.gms.internal.ads.al2
            @Override // com.google.android.gms.internal.ads.ni2
            public final void a(Object obj) {
                this.f5326a.a((JSONObject) obj);
            }
        });
    }
}
