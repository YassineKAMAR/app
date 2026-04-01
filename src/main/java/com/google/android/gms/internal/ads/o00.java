package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00 extends kk implements p00 {
    public o00() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String string = parcel.readString();
            lk.c(parcel);
            O(string);
        } else {
            if (i8 != 2) {
                return false;
            }
            m();
        }
        parcel2.writeNoException();
        return true;
    }
}
