package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ji4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nn1[] f9644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fj4 f9645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qq1 f9646c;

    public ji4(nn1... nn1VarArr) {
        fj4 fj4Var = new fj4();
        qq1 qq1Var = new qq1();
        nn1[] nn1VarArr2 = {fj4Var, qq1Var};
        this.f9644a = nn1VarArr2;
        System.arraycopy(nn1VarArr, 0, nn1VarArr2, 0, 0);
        this.f9645b = fj4Var;
        this.f9646c = qq1Var;
    }

    public final long a(long j8) {
        return this.f9646c.c(j8);
    }

    public final long b() {
        return this.f9645b.i();
    }

    public final dm0 c(dm0 dm0Var) {
        this.f9646c.e(dm0Var.f6811a);
        this.f9646c.d(dm0Var.f6812b);
        return dm0Var;
    }

    public final boolean d(boolean z7) {
        this.f9645b.j(z7);
        return z7;
    }

    public final nn1[] e() {
        return this.f9644a;
    }
}
