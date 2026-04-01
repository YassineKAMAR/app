package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class er0 implements hr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f7467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zp0 f7469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jr0 f7470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final er0 f7471e = this;

    /* synthetic */ er0(zp0 zp0Var, jr0 jr0Var, Long l8, String str, dr0 dr0Var) {
        this.f7469c = zp0Var;
        this.f7470d = jr0Var;
        this.f7467a = l8;
        this.f7468b = str;
    }

    @Override // com.google.android.gms.internal.ads.hr1
    public final sr1 j() {
        jr0 jr0Var = this.f7470d;
        return tr1.a(this.f7467a.longValue(), jr0Var.f9749a, lr1.b(jr0Var.f9750b), this.f7469c, this.f7468b);
    }

    @Override // com.google.android.gms.internal.ads.hr1
    public final wr1 k() {
        jr0 jr0Var = this.f7470d;
        return xr1.a(this.f7467a.longValue(), jr0Var.f9749a, lr1.b(jr0Var.f9750b), this.f7469c, this.f7468b);
    }
}
