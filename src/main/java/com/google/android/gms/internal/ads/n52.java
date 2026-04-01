package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class n52 implements z22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xn1 f11691a;

    public n52(xn1 xn1Var) {
        this.f11691a = xn1Var;
    }

    @Override // com.google.android.gms.internal.ads.z22
    public final a32 a(String str, JSONObject jSONObject) {
        return new a32(this.f11691a.c(str, jSONObject), new v42(), str);
    }
}
