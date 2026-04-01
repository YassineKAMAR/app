package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u00 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        byte[] bArrB = null;
        String[] strArrG = null;
        String[] strArrG2 = null;
        long jU = 0;
        boolean zM = false;
        int iT = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 2:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 3:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 4:
                    bArrB = b3.b.b(parcel, iR);
                    break;
                case 5:
                    strArrG = b3.b.g(parcel, iR);
                    break;
                case 6:
                    strArrG2 = b3.b.g(parcel, iR);
                    break;
                case 7:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case 8:
                    jU = b3.b.u(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new t00(zM, strF, iT, bArrB, strArrG, strArrG2, zM2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new t00[i8];
    }
}
