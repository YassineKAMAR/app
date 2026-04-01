package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class yv extends jk implements aw {
    yv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void J4(tv tvVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, tvVar);
        H0(8, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void T1(g3.a aVar, int i8) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeInt(i8);
        H0(5, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void U0(String str, g3.a aVar) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        lk.f(parcelK0, aVar);
        H0(1, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final g3.a c(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        Parcel parcelV0 = v0(2, parcelK0);
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void i2(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(9, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void l() {
        H0(4, k0());
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void m0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(7, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void v3(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(6, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void z1(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(3, parcelK0);
    }
}
