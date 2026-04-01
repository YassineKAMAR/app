package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class nw extends jk implements pw {
    nw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final boolean a0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        Parcel parcelV0 = v0(17, parcelK0);
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final g3.a o() {
        Parcel parcelV0 = v0(9, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final String r() {
        Parcel parcelV0 = v0(4, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final boolean t0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        Parcel parcelV0 = v0(10, parcelK0);
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }
}
