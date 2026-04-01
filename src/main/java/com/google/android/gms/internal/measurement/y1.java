package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends w0 implements w1 {
    y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.w1
    public final void f(Bundle bundle) {
        Parcel parcelK0 = k0();
        y0.d(parcelK0, bundle);
        H0(1, parcelK0);
    }
}
