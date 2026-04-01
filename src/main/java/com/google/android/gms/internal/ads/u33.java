package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class u33 extends jk {
    u33(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final void h5(m33 m33Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, m33Var);
        H0(2, parcelK0);
    }

    public final s33 q3(p33 p33Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, p33Var);
        Parcel parcelV0 = v0(1, parcelK0);
        s33 s33Var = (s33) lk.a(parcelV0, s33.CREATOR);
        parcelV0.recycle();
        return s33Var;
    }

    public final b43 y4(z33 z33Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z33Var);
        Parcel parcelV0 = v0(3, parcelK0);
        b43 b43Var = (b43) lk.a(parcelV0, b43.CREATOR);
        parcelV0.recycle();
        return b43Var;
    }
}
