package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class mx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f11567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hx1 f11568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bx2 f11569c;

    mx1(lg3 lg3Var, hx1 hx1Var, bx2 bx2Var) {
        this.f11567a = lg3Var;
        this.f11568b = hx1Var;
        this.f11569c = bx2Var;
    }

    public final x3.d a(final ya0 ya0Var) {
        sw2 sw2VarB = this.f11569c.b(vw2.GMS_SIGNALS, zf3.m(zf3.h(null), new z73() { // from class: com.google.android.gms.internal.ads.jx1
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                ya0 ya0Var2 = ya0Var;
                return new ba0(ya0Var2.f17710c, ya0Var2.f17711d, ya0Var2.f17713f, b93.c(ya0Var2.f17708a.getString("ms")), -1, ya0Var2.f17715h, ya0Var2.f17712e, ya0Var2.f17718k, ya0Var2.f17719l);
            }
        }, this.f11567a));
        final hx1 hx1Var = this.f11568b;
        return zf3.m(sw2VarB.f(new gf3() { // from class: com.google.android.gms.internal.ads.kx1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return hx1Var.b((ba0) obj);
            }
        }).a(), new z73() { // from class: com.google.android.gms.internal.ads.lx1
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = ya0Var.f17708a;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectL = h2.v.b().l(bundle);
                    try {
                        h2.v.b().o(jSONObject, jSONObjectL);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectL;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.f11567a);
    }
}
