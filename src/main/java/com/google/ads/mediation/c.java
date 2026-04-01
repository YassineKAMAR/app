package com.google.ads.mediation;

import l2.p;
import z1.n;

/* JADX INFO: loaded from: classes.dex */
final class c extends k2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f4680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p f4681b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, p pVar) {
        this.f4680a = abstractAdViewAdapter;
        this.f4681b = pVar;
    }

    @Override // z1.e
    public final void b(n nVar) {
        this.f4681b.e(this.f4680a, nVar);
    }

    @Override // z1.e
    public final /* bridge */ /* synthetic */ void c(k2.a aVar) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f4680a;
        k2.a aVar2 = aVar;
        abstractAdViewAdapter.mInterstitialAd = aVar2;
        aVar2.c(new d(abstractAdViewAdapter, this.f4681b));
        this.f4681b.l(this.f4680a);
    }
}
