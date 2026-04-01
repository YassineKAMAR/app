package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class wn0 extends kk implements xn0 {
    public wn0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        String strN;
        switch (i8) {
            case 1:
                Bundle bundle = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                V(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                Bundle bundleZ2 = z2(bundle2);
                parcel2.writeNoException();
                lk.e(parcel2, bundleZ2);
                return true;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle3 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                k4(string, string2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                L4(string3, string4, aVarV0);
                parcel2.writeNoException();
                return true;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean zG = lk.g(parcel);
                lk.c(parcel);
                Map mapX4 = X4(string5, string6, zG);
                parcel2.writeNoException();
                parcel2.writeMap(mapX4);
                return true;
            case 6:
                String string7 = parcel.readString();
                lk.c(parcel);
                int iC = c(string7);
                parcel2.writeNoException();
                parcel2.writeInt(iC);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                i0(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Bundle bundle5 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                n5(string8, string9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                lk.c(parcel);
                List listN3 = N3(string10, string11);
                parcel2.writeNoException();
                parcel2.writeList(listN3);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                strN = n();
                parcel2.writeNoException();
                parcel2.writeString(strN);
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                strN = r();
                parcel2.writeNoException();
                parcel2.writeString(strN);
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                long jL = l();
                parcel2.writeNoException();
                parcel2.writeLong(jL);
                return true;
            case 13:
                String string12 = parcel.readString();
                lk.c(parcel);
                U(string12);
                parcel2.writeNoException();
                return true;
            case 14:
                String string13 = parcel.readString();
                lk.c(parcel);
                Z(string13);
                parcel2.writeNoException();
                return true;
            case 15:
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                lk.c(parcel);
                b5(aVarV02, string14, string15);
                parcel2.writeNoException();
                return true;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                strN = o();
                parcel2.writeNoException();
                parcel2.writeString(strN);
                return true;
            case 17:
                strN = q();
                parcel2.writeNoException();
                parcel2.writeString(strN);
                return true;
            case 18:
                strN = m();
                parcel2.writeNoException();
                parcel2.writeString(strN);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                A0(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
