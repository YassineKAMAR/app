package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import b3.b;
import com.google.android.gms.common.api.Scope;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iY = b.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListJ = null;
        String strF7 = null;
        String strF8 = null;
        long jU = 0;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b.r(parcel);
            switch (b.l(iR)) {
                case 1:
                    iT = b.t(parcel, iR);
                    break;
                case 2:
                    strF = b.f(parcel, iR);
                    break;
                case 3:
                    strF2 = b.f(parcel, iR);
                    break;
                case 4:
                    strF3 = b.f(parcel, iR);
                    break;
                case 5:
                    strF4 = b.f(parcel, iR);
                    break;
                case 6:
                    uri = (Uri) b.e(parcel, iR, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = b.f(parcel, iR);
                    break;
                case 8:
                    jU = b.u(parcel, iR);
                    break;
                case 9:
                    strF6 = b.f(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    arrayListJ = b.j(parcel, iR, Scope.CREATOR);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    strF7 = b.f(parcel, iR);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    strF8 = b.f(parcel, iR);
                    break;
                default:
                    b.x(parcel, iR);
                    break;
            }
        }
        b.k(parcel, iY);
        return new GoogleSignInAccount(iT, strF, strF2, strF3, strF4, uri, strF5, jU, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i8) {
        return new GoogleSignInAccount[i8];
    }
}
