package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class re1 implements rz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f14072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f14073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f14074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bh1 f14075e;

    re1(Map map, Map map2, Map map3, w84 w84Var, bh1 bh1Var) {
        this.f14071a = map;
        this.f14072b = map2;
        this.f14073c = map3;
        this.f14074d = w84Var;
        this.f14075e = bh1Var;
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final x22 f(int i8, String str) {
        x22 x22VarF;
        x22 x22Var = (x22) this.f14071a.get(str);
        if (x22Var != null) {
            return x22Var;
        }
        if (i8 == 1) {
            if (this.f14075e.e() == null || (x22VarF = ((rz0) this.f14074d.k()).f(i8, str)) == null) {
                return null;
            }
            return vz0.a(x22VarF);
        }
        if (i8 != 4) {
            return null;
        }
        o52 o52Var = (o52) this.f14073c.get(str);
        if (o52Var != null) {
            return new y22(o52Var, new z73() { // from class: com.google.android.gms.internal.ads.tz0
                @Override // com.google.android.gms.internal.ads.z73
                public final Object apply(Object obj) {
                    return new vz0((List) obj);
                }
            });
        }
        x22 x22Var2 = (x22) this.f14072b.get(str);
        if (x22Var2 == null) {
            return null;
        }
        return vz0.a(x22Var2);
    }
}
