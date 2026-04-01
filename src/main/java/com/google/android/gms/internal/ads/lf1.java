package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class lf1 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f10660a;

    /* synthetic */ lf1(mf1 mf1Var, kf1 kf1Var) {
        this.f10660a = new WeakReference(mf1Var);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        mf1 mf1Var = (mf1) this.f10660a.get();
        if (mf1Var == null) {
            return;
        }
        mf1Var.f11257g.j();
    }
}
