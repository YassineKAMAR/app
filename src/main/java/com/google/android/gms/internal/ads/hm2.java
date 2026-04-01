package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hm2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8830a;

    public hm2(String str) {
        this.f8830a = str;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.f8830a)) {
                return;
            }
            j2.y0.f(jSONObject, "pii").put("adsid", this.f8830a);
        } catch (JSONException e8) {
            qg0.h("Failed putting trustless token.", e8);
        }
    }
}
