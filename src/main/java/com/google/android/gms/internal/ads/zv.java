package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class zv extends kk implements aw {
    public zv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static aw O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof aw ? (aw) iInterfaceQueryLocalInterface : new yv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        tv rvVar;
        switch (i8) {
            case 1:
                String string = parcel.readString();
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                U0(string, aVarV0);
                break;
            case 2:
                String string2 = parcel.readString();
                lk.c(parcel);
                g3.a aVarC = c(string2);
                parcel2.writeNoException();
                lk.f(parcel2, aVarC);
                return true;
            case 3:
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                z1(aVarV02);
                break;
            case 4:
                l();
                break;
            case 5:
                a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                parcel.readInt();
                lk.c(parcel);
                break;
            case 6:
                g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                v3(aVarV03);
                break;
            case 7:
                g3.a aVarV04 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                m0(aVarV04);
                break;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    rvVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    rvVar = iInterfaceQueryLocalInterface instanceof tv ? (tv) iInterfaceQueryLocalInterface : new rv(strongBinder);
                }
                lk.c(parcel);
                J4(rvVar);
                break;
            case 9:
                g3.a aVarV05 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                i2(aVarV05);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
