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
public final class z90 implements Parcelable.Creator {
    public static final y90 a(Parcel parcel) {
        int iY = b3.b.y(parcel);
        long jU = 0;
        long jU2 = 0;
        Bundle bundleA = null;
        h2.r4 r4Var = null;
        h2.w4 w4Var = null;
        String strF = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        wg0 wg0Var = null;
        Bundle bundleA2 = null;
        ArrayList<String> arrayListH = null;
        Bundle bundleA3 = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList<String> arrayListH2 = null;
        String strF7 = null;
        lv lvVar = null;
        ArrayList<String> arrayListH3 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        Bundle bundleA4 = null;
        String strF11 = null;
        h2.t2 t2Var = null;
        Bundle bundleA5 = null;
        String strF12 = null;
        String strF13 = null;
        String strF14 = null;
        ArrayList<Integer> arrayListD = null;
        String strF15 = null;
        ArrayList<String> arrayListH4 = null;
        ArrayList<String> arrayListH5 = null;
        String strF16 = null;
        r10 r10Var = null;
        String strF17 = null;
        Bundle bundleA6 = null;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        int iT4 = 0;
        float fP = 0.0f;
        float fP2 = 0.0f;
        boolean zM2 = false;
        int iT5 = 0;
        int iT6 = 0;
        boolean zM3 = false;
        boolean zM4 = false;
        int iT7 = 0;
        boolean zM5 = false;
        boolean zM6 = false;
        int iT8 = 0;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 2:
                    bundleA = b3.b.a(parcel, iR);
                    break;
                case 3:
                    r4Var = (h2.r4) b3.b.e(parcel, iR, h2.r4.CREATOR);
                    break;
                case 4:
                    w4Var = (h2.w4) b3.b.e(parcel, iR, h2.w4.CREATOR);
                    break;
                case 5:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) b3.b.e(parcel, iR, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) b3.b.e(parcel, iR, PackageInfo.CREATOR);
                    break;
                case 8:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 9:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    strF4 = b3.b.f(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    wg0Var = (wg0) b3.b.e(parcel, iR, wg0.CREATOR);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    bundleA2 = b3.b.a(parcel, iR);
                    break;
                case 13:
                    iT2 = b3.b.t(parcel, iR);
                    break;
                case 14:
                    arrayListH = b3.b.h(parcel, iR);
                    break;
                case 15:
                    bundleA3 = b3.b.a(parcel, iR);
                    break;
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case com.amazon.c.a.a.c.f4053h /* 32 */:
                case 38:
                case 62:
                default:
                    b3.b.x(parcel, iR);
                    break;
                case 18:
                    iT3 = b3.b.t(parcel, iR);
                    break;
                case 19:
                    iT4 = b3.b.t(parcel, iR);
                    break;
                case 20:
                    fP = b3.b.p(parcel, iR);
                    break;
                case 21:
                    strF5 = b3.b.f(parcel, iR);
                    break;
                case 25:
                    jU = b3.b.u(parcel, iR);
                    break;
                case 26:
                    strF6 = b3.b.f(parcel, iR);
                    break;
                case 27:
                    arrayListH2 = b3.b.h(parcel, iR);
                    break;
                case 28:
                    strF7 = b3.b.f(parcel, iR);
                    break;
                case 29:
                    lvVar = (lv) b3.b.e(parcel, iR, lv.CREATOR);
                    break;
                case 30:
                    arrayListH3 = b3.b.h(parcel, iR);
                    break;
                case 31:
                    jU2 = b3.b.u(parcel, iR);
                    break;
                case 33:
                    strF8 = b3.b.f(parcel, iR);
                    break;
                case 34:
                    fP2 = b3.b.p(parcel, iR);
                    break;
                case 35:
                    iT5 = b3.b.t(parcel, iR);
                    break;
                case 36:
                    iT6 = b3.b.t(parcel, iR);
                    break;
                case 37:
                    zM3 = b3.b.m(parcel, iR);
                    break;
                case 39:
                    strF9 = b3.b.f(parcel, iR);
                    break;
                case 40:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case 41:
                    strF10 = b3.b.f(parcel, iR);
                    break;
                case 42:
                    zM4 = b3.b.m(parcel, iR);
                    break;
                case 43:
                    iT7 = b3.b.t(parcel, iR);
                    break;
                case 44:
                    bundleA4 = b3.b.a(parcel, iR);
                    break;
                case 45:
                    strF11 = b3.b.f(parcel, iR);
                    break;
                case 46:
                    t2Var = (h2.t2) b3.b.e(parcel, iR, h2.t2.CREATOR);
                    break;
                case 47:
                    zM5 = b3.b.m(parcel, iR);
                    break;
                case 48:
                    bundleA5 = b3.b.a(parcel, iR);
                    break;
                case 49:
                    strF12 = b3.b.f(parcel, iR);
                    break;
                case 50:
                    strF13 = b3.b.f(parcel, iR);
                    break;
                case 51:
                    strF14 = b3.b.f(parcel, iR);
                    break;
                case 52:
                    zM6 = b3.b.m(parcel, iR);
                    break;
                case 53:
                    arrayListD = b3.b.d(parcel, iR);
                    break;
                case 54:
                    strF15 = b3.b.f(parcel, iR);
                    break;
                case 55:
                    arrayListH4 = b3.b.h(parcel, iR);
                    break;
                case 56:
                    iT8 = b3.b.t(parcel, iR);
                    break;
                case 57:
                    zM7 = b3.b.m(parcel, iR);
                    break;
                case 58:
                    zM8 = b3.b.m(parcel, iR);
                    break;
                case 59:
                    zM9 = b3.b.m(parcel, iR);
                    break;
                case 60:
                    arrayListH5 = b3.b.h(parcel, iR);
                    break;
                case 61:
                    strF16 = b3.b.f(parcel, iR);
                    break;
                case 63:
                    r10Var = (r10) b3.b.e(parcel, iR, r10.CREATOR);
                    break;
                case 64:
                    strF17 = b3.b.f(parcel, iR);
                    break;
                case 65:
                    bundleA6 = b3.b.a(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new y90(iT, bundleA, r4Var, w4Var, strF, applicationInfo, packageInfo, strF2, strF3, strF4, wg0Var, bundleA2, iT2, arrayListH, bundleA3, zM, iT3, iT4, fP, strF5, jU, strF6, arrayListH2, strF7, lvVar, arrayListH3, jU2, strF8, fP2, zM2, iT5, iT6, zM3, strF9, strF10, zM4, iT7, bundleA4, strF11, t2Var, zM5, bundleA5, strF12, strF13, strF14, zM6, arrayListD, strF15, arrayListH4, iT8, zM7, zM8, zM9, arrayListH5, strF16, r10Var, strF17, bundleA6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new y90[i8];
    }
}
