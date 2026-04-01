package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i80 extends kk implements j80 {
    public i80() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static j80 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof j80 ? (j80) iInterfaceQueryLocalInterface : new h80(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            Intent intent = (Intent) lk.a(parcel, Intent.CREATOR);
            lk.c(parcel);
            I0(intent);
        } else if (i8 == 2) {
            g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            lk.c(parcel);
            l1(aVarV0, string, string2);
        } else if (i8 == 3) {
            o();
        } else if (i8 == 4) {
            g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
            lk.c(parcel);
            D0(aVarV02);
        } else {
            if (i8 != 5) {
                return false;
            }
            String[] strArrCreateStringArray = parcel.createStringArray();
            int[] iArrCreateIntArray = parcel.createIntArray();
            g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
            lk.c(parcel);
            K1(strArrCreateStringArray, iArrCreateIntArray, aVarV03);
        }
        parcel2.writeNoException();
        return true;
    }
}
