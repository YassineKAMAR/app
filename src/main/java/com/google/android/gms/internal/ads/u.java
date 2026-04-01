package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class u implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f15419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f15421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f15422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f15423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f15424f;

    public u(x xVar, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f15419a = xVar;
        this.f15420b = j8;
        this.f15421c = j10;
        this.f15422d = j11;
        this.f15423e = j12;
        this.f15424f = j13;
    }

    public final long f(long j8) {
        return this.f15419a.a(j8);
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f15420b;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        r1 r1Var = new r1(j8, w.f(this.f15419a.a(j8), 0L, this.f15421c, this.f15422d, this.f15423e, this.f15424f));
        return new o1(r1Var, r1Var);
    }
}
