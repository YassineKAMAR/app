package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class dg2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vr2 f6721a;

    public dg2(vr2 vr2Var) {
        this.f6721a = vr2Var;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        vr2 vr2Var = this.f6721a;
        Bundle bundle = (Bundle) obj;
        if (vr2Var != null) {
            bundle.putBoolean("render_in_browser", vr2Var.d());
            bundle.putBoolean("disable_ml", this.f6721a.c());
        }
    }
}
