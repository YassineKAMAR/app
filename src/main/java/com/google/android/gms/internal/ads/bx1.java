package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class bx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f6060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f6061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wx1 f6062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c84 f6063d;

    bx1(lg3 lg3Var, lg3 lg3Var2, wx1 wx1Var, c84 c84Var) {
        this.f6060a = lg3Var;
        this.f6061b = lg3Var2;
        this.f6062c = wx1Var;
        this.f6063d = c84Var;
    }

    final /* synthetic */ x3.d a(fa0 fa0Var) {
        return this.f6062c.c(fa0Var, ((Long) h2.y.c().b(ns.Ba)).longValue());
    }

    final /* synthetic */ x3.d b(fa0 fa0Var, int i8, kw1 kw1Var) {
        return ((fz1) this.f6063d.k()).O5(fa0Var, i8);
    }

    public final x3.d c(final fa0 fa0Var) {
        x3.d dVarF;
        String str = fa0Var.f7687f;
        g2.t.r();
        if (j2.k2.b(str)) {
            dVarF = zf3.g(new kw1(1, "Ads service proxy force local"));
        } else {
            dVarF = zf3.f(zf3.k(new ef3() { // from class: com.google.android.gms.internal.ads.yw1
                @Override // com.google.android.gms.internal.ads.ef3
                public final x3.d j() {
                    return this.f17935a.a(fa0Var);
                }
            }, this.f6060a), ExecutionException.class, new gf3() { // from class: com.google.android.gms.internal.ads.zw1
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return zf3.g(cause);
                }
            }, this.f6061b);
        }
        final int callingUid = Binder.getCallingUid();
        return zf3.f(dVarF, kw1.class, new gf3() { // from class: com.google.android.gms.internal.ads.ax1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f5517a.b(fa0Var, callingUid, (kw1) obj);
            }
        }, this.f6061b);
    }
}
