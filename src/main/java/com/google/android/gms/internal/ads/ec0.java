package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ec0 extends kk implements fc0 {
    public ec0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static fc0 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return iInterfaceQueryLocalInterface instanceof fc0 ? (fc0) iInterfaceQueryLocalInterface : new dc0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String strN = n();
            parcel2.writeNoException();
            parcel2.writeString(strN);
        } else {
            if (i8 != 2) {
                return false;
            }
            int iM = m();
            parcel2.writeNoException();
            parcel2.writeInt(iM);
        }
        return true;
    }
}
