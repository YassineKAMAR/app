package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class f40 implements e00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h30 f7617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jh0 f7618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ g40 f7619c;

    public f40(g40 g40Var, h30 h30Var, jh0 jh0Var) {
        this.f7619c = g40Var;
        this.f7617a = h30Var;
        this.f7618b = jh0Var;
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void a(String str) {
        try {
            if (str == null) {
                this.f7618b.e(new q30());
            } else {
                this.f7618b.e(new q30(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.f7617a.g();
            throw th;
        }
        this.f7617a.g();
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void b(JSONObject jSONObject) {
        try {
            try {
                this.f7618b.d(this.f7619c.f8193a.a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e8) {
                this.f7618b.e(e8);
            }
        } finally {
            this.f7617a.g();
        }
    }
}
