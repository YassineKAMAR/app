package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f4495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4496c;

    d(String str) {
        this.f4494a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4495b = jSONObject;
        this.f4496c = jSONObject.optString("countryCode");
    }

    public String a() {
        return this.f4496c;
    }
}
