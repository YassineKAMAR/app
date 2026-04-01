package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class jw extends kk implements kw {
    public jw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        IInterface iInterfaceO;
        String strS;
        switch (i8) {
            case 2:
                iInterfaceO = o();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceO);
                return true;
            case 3:
                strS = s();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 4:
                List listW = w();
                parcel2.writeNoException();
                parcel2.writeList(listW);
                return true;
            case 5:
                strS = r();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 6:
                iInterfaceO = n();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceO);
                return true;
            case 7:
                strS = t();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 8:
                double dK = k();
                parcel2.writeNoException();
                parcel2.writeDouble(dK);
                return true;
            case 9:
                strS = v();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                strS = x();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                Bundle bundleL = l();
                parcel2.writeNoException();
                lk.e(parcel2, bundleL);
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                y();
                parcel2.writeNoException();
                return true;
            case 13:
                iInterfaceO = p();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceO);
                return true;
            case 14:
                Bundle bundle = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                i0(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                boolean zX0 = x0(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zX0 ? 1 : 0);
                return true;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                Bundle bundle3 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                A0(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                iInterfaceO = m();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceO);
                return true;
            case 18:
                iInterfaceO = q();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceO);
                return true;
            case 19:
                strS = u();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            default:
                return false;
        }
    }
}
