package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ma0 extends kk implements na0 {
    public ma0() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        qa0 oa0Var = null;
        if (i8 == 1) {
            ba0 ba0Var = (ba0) lk.a(parcel, ba0.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                oa0Var = iInterfaceQueryLocalInterface instanceof qa0 ? (qa0) iInterfaceQueryLocalInterface : new oa0(strongBinder);
            }
            lk.c(parcel);
            t3(ba0Var, oa0Var);
        } else if (i8 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof qa0) {
                }
            }
            lk.c(parcel);
        } else {
            if (i8 != 3) {
                return false;
            }
            fa0 fa0Var = (fa0) lk.a(parcel, fa0.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                oa0Var = iInterfaceQueryLocalInterface3 instanceof qa0 ? (qa0) iInterfaceQueryLocalInterface3 : new oa0(strongBinder3);
            }
            lk.c(parcel);
            H1(fa0Var, oa0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
