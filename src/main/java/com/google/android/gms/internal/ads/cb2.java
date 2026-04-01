package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class cb2 implements kb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ db2 f6298a;

    cb2(db2 db2Var) {
        this.f6298a = db2Var;
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ad1 ad1Var = (ad1) obj;
        synchronized (this.f6298a) {
            this.f6298a.f6664j = ad1Var;
            this.f6298a.f6664j.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final void j() {
        synchronized (this.f6298a) {
            this.f6298a.f6664j = null;
        }
    }
}
