package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class fv0 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jz2 f8077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f8078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ gv0 f8079c;

    fv0(gv0 gv0Var, jz2 jz2Var, String str) {
        this.f8079c = gv0Var;
        this.f8077a = jz2Var;
        this.f8078b = str;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(final Throwable th) {
        lg3 lg3Var = this.f8079c.f8519e;
        final jz2 jz2Var = this.f8077a;
        final String str = this.f8078b;
        lg3Var.d(new Runnable() { // from class: com.google.android.gms.internal.ads.dv0
            @Override // java.lang.Runnable
            public final void run() {
                fv0 fv0Var = this.f7021a;
                gv0 gv0Var = fv0Var.f8079c;
                gv0Var.f8522h = o90.c(gv0Var.f8515a);
                fv0Var.f8079c.f8522h.a(th, "AttributionReporting.registerSourceAndPingClickUrl");
                jz2Var.c(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        gv0 gv0Var = this.f8079c;
        final jz2 jz2Var = this.f8077a;
        final String str = (String) obj;
        gv0Var.f8519e.d(new Runnable() { // from class: com.google.android.gms.internal.ads.ev0
            @Override // java.lang.Runnable
            public final void run() {
                jz2Var.c(str, null);
            }
        });
    }
}
