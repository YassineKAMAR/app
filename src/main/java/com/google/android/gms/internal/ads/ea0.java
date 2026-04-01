package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ea0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        ArrayList<String> arrayListH = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 2) {
                zM = b3.b.m(parcel, iR);
            } else if (iL != 3) {
                b3.b.x(parcel, iR);
            } else {
                arrayListH = b3.b.h(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new da0(zM, arrayListH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new da0[i8];
    }
}
