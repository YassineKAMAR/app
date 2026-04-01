package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class jn extends jk {
    jn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final en h5(hn hnVar) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, hnVar);
        Parcel parcelV0 = v0(2, parcelK0);
        en enVar = (en) lk.a(parcelV0, en.CREATOR);
        parcelV0.recycle();
        return enVar;
    }

    public final long q3(hn hnVar) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, hnVar);
        Parcel parcelV0 = v0(3, parcelK0);
        long j8 = parcelV0.readLong();
        parcelV0.recycle();
        return j8;
    }

    public final en y4(hn hnVar) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, hnVar);
        Parcel parcelV0 = v0(1, parcelK0);
        en enVar = (en) lk.a(parcelV0, en.CREATOR);
        parcelV0.recycle();
        return enVar;
    }
}
