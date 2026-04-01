package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class za0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        Bundle bundleA = null;
        wg0 wg0Var = null;
        ApplicationInfo applicationInfo = null;
        String strF = null;
        ArrayList<String> arrayListH = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        pu2 pu2Var = null;
        String strF4 = null;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    bundleA = b3.b.a(parcel, iR);
                    break;
                case 2:
                    wg0Var = (wg0) b3.b.e(parcel, iR, wg0.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) b3.b.e(parcel, iR, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 5:
                    arrayListH = b3.b.h(parcel, iR);
                    break;
                case 6:
                    packageInfo = (PackageInfo) b3.b.e(parcel, iR, PackageInfo.CREATOR);
                    break;
                case 7:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 8:
                default:
                    b3.b.x(parcel, iR);
                    break;
                case 9:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    pu2Var = (pu2) b3.b.e(parcel, iR, pu2.CREATOR);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    strF4 = b3.b.f(parcel, iR);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 13:
                    zM2 = b3.b.m(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new ya0(bundleA, wg0Var, applicationInfo, strF, arrayListH, packageInfo, strF2, strF3, pu2Var, strF4, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new ya0[i8];
    }
}
