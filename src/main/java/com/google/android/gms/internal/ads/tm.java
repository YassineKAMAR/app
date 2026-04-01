package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class tm extends jk implements vm {
    tm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void F0(h2.z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void k() {
        H0(5, k0());
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void l() {
        H0(2, k0());
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void m() {
        H0(4, k0());
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final void n() {
        H0(1, k0());
    }
}
