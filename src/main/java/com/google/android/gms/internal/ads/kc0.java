package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class kc0 extends kk implements lc0 {
    public kc0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        fc0 dc0Var;
        switch (i8) {
            case 1:
                t();
                break;
            case 2:
                q();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    dc0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    dc0Var = iInterfaceQueryLocalInterface instanceof fc0 ? (fc0) iInterfaceQueryLocalInterface : new dc0(strongBinder);
                }
                lk.c(parcel);
                I1(dc0Var);
                break;
            case 4:
                int i10 = parcel.readInt();
                lk.c(parcel);
                S(i10);
                break;
            case 5:
                h2.z2 z2Var = (h2.z2) lk.a(parcel, h2.z2.CREATOR);
                lk.c(parcel);
                w3(z2Var);
                break;
            case 6:
                n();
                break;
            case 7:
                m();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
