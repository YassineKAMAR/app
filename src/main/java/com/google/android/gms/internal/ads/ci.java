package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ci implements h43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i23 f6346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a33 f6347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pi f6348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bi f6349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kh f6350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final si f6351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ji f6352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ai f6353h;

    ci(i23 i23Var, a33 a33Var, pi piVar, bi biVar, kh khVar, si siVar, ji jiVar, ai aiVar) {
        this.f6346a = i23Var;
        this.f6347b = a33Var;
        this.f6348c = piVar;
        this.f6349d = biVar;
        this.f6350e = khVar;
        this.f6351f = siVar;
        this.f6352g = jiVar;
        this.f6353h = aiVar;
    }

    private final Map b() {
        HashMap map = new HashMap();
        i23 i23Var = this.f6346a;
        ze zeVarB = this.f6347b.b();
        map.put("v", i23Var.b());
        map.put("gms", Boolean.valueOf(this.f6346a.c()));
        map.put("int", zeVarB.L0());
        map.put("up", Boolean.valueOf(this.f6349d.a()));
        map.put("t", new Throwable());
        ji jiVar = this.f6352g;
        if (jiVar != null) {
            map.put("tcq", Long.valueOf(jiVar.c()));
            map.put("tpq", Long.valueOf(this.f6352g.g()));
            map.put("tcv", Long.valueOf(this.f6352g.d()));
            map.put("tpv", Long.valueOf(this.f6352g.h()));
            map.put("tchv", Long.valueOf(this.f6352g.b()));
            map.put("tphv", Long.valueOf(this.f6352g.f()));
            map.put("tcc", Long.valueOf(this.f6352g.a()));
            map.put("tpc", Long.valueOf(this.f6352g.e()));
        }
        return map;
    }

    final void a(View view) {
        this.f6348c.d(view);
    }

    @Override // com.google.android.gms.internal.ads.h43
    public final Map j() {
        pi piVar = this.f6348c;
        Map mapB = b();
        mapB.put("lts", Long.valueOf(piVar.a()));
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.h43
    public final Map k() {
        Map mapB = b();
        ze zeVarA = this.f6347b.a();
        mapB.put("gai", Boolean.valueOf(this.f6346a.d()));
        mapB.put("did", zeVarA.K0());
        mapB.put("dst", Integer.valueOf(zeVarA.y0() - 1));
        mapB.put("doo", Boolean.valueOf(zeVarA.v0()));
        kh khVar = this.f6350e;
        if (khVar != null) {
            mapB.put("nt", Long.valueOf(khVar.a()));
        }
        si siVar = this.f6351f;
        if (siVar != null) {
            mapB.put("vs", Long.valueOf(siVar.c()));
            mapB.put("vf", Long.valueOf(this.f6351f.b()));
        }
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.h43
    public final Map l() {
        ai aiVar = this.f6353h;
        Map mapB = b();
        if (aiVar != null) {
            mapB.put("vst", aiVar.a());
        }
        return mapB;
    }
}
