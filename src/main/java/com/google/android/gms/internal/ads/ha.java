package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ha implements ia {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f8687m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f8688n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f8689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1 f8690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final la f8691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f8693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dq2 f8694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nb f8696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f8698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f8700l;

    public ha(s0 s0Var, w1 w1Var, la laVar) throws yh0 {
        this.f8689a = s0Var;
        this.f8690b = w1Var;
        this.f8691c = laVar;
        int iMax = Math.max(1, laVar.f10558c / 10);
        this.f8695g = iMax;
        dq2 dq2Var = new dq2(laVar.f10561f);
        dq2Var.s();
        int iS = dq2Var.s();
        this.f8692d = iS;
        int i8 = laVar.f10557b;
        int i9 = laVar.f10559d;
        int i10 = (((i9 - (i8 * 4)) * 8) / (laVar.f10560e * i8)) + 1;
        if (iS != i10) {
            throw yh0.a("Expected frames per block: " + i10 + "; got: " + iS, null);
        }
        int i11 = nz2.f12300a;
        int i12 = ((iMax + iS) - 1) / iS;
        this.f8693e = new byte[i9 * i12];
        this.f8694f = new dq2(i12 * (iS + iS) * i8);
        int i13 = ((laVar.f10558c * laVar.f10559d) * 8) / iS;
        l9 l9Var = new l9();
        l9Var.u("audio/raw");
        l9Var.j0(i13);
        l9Var.q(i13);
        l9Var.n((iMax + iMax) * i8);
        l9Var.k0(laVar.f10557b);
        l9Var.v(laVar.f10558c);
        l9Var.p(2);
        this.f8696h = l9Var.D();
    }

    private final int a(int i8) {
        int i9 = this.f8691c.f10557b;
        return i8 / (i9 + i9);
    }

    private final int e(int i8) {
        return (i8 + i8) * this.f8691c.f10557b;
    }

    private final void f(int i8) {
        long jD = this.f8698j + nz2.D(this.f8700l, 1000000L, this.f8691c.f10558c);
        int iE = e(i8);
        this.f8690b.a(jD, 1, iE, this.f8699k - iE, null);
        this.f8700l += (long) i8;
        this.f8699k -= iE;
    }

    @Override // com.google.android.gms.internal.ads.ia
    public final void b(long j8) {
        this.f8697i = 0;
        this.f8698j = j8;
        this.f8699k = 0;
        this.f8700l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.ia
    public final void c(int i8, long j8) {
        this.f8689a.r(new pa(this.f8691c, this.f8692d, i8, j8));
        this.f8690b.e(this.f8696h);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(com.google.android.gms.internal.ads.q0 r21, long r22) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ha.d(com.google.android.gms.internal.ads.q0, long):boolean");
    }
}
