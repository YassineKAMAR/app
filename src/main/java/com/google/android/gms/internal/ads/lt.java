package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class lt extends jk implements nt {
    lt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.nt
    public final void V0(kt ktVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, ktVar);
        H0(1, parcelK0);
    }
}
