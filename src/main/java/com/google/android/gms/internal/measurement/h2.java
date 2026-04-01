package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements Parcelable.Creator<e2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e2 createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        long jU = 0;
        long jU2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleA = null;
        String strF4 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    jU = b3.b.u(parcel, iR);
                    break;
                case 2:
                    jU2 = b3.b.u(parcel, iR);
                    break;
                case 3:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 4:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 5:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 6:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case 7:
                    bundleA = b3.b.a(parcel, iR);
                    break;
                case 8:
                    strF4 = b3.b.f(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new e2(jU, jU2, zM, strF, strF2, strF3, bundleA, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e2[] newArray(int i8) {
        return new e2[i8];
    }
}
