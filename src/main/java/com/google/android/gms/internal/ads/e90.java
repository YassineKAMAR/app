package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e90 extends jk implements g90 {
    e90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.g90
    public final void b(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        H0(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.g90
    public final void y1(List list) {
        Parcel parcelK0 = k0();
        parcelK0.writeTypedList(list);
        H0(1, parcelK0);
    }
}
