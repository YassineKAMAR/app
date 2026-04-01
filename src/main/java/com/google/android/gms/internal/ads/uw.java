package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class uw extends jk implements ww {
    uw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.ww
    public final void J5(mw mwVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, mwVar);
        H0(1, parcelK0);
    }
}
