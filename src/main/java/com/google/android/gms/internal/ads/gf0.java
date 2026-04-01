package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class gf0 extends jk implements if0 {
    gf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.if0
    public final ff0 w0(g3.a aVar, z40 z40Var, int i8) {
        ff0 df0Var;
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(2, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            df0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            df0Var = iInterfaceQueryLocalInterface instanceof ff0 ? (ff0) iInterfaceQueryLocalInterface : new df0(strongBinder);
        }
        parcelV0.recycle();
        return df0Var;
    }
}
