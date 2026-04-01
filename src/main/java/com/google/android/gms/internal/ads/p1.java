package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class p1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o1 f12696b;

    public p1(long j8, long j9) {
        this.f12695a = j8;
        r1 r1Var = j9 == 0 ? r1.f13855c : new r1(0L, j9);
        this.f12696b = new o1(r1Var, r1Var);
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f12695a;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        return this.f12696b;
    }
}
