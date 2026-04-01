package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class l30 implements nh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m30 f10442a;

    l30(m30 m30Var) {
        this.f10442a = m30Var;
    }

    @Override // com.google.android.gms.internal.ads.nh0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final h20 h20Var = (h20) obj;
        eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.k30
            @Override // java.lang.Runnable
            public final void run() {
                h20 h20Var2 = h20Var;
                h20Var2.m("/result", pz.f13213o);
                h20Var2.l();
            }
        });
    }
}
