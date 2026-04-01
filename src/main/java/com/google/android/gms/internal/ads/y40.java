package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class y40 extends kk implements z40 {
    public y40() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static z40 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof z40 ? (z40) iInterfaceQueryLocalInterface : new x40(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        IInterface iInterfaceC;
        int iB;
        if (i8 != 1) {
            if (i8 == 2) {
                String string = parcel.readString();
                lk.c(parcel);
                iB = b(string);
            } else if (i8 == 3) {
                String string2 = parcel.readString();
                lk.c(parcel);
                iInterfaceC = e(string2);
            } else {
                if (i8 != 4) {
                    return false;
                }
                String string3 = parcel.readString();
                lk.c(parcel);
                iB = h(string3);
            }
            parcel2.writeNoException();
            parcel2.writeInt(iB);
            return true;
        }
        String string4 = parcel.readString();
        lk.c(parcel);
        iInterfaceC = c(string4);
        parcel2.writeNoException();
        lk.f(parcel2, iInterfaceC);
        return true;
    }
}
