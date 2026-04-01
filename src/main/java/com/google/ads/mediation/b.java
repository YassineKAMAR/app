package com.google.ads.mediation;

import l2.k;
import z1.n;

/* JADX INFO: loaded from: classes.dex */
final class b extends z1.d implements a2.e, h2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f4678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k f4679b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, k kVar) {
        this.f4678a = abstractAdViewAdapter;
        this.f4679b = kVar;
    }

    @Override // z1.d, h2.a
    public final void Z() {
        this.f4679b.g(this.f4678a);
    }

    @Override // z1.d
    public final void h() {
        this.f4679b.a(this.f4678a);
    }

    @Override // z1.d
    public final void j(n nVar) {
        this.f4679b.f(this.f4678a, nVar);
    }

    @Override // z1.d
    public final void l() {
        this.f4679b.i(this.f4678a);
    }

    @Override // z1.d
    public final void m() {
        this.f4679b.n(this.f4678a);
    }

    @Override // a2.e
    public final void w(String str, String str2) {
        this.f4679b.q(this.f4678a, str, str2);
    }
}
