package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class lw2 {
    public static final sw2 a(Callable callable, Object obj, tw2 tw2Var) {
        return b(callable, tw2Var.f15356a, obj, tw2Var);
    }

    public static final sw2 b(Callable callable, lg3 lg3Var, Object obj, tw2 tw2Var) {
        return new sw2(tw2Var, obj, tw2.f15355d, Collections.emptyList(), lg3Var.Z(callable));
    }

    public static final sw2 c(x3.d dVar, Object obj, tw2 tw2Var) {
        return new sw2(tw2Var, obj, tw2.f15355d, Collections.emptyList(), dVar);
    }

    public static final sw2 d(final ew2 ew2Var, lg3 lg3Var, Object obj, tw2 tw2Var) {
        return b(new Callable() { // from class: com.google.android.gms.internal.ads.kw2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ew2Var.j();
                return null;
            }
        }, lg3Var, obj, tw2Var);
    }
}
