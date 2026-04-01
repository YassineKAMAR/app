package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends l3.a {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final g3.a G5(g3.a aVar, String str, boolean z7, long j8) {
        Parcel parcelV0 = v0();
        l3.c.d(parcelV0, aVar);
        parcelV0.writeString(str);
        parcelV0.writeInt(z7 ? 1 : 0);
        parcelV0.writeLong(j8);
        Parcel parcelK0 = k0(7, parcelV0);
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarV0;
    }

    public final int H0(g3.a aVar, String str, boolean z7) {
        Parcel parcelV0 = v0();
        l3.c.d(parcelV0, aVar);
        parcelV0.writeString(str);
        parcelV0.writeInt(z7 ? 1 : 0);
        Parcel parcelK0 = k0(3, parcelV0);
        int i8 = parcelK0.readInt();
        parcelK0.recycle();
        return i8;
    }

    public final g3.a h5(g3.a aVar, String str, int i8) {
        Parcel parcelV0 = v0();
        l3.c.d(parcelV0, aVar);
        parcelV0.writeString(str);
        parcelV0.writeInt(i8);
        Parcel parcelK0 = k0(4, parcelV0);
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarV0;
    }

    public final int k3(g3.a aVar, String str, boolean z7) {
        Parcel parcelV0 = v0();
        l3.c.d(parcelV0, aVar);
        parcelV0.writeString(str);
        parcelV0.writeInt(z7 ? 1 : 0);
        Parcel parcelK0 = k0(5, parcelV0);
        int i8 = parcelK0.readInt();
        parcelK0.recycle();
        return i8;
    }

    public final int m() {
        Parcel parcelK0 = k0(6, v0());
        int i8 = parcelK0.readInt();
        parcelK0.recycle();
        return i8;
    }

    public final g3.a q3(g3.a aVar, String str, int i8) {
        Parcel parcelV0 = v0();
        l3.c.d(parcelV0, aVar);
        parcelV0.writeString(str);
        parcelV0.writeInt(i8);
        Parcel parcelK0 = k0(2, parcelV0);
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarV0;
    }

    public final g3.a y4(g3.a aVar, String str, int i8, g3.a aVar2) {
        Parcel parcelV0 = v0();
        l3.c.d(parcelV0, aVar);
        parcelV0.writeString(str);
        parcelV0.writeInt(i8);
        l3.c.d(parcelV0, aVar2);
        Parcel parcelK0 = k0(8, parcelV0);
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarV0;
    }
}
