package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class xd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ta4 f17191a;

    @Deprecated
    public xd4(Context context, ol0 ol0Var) {
        this.f17191a = new ta4(context, ol0Var);
    }

    @Deprecated
    public final xd4 a(final oc4 oc4Var) {
        ta4 ta4Var = this.f17191a;
        uu1.f(!ta4Var.f15040q);
        oc4Var.getClass();
        ta4Var.f15029f = new c93() { // from class: com.google.android.gms.internal.ads.la4
            @Override // com.google.android.gms.internal.ads.c93
            public final Object j() {
                return oc4Var;
            }
        };
        return this;
    }

    @Deprecated
    public final xd4 b(final oq4 oq4Var) {
        ta4 ta4Var = this.f17191a;
        uu1.f(!ta4Var.f15040q);
        oq4Var.getClass();
        ta4Var.f15028e = new c93() { // from class: com.google.android.gms.internal.ads.sa4
            @Override // com.google.android.gms.internal.ads.c93
            public final Object j() {
                return oq4Var;
            }
        };
        return this;
    }

    @Deprecated
    public final yd4 c() {
        ta4 ta4Var = this.f17191a;
        uu1.f(!ta4Var.f15040q);
        ta4Var.f15040q = true;
        return new yd4(ta4Var);
    }
}
