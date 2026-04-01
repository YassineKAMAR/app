package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o8 implements p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1[] f12391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f12395f = -9223372036854775807L;

    public o8(List list) {
        this.f12390a = list;
        this.f12391b = new w1[list.size()];
    }

    private final boolean e(dq2 dq2Var, int i8) {
        if (dq2Var.j() == 0) {
            return false;
        }
        if (dq2Var.u() != i8) {
            this.f12392c = false;
        }
        this.f12393d--;
        return this.f12392c;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void a(dq2 dq2Var) {
        if (this.f12392c) {
            if (this.f12393d != 2 || e(dq2Var, 32)) {
                if (this.f12393d != 1 || e(dq2Var, 0)) {
                    int iL = dq2Var.l();
                    int iJ = dq2Var.j();
                    for (w1 w1Var : this.f12391b) {
                        dq2Var.g(iL);
                        w1Var.d(dq2Var, iJ);
                    }
                    this.f12394e += iJ;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void b(boolean z7) {
        if (this.f12392c) {
            if (this.f12395f != -9223372036854775807L) {
                for (w1 w1Var : this.f12391b) {
                    w1Var.a(this.f12395f, 1, this.f12394e, 0, null);
                }
            }
            this.f12392c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void c(s0 s0Var, ca caVar) {
        for (int i8 = 0; i8 < this.f12391b.length; i8++) {
            z9 z9Var = (z9) this.f12390a.get(i8);
            caVar.c();
            w1 w1VarF = s0Var.f(caVar.a(), 3);
            l9 l9Var = new l9();
            l9Var.j(caVar.b());
            l9Var.u("application/dvbsubs");
            l9Var.k(Collections.singletonList(z9Var.f18121b));
            l9Var.m(z9Var.f18120a);
            w1VarF.e(l9Var.D());
            this.f12391b[i8] = w1VarF;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        if ((i8 & 4) == 0) {
            return;
        }
        this.f12392c = true;
        if (j8 != -9223372036854775807L) {
            this.f12395f = j8;
        }
        this.f12394e = 0;
        this.f12393d = 2;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        this.f12392c = false;
        this.f12395f = -9223372036854775807L;
    }
}
