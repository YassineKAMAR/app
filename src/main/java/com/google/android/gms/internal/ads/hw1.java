package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hw1 implements jw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f9006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d71 f9007c;

    public hw1(Map map, lg3 lg3Var, d71 d71Var) {
        this.f9005a = map;
        this.f9006b = lg3Var;
        this.f9007c = d71Var;
    }

    @Override // com.google.android.gms.internal.ads.jw1
    public final x3.d a(final ya0 ya0Var) {
        this.f9007c.g0(ya0Var);
        x3.d dVarG = zf3.g(new gu1(3));
        for (String str : ((String) h2.y.c().b(ns.X7)).split(com.amazon.a.a.o.b.f.f3942a)) {
            final w84 w84Var = (w84) this.f9005a.get(str.trim());
            if (w84Var != null) {
                dVarG = zf3.f(dVarG, gu1.class, new gf3() { // from class: com.google.android.gms.internal.ads.fw1
                    @Override // com.google.android.gms.internal.ads.gf3
                    public final x3.d a(Object obj) {
                        return ((jw1) w84Var.k()).a(ya0Var);
                    }
                }, this.f9006b);
            }
        }
        zf3.r(dVarG, new gw1(this), eh0.f7327f);
        return dVarG;
    }
}
