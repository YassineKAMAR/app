package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class w60 extends jk implements y60 {
    w60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void E1(String str, String str2, h2.r4 r4Var, g3.a aVar, j60 j60Var, g50 g50Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, j60Var);
        lk.f(parcelK0, g50Var);
        H0(23, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void F2(String str, String str2, h2.r4 r4Var, g3.a aVar, s60 s60Var, g50 g50Var, lv lvVar) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, s60Var);
        lk.f(parcelK0, g50Var);
        lk.d(parcelK0, lvVar);
        H0(22, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void T2(String str, String str2, h2.r4 r4Var, g3.a aVar, v60 v60Var, g50 g50Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, v60Var);
        lk.f(parcelK0, g50Var);
        H0(20, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void U1(String str, String str2, h2.r4 r4Var, g3.a aVar, s60 s60Var, g50 g50Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, s60Var);
        lk.f(parcelK0, g50Var);
        H0(18, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void Y3(String str, String str2, h2.r4 r4Var, g3.a aVar, m60 m60Var, g50 g50Var, h2.w4 w4Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, m60Var);
        lk.f(parcelK0, g50Var);
        lk.d(parcelK0, w4Var);
        H0(21, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void Z4(String str, String str2, h2.r4 r4Var, g3.a aVar, m60 m60Var, g50 g50Var, h2.w4 w4Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, m60Var);
        lk.f(parcelK0, g50Var);
        lk.d(parcelK0, w4Var);
        H0(13, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final boolean a0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        Parcel parcelV0 = v0(24, parcelK0);
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void j5(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        H0(19, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final boolean l2(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        Parcel parcelV0 = v0(17, parcelK0);
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void l3(String str, String str2, h2.r4 r4Var, g3.a aVar, v60 v60Var, g50 g50Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, v60Var);
        lk.f(parcelK0, g50Var);
        H0(16, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final h2.p2 m() {
        Parcel parcelV0 = v0(5, k0());
        h2.p2 p2VarO5 = h2.o2.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return p2VarO5;
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final m70 n() {
        Parcel parcelV0 = v0(2, k0());
        m70 m70Var = (m70) lk.a(parcelV0, m70.CREATOR);
        parcelV0.recycle();
        return m70Var;
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final m70 q() {
        Parcel parcelV0 = v0(3, k0());
        m70 m70Var = (m70) lk.a(parcelV0, m70.CREATOR);
        parcelV0.recycle();
        return m70Var;
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void s2(String str, String str2, h2.r4 r4Var, g3.a aVar, p60 p60Var, g50 g50Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, p60Var);
        lk.f(parcelK0, g50Var);
        H0(14, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final boolean t0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        Parcel parcelV0 = v0(15, parcelK0);
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void x1(g3.a aVar, String str, Bundle bundle, Bundle bundle2, h2.w4 w4Var, b70 b70Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeString(str);
        lk.d(parcelK0, bundle);
        lk.d(parcelK0, bundle2);
        lk.d(parcelK0, w4Var);
        lk.f(parcelK0, b70Var);
        H0(1, parcelK0);
    }
}
