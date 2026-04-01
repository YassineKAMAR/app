package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class qa implements Parcelable.Creator<na> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ na createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        long jU = 0;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                strF = b3.b.f(parcel, iR);
            } else if (iL == 2) {
                jU = b3.b.u(parcel, iR);
            } else if (iL != 3) {
                b3.b.x(parcel, iR);
            } else {
                iT = b3.b.t(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new na(strF, jU, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ na[] newArray(int i8) {
        return new na[i8];
    }
}
