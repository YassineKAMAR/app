package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ow extends kk implements pw {
    public ow() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static pw O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof pw ? (pw) iInterfaceQueryLocalInterface : new nw(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        String strS4;
        IInterface iInterfaceG0;
        boolean z7;
        int i10;
        boolean zT0;
        switch (i8) {
            case 1:
                String string = parcel.readString();
                lk.c(parcel);
                strS4 = S4(string);
                parcel2.writeNoException();
                parcel2.writeString(strS4);
                return true;
            case 2:
                String string2 = parcel.readString();
                lk.c(parcel);
                iInterfaceG0 = g0(string2);
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceG0);
                return true;
            case 3:
                List<String> listS = s();
                parcel2.writeNoException();
                parcel2.writeStringList(listS);
                return true;
            case 4:
                strS4 = r();
                parcel2.writeNoException();
                parcel2.writeString(strS4);
                return true;
            case 5:
                String string3 = parcel.readString();
                lk.c(parcel);
                Z(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                w();
                parcel2.writeNoException();
                return true;
            case 7:
                iInterfaceG0 = m();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceG0);
                return true;
            case 8:
                u();
                parcel2.writeNoException();
                return true;
            case 9:
                iInterfaceG0 = o();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceG0);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                zT0 = t0(aVarV0);
                parcel2.writeNoException();
                i10 = zT0;
                parcel2.writeInt(i10);
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                parcel2.writeNoException();
                iInterfaceG0 = null;
                lk.f(parcel2, iInterfaceG0);
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                z7 = z();
                parcel2.writeNoException();
                int i11 = lk.f10749b;
                i10 = z7;
                parcel2.writeInt(i10);
                return true;
            case 13:
                z7 = G();
                parcel2.writeNoException();
                int i112 = lk.f10749b;
                i10 = z7;
                parcel2.writeInt(i10);
                return true;
            case 14:
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                X3(aVarV02);
                parcel2.writeNoException();
                return true;
            case 15:
                x();
                parcel2.writeNoException();
                return true;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                iInterfaceG0 = n();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceG0);
                return true;
            case 17:
                g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                zT0 = a0(aVarV03);
                parcel2.writeNoException();
                i10 = zT0;
                parcel2.writeInt(i10);
                return true;
            default:
                return false;
        }
    }
}
