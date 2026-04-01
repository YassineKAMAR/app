package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class fs0 implements p2.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f8011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p31 f8012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p2.g f8013c;

    /* synthetic */ fs0(zp0 zp0Var, es0 es0Var) {
        this.f8011a = zp0Var;
    }

    @Override // p2.z
    public final /* synthetic */ p2.z a(p2.g gVar) {
        this.f8013c = gVar;
        return this;
    }

    @Override // p2.z
    public final /* synthetic */ p2.z b(p31 p31Var) {
        this.f8012b = p31Var;
        return this;
    }

    @Override // p2.z
    public final p2.a0 l() {
        r84.c(this.f8012b, p31.class);
        r84.c(this.f8013c, p2.g.class);
        return new hs0(this.f8011a, this.f8013c, new y01(), new tq1(), this.f8012b, null, null, null);
    }
}
