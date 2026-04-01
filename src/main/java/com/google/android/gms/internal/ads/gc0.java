package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 extends jk implements ic0 {
    gc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void J0(h2.c2 c2Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, c2Var);
        H0(8, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void Q2(xc0 xc0Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, xc0Var);
        H0(7, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void Q3(h2.f2 f2Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, f2Var);
        H0(13, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void S2(lc0 lc0Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, lc0Var);
        H0(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void U2(h2.r4 r4Var, pc0 pc0Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, pc0Var);
        H0(14, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void j0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(5, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final h2.m2 l() {
        Parcel parcelV0 = v0(12, k0());
        h2.m2 m2VarO5 = h2.l2.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return m2VarO5;
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void x2(h2.r4 r4Var, pc0 pc0Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, pc0Var);
        H0(1, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void x3(boolean z7) {
        Parcel parcelK0 = k0();
        int i8 = lk.f10749b;
        parcelK0.writeInt(z7 ? 1 : 0);
        H0(15, parcelK0);
    }
}
