package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class uq0 implements go2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2.w4 f15800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zp0 f15802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final uq0 f15803e = this;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f15804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f15805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f15806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f15807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w84 f15808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w84 f15809k;

    /* synthetic */ uq0(zp0 zp0Var, Context context, String str, h2.w4 w4Var, tq0 tq0Var) {
        this.f15802d = zp0Var;
        this.f15799a = context;
        this.f15800b = w4Var;
        this.f15801c = str;
        j84 j84VarA = k84.a(context);
        this.f15804f = j84VarA;
        j84 j84VarA2 = k84.a(w4Var);
        this.f15805g = j84VarA2;
        w84 w84VarB = i84.b(new wa2(zp0Var.f18338o));
        this.f15806h = w84VarB;
        w84 w84VarB2 = i84.b(bb2.a());
        this.f15807i = w84VarB2;
        w84 w84VarB3 = i84.b(k91.a());
        this.f15808j = w84VarB3;
        this.f15809k = i84.b(new eo2(j84VarA, zp0Var.f18340p, j84VarA2, zp0Var.V, w84VarB, w84VarB2, vs2.a(), w84VarB3));
    }

    @Override // com.google.android.gms.internal.ads.go2
    public final aa2 j() {
        do2 do2Var = (do2) this.f15809k.k();
        va2 va2Var = (va2) this.f15806h.k();
        wg0 wg0VarD = this.f15802d.f18312b.d();
        r84.b(wg0VarD);
        return new aa2(this.f15799a, this.f15800b, this.f15801c, do2Var, va2Var, wg0VarD, (eq1) this.f15802d.f18311a0.k());
    }
}
