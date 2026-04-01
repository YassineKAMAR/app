package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k10 extends jk implements m10 {
    k10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.m10
    public final void v4(List list) {
        Parcel parcelK0 = k0();
        parcelK0.writeTypedList(list);
        H0(1, parcelK0);
    }
}
