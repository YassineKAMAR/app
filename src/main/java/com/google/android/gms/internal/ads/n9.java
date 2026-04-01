package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p8 f11734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kx2 f11735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cp2 f11736c = new cp2(new byte[64], 64);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11739f;

    public n9(p8 p8Var, kx2 kx2Var) {
        this.f11734a = p8Var;
        this.f11735b = kx2Var;
    }

    public final void a(dq2 dq2Var) {
        long jB;
        long j8;
        dq2Var.c(this.f11736c.f6432a, 0, 3);
        this.f11736c.j(0);
        this.f11736c.l(8);
        this.f11737d = this.f11736c.n();
        this.f11738e = this.f11736c.n();
        this.f11736c.l(6);
        cp2 cp2Var = this.f11736c;
        dq2Var.c(cp2Var.f6432a, 0, cp2Var.d(8));
        this.f11736c.j(0);
        if (this.f11737d) {
            this.f11736c.l(4);
            long jD = this.f11736c.d(3);
            this.f11736c.l(1);
            int iD = this.f11736c.d(15) << 15;
            this.f11736c.l(1);
            long jD2 = this.f11736c.d(15);
            this.f11736c.l(1);
            if (this.f11739f || !this.f11738e) {
                j8 = jD;
            } else {
                this.f11736c.l(4);
                long jD3 = ((long) this.f11736c.d(3)) << 30;
                this.f11736c.l(1);
                int iD2 = this.f11736c.d(15) << 15;
                this.f11736c.l(1);
                j8 = jD;
                long jD4 = this.f11736c.d(15);
                this.f11736c.l(1);
                this.f11735b.b(((long) iD2) | jD3 | jD4);
                this.f11739f = true;
            }
            jB = this.f11735b.b((j8 << 30) | ((long) iD) | jD2);
        } else {
            jB = 0;
        }
        this.f11734a.d(jB, 4);
        this.f11734a.a(dq2Var);
        this.f11734a.b(false);
    }

    public final void b() {
        this.f11739f = false;
        this.f11734a.m();
    }
}
