package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public final class k31 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f9916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f9917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f9918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f9919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f9920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f9921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f9922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f9923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f9924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w84 f9925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w84 f9926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w84 f9927l;

    public k31(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7, w84 w84Var8, w84 w84Var9, w84 w84Var10, w84 w84Var11, w84 w84Var12) {
        this.f9916a = w84Var;
        this.f9917b = w84Var2;
        this.f9918c = w84Var3;
        this.f9919d = w84Var4;
        this.f9920e = w84Var5;
        this.f9921f = w84Var6;
        this.f9922g = w84Var7;
        this.f9923h = w84Var8;
        this.f9924i = w84Var9;
        this.f9925j = w84Var10;
        this.f9926k = w84Var11;
        this.f9927l = w84Var12;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j31 k() {
        bx2 bx2Var = (bx2) this.f9916a.k();
        wg0 wg0VarA = ((uo0) this.f9917b).a();
        ApplicationInfo applicationInfoK = ((su1) this.f9918c).k();
        String strK = ((yu1) this.f9919d).k();
        fs fsVar = ns.f12021a;
        return new j31(bx2Var, wg0VarA, applicationInfoK, strK, h2.y.a().a(), (PackageInfo) this.f9921f.k(), i84.a(this.f9922g), ((go0) this.f9923h).k(), (String) this.f9924i.k(), ((ti2) this.f9925j).k(), ((x31) this.f9926k).a(), (v91) this.f9927l.k());
    }
}
