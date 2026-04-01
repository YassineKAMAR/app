package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class h10 extends jk implements j10 {
    h10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.j10
    public final void b(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        H0(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.j10
    public final void n() {
        H0(2, k0());
    }
}
