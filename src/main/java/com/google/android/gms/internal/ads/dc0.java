package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class dc0 extends jk implements fc0 {
    dc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.fc0
    public final int m() {
        Parcel parcelV0 = v0(2, k0());
        int i8 = parcelV0.readInt();
        parcelV0.recycle();
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.fc0
    public final String n() {
        Parcel parcelV0 = v0(1, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }
}
