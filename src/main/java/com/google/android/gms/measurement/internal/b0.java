package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Parcelable.Creator<z> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            if (b3.b.l(iR) != 2) {
                b3.b.x(parcel, iR);
            } else {
                bundleA = b3.b.a(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new z(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z[] newArray(int i8) {
        return new z[i8];
    }
}
