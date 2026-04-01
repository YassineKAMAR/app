package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class r60 extends kk implements s60 {
    public r60() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            p50 p50VarO5 = o50.O5(parcel.readStrongBinder());
            lk.c(parcel);
            T0(p50VarO5);
        } else if (i8 == 2) {
            String string = parcel.readString();
            lk.c(parcel);
            b(string);
        } else {
            if (i8 != 3) {
                return false;
            }
            h2.z2 z2Var = (h2.z2) lk.a(parcel, h2.z2.CREATOR);
            lk.c(parcel);
            a(z2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
