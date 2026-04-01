package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class pb0 extends jk {
    pb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void q3(ob0 ob0Var, String str, String str2) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, ob0Var);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        H0(2, parcelK0);
    }
}
