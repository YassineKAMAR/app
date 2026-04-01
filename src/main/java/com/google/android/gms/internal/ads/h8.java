package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class h8 implements p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cp2 f8667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f8668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w1 f8671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f8675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private nb f8676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f8678l;

    public h8(String str) {
        cp2 cp2Var = new cp2(new byte[16], 16);
        this.f8667a = cp2Var;
        this.f8668b = new dq2(cp2Var.f6432a);
        this.f8672f = 0;
        this.f8673g = 0;
        this.f8674h = false;
        this.f8678l = -9223372036854775807L;
        this.f8669c = str;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void a(dq2 dq2Var) {
        uu1.b(this.f8671e);
        while (dq2Var.j() > 0) {
            int i8 = this.f8672f;
            if (i8 == 0) {
                while (dq2Var.j() > 0) {
                    if (this.f8674h) {
                        int iU = dq2Var.u();
                        this.f8674h = iU == 172;
                        if (iU != 64) {
                            if (iU == 65) {
                                iU = 65;
                            }
                        }
                        this.f8672f = 1;
                        dq2 dq2Var2 = this.f8668b;
                        dq2Var2.i()[0] = -84;
                        dq2Var2.i()[1] = iU == 65 ? (byte) 65 : (byte) 64;
                        this.f8673g = 2;
                    } else {
                        this.f8674h = dq2Var.u() == 172;
                    }
                }
            } else if (i8 != 1) {
                int iMin = Math.min(dq2Var.j(), this.f8677k - this.f8673g);
                this.f8671e.d(dq2Var, iMin);
                int i9 = this.f8673g + iMin;
                this.f8673g = i9;
                int i10 = this.f8677k;
                if (i9 == i10) {
                    long j8 = this.f8678l;
                    if (j8 != -9223372036854775807L) {
                        this.f8671e.a(j8, 1, i10, 0, null);
                        this.f8678l += this.f8675i;
                    }
                    this.f8672f = 0;
                }
            } else {
                byte[] bArrI = this.f8668b.i();
                int iMin2 = Math.min(dq2Var.j(), 16 - this.f8673g);
                dq2Var.c(bArrI, this.f8673g, iMin2);
                int i11 = this.f8673g + iMin2;
                this.f8673g = i11;
                if (i11 == 16) {
                    this.f8667a.j(0);
                    r rVarA = s.a(this.f8667a);
                    nb nbVar = this.f8676j;
                    if (nbVar == null || nbVar.f11806y != 2 || rVarA.f13817a != nbVar.f11807z || !"audio/ac4".equals(nbVar.f11793l)) {
                        l9 l9Var = new l9();
                        l9Var.j(this.f8670d);
                        l9Var.u("audio/ac4");
                        l9Var.k0(2);
                        l9Var.v(rVarA.f13817a);
                        l9Var.m(this.f8669c);
                        nb nbVarD = l9Var.D();
                        this.f8676j = nbVarD;
                        this.f8671e.e(nbVarD);
                    }
                    this.f8677k = rVarA.f13818b;
                    this.f8675i = (((long) rVarA.f13819c) * 1000000) / ((long) this.f8676j.f11807z);
                    this.f8668b.g(0);
                    this.f8671e.d(this.f8668b, 16);
                    this.f8672f = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void b(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void c(s0 s0Var, ca caVar) {
        caVar.c();
        this.f8670d = caVar.b();
        this.f8671e = s0Var.f(caVar.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        if (j8 != -9223372036854775807L) {
            this.f8678l = j8;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        this.f8672f = 0;
        this.f8673g = 0;
        this.f8674h = false;
        this.f8678l = -9223372036854775807L;
    }
}
