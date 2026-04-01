package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class rw extends jk implements tw {
    rw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.tw
    public final void G1(kw kwVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, kwVar);
        H0(1, parcelK0);
    }
}
