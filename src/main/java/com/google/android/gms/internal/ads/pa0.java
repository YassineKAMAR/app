package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class pa0 extends kk implements qa0 {
    public pa0() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) lk.a(parcel, ParcelFileDescriptor.CREATOR);
            lk.c(parcel);
            u0(parcelFileDescriptor);
        } else {
            if (i8 != 2) {
                return false;
            }
            j2.d0 d0Var = (j2.d0) lk.a(parcel, j2.d0.CREATOR);
            lk.c(parcel);
            r0(d0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
