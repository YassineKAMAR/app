package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class am4 implements en4, mj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dn4 f5337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lj4 f5338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ cm4 f5339d;

    public am4(cm4 cm4Var, Object obj) {
        this.f5339d = cm4Var;
        this.f5337b = cm4Var.e(null);
        this.f5338c = cm4Var.c(null);
        this.f5336a = obj;
    }

    private final pm4 b(pm4 pm4Var) {
        cm4 cm4Var = this.f5339d;
        Object obj = this.f5336a;
        long j8 = pm4Var.f12946c;
        cm4Var.p(obj, j8);
        cm4 cm4Var2 = this.f5339d;
        Object obj2 = this.f5336a;
        long j9 = pm4Var.f12947d;
        cm4Var2.p(obj2, j9);
        return (j8 == pm4Var.f12946c && j9 == pm4Var.f12947d) ? pm4Var : new pm4(1, pm4Var.f12944a, pm4Var.f12945b, 0, null, j8, j9);
    }

    private final boolean c(int i8, tm4 tm4Var) {
        tm4 tm4VarQ;
        if (tm4Var != null) {
            tm4VarQ = this.f5339d.q(this.f5336a, tm4Var);
            if (tm4VarQ == null) {
                return false;
            }
        } else {
            tm4VarQ = null;
        }
        this.f5339d.o(this.f5336a, 0);
        dn4 dn4Var = this.f5337b;
        int i9 = dn4Var.f6828a;
        if (!nz2.e(dn4Var.f6829b, tm4VarQ)) {
            this.f5337b = this.f5339d.f(0, tm4VarQ);
        }
        lj4 lj4Var = this.f5338c;
        int i10 = lj4Var.f10745a;
        if (nz2.e(lj4Var.f10746b, tm4VarQ)) {
            return true;
        }
        this.f5338c = this.f5339d.d(0, tm4VarQ);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void C(int i8, tm4 tm4Var, km4 km4Var, pm4 pm4Var) {
        if (c(0, tm4Var)) {
            this.f5337b.d(km4Var, b(pm4Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void D(int i8, tm4 tm4Var, pm4 pm4Var) {
        if (c(0, tm4Var)) {
            this.f5337b.c(b(pm4Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void F(int i8, tm4 tm4Var, km4 km4Var, pm4 pm4Var, IOException iOException, boolean z7) {
        if (c(0, tm4Var)) {
            this.f5337b.f(km4Var, b(pm4Var), iOException, z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void h(int i8, tm4 tm4Var, km4 km4Var, pm4 pm4Var) {
        if (c(0, tm4Var)) {
            this.f5337b.g(km4Var, b(pm4Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void p(int i8, tm4 tm4Var, km4 km4Var, pm4 pm4Var) {
        if (c(0, tm4Var)) {
            this.f5337b.e(km4Var, b(pm4Var));
        }
    }
}
