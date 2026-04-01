package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class dq0 implements ww0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f6858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pp2 f6859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private po2 f6860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ea1 f6861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p31 f6862e;

    /* synthetic */ dq0(zp0 zp0Var, cq0 cq0Var) {
        this.f6858a = zp0Var;
    }

    @Override // com.google.android.gms.internal.ads.ww0
    public final /* synthetic */ ww0 a(p31 p31Var) {
        this.f6862e = p31Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ww0
    public final /* synthetic */ ww0 d(ea1 ea1Var) {
        this.f6861d = ea1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final /* synthetic */ l31 g(pp2 pp2Var) {
        this.f6859b = pp2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l31
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final xw0 o() {
        r84.c(this.f6861d, ea1.class);
        r84.c(this.f6862e, p31.class);
        return new fq0(this.f6858a, new y01(), new zt2(), new v21(), new tq1(), this.f6861d, this.f6862e, f72.a(), null, this.f6859b, this.f6860c, null);
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final /* synthetic */ l31 u(po2 po2Var) {
        this.f6860c = po2Var;
        return this;
    }
}
