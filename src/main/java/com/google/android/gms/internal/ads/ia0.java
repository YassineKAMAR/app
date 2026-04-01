package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ia0 extends kk implements ja0 {
    public ia0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        ua0 sa0Var = null;
        if (i8 != 1) {
            if (i8 == 2) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof ka0) {
                    }
                }
                lk.c(parcel);
            } else if (i8 == 4) {
                ya0 ya0Var = (ya0) lk.a(parcel, ya0.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    sa0Var = iInterfaceQueryLocalInterface2 instanceof ua0 ? (ua0) iInterfaceQueryLocalInterface2 : new sa0(strongBinder2);
                }
                lk.c(parcel);
                N4(ya0Var, sa0Var);
            } else if (i8 == 5) {
                ya0 ya0Var2 = (ya0) lk.a(parcel, ya0.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    sa0Var = iInterfaceQueryLocalInterface3 instanceof ua0 ? (ua0) iInterfaceQueryLocalInterface3 : new sa0(strongBinder3);
                }
                lk.c(parcel);
                m5(ya0Var2, sa0Var);
            } else if (i8 == 6) {
                ya0 ya0Var3 = (ya0) lk.a(parcel, ya0.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    sa0Var = iInterfaceQueryLocalInterface4 instanceof ua0 ? (ua0) iInterfaceQueryLocalInterface4 : new sa0(strongBinder4);
                }
                lk.c(parcel);
                M3(ya0Var3, sa0Var);
            } else {
                if (i8 != 7) {
                    return false;
                }
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    sa0Var = iInterfaceQueryLocalInterface5 instanceof ua0 ? (ua0) iInterfaceQueryLocalInterface5 : new sa0(strongBinder5);
                }
                lk.c(parcel);
                u3(string, sa0Var);
            }
            parcel2.writeNoException();
        } else {
            lk.c(parcel);
            parcel2.writeNoException();
            lk.e(parcel2, null);
        }
        return true;
    }
}
