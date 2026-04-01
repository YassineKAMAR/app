package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class gb implements Parcelable.Creator<hb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hb createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        Long lV = null;
        Float fQ = null;
        String strF2 = null;
        String strF3 = null;
        Double dO = null;
        long jU = 0;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 2:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 3:
                    jU = b3.b.u(parcel, iR);
                    break;
                case 4:
                    lV = b3.b.v(parcel, iR);
                    break;
                case 5:
                    fQ = b3.b.q(parcel, iR);
                    break;
                case 6:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 7:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case 8:
                    dO = b3.b.o(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new hb(iT, strF, jU, lV, fQ, strF2, strF3, dO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hb[] newArray(int i8) {
        return new hb[i8];
    }
}
