package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class xu0 implements c51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qt2 f17467a;

    public xu0(qt2 qt2Var) {
        this.f17467a = qt2Var;
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void D(Context context) {
        try {
            this.f17467a.y();
        } catch (ys2 e8) {
            qg0.h("Cannot invoke onPause for the mediation adapter.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void b(Context context) {
        try {
            this.f17467a.z();
            if (context != null) {
                this.f17467a.x(context);
            }
        } catch (ys2 e8) {
            qg0.h("Cannot invoke onResume for the mediation adapter.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void q(Context context) {
        try {
            this.f17467a.l();
        } catch (ys2 e8) {
            qg0.h("Cannot invoke onDestroy for the mediation adapter.", e8);
        }
    }
}
