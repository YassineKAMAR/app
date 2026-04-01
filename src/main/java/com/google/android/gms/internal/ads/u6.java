package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f15501a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h7 f15504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q6 f15505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15509i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f15512l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g7 f15502b = new g7();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dq2 f15503c = new dq2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final dq2 f15510j = new dq2(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final dq2 f15511k = new dq2();

    public u6(w1 w1Var, h7 h7Var, q6 q6Var) {
        this.f15501a = w1Var;
        this.f15504d = h7Var;
        this.f15505e = q6Var;
        h(h7Var, q6Var);
    }

    public final int a() {
        int i8 = !this.f15512l ? this.f15504d.f8660g[this.f15506f] : this.f15502b.f8237j[this.f15506f] ? 1 : 0;
        return f() != null ? i8 | 1073741824 : i8;
    }

    public final int b() {
        return !this.f15512l ? this.f15504d.f8657d[this.f15506f] : this.f15502b.f8235h[this.f15506f];
    }

    public final int c(int i8, int i9) {
        dq2 dq2Var;
        f7 f7VarF = f();
        if (f7VarF == null) {
            return 0;
        }
        int i10 = f7VarF.f7656d;
        if (i10 != 0) {
            dq2Var = this.f15502b.f8241n;
        } else {
            byte[] bArr = f7VarF.f7657e;
            int i11 = nz2.f12300a;
            dq2 dq2Var2 = this.f15511k;
            int length = bArr.length;
            dq2Var2.e(bArr, length);
            dq2Var = this.f15511k;
            i10 = length;
        }
        boolean zB = this.f15502b.b(this.f15506f);
        boolean z7 = zB || i9 != 0;
        dq2 dq2Var3 = this.f15510j;
        dq2Var3.i()[0] = (byte) ((true != z7 ? 0 : 128) | i10);
        dq2Var3.g(0);
        this.f15501a.c(this.f15510j, 1, 1);
        this.f15501a.c(dq2Var, i10, 1);
        if (!z7) {
            return i10 + 1;
        }
        if (!zB) {
            this.f15503c.d(8);
            dq2 dq2Var4 = this.f15503c;
            byte[] bArrI = dq2Var4.i();
            bArrI[0] = 0;
            bArrI[1] = 1;
            bArrI[2] = 0;
            bArrI[3] = (byte) i9;
            bArrI[4] = (byte) ((i8 >> 24) & 255);
            bArrI[5] = (byte) ((i8 >> 16) & 255);
            bArrI[6] = (byte) ((i8 >> 8) & 255);
            bArrI[7] = (byte) (i8 & 255);
            this.f15501a.c(dq2Var4, 8, 1);
            return i10 + 9;
        }
        int i12 = i10 + 1;
        dq2 dq2Var5 = this.f15502b.f8241n;
        int iY = dq2Var5.y();
        dq2Var5.h(-2);
        int i13 = (iY * 6) + 2;
        if (i9 != 0) {
            this.f15503c.d(i13);
            byte[] bArrI2 = this.f15503c.i();
            dq2Var5.c(bArrI2, 0, i13);
            int i14 = (((bArrI2[2] & 255) << 8) | (bArrI2[3] & 255)) + i9;
            bArrI2[2] = (byte) ((i14 >> 8) & 255);
            bArrI2[3] = (byte) (i14 & 255);
            dq2Var5 = this.f15503c;
        }
        this.f15501a.c(dq2Var5, i13, 1);
        return i12 + i13;
    }

    public final long d() {
        return !this.f15512l ? this.f15504d.f8656c[this.f15506f] : this.f15502b.f8233f[this.f15508h];
    }

    public final long e() {
        if (!this.f15512l) {
            return this.f15504d.f8659f[this.f15506f];
        }
        g7 g7Var = this.f15502b;
        return g7Var.f8236i[this.f15506f];
    }

    public final f7 f() {
        if (!this.f15512l) {
            return null;
        }
        g7 g7Var = this.f15502b;
        q6 q6Var = g7Var.f8228a;
        int i8 = nz2.f12300a;
        int i9 = q6Var.f13300a;
        f7 f7VarA = g7Var.f8240m;
        if (f7VarA == null) {
            f7VarA = this.f15504d.f8654a.a(i9);
        }
        if (f7VarA == null || !f7VarA.f7653a) {
            return null;
        }
        return f7VarA;
    }

    public final void h(h7 h7Var, q6 q6Var) {
        this.f15504d = h7Var;
        this.f15505e = q6Var;
        this.f15501a.e(h7Var.f8654a.f7154f);
        i();
    }

    public final void i() {
        g7 g7Var = this.f15502b;
        g7Var.f8231d = 0;
        g7Var.f8243p = 0L;
        g7Var.f8244q = false;
        g7Var.f8238k = false;
        g7Var.f8242o = false;
        g7Var.f8240m = null;
        this.f15506f = 0;
        this.f15508h = 0;
        this.f15507g = 0;
        this.f15509i = 0;
        this.f15512l = false;
    }

    public final boolean k() {
        this.f15506f++;
        if (!this.f15512l) {
            return false;
        }
        int i8 = this.f15507g + 1;
        this.f15507g = i8;
        int[] iArr = this.f15502b.f8234g;
        int i9 = this.f15508h;
        if (i8 != iArr[i9]) {
            return true;
        }
        this.f15508h = i9 + 1;
        this.f15507g = 0;
        return false;
    }
}
