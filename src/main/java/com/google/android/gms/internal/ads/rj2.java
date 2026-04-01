package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rj2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14156a;

    public rj2(String str) {
        this.f14156a = str;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f14156a);
        } catch (JSONException e8) {
            j2.v1.l("Failed putting Ad ID.", e8);
        }
    }
}
