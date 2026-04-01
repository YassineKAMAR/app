package com.google.ads.mediation;

import c2.f;
import c2.h;
import l2.r;
import z1.n;

/* JADX INFO: loaded from: classes.dex */
final class e extends z1.d implements h.a, f.b, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f4684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f4685b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, r rVar) {
        this.f4684a = abstractAdViewAdapter;
        this.f4685b = rVar;
    }

    @Override // z1.d, h2.a
    public final void Z() {
        this.f4685b.j(this.f4684a);
    }

    @Override // c2.f.a
    public final void a(f fVar, String str) {
        this.f4685b.m(this.f4684a, fVar, str);
    }

    @Override // c2.h.a
    public final void b(h hVar) {
        this.f4685b.d(this.f4684a, new a(hVar));
    }

    @Override // c2.f.b
    public final void e(f fVar) {
        this.f4685b.k(this.f4684a, fVar);
    }

    @Override // z1.d
    public final void h() {
        this.f4685b.h(this.f4684a);
    }

    @Override // z1.d
    public final void j(n nVar) {
        this.f4685b.p(this.f4684a, nVar);
    }

    @Override // z1.d
    public final void k() {
        this.f4685b.r(this.f4684a);
    }

    @Override // z1.d
    public final void l() {
    }

    @Override // z1.d
    public final void m() {
        this.f4685b.b(this.f4684a);
    }
}
