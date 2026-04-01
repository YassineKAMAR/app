package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class z1 extends z0 implements w1 {
    public z1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.z0
    protected final boolean k0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) y0.a(parcel, Bundle.CREATOR);
        y0.f(parcel);
        f(bundle);
        parcel2.writeNoException();
        return true;
    }
}
