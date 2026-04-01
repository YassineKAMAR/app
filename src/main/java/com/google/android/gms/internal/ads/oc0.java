package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class oc0 extends kk implements pc0 {
    public oc0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            q();
        } else if (i8 == 2) {
            int i10 = parcel.readInt();
            lk.c(parcel);
            g(i10);
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
