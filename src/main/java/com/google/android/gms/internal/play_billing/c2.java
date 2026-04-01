package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class c2 extends e2 {
    /* synthetic */ c2(b2 b2Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.e2
    final void a(Object obj, long j8) {
        ((r1) d4.k(obj, j8)).k();
    }

    @Override // com.google.android.gms.internal.play_billing.e2
    final void b(Object obj, Object obj2, long j8) {
        r1 r1VarF = (r1) d4.k(obj, j8);
        r1 r1Var = (r1) d4.k(obj2, j8);
        int size = r1VarF.size();
        int size2 = r1Var.size();
        if (size > 0 && size2 > 0) {
            if (!r1VarF.l()) {
                r1VarF = r1VarF.f(size2 + size);
            }
            r1VarF.addAll(r1Var);
        }
        if (size > 0) {
            r1Var = r1VarF;
        }
        d4.x(obj, j8, r1Var);
    }
}
