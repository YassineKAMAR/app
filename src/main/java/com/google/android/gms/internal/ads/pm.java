package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class pm extends jk implements rm {
    pm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.rm
    public final void R4(h2.z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.rm
    public final void d(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.rm
    public final void g3(om omVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, omVar);
        H0(1, parcelK0);
    }
}
