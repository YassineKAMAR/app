package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hu0 implements xt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ft1 f8977a;

    hu0(ft1 ft1Var) {
        this.f8977a = ft1Var;
    }

    @Override // com.google.android.gms.internal.ads.xt0
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) h2.y.c().b(ns.V8)).booleanValue()) {
                this.f8977a.m(jSONObject);
            }
        }
    }
}
