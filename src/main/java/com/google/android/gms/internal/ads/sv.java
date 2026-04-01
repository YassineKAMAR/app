package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases_flutter.R;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class sv extends kk implements tv {
    public sv() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        float fM;
        IInterface iInterfaceR;
        dx dxVar;
        int iU;
        switch (i8) {
            case 2:
                fM = m();
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 3:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                b0(aVarV0);
                parcel2.writeNoException();
                return true;
            case 4:
                iInterfaceR = r();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceR);
                return true;
            case 5:
                fM = q();
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 6:
                fM = n();
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 7:
                iInterfaceR = o();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceR);
                return true;
            case 8:
                iU = u();
                parcel2.writeNoException();
                int i10 = lk.f10749b;
                parcel2.writeInt(iU);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    dxVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    dxVar = iInterfaceQueryLocalInterface instanceof dx ? (dx) iInterfaceQueryLocalInterface : new dx(strongBinder);
                }
                lk.c(parcel);
                t5(dxVar);
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                iU = s();
                parcel2.writeNoException();
                int i102 = lk.f10749b;
                parcel2.writeInt(iU);
                return true;
            default:
                return false;
        }
    }
}
