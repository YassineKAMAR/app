package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class h50 extends jk implements j50 {
    h50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final g3.a m() {
        Parcel parcelV0 = v0(1, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final boolean n() {
        Parcel parcelV0 = v0(2, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }
}
