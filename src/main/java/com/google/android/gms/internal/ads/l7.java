package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class l7 implements s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r7 f10479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f10480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f10481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x7 f10482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f10484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f10485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f10487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f10488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f10489k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f10490l;

    public l7(x7 x7Var, long j8, long j9, long j10, long j11, boolean z7) {
        uu1.d(j8 >= 0 && j9 > j8);
        this.f10482d = x7Var;
        this.f10480b = j8;
        this.f10481c = j9;
        if (j10 == j9 - j8 || z7) {
            this.f10484f = j11;
            this.f10483e = 4;
        } else {
            this.f10483e = 0;
        }
        this.f10479a = new r7();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    @Override // com.google.android.gms.internal.ads.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.q0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l7.a(com.google.android.gms.internal.ads.q0):long");
    }

    @Override // com.google.android.gms.internal.ads.s7
    public final /* bridge */ /* synthetic */ q1 m() {
        i7 i7Var = null;
        if (this.f10484f != 0) {
            return new k7(this, i7Var);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s7
    public final void p(long j8) {
        this.f10486h = Math.max(0L, Math.min(j8, this.f10484f - 1));
        this.f10483e = 2;
        this.f10487i = this.f10480b;
        this.f10488j = this.f10481c;
        this.f10489k = 0L;
        this.f10490l = this.f10484f;
    }
}
