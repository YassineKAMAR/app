package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class u60 extends kk implements v60 {
    public u60() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 2) {
            q();
        } else if (i8 == 3) {
            String string = parcel.readString();
            lk.c(parcel);
            b(string);
        } else {
            if (i8 != 4) {
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
