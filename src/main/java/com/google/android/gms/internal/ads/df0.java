package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class df0 extends jk implements ff0 {
    df0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void e0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(8, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void g5(g3.a aVar, jf0 jf0Var, cf0 cf0Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, jf0Var);
        lk.f(parcelK0, cf0Var);
        H0(1, parcelK0);
    }
}
