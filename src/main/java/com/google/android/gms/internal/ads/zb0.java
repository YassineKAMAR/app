package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class zb0 extends kk implements ac0 {
    public zb0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static ac0 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof ac0 ? (ac0) iInterfaceQueryLocalInterface : new yb0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                p1(aVarV0);
                break;
            case 2:
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                lk.c(parcel);
                G4(aVarV02, i10);
                break;
            case 3:
                g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                e0(aVarV03);
                break;
            case 4:
                g3.a aVarV04 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                b0(aVarV04);
                break;
            case 5:
                g3.a aVarV05 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                F4(aVarV05);
                break;
            case 6:
                g3.a aVarV06 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                G0(aVarV06);
                break;
            case 7:
                g3.a aVarV07 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                bc0 bc0Var = (bc0) lk.a(parcel, bc0.CREATOR);
                lk.c(parcel);
                k5(aVarV07, bc0Var);
                break;
            case 8:
                g3.a aVarV08 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                zze(aVarV08);
                break;
            case 9:
                g3.a aVarV09 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                lk.c(parcel);
                s0(aVarV09, i11);
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                g3.a aVarV010 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                o4(aVarV010);
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                g3.a aVarV011 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                u5(aVarV011);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                lk.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
