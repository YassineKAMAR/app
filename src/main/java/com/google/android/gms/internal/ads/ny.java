package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ny implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hc1 f12285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gv0 f12286b;

    public /* synthetic */ ny(hc1 hc1Var, gv0 gv0Var) {
        this.f12285a = hc1Var;
        this.f12286b = gv0Var;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        pz.c(map, this.f12285a);
        String str = (String) map.get("u");
        if (str == null) {
            qg0.g("URL missing from click GMSG.");
            return;
        }
        final gv0 gv0Var = this.f12286b;
        qf3 qf3VarC = qf3.C(pz.a(fm0Var, str));
        gf3 gf3Var = new gf3() { // from class: com.google.android.gms.internal.ads.py
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj2) {
                gv0 gv0Var2;
                String str2 = (String) obj2;
                qz qzVar = pz.f13199a;
                return (!((Boolean) h2.y.c().b(ns.u9)).booleanValue() || (gv0Var2 = gv0Var) == null) ? zf3.h(str2) : gv0Var2.c(str2, h2.v.e());
            }
        };
        lg3 lg3Var = eh0.f7322a;
        zf3.r(zf3.n(qf3VarC, gf3Var, lg3Var), new dz(fm0Var), lg3Var);
    }
}
