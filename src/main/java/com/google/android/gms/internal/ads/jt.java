package com.google.android.gms.internal.ads;

import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class jt extends kk implements kt {
    public jt() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        String strK;
        if (i8 == 1) {
            strK = k();
        } else {
            if (i8 != 2) {
                if (i8 == 3) {
                    g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                    lk.c(parcel);
                    m0(aVarV0);
                } else if (i8 == 4) {
                    m();
                } else {
                    if (i8 != 5) {
                        return false;
                    }
                    n();
                }
                parcel2.writeNoException();
                return true;
            }
            strK = l();
        }
        parcel2.writeNoException();
        parcel2.writeString(strK);
        return true;
    }
}
