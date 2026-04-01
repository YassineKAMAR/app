package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mb implements Parcelable.Creator<lb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lb createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = "";
        String strF2 = strF;
        String strF3 = strF2;
        long jU = 0;
        long jU2 = 0;
        long jU3 = 0;
        long jU4 = 0;
        long jU5 = 0;
        long jU6 = 0;
        long jU7 = 0;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        Boolean boolN = null;
        ArrayList<String> arrayListH = null;
        String strF11 = null;
        String strF12 = null;
        long jU8 = -2147483648L;
        boolean zM = true;
        boolean zM2 = false;
        int iT = 0;
        boolean zM3 = true;
        boolean zM4 = false;
        boolean zM5 = false;
        int iT2 = 100;
        int iT3 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 2:
                    strF4 = b3.b.f(parcel, iR);
                    break;
                case 3:
                    strF5 = b3.b.f(parcel, iR);
                    break;
                case 4:
                    strF6 = b3.b.f(parcel, iR);
                    break;
                case 5:
                    strF7 = b3.b.f(parcel, iR);
                    break;
                case 6:
                    jU = b3.b.u(parcel, iR);
                    break;
                case 7:
                    jU2 = b3.b.u(parcel, iR);
                    break;
                case 8:
                    strF8 = b3.b.f(parcel, iR);
                    break;
                case 9:
                    zM = b3.b.m(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    jU8 = b3.b.u(parcel, iR);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    strF9 = b3.b.f(parcel, iR);
                    break;
                case 13:
                    jU3 = b3.b.u(parcel, iR);
                    break;
                case 14:
                    jU4 = b3.b.u(parcel, iR);
                    break;
                case 15:
                    iT = b3.b.t(parcel, iR);
                    break;
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                    zM3 = b3.b.m(parcel, iR);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    b3.b.x(parcel, iR);
                    break;
                case 18:
                    zM4 = b3.b.m(parcel, iR);
                    break;
                case 19:
                    strF10 = b3.b.f(parcel, iR);
                    break;
                case 21:
                    boolN = b3.b.n(parcel, iR);
                    break;
                case 22:
                    jU5 = b3.b.u(parcel, iR);
                    break;
                case 23:
                    arrayListH = b3.b.h(parcel, iR);
                    break;
                case 24:
                    strF11 = b3.b.f(parcel, iR);
                    break;
                case 25:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 26:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 27:
                    strF12 = b3.b.f(parcel, iR);
                    break;
                case 28:
                    zM5 = b3.b.m(parcel, iR);
                    break;
                case 29:
                    jU6 = b3.b.u(parcel, iR);
                    break;
                case 30:
                    iT2 = b3.b.t(parcel, iR);
                    break;
                case 31:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case com.amazon.c.a.a.c.f4053h /* 32 */:
                    iT3 = b3.b.t(parcel, iR);
                    break;
                case 34:
                    jU7 = b3.b.u(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new lb(strF4, strF5, strF6, strF7, jU, jU2, strF8, zM, zM2, jU8, strF9, jU3, jU4, iT, zM3, zM4, strF10, boolN, jU5, arrayListH, strF11, strF, strF2, strF12, zM5, jU6, iT2, strF3, iT3, jU7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lb[] newArray(int i8) {
        return new lb[i8];
    }
}
