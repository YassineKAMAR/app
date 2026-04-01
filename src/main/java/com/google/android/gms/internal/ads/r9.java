package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f13989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1[] f13990b;

    public r9(List list) {
        this.f13989a = list;
        this.f13990b = new w1[list.size()];
    }

    public final void a(long j8, dq2 dq2Var) {
        b0.a(j8, dq2Var, this.f13990b);
    }

    public final void b(s0 s0Var, ca caVar) {
        for (int i8 = 0; i8 < this.f13990b.length; i8++) {
            caVar.c();
            w1 w1VarF = s0Var.f(caVar.a(), 3);
            nb nbVar = (nb) this.f13989a.get(i8);
            String str = nbVar.f11793l;
            boolean z7 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z7 = false;
            }
            uu1.e(z7, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String strB = nbVar.f11782a;
            if (strB == null) {
                strB = caVar.b();
            }
            l9 l9Var = new l9();
            l9Var.j(strB);
            l9Var.u(str);
            l9Var.w(nbVar.f11785d);
            l9Var.m(nbVar.f11784c);
            l9Var.i0(nbVar.D);
            l9Var.k(nbVar.f11795n);
            w1VarF.e(l9Var.D());
            this.f13990b[i8] = w1VarF;
        }
    }
}
