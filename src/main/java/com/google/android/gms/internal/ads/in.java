package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final class in implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        long jU = 0;
        long jU2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Bundle bundleA = null;
        String strF5 = null;
        boolean zM = false;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 2:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 3:
                    jU = b3.b.u(parcel, iR);
                    break;
                case 4:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 5:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case 6:
                    strF4 = b3.b.f(parcel, iR);
                    break;
                case 7:
                    bundleA = b3.b.a(parcel, iR);
                    break;
                case 8:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 9:
                    jU2 = b3.b.u(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    strF5 = b3.b.f(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    iT = b3.b.t(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new hn(strF, jU, strF2, strF3, strF4, bundleA, zM, jU2, strF5, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new hn[i8];
    }
}
