package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pl2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f12935a;

    public pl2(Bundle bundle) {
        this.f12935a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f12935a != null) {
            try {
                j2.y0.f(j2.y0.f(jSONObject, "device"), "play_store").put("parental_controls", h2.v.b().l(this.f12935a));
            } catch (JSONException unused) {
                j2.v1.k("Failed putting parental controls bundle.");
            }
        }
    }
}
