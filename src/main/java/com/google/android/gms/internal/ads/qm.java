package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class qm extends kk implements rm {
    public qm() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static rm O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof rm ? (rm) iInterfaceQueryLocalInterface : new pm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        om mmVar;
        if (i8 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                mmVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                mmVar = iInterfaceQueryLocalInterface instanceof om ? (om) iInterfaceQueryLocalInterface : new mm(strongBinder);
            }
            lk.c(parcel);
            g3(mmVar);
        } else if (i8 == 2) {
            parcel.readInt();
            lk.c(parcel);
        } else {
            if (i8 != 3) {
                return false;
            }
            h2.z2 z2Var = (h2.z2) lk.a(parcel, h2.z2.CREATOR);
            lk.c(parcel);
            R4(z2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
