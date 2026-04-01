package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class cf3 extends ze3 {
    /* synthetic */ cf3(bf3 bf3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.ze3
    final int a(df3 df3Var) {
        int i8;
        synchronized (df3Var) {
            i8 = df3Var.f6710i - 1;
            df3Var.f6710i = i8;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.ze3
    final void b(df3 df3Var, Set set, Set set2) {
        synchronized (df3Var) {
            if (df3Var.f6709h == null) {
                df3Var.f6709h = set2;
            }
        }
    }
}
