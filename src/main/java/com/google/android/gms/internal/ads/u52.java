package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u52 implements o52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye1 f15490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f15491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij1 f15492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt2 f15493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final am1 f15494e;

    public u52(ye1 ye1Var, lg3 lg3Var, ij1 ij1Var, rt2 rt2Var, am1 am1Var) {
        this.f15490a = ye1Var;
        this.f15491b = lg3Var;
        this.f15492c = ij1Var;
        this.f15493d = rt2Var;
        this.f15494e = am1Var;
    }

    private final x3.d g(final ks2 ks2Var, final wr2 wr2Var, final JSONObject jSONObject) {
        ij1 ij1Var = this.f15492c;
        final x3.d dVarA = this.f15493d.a();
        final x3.d dVarA2 = ij1Var.a(ks2Var, wr2Var, jSONObject);
        return zf3.c(dVarA, dVarA2).a(new Callable() { // from class: com.google.android.gms.internal.ads.p52
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12746a.c(dVarA2, dVarA, ks2Var, wr2Var, jSONObject);
            }
        }, this.f15491b);
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(final ks2 ks2Var, final wr2 wr2Var) {
        return zf3.n(zf3.n(this.f15493d.a(), new gf3() { // from class: com.google.android.gms.internal.ads.r52
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f13943a.e(wr2Var, (ul1) obj);
            }
        }, this.f15491b), new gf3() { // from class: com.google.android.gms.internal.ads.s52
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f14523a.f(ks2Var, wr2Var, (JSONArray) obj);
            }
        }, this.f15491b);
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        cs2 cs2Var = wr2Var.f16905u;
        return (cs2Var == null || cs2Var.f6467c == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ lg1 c(x3.d dVar, x3.d dVar2, ks2 ks2Var, wr2 wr2Var, JSONObject jSONObject) {
        qg1 qg1Var = (qg1) dVar.get();
        ul1 ul1Var = (ul1) dVar2.get();
        rg1 rg1VarC = this.f15490a.c(new d01(ks2Var, wr2Var, null), new ch1(qg1Var), new of1(jSONObject, ul1Var));
        rg1VarC.j().b();
        rg1VarC.k().a(ul1Var);
        rg1VarC.i().a(qg1Var.f0());
        rg1VarC.l().a(this.f15494e);
        return rg1VarC.h();
    }

    final /* synthetic */ x3.d d(ul1 ul1Var, JSONObject jSONObject) throws q30 {
        this.f15493d.b(zf3.h(ul1Var));
        if (jSONObject.optBoolean("success")) {
            return zf3.h(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new q30("process json failed");
    }

    final /* synthetic */ x3.d e(wr2 wr2Var, final ul1 ul1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) h2.y.c().b(ns.o8)).booleanValue() && e3.m.k()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", wr2Var.f16905u.f6467c);
        jSONObject2.put("sdk_params", jSONObject);
        return zf3.n(ul1Var.d("google.afma.nativeAds.preProcessJson", jSONObject2), new gf3() { // from class: com.google.android.gms.internal.ads.q52
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f13297a.d(ul1Var, (JSONObject) obj);
            }
        }, this.f15491b);
    }

    final /* synthetic */ x3.d f(ks2 ks2Var, wr2 wr2Var, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zf3.g(new gu1(3));
        }
        int i8 = 0;
        if (ks2Var.f10322a.f8947a.f15309k <= 1) {
            return zf3.m(g(ks2Var, wr2Var, jSONArray.getJSONObject(0)), new z73() { // from class: com.google.android.gms.internal.ads.t52
                @Override // com.google.android.gms.internal.ads.z73
                public final Object apply(Object obj) {
                    return Collections.singletonList(zf3.h((lg1) obj));
                }
            }, this.f15491b);
        }
        int length = jSONArray.length();
        this.f15493d.c(Math.min(length, ks2Var.f10322a.f8947a.f15309k));
        ArrayList arrayList = new ArrayList(ks2Var.f10322a.f8947a.f15309k);
        while (i8 < ks2Var.f10322a.f8947a.f15309k) {
            arrayList.add(i8 < length ? g(ks2Var, wr2Var, jSONArray.getJSONObject(i8)) : zf3.g(new gu1(3)));
            i8++;
        }
        return zf3.h(arrayList);
    }
}
