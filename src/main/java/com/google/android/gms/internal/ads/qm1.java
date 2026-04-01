package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qm1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f13566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f13567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f13568c;

    public qm1(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f13566a = w84Var;
        this.f13567b = w84Var2;
        this.f13568c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* synthetic */ Object k() {
        int i8 = ((x31) this.f13568c).a().f15313o.f8488a;
        if (i8 != 0) {
            return ((p82) (i8 + (-1) != 0 ? this.f13567b : this.f13566a)).k();
        }
        throw null;
    }
}
