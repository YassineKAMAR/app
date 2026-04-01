package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class n40 implements e00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jh0 f11672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ o40 f11673b;

    public n40(o40 o40Var, jh0 jh0Var) {
        this.f11673b = o40Var;
        this.f11672a = jh0Var;
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void a(String str) {
        try {
            if (str == null) {
                this.f11672a.e(new q30());
            } else {
                this.f11672a.e(new q30(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void b(JSONObject jSONObject) {
        try {
            this.f11672a.d(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e8) {
            this.f11672a.e(e8);
        }
    }
}
