package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends w0 implements b2 {
    d2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.b2
    public final void L3(String str, String str2, Bundle bundle, long j8) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        y0.d(parcelK0, bundle);
        parcelK0.writeLong(j8);
        H0(1, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.b2
    public final int j() {
        Parcel parcelV0 = v0(2, k0());
        int i8 = parcelV0.readInt();
        parcelV0.recycle();
        return i8;
    }
}
