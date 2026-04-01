package com.google.android.gms.internal.ads;

import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class l60 extends kk implements m60 {
    public l60() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
            lk.c(parcel);
            D0(aVarV0);
        } else if (i8 == 2) {
            String string = parcel.readString();
            lk.c(parcel);
            b(string);
        } else if (i8 == 3) {
            h2.z2 z2Var = (h2.z2) lk.a(parcel, h2.z2.CREATOR);
            lk.c(parcel);
            a(z2Var);
        } else {
            if (i8 != 4) {
                return false;
            }
            j50 j50VarO5 = i50.O5(parcel.readStrongBinder());
            lk.c(parcel);
            d4(j50VarO5);
        }
        parcel2.writeNoException();
        return true;
    }
}
