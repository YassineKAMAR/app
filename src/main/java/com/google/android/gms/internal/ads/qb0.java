package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class qb0 extends kk implements rb0 {
    public qb0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        int iC;
        if (i8 == 1) {
            wb0 wb0Var = (wb0) lk.a(parcel, wb0.CREATOR);
            lk.c(parcel);
            Z3(wb0Var);
        } else if (i8 != 2) {
            vb0 tb0Var = null;
            pb0 pb0Var = null;
            if (i8 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    tb0Var = iInterfaceQueryLocalInterface instanceof vb0 ? (vb0) iInterfaceQueryLocalInterface : new tb0(strongBinder);
                }
                lk.c(parcel);
                D5(tb0Var);
            } else {
                if (i8 != 34) {
                    switch (i8) {
                        case 5:
                            iC = C();
                            break;
                        case 6:
                            o();
                            break;
                        case 7:
                            t();
                            break;
                        case 8:
                            m();
                            break;
                        case 9:
                            g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                            lk.c(parcel);
                            e0(aVarV0);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                            lk.c(parcel);
                            p0(aVarV02);
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                            lk.c(parcel);
                            G0(aVarV03);
                            break;
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                            String strP = p();
                            parcel2.writeNoException();
                            parcel2.writeString(strP);
                            return true;
                        case 13:
                            String string = parcel.readString();
                            lk.c(parcel);
                            c0(string);
                            break;
                        case 14:
                            h2.w0 w0VarO5 = h2.v0.O5(parcel.readStrongBinder());
                            lk.c(parcel);
                            B3(w0VarO5);
                            break;
                        case 15:
                            Bundle bundleK = k();
                            parcel2.writeNoException();
                            lk.e(parcel2, bundleK);
                            return true;
                        case com.amazon.c.a.a.c.f4052g /* 16 */:
                            IBinder strongBinder2 = parcel.readStrongBinder();
                            if (strongBinder2 != null) {
                                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                pb0Var = iInterfaceQueryLocalInterface2 instanceof pb0 ? (pb0) iInterfaceQueryLocalInterface2 : new pb0(strongBinder2);
                            }
                            lk.c(parcel);
                            d2(pb0Var);
                            break;
                        case 17:
                            parcel.readString();
                            lk.c(parcel);
                            break;
                        case 18:
                            g3.a aVarV04 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                            lk.c(parcel);
                            a0(aVarV04);
                            break;
                        case 19:
                            String string2 = parcel.readString();
                            lk.c(parcel);
                            i3(string2);
                            break;
                        case 20:
                            iC = G();
                            break;
                        case 21:
                            h2.m2 m2VarL = l();
                            parcel2.writeNoException();
                            lk.f(parcel2, m2VarL);
                            return true;
                        default:
                            return false;
                    }
                    parcel2.writeNoException();
                    int i10 = lk.f10749b;
                    parcel2.writeInt(iC);
                    return true;
                }
                boolean zG = lk.g(parcel);
                lk.c(parcel);
                Y(zG);
            }
        } else {
            z();
        }
        parcel2.writeNoException();
        return true;
    }
}
