package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        long jU = 0;
        long jU2 = 0;
        long jU3 = 0;
        String strF = null;
        String strF2 = null;
        hb hbVar = null;
        String strF3 = null;
        d0 d0Var = null;
        d0 d0Var2 = null;
        d0 d0Var3 = null;
        boolean zM = false;
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
                    hbVar = (hb) b3.b.e(parcel, iR, hb.CREATOR);
                    break;
                case 5:
                    jU = b3.b.u(parcel, iR);
                    break;
                case 6:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 7:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case 8:
                    d0Var = (d0) b3.b.e(parcel, iR, d0.CREATOR);
                    break;
                case 9:
                    jU2 = b3.b.u(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    d0Var2 = (d0) b3.b.e(parcel, iR, d0.CREATOR);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    jU3 = b3.b.u(parcel, iR);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    d0Var3 = (d0) b3.b.e(parcel, iR, d0.CREATOR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new d(strF, strF2, hbVar, jU, zM, strF3, d0Var, jU2, d0Var2, jU3, d0Var3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i8) {
        return new d[i8];
    }
}
