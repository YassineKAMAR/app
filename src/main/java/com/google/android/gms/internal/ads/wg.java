package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class wg implements k33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g23 f16722a;

    wg(g23 g23Var) {
        this.f16722a = g23Var;
    }

    @Override // com.google.android.gms.internal.ads.k33
    public final void a(int i8, long j8, String str) {
        this.f16722a.e(i8, System.currentTimeMillis() - j8, str);
    }

    @Override // com.google.android.gms.internal.ads.k33
    public final void c(int i8, long j8) {
        this.f16722a.d(i8, System.currentTimeMillis() - j8);
    }
}
