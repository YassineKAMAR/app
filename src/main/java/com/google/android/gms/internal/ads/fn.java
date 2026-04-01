package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class fn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        long jU = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) b3.b.e(parcel, iR, ParcelFileDescriptor.CREATOR);
            } else if (iL == 3) {
                zM = b3.b.m(parcel, iR);
            } else if (iL == 4) {
                zM2 = b3.b.m(parcel, iR);
            } else if (iL == 5) {
                jU = b3.b.u(parcel, iR);
            } else if (iL != 6) {
                b3.b.x(parcel, iR);
            } else {
                zM3 = b3.b.m(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new en(parcelFileDescriptor, zM, zM2, jU, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new en[i8];
    }
}
