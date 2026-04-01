package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ca0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        ApplicationInfo applicationInfo = null;
        String strF = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList<String> arrayListH = null;
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    applicationInfo = (ApplicationInfo) b3.b.e(parcel, iR, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 3:
                    packageInfo = (PackageInfo) b3.b.e(parcel, iR, PackageInfo.CREATOR);
                    break;
                case 4:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 5:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 6:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case 7:
                    arrayListH = b3.b.h(parcel, iR);
                    break;
                case 8:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 9:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new ba0(applicationInfo, strF, packageInfo, strF2, iT, strF3, arrayListH, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new ba0[i8];
    }
}
