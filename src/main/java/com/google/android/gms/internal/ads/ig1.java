package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ig1 implements tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f9177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ lg1 f9178b;

    ig1(lg1 lg1Var, String str) {
        this.f9178b = lg1Var;
        this.f9177a = str;
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void b0(sk skVar) {
        if (!((Boolean) h2.y.c().b(ns.H1)).booleanValue()) {
            if (skVar.f14729j) {
                lg1 lg1Var = this.f9178b;
                lg1Var.D.put(this.f9177a, Boolean.TRUE);
                lg1 lg1Var2 = this.f9178b;
                lg1Var2.d0(lg1Var2.f10680t.n(), this.f9178b.f10680t.u(), this.f9178b.f10680t.x(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (skVar.f14729j) {
                lg1 lg1Var3 = this.f9178b;
                if (lg1Var3.f10680t == null) {
                    return;
                }
                lg1Var3.D.put(this.f9177a, Boolean.TRUE);
                lg1 lg1Var4 = this.f9178b;
                lg1Var4.d0(lg1Var4.f10680t.n(), this.f9178b.f10680t.u(), this.f9178b.f10680t.x(), true);
            }
        }
    }
}
