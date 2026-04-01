package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends w0 implements a1 {
    c1(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Bundle f(Bundle bundle) {
        Parcel parcelK0 = k0();
        y0.d(parcelK0, bundle);
        Parcel parcelV0 = v0(1, parcelK0);
        Bundle bundle2 = (Bundle) y0.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle2;
    }
}
