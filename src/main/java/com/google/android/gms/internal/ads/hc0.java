package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class hc0 extends kk implements ic0 {
    public hc0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static ic0 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof ic0 ? (ic0) iInterfaceQueryLocalInterface : new gc0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        IInterface iInterfaceP;
        pc0 nc0Var = null;
        pc0 nc0Var2 = null;
        qc0 qc0Var = null;
        lc0 jc0Var = null;
        switch (i8) {
            case 1:
                h2.r4 r4Var = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    nc0Var = iInterfaceQueryLocalInterface instanceof pc0 ? (pc0) iInterfaceQueryLocalInterface : new nc0(strongBinder);
                }
                lk.c(parcel);
                x2(r4Var, nc0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    jc0Var = iInterfaceQueryLocalInterface2 instanceof lc0 ? (lc0) iInterfaceQueryLocalInterface2 : new jc0(strongBinder2);
                }
                lk.c(parcel);
                S2(jc0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zW = w();
                parcel2.writeNoException();
                int i10 = lk.f10749b;
                parcel2.writeInt(zW ? 1 : 0);
                return true;
            case 4:
                String strM = m();
                parcel2.writeNoException();
                parcel2.writeString(strM);
                return true;
            case 5:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                j0(aVarV0);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    qc0Var = iInterfaceQueryLocalInterface3 instanceof qc0 ? (qc0) iInterfaceQueryLocalInterface3 : new qc0(strongBinder3);
                }
                lk.c(parcel);
                n2(qc0Var);
                parcel2.writeNoException();
                return true;
            case 7:
                xc0 xc0Var = (xc0) lk.a(parcel, xc0.CREATOR);
                lk.c(parcel);
                Q2(xc0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                h2.c2 c2VarO5 = h2.b2.O5(parcel.readStrongBinder());
                lk.c(parcel);
                J0(c2VarO5);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleK = k();
                parcel2.writeNoException();
                lk.e(parcel2, bundleK);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                boolean zG = lk.g(parcel);
                lk.c(parcel);
                u2(aVarV02, zG);
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                iInterfaceP = p();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceP);
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                iInterfaceP = l();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceP);
                return true;
            case 13:
                h2.f2 f2VarO5 = h2.e2.O5(parcel.readStrongBinder());
                lk.c(parcel);
                Q3(f2VarO5);
                parcel2.writeNoException();
                return true;
            case 14:
                h2.r4 r4Var2 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    nc0Var2 = iInterfaceQueryLocalInterface4 instanceof pc0 ? (pc0) iInterfaceQueryLocalInterface4 : new nc0(strongBinder4);
                }
                lk.c(parcel);
                U2(r4Var2, nc0Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zG2 = lk.g(parcel);
                lk.c(parcel);
                x3(zG2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
