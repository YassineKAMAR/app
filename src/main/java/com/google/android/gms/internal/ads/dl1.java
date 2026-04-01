package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dl1 extends rx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg1 f6792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qg1 f6793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final eq1 f6794d;

    public dl1(String str, lg1 lg1Var, qg1 qg1Var, eq1 eq1Var) {
        this.f6791a = str;
        this.f6792b = lg1Var;
        this.f6793c = qg1Var;
        this.f6794d = eq1Var;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final List A() {
        return h0() ? this.f6793c.h() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String B() {
        return this.f6791a;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void B2(Bundle bundle) {
        this.f6792b.q(bundle);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void B5(Bundle bundle) {
        this.f6792b.l(bundle);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String C() {
        return this.f6793c.d();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void C4() {
        this.f6792b.s();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void D() {
        this.f6792b.a();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void D3(px pxVar) {
        this.f6792b.v(pxVar);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final List E() {
        return this.f6793c.g();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String G() {
        return this.f6793c.e();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void J() {
        this.f6792b.X();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void M4(h2.r1 r1Var) {
        this.f6792b.t(r1Var);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void R() {
        this.f6792b.m();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void R3(h2.u1 u1Var) {
        this.f6792b.h(u1Var);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final boolean X() {
        return this.f6792b.A();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final boolean h0() {
        return (this.f6793c.h().isEmpty() || this.f6793c.X() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final double m() {
        return this.f6793c.A();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final Bundle n() {
        return this.f6793c.Q();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final h2.p2 o() {
        return this.f6793c.W();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final h2.m2 q() {
        if (((Boolean) h2.y.c().b(ns.J6)).booleanValue()) {
            return this.f6792b.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final pv r() {
        return this.f6793c.Y();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final wv s() {
        return this.f6793c.a0();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final tv t() {
        return this.f6792b.M().a();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final boolean t4(Bundle bundle) {
        return this.f6792b.D(bundle);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final g3.a u() {
        return this.f6793c.i0();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String v() {
        return this.f6793c.k0();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String w() {
        return this.f6793c.l0();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final g3.a x() {
        return g3.b.k3(this.f6792b);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String y() {
        return this.f6793c.m0();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void y2(h2.f2 f2Var) {
        try {
            if (!f2Var.n()) {
                this.f6794d.e();
            }
        } catch (RemoteException e8) {
            qg0.c("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f6792b.u(f2Var);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String z() {
        return this.f6793c.b();
    }
}
