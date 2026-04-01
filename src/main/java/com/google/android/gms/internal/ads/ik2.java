package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ik2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f9256a;

    public ik2(JSONObject jSONObject) {
        this.f9256a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject jSONObjectF = j2.y0.f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f9256a;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectF.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            j2.v1.k("Failed putting app indexing json.");
        }
    }
}
