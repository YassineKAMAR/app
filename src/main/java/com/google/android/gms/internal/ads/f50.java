package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class f50 extends kk implements g50 {
    public f50() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static g50 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof g50 ? (g50) iInterfaceQueryLocalInterface : new e50(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                m();
                parcel2.writeNoException();
                return true;
            case 2:
                n();
                parcel2.writeNoException();
                return true;
            case 3:
                int i10 = parcel.readInt();
                lk.c(parcel);
                F(i10);
                parcel2.writeNoException();
                return true;
            case 4:
                v();
                parcel2.writeNoException();
                return true;
            case 5:
                y();
                parcel2.writeNoException();
                return true;
            case 6:
                w();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof k50) {
                    }
                }
                lk.c(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                x();
                parcel2.writeNoException();
                return true;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                lk.c(parcel);
                w4(string, string2);
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                ow.O5(parcel.readStrongBinder());
                parcel.readString();
                lk.c(parcel);
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                A();
                parcel2.writeNoException();
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                parcel.readString();
                lk.c(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                K();
                parcel2.writeNoException();
                return true;
            case 14:
                bc0 bc0Var = (bc0) lk.a(parcel, bc0.CREATOR);
                lk.c(parcel);
                W3(bc0Var);
                parcel2.writeNoException();
                return true;
            case 15:
                J();
                parcel2.writeNoException();
                return true;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                fc0 fc0VarO5 = ec0.O5(parcel.readStrongBinder());
                lk.c(parcel);
                F1(fc0VarO5);
                parcel2.writeNoException();
                return true;
            case 17:
                int i11 = parcel.readInt();
                lk.c(parcel);
                q4(i11);
                parcel2.writeNoException();
                return true;
            case 18:
                E();
                parcel2.writeNoException();
                return true;
            case 19:
                lk.c(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                D();
                parcel2.writeNoException();
                return true;
            case 21:
                String string3 = parcel.readString();
                lk.c(parcel);
                U(string3);
                parcel2.writeNoException();
                return true;
            case 22:
                int i12 = parcel.readInt();
                String string4 = parcel.readString();
                lk.c(parcel);
                h1(i12, string4);
                parcel2.writeNoException();
                return true;
            case 23:
                h2.z2 z2Var = (h2.z2) lk.a(parcel, h2.z2.CREATOR);
                lk.c(parcel);
                O2(z2Var);
                parcel2.writeNoException();
                return true;
            case 24:
                h2.z2 z2Var2 = (h2.z2) lk.a(parcel, h2.z2.CREATOR);
                lk.c(parcel);
                E4(z2Var2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
