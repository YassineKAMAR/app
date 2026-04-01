package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class j42 extends l60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a32 f9481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k42 f9482b;

    /* synthetic */ j42(k42 k42Var, a32 a32Var, i42 i42Var) {
        this.f9482b = k42Var;
        this.f9481a = a32Var;
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final void D0(g3.a aVar) {
        this.f9482b.f9943c = (View) g3.b.H0(aVar);
        ((v42) this.f9481a.f5002c).w();
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final void a(h2.z2 z2Var) {
        ((v42) this.f9481a.f5002c).O2(z2Var);
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final void b(String str) {
        ((v42) this.f9481a.f5002c).h1(0, str);
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final void d4(j50 j50Var) {
        this.f9482b.f9944d = j50Var;
        ((v42) this.f9481a.f5002c).w();
    }
}
