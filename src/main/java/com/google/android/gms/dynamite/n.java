package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends l3.a {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final g3.a H0(g3.a aVar, String str, int i8, g3.a aVar2) {
        Parcel parcelV0 = v0();
        l3.c.d(parcelV0, aVar);
        parcelV0.writeString(str);
        parcelV0.writeInt(i8);
        l3.c.d(parcelV0, aVar2);
        Parcel parcelK0 = k0(2, parcelV0);
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarV0;
    }

    public final g3.a k3(g3.a aVar, String str, int i8, g3.a aVar2) {
        Parcel parcelV0 = v0();
        l3.c.d(parcelV0, aVar);
        parcelV0.writeString(str);
        parcelV0.writeInt(i8);
        l3.c.d(parcelV0, aVar2);
        Parcel parcelK0 = k0(3, parcelV0);
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarV0;
    }
}
