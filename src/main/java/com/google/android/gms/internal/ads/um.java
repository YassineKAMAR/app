package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class um extends kk implements vm {
    public um() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            n();
        } else if (i8 == 2) {
            l();
        } else if (i8 == 3) {
            h2.z2 z2Var = (h2.z2) lk.a(parcel, h2.z2.CREATOR);
            lk.c(parcel);
            F0(z2Var);
        } else if (i8 == 4) {
            m();
        } else {
            if (i8 != 5) {
                return false;
            }
            k();
        }
        parcel2.writeNoException();
        return true;
    }
}
