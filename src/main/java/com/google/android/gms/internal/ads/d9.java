package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class d9 implements p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f6618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f6619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w1 f6621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f6622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6623f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f6627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f6629l;

    public d9(String str) {
        dq2 dq2Var = new dq2(4);
        this.f6618a = dq2Var;
        dq2Var.i()[0] = -1;
        this.f6619b = new k1();
        this.f6629l = -9223372036854775807L;
        this.f6620c = str;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void a(dq2 dq2Var) {
        uu1.b(this.f6621d);
        while (dq2Var.j() > 0) {
            int i8 = this.f6623f;
            if (i8 == 0) {
                byte[] bArrI = dq2Var.i();
                int iL = dq2Var.l();
                int iM = dq2Var.m();
                while (iL < iM) {
                    int i9 = iL + 1;
                    byte b8 = bArrI[iL];
                    boolean z7 = (b8 & 255) == 255;
                    boolean z8 = this.f6626i && (b8 & 224) == 224;
                    this.f6626i = z7;
                    if (z8) {
                        dq2Var.g(i9);
                        this.f6626i = false;
                        this.f6618a.i()[1] = bArrI[iL];
                        this.f6624g = 2;
                        this.f6623f = 1;
                        break;
                        break;
                    }
                    iL = i9;
                }
                dq2Var.g(iM);
            } else if (i8 != 1) {
                int iMin = Math.min(dq2Var.j(), this.f6628k - this.f6624g);
                this.f6621d.d(dq2Var, iMin);
                int i10 = this.f6624g + iMin;
                this.f6624g = i10;
                int i11 = this.f6628k;
                if (i10 >= i11) {
                    long j8 = this.f6629l;
                    if (j8 != -9223372036854775807L) {
                        this.f6621d.a(j8, 1, i11, 0, null);
                        this.f6629l += this.f6627j;
                    }
                    this.f6624g = 0;
                    this.f6623f = 0;
                }
            } else {
                int iMin2 = Math.min(dq2Var.j(), 4 - this.f6624g);
                dq2Var.c(this.f6618a.i(), this.f6624g, iMin2);
                int i12 = this.f6624g + iMin2;
                this.f6624g = i12;
                if (i12 >= 4) {
                    this.f6618a.g(0);
                    if (!this.f6619b.a(this.f6618a.o())) {
                        this.f6624g = 0;
                        this.f6623f = 1;
                        break;
                    }
                    k1 k1Var = this.f6619b;
                    this.f6628k = k1Var.f9866c;
                    if (!this.f6625h) {
                        this.f6627j = (((long) k1Var.f9870g) * 1000000) / ((long) k1Var.f9867d);
                        l9 l9Var = new l9();
                        l9Var.j(this.f6622e);
                        l9Var.u(this.f6619b.f9865b);
                        l9Var.n(4096);
                        l9Var.k0(this.f6619b.f9868e);
                        l9Var.v(this.f6619b.f9867d);
                        l9Var.m(this.f6620c);
                        this.f6621d.e(l9Var.D());
                        this.f6625h = true;
                    }
                    this.f6618a.g(0);
                    this.f6621d.d(this.f6618a, 4);
                    this.f6623f = 2;
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
        this.f6622e = caVar.b();
        this.f6621d = s0Var.f(caVar.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        if (j8 != -9223372036854775807L) {
            this.f6629l = j8;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        this.f6623f = 0;
        this.f6624g = 0;
        this.f6626i = false;
        this.f6629l = -9223372036854775807L;
    }
}
