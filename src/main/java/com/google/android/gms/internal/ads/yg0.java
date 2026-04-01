package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class yg0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 2) {
                strF = b3.b.f(parcel, iR);
            } else if (iL == 3) {
                iT = b3.b.t(parcel, iR);
            } else if (iL == 4) {
                iT2 = b3.b.t(parcel, iR);
            } else if (iL == 5) {
                zM = b3.b.m(parcel, iR);
            } else if (iL != 6) {
                b3.b.x(parcel, iR);
            } else {
                zM2 = b3.b.m(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new wg0(strF, iT, iT2, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new wg0[i8];
    }
}
