package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zs1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f18471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f18472g;

    public zs1(String str, String str2, String str3, int i8, String str4, int i9, boolean z7) {
        this.f18466a = str;
        this.f18467b = str2;
        this.f18468c = str3;
        this.f18469d = i8;
        this.f18470e = str4;
        this.f18471f = i9;
        this.f18472g = z7;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f18466a);
        jSONObject.put("version", this.f18468c);
        if (((Boolean) h2.y.c().b(ns.b9)).booleanValue()) {
            jSONObject.put(com.amazon.a.a.o.b.I, this.f18467b);
        }
        jSONObject.put("status", this.f18469d);
        jSONObject.put(com.amazon.a.a.o.b.f3893c, this.f18470e);
        jSONObject.put("initializationLatencyMillis", this.f18471f);
        if (((Boolean) h2.y.c().b(ns.c9)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f18472g);
        }
        return jSONObject;
    }
}
