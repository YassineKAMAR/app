package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class v10 extends jk implements x10 {
    v10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final void g(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final void n() {
        H0(1, k0());
    }
}
