package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class qy1 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ua0 f13799a;

    qy1(uy1 uy1Var, ua0 ua0Var) {
        this.f13799a = ua0Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        try {
            this.f13799a.r0(j2.d0.i(th));
        } catch (RemoteException e8) {
            j2.v1.l("Service can't call client", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f13799a.u0((ParcelFileDescriptor) obj);
        } catch (RemoteException e8) {
            j2.v1.l("Service can't call client", e8);
        }
    }
}
