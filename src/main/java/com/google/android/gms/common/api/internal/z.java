package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
final class z extends z2.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f4909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a0 f4910b;

    z(a0 a0Var, Dialog dialog) {
        this.f4910b = a0Var;
        this.f4909a = dialog;
    }

    @Override // z2.p
    public final void a() {
        this.f4910b.f4820b.o();
        if (this.f4909a.isShowing()) {
            this.f4909a.dismiss();
        }
    }
}
