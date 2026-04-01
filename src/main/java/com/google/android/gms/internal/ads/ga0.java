package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ga0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        Bundle bundleA = null;
        byte[] bArrB = null;
        String strF2 = null;
        String strF3 = null;
        int iT = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 2:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 3:
                    bundleA = b3.b.a(parcel, iR);
                    break;
                case 4:
                    bArrB = b3.b.b(parcel, iR);
                    break;
                case 5:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 6:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 7:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new fa0(strF, iT, bundleA, bArrB, zM, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new fa0[i8];
    }
}
