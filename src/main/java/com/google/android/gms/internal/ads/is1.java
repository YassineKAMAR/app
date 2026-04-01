package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class is1 extends i10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f9332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f9334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ey2 f9335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ jh0 f9336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ js1 f9337f;

    is1(js1 js1Var, Object obj, String str, long j8, ey2 ey2Var, jh0 jh0Var) {
        this.f9337f = js1Var;
        this.f9332a = obj;
        this.f9333b = str;
        this.f9334c = j8;
        this.f9335d = ey2Var;
        this.f9336e = jh0Var;
    }

    @Override // com.google.android.gms.internal.ads.j10
    public final void b(String str) {
        synchronized (this.f9332a) {
            this.f9337f.v(this.f9333b, false, str, (int) (g2.t.b().b() - this.f9334c));
            this.f9337f.f9786l.b(this.f9333b, "error");
            this.f9337f.f9789o.b(this.f9333b, "error");
            ty2 ty2Var = this.f9337f.f9790p;
            ey2 ey2Var = this.f9335d;
            ey2Var.e(str);
            ey2Var.C0(false);
            ty2Var.b(ey2Var.u());
            this.f9336e.d(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.j10
    public final void n() {
        synchronized (this.f9332a) {
            this.f9337f.v(this.f9333b, true, "", (int) (g2.t.b().b() - this.f9334c));
            this.f9337f.f9786l.d(this.f9333b);
            this.f9337f.f9789o.h(this.f9333b);
            ty2 ty2Var = this.f9337f.f9790p;
            ey2 ey2Var = this.f9335d;
            ey2Var.C0(true);
            ty2Var.b(ey2Var.u());
            this.f9336e.d(Boolean.TRUE);
        }
    }
}
