package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class pn1 implements c51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fm0 f12951a;

    pn1(fm0 fm0Var) {
        this.f12951a = fm0Var;
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void D(Context context) {
        fm0 fm0Var = this.f12951a;
        if (fm0Var != null) {
            fm0Var.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void b(Context context) {
        fm0 fm0Var = this.f12951a;
        if (fm0Var != null) {
            fm0Var.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void q(Context context) {
        fm0 fm0Var = this.f12951a;
        if (fm0Var != null) {
            fm0Var.destroy();
        }
    }
}
