package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class k7 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l7 f9960a;

    /* synthetic */ k7(l7 l7Var, i7 i7Var) {
        this.f9960a = l7Var;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        l7 l7Var = this.f9960a;
        return l7Var.f10482d.e(l7Var.f10484f);
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        l7 l7Var = this.f9960a;
        long jF = l7Var.f10482d.f(j8);
        long j9 = l7Var.f10480b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jF);
        l7 l7Var2 = this.f9960a;
        long jLongValue = j9 + bigIntegerValueOf.multiply(BigInteger.valueOf(l7Var2.f10481c - l7Var2.f10480b)).divide(BigInteger.valueOf(this.f9960a.f10484f)).longValue();
        r1 r1Var = new r1(j8, Math.max(this.f9960a.f10480b, Math.min(jLongValue - 30000, r0.f10481c - 1)));
        return new o1(r1Var, r1Var);
    }
}
