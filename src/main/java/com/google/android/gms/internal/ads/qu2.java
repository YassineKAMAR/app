package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class qu2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = 0;
        int iT6 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 2:
                    iT2 = b3.b.t(parcel, iR);
                    break;
                case 3:
                    iT3 = b3.b.t(parcel, iR);
                    break;
                case 4:
                    iT4 = b3.b.t(parcel, iR);
                    break;
                case 5:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 6:
                    iT5 = b3.b.t(parcel, iR);
                    break;
                case 7:
                    iT6 = b3.b.t(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new pu2(iT, iT2, iT3, iT4, strF, iT5, iT6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new pu2[i8];
    }
}
