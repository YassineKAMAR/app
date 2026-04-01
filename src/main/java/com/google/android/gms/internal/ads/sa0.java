package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class sa0 extends jk implements ua0 {
    sa0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void r0(j2.d0 d0Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, d0Var);
        H0(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void u0(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, parcelFileDescriptor);
        H0(1, parcelK0);
    }
}
