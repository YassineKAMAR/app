package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class gm1 implements g00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o51 f8395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bc0 f8396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8398d;

    public gm1(o51 o51Var, wr2 wr2Var) {
        this.f8395a = o51Var;
        this.f8396b = wr2Var.f16891n;
        this.f8397c = wr2Var.f16887l;
        this.f8398d = wr2Var.f16889m;
    }

    @Override // com.google.android.gms.internal.ads.g00
    public final void c0(bc0 bc0Var) {
        int i8;
        String str;
        bc0 bc0Var2 = this.f8396b;
        if (bc0Var2 != null) {
            bc0Var = bc0Var2;
        }
        if (bc0Var != null) {
            str = bc0Var.f5708a;
            i8 = bc0Var.f5709b;
        } else {
            i8 = 1;
            str = "";
        }
        this.f8395a.A0(new lb0(str, i8), this.f8397c, this.f8398d);
    }

    @Override // com.google.android.gms.internal.ads.g00
    public final void k() {
        this.f8395a.m();
    }

    @Override // com.google.android.gms.internal.ads.g00
    public final void l() {
        this.f8395a.n();
    }
}
