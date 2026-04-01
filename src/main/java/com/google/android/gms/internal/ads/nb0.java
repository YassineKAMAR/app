package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class nb0 extends kk implements ob0 {
    public nb0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String strL = l();
            parcel2.writeNoException();
            parcel2.writeString(strL);
        } else {
            if (i8 != 2) {
                return false;
            }
            int iK = k();
            parcel2.writeNoException();
            parcel2.writeInt(iK);
        }
        return true;
    }
}
