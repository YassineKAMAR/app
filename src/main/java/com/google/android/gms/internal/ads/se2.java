package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class se2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f14645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f14646b;

    public se2(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f14645a = jSONObject;
        this.f14646b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = this.f14645a;
        Bundle bundle = (Bundle) obj;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f14646b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
