package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class nr0 implements be1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f12002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pp2 f12003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private po2 f12004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ea1 f12005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p31 f12006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c92 f12007f;

    /* synthetic */ nr0(zp0 zp0Var, mr0 mr0Var) {
        this.f12002a = zp0Var;
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final /* synthetic */ be1 f(p31 p31Var) {
        this.f12006e = p31Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final /* synthetic */ l31 g(pp2 pp2Var) {
        this.f12003b = pp2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final /* synthetic */ be1 j(c92 c92Var) {
        this.f12007f = c92Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l31
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ce1 o() {
        r84.c(this.f12005d, ea1.class);
        r84.c(this.f12006e, p31.class);
        r84.c(this.f12007f, c92.class);
        return new pr0(this.f12002a, new y01(), new zt2(), new v21(), new tq1(), this.f12005d, this.f12006e, f72.a(), this.f12007f, null, this.f12003b, this.f12004c, null);
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final /* synthetic */ be1 r(ea1 ea1Var) {
        this.f12005d = ea1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final /* synthetic */ l31 u(po2 po2Var) {
        this.f12004c = po2Var;
        return this;
    }
}
