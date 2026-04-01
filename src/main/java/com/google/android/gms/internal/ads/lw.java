package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class lw extends kk implements mw {
    public lw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        IInterface iInterfaceQ;
        String strS;
        switch (i8) {
            case 2:
                iInterfaceQ = q();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceQ);
                return true;
            case 3:
                strS = s();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 4:
                List listX = x();
                parcel2.writeNoException();
                parcel2.writeList(listX);
                return true;
            case 5:
                strS = r();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 6:
                iInterfaceQ = m();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceQ);
                return true;
            case 7:
                strS = t();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 8:
                strS = o();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 9:
                Bundle bundleK = k();
                parcel2.writeNoException();
                lk.e(parcel2, bundleK);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                v();
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                iInterfaceQ = l();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceQ);
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                Bundle bundle = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                J1(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                boolean zI0 = i0(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zI0 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                V(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                iInterfaceQ = p();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceQ);
                return true;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                iInterfaceQ = n();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceQ);
                return true;
            case 17:
                strS = u();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            default:
                return false;
        }
    }
}
