package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class p6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ hb f20352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f20353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f20354c;

    p6(a6 a6Var, hb hbVar, lb lbVar) {
        this.f20354c = a6Var;
        this.f20352a = hbVar;
        this.f20353b = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20354c.f19787a.o0();
        if (this.f20352a.g() == null) {
            this.f20354c.f19787a.E(this.f20352a.f20071b, this.f20353b);
        } else {
            this.f20354c.f19787a.x(this.f20352a, this.f20353b);
        }
    }
}
