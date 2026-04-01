package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class xa0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            if (b3.b.l(iR) != 2) {
                b3.b.x(parcel, iR);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) b3.b.e(parcel, iR, ParcelFileDescriptor.CREATOR);
            }
        }
        b3.b.k(parcel, iY);
        return new wa0(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new wa0[i8];
    }
}
