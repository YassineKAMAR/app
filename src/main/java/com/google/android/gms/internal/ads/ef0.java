package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases_flutter.R;
import g3.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ef0 extends kk implements ff0 {
    public ef0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static ff0 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof ff0 ? (ff0) iInterfaceQueryLocalInterface : new df0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        cf0 af0Var = null;
        switch (i8) {
            case 1:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                jf0 jf0Var = (jf0) lk.a(parcel, jf0.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    af0Var = iInterfaceQueryLocalInterface instanceof cf0 ? (cf0) iInterfaceQueryLocalInterface : new af0(strongBinder);
                }
                lk.c(parcel);
                g5(aVarV0, jf0Var, af0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                b0(aVarV02);
                parcel2.writeNoException();
                return true;
            case 3:
                a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
            case 4:
                a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                parcel2.writeNoException();
                lk.f(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g90 g90VarO5 = f90.O5(parcel.readStrongBinder());
                lk.c(parcel);
                j1(arrayListCreateTypedArrayList, aVarV03, g90VarO5);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                g3.a aVarV04 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g90 g90VarO52 = f90.O5(parcel.readStrongBinder());
                lk.c(parcel);
                X2(arrayListCreateTypedArrayList2, aVarV04, g90VarO52);
                parcel2.writeNoException();
                return true;
            case 7:
                j90 j90Var = (j90) lk.a(parcel, j90.CREATOR);
                lk.c(parcel);
                O4(j90Var);
                parcel2.writeNoException();
                return true;
            case 8:
                g3.a aVarV05 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                e0(aVarV05);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                g3.a aVarV06 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g90 g90VarO53 = f90.O5(parcel.readStrongBinder());
                lk.c(parcel);
                K3(arrayListCreateTypedArrayList3, aVarV06, g90VarO53);
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                g3.a aVarV07 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g90 g90VarO54 = f90.O5(parcel.readStrongBinder());
                lk.c(parcel);
                q5(arrayListCreateTypedArrayList4, aVarV07, g90VarO54);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
