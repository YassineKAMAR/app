package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class o80 extends jk implements q80 {
    o80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void A() {
        H0(14, k0());
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void A2(int i8, String[] strArr, int[] iArr) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        parcelK0.writeStringArray(strArr);
        parcelK0.writeIntArray(iArr);
        H0(15, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void B() {
        H0(4, k0());
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void C3(Bundle bundle) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, bundle);
        H0(1, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void D() {
        H0(9, k0());
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void E() {
        H0(7, k0());
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void G() {
        H0(3, k0());
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void X1(int i8, int i9, Intent intent) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        parcelK0.writeInt(i9);
        lk.d(parcelK0, intent);
        H0(12, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final boolean h0() {
        Parcel parcelV0 = v0(11, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void p0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(13, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void r() {
        H0(10, k0());
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void w() {
        H0(5, k0());
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void x() {
        H0(8, k0());
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void x0(Bundle bundle) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, bundle);
        Parcel parcelV0 = v0(6, parcelK0);
        if (parcelV0.readInt() != 0) {
            bundle.readFromParcel(parcelV0);
        }
        parcelV0.recycle();
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void z() {
        H0(2, k0());
    }
}
