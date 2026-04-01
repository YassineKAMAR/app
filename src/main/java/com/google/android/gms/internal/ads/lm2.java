package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lm2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f10778a;

    public lm2(Map map) {
        this.f10778a = map;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", h2.v.b().m(this.f10778a));
        } catch (JSONException e8) {
            j2.v1.k("Could not encode video decoder properties: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
