package h2;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        Bundle bundleA = null;
        ArrayList<String> arrayListH = null;
        String strF = null;
        h4 h4Var = null;
        Location location = null;
        String strF2 = null;
        Bundle bundleA2 = null;
        Bundle bundleA3 = null;
        ArrayList<String> arrayListH2 = null;
        String strF3 = null;
        String strF4 = null;
        y0 y0Var = null;
        String strF5 = null;
        ArrayList<String> arrayListH3 = null;
        String strF6 = null;
        long jU = 0;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        int iT4 = 0;
        int iT5 = 0;
        int iT6 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 2:
                    jU = b3.b.u(parcel, iR);
                    break;
                case 3:
                    bundleA = b3.b.a(parcel, iR);
                    break;
                case 4:
                    iT2 = b3.b.t(parcel, iR);
                    break;
                case 5:
                    arrayListH = b3.b.h(parcel, iR);
                    break;
                case 6:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 7:
                    iT3 = b3.b.t(parcel, iR);
                    break;
                case 8:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case 9:
                    strF = b3.b.f(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    h4Var = (h4) b3.b.e(parcel, iR, h4.CREATOR);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    location = (Location) b3.b.e(parcel, iR, Location.CREATOR);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 13:
                    bundleA2 = b3.b.a(parcel, iR);
                    break;
                case 14:
                    bundleA3 = b3.b.a(parcel, iR);
                    break;
                case 15:
                    arrayListH2 = b3.b.h(parcel, iR);
                    break;
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case 17:
                    strF4 = b3.b.f(parcel, iR);
                    break;
                case 18:
                    zM3 = b3.b.m(parcel, iR);
                    break;
                case 19:
                    y0Var = (y0) b3.b.e(parcel, iR, y0.CREATOR);
                    break;
                case 20:
                    iT4 = b3.b.t(parcel, iR);
                    break;
                case 21:
                    strF5 = b3.b.f(parcel, iR);
                    break;
                case 22:
                    arrayListH3 = b3.b.h(parcel, iR);
                    break;
                case 23:
                    iT5 = b3.b.t(parcel, iR);
                    break;
                case 24:
                    strF6 = b3.b.f(parcel, iR);
                    break;
                case 25:
                    iT6 = b3.b.t(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new r4(iT, jU, bundleA, iT2, arrayListH, zM, iT3, zM2, strF, h4Var, location, strF2, bundleA2, bundleA3, arrayListH2, strF3, strF4, zM3, y0Var, iT4, strF5, arrayListH3, iT5, strF6, iT6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new r4[i8];
    }
}
