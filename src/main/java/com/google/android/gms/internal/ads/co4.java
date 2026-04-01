package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class co4 extends ul4 implements sn4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final on3 f6421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sj4 f6422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f6423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f6424k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f6425l = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f6426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f6427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g94 f6428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private c50 f6429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final zn4 f6430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final cr4 f6431r;

    /* synthetic */ co4(c50 c50Var, on3 on3Var, zn4 zn4Var, sj4 sj4Var, cr4 cr4Var, int i8, bo4 bo4Var) {
        this.f6429p = c50Var;
        this.f6421h = on3Var;
        this.f6430q = zn4Var;
        this.f6422i = sj4Var;
        this.f6431r = cr4Var;
        this.f6423j = i8;
    }

    private final void m() {
        long j8 = this.f6425l;
        boolean z7 = this.f6426m;
        boolean z8 = this.f6427n;
        c50 c50VarO0 = o0();
        po4 po4Var = new po4(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j8, j8, 0L, 0L, z7, false, false, null, c50VarO0, z8 ? c50VarO0.f6165d : null);
        j(this.f6424k ? new yn4(this, po4Var) : po4Var);
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void W() {
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void Y(rm4 rm4Var) {
        ((xn4) rm4Var).C();
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final rm4 Z(tm4 tm4Var, xq4 xq4Var, long j8) {
        po3 po3VarJ = this.f6421h.j();
        g94 g94Var = this.f6428o;
        if (g94Var != null) {
            po3VarJ.a(g94Var);
        }
        fy fyVar = o0().f6163b;
        fyVar.getClass();
        zn4 zn4Var = this.f6430q;
        b();
        return new xn4(fyVar.f8107a, po3VarJ, new vl4(zn4Var.f18303a), this.f6422i, c(tm4Var), this.f6431r, e(tm4Var), this, xq4Var, null, this.f6423j, nz2.C(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.sn4
    public final void a(long j8, boolean z7, boolean z8) {
        if (j8 == -9223372036854775807L) {
            j8 = this.f6425l;
        }
        if (!this.f6424k && this.f6425l == j8 && this.f6426m == z7 && this.f6427n == z8) {
            return;
        }
        this.f6425l = j8;
        this.f6426m = z7;
        this.f6427n = z8;
        this.f6424k = false;
        m();
    }

    @Override // com.google.android.gms.internal.ads.ul4, com.google.android.gms.internal.ads.vm4
    public final synchronized void d0(c50 c50Var) {
        this.f6429p = c50Var;
    }

    @Override // com.google.android.gms.internal.ads.ul4
    protected final void i(g94 g94Var) {
        this.f6428o = g94Var;
        Looper.myLooper().getClass();
        b();
        m();
    }

    @Override // com.google.android.gms.internal.ads.ul4
    protected final void k() {
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final synchronized c50 o0() {
        return this.f6429p;
    }
}
