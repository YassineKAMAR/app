package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d71 f15366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bx1 f15367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bx2 f15368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts2 f15369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wg0 f15370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ty2 f15371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qy2 f15372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f15373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final lg3 f15374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x3.d f15375j;

    tx1(d71 d71Var, bx1 bx1Var, bx2 bx2Var, ts2 ts2Var, wg0 wg0Var, ty2 ty2Var, qy2 qy2Var, Context context, lg3 lg3Var) {
        this.f15366a = d71Var;
        this.f15367b = bx1Var;
        this.f15368c = bx2Var;
        this.f15369d = ts2Var;
        this.f15370e = wg0Var;
        this.f15371f = ty2Var;
        this.f15372g = qy2Var;
        this.f15373h = context;
        this.f15374i = lg3Var;
    }

    final /* synthetic */ fa0 a(ya0 ya0Var, hz1 hz1Var) {
        hz1Var.f9018c.put("Content-Type", hz1Var.f9020e);
        hz1Var.f9018c.put("User-Agent", g2.t.r().D(this.f15373h, ya0Var.f17709b.f16723a));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hz1Var.f9018c.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new fa0(hz1Var.f9016a, hz1Var.f9017b, bundle, hz1Var.f9019d, hz1Var.f9021f, ya0Var.f17711d, ya0Var.f17715h);
    }

    public final x3.d c(final ya0 ya0Var, final JSONObject jSONObject, final bb0 bb0Var) {
        this.f15366a.g0(ya0Var);
        sw2 sw2VarB = this.f15368c.b(vw2.PROXY, zf3.m(this.f15368c.b(vw2.PREPARE_HTTP_REQUEST, zf3.h(new lz1(jSONObject, bb0Var))).e(new mz1(ya0Var.f17714g, this.f15372g, dy2.a(this.f15373h, 9))).a(), new z73() { // from class: com.google.android.gms.internal.ads.px1
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return this.f13176a.a(ya0Var, (hz1) obj);
            }
        }, this.f15374i));
        final bx1 bx1Var = this.f15367b;
        fw2 fw2VarA = sw2VarB.f(new gf3() { // from class: com.google.android.gms.internal.ads.qx1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return bx1Var.c((fa0) obj);
            }
        }).a();
        this.f15375j = fw2VarA;
        x3.d dVarN = zf3.n(this.f15368c.b(vw2.PRE_PROCESS, fw2VarA).e(new dw2() { // from class: com.google.android.gms.internal.ads.ox1
            @Override // com.google.android.gms.internal.ads.dw2
            public final Object a(Object obj) {
                return new ty1(iz1.a(new InputStreamReader((InputStream) obj)), jSONObject, bb0Var);
            }
        }).f(g2.t.h().a(this.f15373h, this.f15370e, this.f15371f).a("google.afma.response.normalize", ty1.f15382d, y30.f17576c)).a(), new gf3() { // from class: com.google.android.gms.internal.ads.rx1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f14363a.d((InputStream) obj);
            }
        }, this.f15374i);
        zf3.r(dVarN, new sx1(this), this.f15374i);
        return dVarN;
    }

    final /* synthetic */ x3.d d(InputStream inputStream) {
        return zf3.h(new ks2(new hs2(this.f15369d), js2.a(new InputStreamReader(inputStream))));
    }
}
