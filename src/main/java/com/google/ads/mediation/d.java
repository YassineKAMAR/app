package com.google.ads.mediation;

import l2.p;
import z1.m;

/* JADX INFO: loaded from: classes.dex */
final class d extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f4682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p f4683b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, p pVar) {
        this.f4682a = abstractAdViewAdapter;
        this.f4683b = pVar;
    }

    @Override // z1.m
    public final void b() {
        this.f4683b.o(this.f4682a);
    }

    @Override // z1.m
    public final void e() {
        this.f4683b.s(this.f4682a);
    }
}
