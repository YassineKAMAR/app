package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class mm extends jk implements om {
    mm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void Z2(g3.a aVar, vm vmVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, vmVar);
        H0(4, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.om
    public final h2.m2 n() {
        Parcel parcelV0 = v0(5, k0());
        h2.m2 m2VarO5 = h2.l2.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return m2VarO5;
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void w2(h2.f2 f2Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, f2Var);
        H0(7, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void w5(boolean z7) {
        Parcel parcelK0 = k0();
        int i8 = lk.f10749b;
        parcelK0.writeInt(z7 ? 1 : 0);
        H0(6, parcelK0);
    }
}
