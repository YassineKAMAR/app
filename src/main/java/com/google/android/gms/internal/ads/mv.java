package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final class mv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        h2.k4 k4Var = null;
        int iT = 0;
        boolean zM = false;
        int iT2 = 0;
        boolean zM2 = false;
        int iT3 = 0;
        boolean zM3 = false;
        int iT4 = 0;
        int iT5 = 0;
        boolean zM4 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 2:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 3:
                    iT2 = b3.b.t(parcel, iR);
                    break;
                case 4:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case 5:
                    iT3 = b3.b.t(parcel, iR);
                    break;
                case 6:
                    k4Var = (h2.k4) b3.b.e(parcel, iR, h2.k4.CREATOR);
                    break;
                case 7:
                    zM3 = b3.b.m(parcel, iR);
                    break;
                case 8:
                    iT4 = b3.b.t(parcel, iR);
                    break;
                case 9:
                    iT5 = b3.b.t(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    zM4 = b3.b.m(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new lv(iT, zM, iT2, zM2, iT3, k4Var, zM3, iT4, iT5, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new lv[i8];
    }
}
