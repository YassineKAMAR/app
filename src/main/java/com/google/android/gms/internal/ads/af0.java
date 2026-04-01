package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class af0 extends jk implements cf0 {
    af0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void B1(String str, String str2, Bundle bundle) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.d(parcelK0, bundle);
        H0(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void c(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        H0(2, parcelK0);
    }
}
