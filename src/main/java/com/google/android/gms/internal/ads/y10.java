package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class y10 extends jk implements b20 {
    y10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.b20
    public final void a(h2.z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.b20
    public final void g(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.b20
    public final void z3(u10 u10Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, u10Var);
        H0(1, parcelK0);
    }
}
