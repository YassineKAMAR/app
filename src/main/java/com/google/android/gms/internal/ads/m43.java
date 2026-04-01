package com.google.android.gms.internal.ads;

import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m43 extends kk implements n43 {
    public m43() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 2:
                a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                parcel.readString();
                lk.c(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                lk.c(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                lk.c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
            case 7:
                parcel.readInt();
                lk.c(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                lk.c(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
