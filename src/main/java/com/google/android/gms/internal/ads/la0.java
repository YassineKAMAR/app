package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class la0 extends jk implements na0 {
    la0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void H1(fa0 fa0Var, qa0 qa0Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, fa0Var);
        lk.f(parcelK0, qa0Var);
        H0(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void t3(ba0 ba0Var, qa0 qa0Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, ba0Var);
        lk.f(parcelK0, qa0Var);
        H0(1, parcelK0);
    }
}
