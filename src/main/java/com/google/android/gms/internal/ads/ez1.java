package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class ez1 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ qa0 f7552a;

    ez1(fz1 fz1Var, qa0 qa0Var) {
        this.f7552a = qa0Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        try {
            this.f7552a.r0(j2.d0.i(th));
        } catch (RemoteException e8) {
            j2.v1.l("Ad service can't call client", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f7552a.u0((ParcelFileDescriptor) obj);
        } catch (RemoteException e8) {
            j2.v1.l("Ad service can't call client", e8);
        }
    }
}
