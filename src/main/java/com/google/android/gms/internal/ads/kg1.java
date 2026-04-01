package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class kg1 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f10068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ lg1 f10069b;

    kg1(lg1 lg1Var, View view) {
        this.f10069b = lg1Var;
        this.f10068a = view;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        g2.t.q().u(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f10069b.J(this.f10068a, (qz2) obj);
    }
}
