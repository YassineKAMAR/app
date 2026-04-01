package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        PendingIntent pendingIntent = null;
        x2.b bVar = null;
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT2 = b3.b.t(parcel, iR);
            } else if (iL == 2) {
                strF = b3.b.f(parcel, iR);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) b3.b.e(parcel, iR, PendingIntent.CREATOR);
            } else if (iL == 4) {
                bVar = (x2.b) b3.b.e(parcel, iR, x2.b.CREATOR);
            } else if (iL != 1000) {
                b3.b.x(parcel, iR);
            } else {
                iT = b3.b.t(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new Status(iT, iT2, strF, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Status[i8];
    }
}
