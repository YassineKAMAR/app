package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class v14 extends x14 {
    /* synthetic */ v14(u14 u14Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.x14
    final List a(Object obj, long j8) {
        j14 j14Var = (j14) g44.p(obj, j8);
        if (j14Var.l()) {
            return j14Var;
        }
        int size = j14Var.size();
        j14 j14VarF = j14Var.f(size == 0 ? 10 : size + size);
        g44.D(obj, j8, j14VarF);
        return j14VarF;
    }

    @Override // com.google.android.gms.internal.ads.x14
    final void b(Object obj, long j8) {
        ((j14) g44.p(obj, j8)).k();
    }

    @Override // com.google.android.gms.internal.ads.x14
    final void c(Object obj, Object obj2, long j8) {
        j14 j14VarF = (j14) g44.p(obj, j8);
        j14 j14Var = (j14) g44.p(obj2, j8);
        int size = j14VarF.size();
        int size2 = j14Var.size();
        if (size > 0 && size2 > 0) {
            if (!j14VarF.l()) {
                j14VarF = j14VarF.f(size2 + size);
            }
            j14VarF.addAll(j14Var);
        }
        if (size > 0) {
            j14Var = j14VarF;
        }
        g44.D(obj, j8, j14Var);
    }
}
