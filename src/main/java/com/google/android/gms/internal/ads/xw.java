package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class xw extends jk implements zw {
    xw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zw
    public final void G2(pw pwVar, String str) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, pwVar);
        parcelK0.writeString(str);
        H0(1, parcelK0);
    }
}
