package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ox extends jk implements px {
    ox(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void O(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        H0(1, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void m() {
        H0(2, k0());
    }
}
