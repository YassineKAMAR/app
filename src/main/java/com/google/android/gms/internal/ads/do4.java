package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class do4 implements rq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qq4 f6846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public do4 f6847d;

    public do4(long j8, int i8) {
        c(j8, 65536);
    }

    public final int a(long j8) {
        long j9 = j8 - this.f6844a;
        int i8 = this.f6846c.f13734b;
        return (int) j9;
    }

    public final do4 b() {
        this.f6846c = null;
        do4 do4Var = this.f6847d;
        this.f6847d = null;
        return do4Var;
    }

    public final void c(long j8, int i8) {
        uu1.f(this.f6846c == null);
        this.f6844a = j8;
        this.f6845b = j8 + 65536;
    }

    @Override // com.google.android.gms.internal.ads.rq4
    public final qq4 l() {
        qq4 qq4Var = this.f6846c;
        qq4Var.getClass();
        return qq4Var;
    }

    @Override // com.google.android.gms.internal.ads.rq4
    public final rq4 p() {
        do4 do4Var = this.f6847d;
        if (do4Var == null || do4Var.f6846c == null) {
            return null;
        }
        return do4Var;
    }
}
