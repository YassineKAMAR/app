package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class z92 implements kb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa2 f18122a;

    z92(aa2 aa2Var) {
        this.f18122a = aa2Var;
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        jx0 jx0Var = (jx0) obj;
        synchronized (this.f18122a) {
            aa2 aa2Var = this.f18122a;
            if (aa2Var.f5169i != null) {
                aa2Var.f5169i.a();
            }
            this.f18122a.f5169i = jx0Var;
            this.f18122a.f5169i.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final void j() {
        synchronized (this.f18122a) {
            this.f18122a.f5169i = null;
        }
    }
}
