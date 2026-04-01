package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class l43 extends jk implements n43 {
    l43(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.n43
    public final void F(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(7, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.n43
    public final void i(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(6, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.n43
    public final void n() {
        H0(3, k0());
    }

    @Override // com.google.android.gms.internal.ads.n43
    public final void n4(g3.a aVar, String str, String str2) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeString(str);
        parcelK0.writeString(null);
        H0(8, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.n43
    public final void q0(byte[] bArr) {
        Parcel parcelK0 = k0();
        parcelK0.writeByteArray(bArr);
        H0(5, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.n43
    public final void y0(int[] iArr) {
        Parcel parcelK0 = k0();
        parcelK0.writeIntArray(null);
        H0(4, parcelK0);
    }
}
