package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ov extends kk implements pv {
    public ov() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static pv O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof pv ? (pv) iInterfaceQueryLocalInterface : new nv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 2) {
            String strQ = q();
            parcel2.writeNoException();
            parcel2.writeString(strQ);
            return true;
        }
        if (i8 != 3) {
            return false;
        }
        List listO = o();
        parcel2.writeNoException();
        parcel2.writeList(listO);
        return true;
    }
}
