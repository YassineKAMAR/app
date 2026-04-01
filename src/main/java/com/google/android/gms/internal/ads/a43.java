package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a43 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        String strF2 = null;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT = b3.b.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = b3.b.t(parcel, iR);
            } else if (iL == 3) {
                strF = b3.b.f(parcel, iR);
            } else if (iL == 4) {
                strF2 = b3.b.f(parcel, iR);
            } else if (iL != 5) {
                b3.b.x(parcel, iR);
            } else {
                iT3 = b3.b.t(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new z33(iT, iT2, iT3, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new z33[i8];
    }
}
