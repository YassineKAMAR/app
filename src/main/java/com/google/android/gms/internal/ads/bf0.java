package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class bf0 extends kk implements cf0 {
    public bf0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            parcel.readString();
            parcel.readString();
            lk.c(parcel);
        } else if (i8 == 2) {
            String string = parcel.readString();
            lk.c(parcel);
            c(string);
        } else {
            if (i8 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) lk.a(parcel, Bundle.CREATOR);
            lk.c(parcel);
            B1(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
