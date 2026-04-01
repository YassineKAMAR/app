package com.google.android.gms.internal.ads;

import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ew extends kk implements fw {
    public ew() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
            lk.c(parcel);
            o2(aVarV0);
        } else if (i8 == 2) {
            p();
        } else {
            if (i8 != 3) {
                return false;
            }
            g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
            lk.c(parcel);
            o0(aVarV02);
        }
        parcel2.writeNoException();
        return true;
    }
}
