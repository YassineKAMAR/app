package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class vn2 implements kb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ wn2 f16381a;

    vn2(wn2 wn2Var) {
        this.f16381a = wn2Var;
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dx0 dx0Var = (dx0) obj;
        synchronized (this.f16381a) {
            dx0 dx0Var2 = this.f16381a.f16836k;
            if (dx0Var2 != null) {
                dx0Var2.a();
            }
            wn2 wn2Var = this.f16381a;
            wn2Var.f16836k = dx0Var;
            dx0Var.i(wn2Var);
            wn2 wn2Var2 = this.f16381a;
            wn2Var2.f16831f.j(new ex0(dx0Var, wn2Var2, wn2Var2.f16831f, wn2Var2.f16833h));
            dx0Var.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final void j() {
        synchronized (this.f16381a) {
            this.f16381a.f16836k = null;
        }
    }
}
