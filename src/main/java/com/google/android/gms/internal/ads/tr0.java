package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class tr0 implements aq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f15242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tr0 f15243b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f15244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f15245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f15246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f15247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f15248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f15249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f15250i;

    /* synthetic */ tr0(zp0 zp0Var, Context context, String str, h2.w4 w4Var, sr0 sr0Var) {
        this.f15242a = zp0Var;
        j84 j84VarA = k84.a(context);
        this.f15244c = j84VarA;
        j84 j84VarA2 = k84.a(w4Var);
        this.f15245d = j84VarA2;
        j84 j84VarA3 = k84.a(str);
        this.f15246e = j84VarA3;
        w84 w84VarB = i84.b(new wa2(zp0Var.f18338o));
        this.f15247f = w84VarB;
        w84 w84VarB2 = i84.b(new zq2(zp0Var.H0));
        this.f15248g = w84VarB2;
        w84 w84VarB3 = i84.b(new yp2(j84VarA, zp0Var.f18340p, zp0Var.V, w84VarB, w84VarB2, vs2.a()));
        this.f15249h = w84VarB3;
        this.f15250i = i84.b(new eb2(j84VarA, j84VarA2, j84VarA3, w84VarB3, w84VarB, w84VarB2, zp0Var.f18326i, zp0Var.W, zp0Var.f18311a0));
    }

    @Override // com.google.android.gms.internal.ads.aq2
    public final db2 j() {
        return (db2) this.f15250i.k();
    }
}
