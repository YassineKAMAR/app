package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9892c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l2 f9894e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n2 f9898i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f9903n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f9890a = new dq2(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2 f9891b = new j2(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s0 f9893d = new n0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n2[] f9896g = new n2[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f9900k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f9901l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f9899j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9895f = -9223372036854775807L;

    private final n2 b(int i8) {
        for (n2 n2Var : this.f9896g) {
            if (n2Var.g(i8)) {
                return n2Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        int i8;
        this.f9897h = -1L;
        this.f9898i = null;
        for (n2 n2Var : this.f9896g) {
            n2Var.f(j8);
        }
        if (j8 != 0) {
            i8 = 6;
        } else {
            if (this.f9896g.length == 0) {
                this.f9892c = 0;
                return;
            }
            i8 = 3;
        }
        this.f9892c = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0307  */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(com.google.android.gms.internal.ads.q0 r27, com.google.android.gms.internal.ads.n1 r28) throws com.google.android.gms.internal.ads.yh0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k2.f(com.google.android.gms.internal.ads.q0, com.google.android.gms.internal.ads.n1):int");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) {
        ((f0) q0Var).L(this.f9890a.i(), 0, 12, false);
        this.f9890a.g(0);
        if (this.f9890a.q() != 1179011410) {
            return false;
        }
        this.f9890a.h(4);
        return this.f9890a.q() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f9892c = 0;
        this.f9893d = s0Var;
        this.f9897h = -1L;
    }
}
