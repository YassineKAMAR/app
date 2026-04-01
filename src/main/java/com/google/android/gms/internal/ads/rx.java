package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class rx extends kk implements sx {
    public rx() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        String strZ;
        List listE;
        IInterface iInterfaceS;
        px oxVar;
        int i10;
        boolean zH0;
        switch (i8) {
            case 2:
                strZ = z();
                parcel2.writeNoException();
                parcel2.writeString(strZ);
                return true;
            case 3:
                listE = E();
                parcel2.writeNoException();
                parcel2.writeList(listE);
                return true;
            case 4:
                strZ = w();
                parcel2.writeNoException();
                parcel2.writeString(strZ);
                return true;
            case 5:
                iInterfaceS = s();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceS);
                return true;
            case 6:
                strZ = y();
                parcel2.writeNoException();
                parcel2.writeString(strZ);
                return true;
            case 7:
                strZ = v();
                parcel2.writeNoException();
                parcel2.writeString(strZ);
                return true;
            case 8:
                double dM = m();
                parcel2.writeNoException();
                parcel2.writeDouble(dM);
                return true;
            case 9:
                strZ = G();
                parcel2.writeNoException();
                parcel2.writeString(strZ);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                strZ = C();
                parcel2.writeNoException();
                parcel2.writeString(strZ);
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                iInterfaceS = o();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceS);
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                strZ = B();
                parcel2.writeNoException();
                parcel2.writeString(strZ);
                return true;
            case 13:
                D();
                parcel2.writeNoException();
                return true;
            case 14:
                iInterfaceS = r();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceS);
                return true;
            case 15:
                Bundle bundle = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                B5(bundle);
                parcel2.writeNoException();
                return true;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                Bundle bundle2 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                boolean zT4 = t4(bundle2);
                parcel2.writeNoException();
                i10 = zT4;
                parcel2.writeInt(i10);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                B2(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                iInterfaceS = x();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceS);
                return true;
            case 19:
                iInterfaceS = u();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceS);
                return true;
            case 20:
                Bundle bundleN = n();
                parcel2.writeNoException();
                lk.e(parcel2, bundleN);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    oxVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    oxVar = iInterfaceQueryLocalInterface instanceof px ? (px) iInterfaceQueryLocalInterface : new ox(strongBinder);
                }
                lk.c(parcel);
                D3(oxVar);
                parcel2.writeNoException();
                return true;
            case 22:
                J();
                parcel2.writeNoException();
                return true;
            case 23:
                listE = A();
                parcel2.writeNoException();
                parcel2.writeList(listE);
                return true;
            case 24:
                zH0 = h0();
                parcel2.writeNoException();
                int i11 = lk.f10749b;
                i10 = zH0;
                parcel2.writeInt(i10);
                return true;
            case 25:
                h2.u1 u1VarO5 = h2.t1.O5(parcel.readStrongBinder());
                lk.c(parcel);
                R3(u1VarO5);
                parcel2.writeNoException();
                return true;
            case 26:
                h2.r1 r1VarO5 = h2.q1.O5(parcel.readStrongBinder());
                lk.c(parcel);
                M4(r1VarO5);
                parcel2.writeNoException();
                return true;
            case 27:
                C4();
                parcel2.writeNoException();
                return true;
            case 28:
                R();
                parcel2.writeNoException();
                return true;
            case 29:
                iInterfaceS = t();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceS);
                return true;
            case 30:
                zH0 = X();
                parcel2.writeNoException();
                int i112 = lk.f10749b;
                i10 = zH0;
                parcel2.writeInt(i10);
                return true;
            case 31:
                iInterfaceS = q();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceS);
                return true;
            case com.amazon.c.a.a.c.f4053h /* 32 */:
                h2.f2 f2VarO5 = h2.e2.O5(parcel.readStrongBinder());
                lk.c(parcel);
                y2(f2VarO5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
