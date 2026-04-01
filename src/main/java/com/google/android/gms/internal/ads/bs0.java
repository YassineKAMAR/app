package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class bs0 implements om1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f6014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pp2 f6015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private po2 f6016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ea1 f6017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p31 f6018e;

    /* synthetic */ bs0(zp0 zp0Var, as0 as0Var) {
        this.f6014a = zp0Var;
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final /* synthetic */ om1 a(p31 p31Var) {
        this.f6018e = p31Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final /* synthetic */ om1 d(ea1 ea1Var) {
        this.f6017d = ea1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final /* synthetic */ l31 g(pp2 pp2Var) {
        this.f6015b = pp2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l31
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final pm1 o() {
        r84.c(this.f6017d, ea1.class);
        r84.c(this.f6018e, p31.class);
        return new ds0(this.f6014a, new y01(), new zt2(), new v21(), new tq1(), this.f6017d, this.f6018e, f72.a(), null, this.f6015b, this.f6016c, null);
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final /* synthetic */ l31 u(po2 po2Var) {
        this.f6016c = po2Var;
        return this;
    }
}
