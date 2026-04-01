package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class pa implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final la f12800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f12804e;

    public pa(la laVar, int i8, long j8, long j9) {
        this.f12800a = laVar;
        this.f12801b = i8;
        this.f12802c = j8;
        long j10 = (j9 - j8) / ((long) laVar.f10559d);
        this.f12803d = j10;
        this.f12804e = b(j10);
    }

    private final long b(long j8) {
        return nz2.D(j8 * ((long) this.f12801b), 1000000L, this.f12800a.f10558c);
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f12804e;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        long jMax = Math.max(0L, Math.min((((long) this.f12800a.f10558c) * j8) / (((long) this.f12801b) * 1000000), this.f12803d - 1));
        long j9 = ((long) this.f12800a.f10559d) * jMax;
        long jB = b(jMax);
        r1 r1Var = new r1(jB, this.f12802c + j9);
        if (jB >= j8 || jMax == this.f12803d - 1) {
            return new o1(r1Var, r1Var);
        }
        long j10 = jMax + 1;
        return new o1(r1Var, new r1(b(j10), this.f12802c + (j10 * ((long) this.f12800a.f10559d))));
    }
}
