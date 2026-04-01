package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class h80 extends jk implements j80 {
    h80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void D0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(4, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void I0(Intent intent) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, intent);
        H0(1, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void K1(String[] strArr, int[] iArr, g3.a aVar) {
        Parcel parcelK0 = k0();
        parcelK0.writeStringArray(strArr);
        parcelK0.writeIntArray(iArr);
        lk.f(parcelK0, aVar);
        H0(5, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void l1(g3.a aVar, String str, String str2) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        H0(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void o() {
        H0(3, k0());
    }
}
