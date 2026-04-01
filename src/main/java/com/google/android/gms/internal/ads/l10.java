package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class l10 extends kk implements m10 {
    public l10() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static m10 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof m10 ? (m10) iInterfaceQueryLocalInterface : new k10(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(f10.CREATOR);
        lk.c(parcel);
        v4(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
