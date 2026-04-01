package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ld0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        String strF2 = null;
        ArrayList<String> arrayListH = null;
        ArrayList<String> arrayListH2 = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 2:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 3:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 4:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 5:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case 6:
                    arrayListH = b3.b.h(parcel, iR);
                    break;
                case 7:
                    zM3 = b3.b.m(parcel, iR);
                    break;
                case 8:
                    zM4 = b3.b.m(parcel, iR);
                    break;
                case 9:
                    arrayListH2 = b3.b.h(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new kd0(strF, strF2, zM, zM2, arrayListH, zM3, zM4, arrayListH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new kd0[i8];
    }
}
