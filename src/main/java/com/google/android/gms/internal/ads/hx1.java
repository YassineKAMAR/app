package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f9009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f9010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final by1 f9011c;

    hx1(lg3 lg3Var, lg3 lg3Var2, by1 by1Var) {
        this.f9009a = lg3Var;
        this.f9010b = lg3Var2;
        this.f9011c = by1Var;
    }

    final /* synthetic */ x3.d a(ba0 ba0Var) {
        return this.f9011c.c(ba0Var, ((Long) h2.y.c().b(ns.Aa)).longValue());
    }

    public final x3.d b(final ba0 ba0Var) {
        x3.d dVarF;
        String str = ba0Var.f5669b;
        g2.t.r();
        if (j2.k2.b(str)) {
            dVarF = zf3.g(new kw1(1, "Ads signal service force local"));
        } else {
            dVarF = zf3.f(zf3.k(new ef3() { // from class: com.google.android.gms.internal.ads.dx1
                @Override // com.google.android.gms.internal.ads.ef3
                public final x3.d j() {
                    return this.f7045a.a(ba0Var);
                }
            }, this.f9009a), ExecutionException.class, new gf3() { // from class: com.google.android.gms.internal.ads.ex1
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return zf3.g(cause);
                }
            }, this.f9010b);
        }
        return zf3.n(zf3.f(qf3.C(dVarF), kw1.class, new gf3() { // from class: com.google.android.gms.internal.ads.fx1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return zf3.h(null);
            }
        }, this.f9010b), new gf3() { // from class: com.google.android.gms.internal.ads.gx1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream != null) {
                    try {
                        g2.t.r();
                        jSONObject = new JSONObject(j2.k2.m(new InputStreamReader(inputStream)));
                    } catch (IOException | JSONException e8) {
                        g2.t.q().u(e8, "AdsServiceSignalTask.startAdsServiceSignalTask");
                    }
                }
                return zf3.h(jSONObject);
            }
        }, this.f9010b);
    }
}
