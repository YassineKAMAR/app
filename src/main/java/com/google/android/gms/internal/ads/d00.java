package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class d00 implements e00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jh0 f6526a;

    d00(f00 f00Var, jh0 jh0Var) {
        this.f6526a = jh0Var;
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void a(String str) {
        this.f6526a.e(new q30(str));
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void b(JSONObject jSONObject) {
        this.f6526a.d(jSONObject);
    }
}
