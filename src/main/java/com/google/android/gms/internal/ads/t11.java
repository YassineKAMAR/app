package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class t11 implements x91, v51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.e f14909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v11 f14910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts2 f14911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f14912d;

    t11(e3.e eVar, v11 v11Var, ts2 ts2Var, String str) {
        this.f14909a = eVar;
        this.f14910b = v11Var;
        this.f14911c = ts2Var;
        this.f14912d = str;
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final void B() {
        ts2 ts2Var = this.f14911c;
        this.f14910b.d(ts2Var.f15304f, this.f14912d, this.f14909a.b());
    }

    @Override // com.google.android.gms.internal.ads.x91
    public final void j() {
        this.f14910b.e(this.f14912d, this.f14909a.b());
    }
}
