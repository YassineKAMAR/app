package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class p80 extends kk implements q80 {
    public p80() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static q80 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof q80 ? (q80) iInterfaceQueryLocalInterface : new o80(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                Bundle bundle = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                C3(bundle);
                break;
            case 2:
                break;
            case 3:
                G();
                break;
            case 4:
                B();
                break;
            case 5:
                w();
                break;
            case 6:
                Bundle bundle2 = (Bundle) lk.a(parcel, Bundle.CREATOR);
                lk.c(parcel);
                x0(bundle2);
                parcel2.writeNoException();
                lk.e(parcel2, bundle2);
                return true;
            case 7:
                E();
                break;
            case 8:
                x();
                break;
            case 9:
                D();
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                r();
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                boolean zH0 = h0();
                parcel2.writeNoException();
                int i10 = lk.f10749b;
                parcel2.writeInt(zH0 ? 1 : 0);
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                parcel.readInt();
                parcel.readInt();
                lk.c(parcel);
                break;
            case 13:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                p0(aVarV0);
                break;
            case 14:
                A();
                break;
            case 15:
                int i11 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                lk.c(parcel);
                A2(i11, strArrCreateStringArray, iArrCreateIntArray);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
