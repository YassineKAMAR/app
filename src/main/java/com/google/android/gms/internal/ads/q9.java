package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class q9 implements da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p9 f13343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f13344b = new dq2(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f13348f;

    public q9(p9 p9Var) {
        this.f13343a = p9Var;
    }

    @Override // com.google.android.gms.internal.ads.da
    public final void a(dq2 dq2Var, int i8) {
        int i9 = i8 & 1;
        int iL = i9 != 0 ? dq2Var.l() + dq2Var.u() : -1;
        if (this.f13348f) {
            if (i9 == 0) {
                return;
            }
            this.f13348f = false;
            dq2Var.g(iL);
            this.f13346d = 0;
        }
        while (dq2Var.j() > 0) {
            int i10 = this.f13346d;
            if (i10 < 3) {
                if (i10 == 0) {
                    int iU = dq2Var.u();
                    dq2Var.g(dq2Var.l() - 1);
                    if (iU == 255) {
                        this.f13348f = true;
                        return;
                    }
                }
                int iMin = Math.min(dq2Var.j(), 3 - this.f13346d);
                dq2Var.c(this.f13344b.i(), this.f13346d, iMin);
                int i11 = this.f13346d + iMin;
                this.f13346d = i11;
                if (i11 == 3) {
                    this.f13344b.g(0);
                    this.f13344b.f(3);
                    this.f13344b.h(1);
                    dq2 dq2Var2 = this.f13344b;
                    int iU2 = dq2Var2.u();
                    boolean z7 = (iU2 & 128) != 0;
                    int iU3 = dq2Var2.u();
                    this.f13347e = z7;
                    this.f13345c = (iU3 | ((iU2 & 15) << 8)) + 3;
                    int iK = this.f13344b.k();
                    int i12 = this.f13345c;
                    if (iK < i12) {
                        int iK2 = this.f13344b.k();
                        this.f13344b.a(Math.min(4098, Math.max(i12, iK2 + iK2)));
                    }
                }
            } else {
                int iMin2 = Math.min(dq2Var.j(), this.f13345c - i10);
                dq2Var.c(this.f13344b.i(), this.f13346d, iMin2);
                int i13 = this.f13346d + iMin2;
                this.f13346d = i13;
                int i14 = this.f13345c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f13347e) {
                        this.f13344b.f(i14);
                    } else {
                        if (nz2.p(this.f13344b.i(), 0, i14, -1) != 0) {
                            this.f13348f = true;
                            return;
                        }
                        this.f13344b.f(this.f13345c - 4);
                    }
                    this.f13344b.g(0);
                    this.f13343a.a(this.f13344b);
                    this.f13346d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.da
    public final void b(kx2 kx2Var, s0 s0Var, ca caVar) {
        this.f13343a.b(kx2Var, s0Var, caVar);
        this.f13348f = true;
    }

    @Override // com.google.android.gms.internal.ads.da
    public final void l() {
        this.f13348f = true;
    }
}
