package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class a9 implements p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r9 f5077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w1 f5079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z8 f5080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5081e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5088l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f5082f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e9 f5083g = new e9(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e9 f5084h = new e9(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e9 f5085i = new e9(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e9 f5086j = new e9(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e9 f5087k = new e9(40, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5089m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final dq2 f5090n = new dq2();

    public a9(r9 r9Var) {
        this.f5077a = r9Var;
    }

    private final void e(byte[] bArr, int i8, int i9) {
        this.f5080d.c(bArr, i8, i9);
        if (!this.f5081e) {
            this.f5083g.a(bArr, i8, i9);
            this.f5084h.a(bArr, i8, i9);
            this.f5085i.a(bArr, i8, i9);
        }
        this.f5086j.a(bArr, i8, i9);
        this.f5087k.a(bArr, i8, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
    @Override // com.google.android.gms.internal.ads.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.dq2 r32) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a9.a(com.google.android.gms.internal.ads.dq2):void");
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void b(boolean z7) {
        uu1.b(this.f5079c);
        int i8 = nz2.f12300a;
        if (z7) {
            this.f5080d.a(this.f5088l);
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void c(s0 s0Var, ca caVar) {
        caVar.c();
        this.f5078b = caVar.b();
        w1 w1VarF = s0Var.f(caVar.a(), 2);
        this.f5079c = w1VarF;
        this.f5080d = new z8(w1VarF);
        this.f5077a.b(s0Var, caVar);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        if (j8 != -9223372036854775807L) {
            this.f5089m = j8;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        this.f5088l = 0L;
        this.f5089m = -9223372036854775807L;
        sd3.f(this.f5082f);
        this.f5083g.b();
        this.f5084h.b();
        this.f5085i.b();
        this.f5086j.b();
        this.f5087k.b();
        z8 z8Var = this.f5080d;
        if (z8Var != null) {
            z8Var.d();
        }
    }
}
