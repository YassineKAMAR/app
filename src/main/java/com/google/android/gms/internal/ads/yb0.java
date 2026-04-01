package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 extends jk implements ac0 {
    yb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final void F4(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(5, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final void G0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(6, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final void b0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(4, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final void e0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final void k5(g3.a aVar, bc0 bc0Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, bc0Var);
        H0(7, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final void p1(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(1, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final void s0(g3.a aVar, int i8) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeInt(i8);
        H0(9, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final void u5(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(11, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final void zze(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(8, parcelK0);
    }
}
