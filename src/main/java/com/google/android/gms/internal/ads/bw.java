package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class bw extends jk implements dw {
    bw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final IBinder b3(g3.a aVar, g3.a aVar2, g3.a aVar3, int i8) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, aVar2);
        lk.f(parcelK0, aVar3);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(1, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        parcelV0.recycle();
        return strongBinder;
    }
}
