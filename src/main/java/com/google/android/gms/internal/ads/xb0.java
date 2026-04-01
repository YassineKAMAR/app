package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        h2.r4 r4Var = null;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 2) {
                r4Var = (h2.r4) b3.b.e(parcel, iR, h2.r4.CREATOR);
            } else if (iL != 3) {
                b3.b.x(parcel, iR);
            } else {
                strF = b3.b.f(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new wb0(r4Var, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new wb0[i8];
    }
}
