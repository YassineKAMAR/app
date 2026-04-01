package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class jg1 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f9608a = "Google";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ lg1 f9609b;

    jg1(lg1 lg1Var, String str, boolean z7) {
        this.f9609b = lg1Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        g2.t.q().u(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f9609b.f10670j.t((fm0) obj);
        lg1 lg1Var = this.f9609b;
        jh0 jh0VarC0 = lg1Var.f10670j.c0();
        qz2 qz2VarP = lg1Var.P(this.f9608a, true);
        if (qz2VarP != null && jh0VarC0 != null) {
            jh0VarC0.d(qz2VarP);
        } else if (jh0VarC0 != null) {
            jh0VarC0.cancel(false);
        }
    }
}
