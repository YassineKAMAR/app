package com.google.android.gms.internal.ads;

import a3.c;
import android.os.Bundle;
import android.os.DeadObjectException;

/* JADX INFO: loaded from: classes.dex */
final class c10 implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jh0 f6100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e10 f6101b;

    c10(e10 e10Var, jh0 jh0Var) {
        this.f6101b = e10Var;
        this.f6100a = jh0Var;
    }

    @Override // a3.c.a
    public final void H0(Bundle bundle) {
        try {
            this.f6100a.d(this.f6101b.f7089a.j0());
        } catch (DeadObjectException e8) {
            this.f6100a.e(e8);
        }
    }

    @Override // a3.c.a
    public final void v0(int i8) {
        this.f6100a.e(new RuntimeException("onConnectionSuspended: " + i8));
    }
}
