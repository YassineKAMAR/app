package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class x40 extends jk implements z40 {
    x40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final boolean b(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        Parcel parcelV0 = v0(2, parcelK0);
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final d50 c(String str) {
        d50 a50Var;
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        Parcel parcelV0 = v0(1, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            a50Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a50Var = iInterfaceQueryLocalInterface instanceof d50 ? (d50) iInterfaceQueryLocalInterface : new a50(strongBinder);
        }
        parcelV0.recycle();
        return a50Var;
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final y60 e(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        Parcel parcelV0 = v0(3, parcelK0);
        y60 y60VarO5 = x60.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return y60VarO5;
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final boolean h(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        Parcel parcelV0 = v0(4, parcelK0);
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }
}
