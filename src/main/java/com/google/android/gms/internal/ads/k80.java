package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class k80 extends jk implements m80 {
    k80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final j80 w0(g3.a aVar, z40 z40Var, int i8) {
        j80 h80Var;
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(1, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            h80Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            h80Var = iInterfaceQueryLocalInterface instanceof j80 ? (j80) iInterfaceQueryLocalInterface : new h80(strongBinder);
        }
        parcelV0.recycle();
        return h80Var;
    }
}
