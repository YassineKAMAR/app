package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tk2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15135a;

    public tk2(String str) {
        this.f15135a = str;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject jSONObjectF = j2.y0.f((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.f15135a)) {
                return;
            }
            jSONObjectF.put("attok", this.f15135a);
        } catch (JSONException e8) {
            j2.v1.l("Failed putting attestation token.", e8);
        }
    }
}
