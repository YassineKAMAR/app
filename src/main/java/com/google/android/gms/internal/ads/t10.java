package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class t10 extends kk implements u10 {
    public t10() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        IInterface iInterfaceK;
        x10 v10Var;
        if (i8 != 3) {
            if (i8 == 4) {
                p();
            } else if (i8 == 5) {
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    v10Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    v10Var = iInterfaceQueryLocalInterface instanceof x10 ? (x10) iInterfaceQueryLocalInterface : new v10(strongBinder);
                }
                lk.c(parcel);
                Q4(aVarV0, v10Var);
            } else if (i8 == 6) {
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                zze(aVarV02);
            } else {
                if (i8 != 7) {
                    return false;
                }
                iInterfaceK = l();
            }
            parcel2.writeNoException();
            return true;
        }
        iInterfaceK = k();
        parcel2.writeNoException();
        lk.f(parcel2, iInterfaceK);
        return true;
    }
}
