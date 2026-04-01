package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class x80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17118b;

    public x80(boolean z7, String str) {
        this.f17117a = z7;
        this.f17118b = str;
    }

    public static x80 a(JSONObject jSONObject) {
        return new x80(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
