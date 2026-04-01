package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qw0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f13789a;

    public qw0(w84 w84Var) {
        this.f13789a = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        try {
            return new JSONObject(((e01) this.f13789a).a().B);
        } catch (JSONException unused) {
            return null;
        }
    }
}
