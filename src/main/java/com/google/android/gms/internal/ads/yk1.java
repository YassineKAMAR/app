package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yk1 extends lw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg1 f17798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qg1 f17799c;

    public yk1(String str, lg1 lg1Var, qg1 qg1Var) {
        this.f17797a = str;
        this.f17798b = lg1Var;
        this.f17799c = qg1Var;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void J1(Bundle bundle) {
        this.f17798b.l(bundle);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void V(Bundle bundle) {
        this.f17798b.q(bundle);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final boolean i0(Bundle bundle) {
        return this.f17798b.D(bundle);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final Bundle k() {
        return this.f17799c.Q();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final h2.p2 l() {
        return this.f17799c.W();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final wv m() {
        return this.f17799c.b0();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final g3.a n() {
        return this.f17799c.i0();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String o() {
        return this.f17799c.k0();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final pv p() {
        return this.f17799c.Y();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final g3.a q() {
        return g3.b.k3(this.f17798b);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String r() {
        return this.f17799c.l0();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String s() {
        return this.f17799c.b();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String t() {
        return this.f17799c.m0();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String u() {
        return this.f17797a;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void v() {
        this.f17798b.a();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final List x() {
        return this.f17799c.g();
    }
}
