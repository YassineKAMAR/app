package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class i50 extends kk implements j50 {
    public i50() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static j50 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof j50 ? (j50) iInterfaceQueryLocalInterface : new h50(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            g3.a aVarM = m();
            parcel2.writeNoException();
            lk.f(parcel2, aVarM);
        } else {
            if (i8 != 2) {
                return false;
            }
            boolean zN = n();
            parcel2.writeNoException();
            int i10 = lk.f10749b;
            parcel2.writeInt(zN ? 1 : 0);
        }
        return true;
    }
}
