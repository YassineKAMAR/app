package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class l00 extends jk implements n00 {
    l00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final void c(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        H0(1, parcelK0);
    }
}
