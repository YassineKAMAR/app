package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class lx extends jk implements nx {
    lx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final boolean o0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        Parcel parcelV0 = v0(2, parcelK0);
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }
}
