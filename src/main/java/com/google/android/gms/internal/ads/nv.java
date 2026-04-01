package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nv extends jk implements pv {
    nv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final List o() {
        Parcel parcelV0 = v0(3, k0());
        ArrayList arrayListB = lk.b(parcelV0);
        parcelV0.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final String q() {
        Parcel parcelV0 = v0(2, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }
}
