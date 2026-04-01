package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class mk extends jk implements ok {
    mk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.ok
    public final void F(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(7, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ok
    public final void U4(g3.a aVar, String str) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeString("GMA_SDK");
        H0(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ok
    public final void i(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(0);
        H0(6, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ok
    public final void n() {
        H0(3, k0());
    }

    @Override // com.google.android.gms.internal.ads.ok
    public final void q0(byte[] bArr) {
        Parcel parcelK0 = k0();
        parcelK0.writeByteArray(bArr);
        H0(5, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ok
    public final void y0(int[] iArr) {
        Parcel parcelK0 = k0();
        parcelK0.writeIntArray(null);
        H0(4, parcelK0);
    }
}
