package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class r80 extends jk implements t80 {
    r80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final IBinder zze(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        Parcel parcelV0 = v0(1, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        parcelV0.recycle();
        return strongBinder;
    }
}
