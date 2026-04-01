package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class xr0 implements qr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f17436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xr0 f17437b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f17438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f17439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f17440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f17441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f17442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f17443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f17444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w84 f17445j;

    /* synthetic */ xr0(zp0 zp0Var, Context context, String str, wr0 wr0Var) {
        this.f17436a = zp0Var;
        j84 j84VarA = k84.a(context);
        this.f17438c = j84VarA;
        op2 op2Var = new op2(j84VarA, zp0Var.H0, zp0Var.I0);
        this.f17439d = op2Var;
        w84 w84VarB = i84.b(new zq2(zp0Var.H0));
        this.f17440e = w84VarB;
        w84 w84VarB2 = i84.b(qs2.a());
        this.f17441f = w84VarB2;
        w84 w84VarB3 = i84.b(new kr2(j84VarA, zp0Var.f18340p, zp0Var.V, op2Var, w84VarB, vs2.a(), w84VarB2));
        this.f17442g = w84VarB3;
        this.f17443h = i84.b(new ur2(w84VarB3, w84VarB, w84VarB2));
        j84 j84VarB = k84.b(str);
        this.f17444i = j84VarB;
        this.f17445j = i84.b(new or2(j84VarB, w84VarB3, j84VarA, w84VarB, w84VarB2, zp0Var.f18326i, zp0Var.W, zp0Var.f18311a0));
    }

    @Override // com.google.android.gms.internal.ads.qr2
    public final nr2 j() {
        return (nr2) this.f17445j.k();
    }

    @Override // com.google.android.gms.internal.ads.qr2
    public final tr2 k() {
        return (tr2) this.f17443h.k();
    }
}
