package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class kq0 implements om2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f10227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kq0 f10228b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f10229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f10230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f10231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f10232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f10233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f10234h;

    /* synthetic */ kq0(zp0 zp0Var, Context context, String str, jq0 jq0Var) {
        this.f10227a = zp0Var;
        j84 j84VarA = k84.a(context);
        this.f10229c = j84VarA;
        j84 j84VarA2 = k84.a(str);
        this.f10230d = j84VarA2;
        np2 np2Var = new np2(j84VarA, zp0Var.H0, zp0Var.I0);
        this.f10231e = np2Var;
        w84 w84VarB = i84.b(new pn2(zp0Var.H0));
        this.f10232f = w84VarB;
        w84 w84VarB2 = i84.b(new rn2(j84VarA, zp0Var.f18340p, zp0Var.V, np2Var, w84VarB, vs2.a(), zp0Var.f18326i));
        this.f10233g = w84VarB2;
        this.f10234h = i84.b(new xn2(zp0Var.V, j84VarA, j84VarA2, w84VarB2, w84VarB, zp0Var.f18326i, zp0Var.f18311a0));
    }

    @Override // com.google.android.gms.internal.ads.om2
    public final wn2 j() {
        return (wn2) this.f10234h.k();
    }
}
