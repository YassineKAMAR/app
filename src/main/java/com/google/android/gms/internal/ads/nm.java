package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class nm extends kk implements om {
    public nm() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        IInterface iInterfaceM;
        vm tmVar;
        switch (i8) {
            case 2:
                iInterfaceM = m();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceM);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof sm) {
                    }
                }
                lk.c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    tmVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    tmVar = iInterfaceQueryLocalInterface2 instanceof vm ? (vm) iInterfaceQueryLocalInterface2 : new tm(strongBinder2);
                }
                lk.c(parcel);
                Z2(aVarV0, tmVar);
                parcel2.writeNoException();
                return true;
            case 5:
                iInterfaceM = n();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceM);
                return true;
            case 6:
                boolean zG = lk.g(parcel);
                lk.c(parcel);
                w5(zG);
                parcel2.writeNoException();
                return true;
            case 7:
                h2.f2 f2VarO5 = h2.e2.O5(parcel.readStrongBinder());
                lk.c(parcel);
                w2(f2VarO5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
