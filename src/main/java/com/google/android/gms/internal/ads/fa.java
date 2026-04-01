package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1[] f7681b;

    public fa(List list) {
        this.f7680a = list;
        this.f7681b = new w1[list.size()];
    }

    public final void a(long j8, dq2 dq2Var) {
        if (dq2Var.j() < 9) {
            return;
        }
        int iO = dq2Var.o();
        int iO2 = dq2Var.o();
        int iU = dq2Var.u();
        if (iO == 434 && iO2 == 1195456820 && iU == 3) {
            b0.b(j8, dq2Var, this.f7681b);
        }
    }

    public final void b(s0 s0Var, ca caVar) {
        for (int i8 = 0; i8 < this.f7681b.length; i8++) {
            caVar.c();
            w1 w1VarF = s0Var.f(caVar.a(), 3);
            nb nbVar = (nb) this.f7680a.get(i8);
            String str = nbVar.f11793l;
            boolean z7 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z7 = false;
            }
            uu1.e(z7, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            l9 l9Var = new l9();
            l9Var.j(caVar.b());
            l9Var.u(str);
            l9Var.w(nbVar.f11785d);
            l9Var.m(nbVar.f11784c);
            l9Var.i0(nbVar.D);
            l9Var.k(nbVar.f11795n);
            w1VarF.e(l9Var.D());
            this.f7681b[i8] = w1VarF;
        }
    }
}
