package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ws2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f16936a;

    public ws2(JSONObject jSONObject) {
        this.f16936a = jSONObject;
    }

    public final String a() {
        if (b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int b() {
        int iOptInt = this.f16936a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
