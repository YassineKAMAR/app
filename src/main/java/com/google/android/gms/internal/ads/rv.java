package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class rv extends jk implements tv {
    rv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final g3.a r() {
        Parcel parcelV0 = v0(4, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final boolean s() {
        Parcel parcelV0 = v0(10, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final boolean u() {
        Parcel parcelV0 = v0(8, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }
}
