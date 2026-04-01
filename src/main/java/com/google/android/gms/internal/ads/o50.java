package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class o50 extends kk implements p50 {
    public o50() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static p50 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof p50 ? (p50) iInterfaceQueryLocalInterface : new n50(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        String strC;
        IInterface iInterfaceU;
        int iF0;
        float fN;
        switch (i8) {
            case 2:
                strC = C();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 3:
                List listA = A();
                parcel2.writeNoException();
                parcel2.writeList(listA);
                return true;
            case 4:
                strC = z();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 5:
                iInterfaceU = u();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceU);
                return true;
            case 6:
                strC = B();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 7:
                strC = y();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 8:
                double dM = m();
                parcel2.writeNoException();
                parcel2.writeDouble(dM);
                return true;
            case 9:
                strC = E();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                strC = G();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                iInterfaceU = t();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceU);
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                parcel2.writeNoException();
                iInterfaceU = null;
                lk.f(parcel2, iInterfaceU);
                return true;
            case 13:
                iInterfaceU = x();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceU);
                return true;
            case 14:
                iInterfaceU = v();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceU);
                return true;
            case 15:
                iInterfaceU = w();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceU);
                return true;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                Bundle bundleR = r();
                parcel2.writeNoException();
                lk.e(parcel2, bundleR);
                return true;
            case 17:
                iF0 = f0();
                parcel2.writeNoException();
                int i10 = lk.f10749b;
                parcel2.writeInt(iF0);
                return true;
            case 18:
                iF0 = R();
                parcel2.writeNoException();
                int i102 = lk.f10749b;
                parcel2.writeInt(iF0);
                return true;
            case 19:
                D();
                parcel2.writeNoException();
                return true;
            case 20:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                A5(aVarV0);
                parcel2.writeNoException();
                return true;
            case 21:
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g3.a aVarV04 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                Q1(aVarV02, aVarV03, aVarV04);
                parcel2.writeNoException();
                return true;
            case 22:
                g3.a aVarV05 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                I3(aVarV05);
                parcel2.writeNoException();
                return true;
            case 23:
                fN = n();
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 24:
                fN = o();
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 25:
                fN = q();
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            default:
                return false;
        }
    }
}
