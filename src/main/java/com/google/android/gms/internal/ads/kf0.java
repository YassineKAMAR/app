package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class kf0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        String strF2 = null;
        h2.w4 w4Var = null;
        h2.r4 r4Var = null;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                strF = b3.b.f(parcel, iR);
            } else if (iL == 2) {
                strF2 = b3.b.f(parcel, iR);
            } else if (iL == 3) {
                w4Var = (h2.w4) b3.b.e(parcel, iR, h2.w4.CREATOR);
            } else if (iL != 4) {
                b3.b.x(parcel, iR);
            } else {
                r4Var = (h2.r4) b3.b.e(parcel, iR, h2.r4.CREATOR);
            }
        }
        b3.b.k(parcel, iY);
        return new jf0(strF, strF2, w4Var, r4Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new jf0[i8];
    }
}
