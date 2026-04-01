package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1 f4944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4945b;

    public a1(c1 c1Var, long j8) {
        this.f4944a = c1Var;
        this.f4945b = j8;
    }

    private final r1 b(long j8, long j9) {
        return new r1((j8 * 1000000) / ((long) this.f4944a.f6092e), this.f4945b + j9);
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f4944a.a();
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        uu1.b(this.f4944a.f6098k);
        c1 c1Var = this.f4944a;
        b1 b1Var = c1Var.f6098k;
        long[] jArr = b1Var.f5553a;
        long[] jArr2 = b1Var.f5554b;
        int iO = nz2.o(jArr, c1Var.b(j8), true, false);
        r1 r1VarB = b(iO == -1 ? 0L : jArr[iO], iO != -1 ? jArr2[iO] : 0L);
        if (r1VarB.f13856a == j8 || iO == jArr.length - 1) {
            return new o1(r1VarB, r1VarB);
        }
        int i8 = iO + 1;
        return new o1(r1VarB, b(jArr[i8], jArr2[i8]));
    }
}
