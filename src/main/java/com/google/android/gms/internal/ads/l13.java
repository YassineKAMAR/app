package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f10422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v13 f10423b;

    public l13(v13 v13Var) {
        this.f10423b = v13Var;
    }

    public final JSONObject a() {
        return this.f10422a;
    }

    public final void b() {
        this.f10423b.b(new w13(this));
    }

    public final void c(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f10423b.b(new x13(this, hashSet, jSONObject, j8));
    }

    public final void d(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f10423b.b(new y13(this, hashSet, jSONObject, j8));
    }

    public final void e(JSONObject jSONObject) {
        this.f10422a = jSONObject;
    }
}
