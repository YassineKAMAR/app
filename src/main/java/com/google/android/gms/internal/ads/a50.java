package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g3.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a50 extends jk implements d50 {
    a50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void A1(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(37, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void A3(g3.a aVar, h2.r4 r4Var, String str, g50 g50Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, r4Var);
        parcelK0.writeString(str);
        lk.f(parcelK0, g50Var);
        H0(38, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void E2(g3.a aVar, h2.w4 w4Var, h2.r4 r4Var, String str, String str2, g50 g50Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, w4Var);
        lk.d(parcelK0, r4Var);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.f(parcelK0, g50Var);
        H0(6, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final boolean H() {
        Parcel parcelV0 = v0(13, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final l50 I() {
        l50 l50Var;
        Parcel parcelV0 = v0(15, k0());
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            l50Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            l50Var = iInterfaceQueryLocalInterface instanceof l50 ? (l50) iInterfaceQueryLocalInterface : new l50(strongBinder);
        }
        parcelV0.recycle();
        return l50Var;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void K2(g3.a aVar, h2.r4 r4Var, String str, ac0 ac0Var, String str2) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, r4Var);
        parcelK0.writeString(null);
        lk.f(parcelK0, ac0Var);
        parcelK0.writeString(str2);
        H0(10, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void L() {
        H0(12, k0());
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void L5(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(21, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final boolean M() {
        Parcel parcelV0 = v0(22, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void M1(g3.a aVar, j10 j10Var, List list) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, j10Var);
        parcelK0.writeTypedList(list);
        H0(31, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void N() {
        H0(8, k0());
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final m50 P() {
        m50 m50Var;
        Parcel parcelV0 = v0(16, k0());
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            m50Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            m50Var = iInterfaceQueryLocalInterface instanceof m50 ? (m50) iInterfaceQueryLocalInterface : new m50(strongBinder);
        }
        parcelV0.recycle();
        return m50Var;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void P0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(30, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void Q() {
        H0(4, k0());
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void R1(h2.r4 r4Var, String str) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, r4Var);
        parcelK0.writeString(str);
        H0(11, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void T() {
        H0(9, k0());
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void V2(g3.a aVar, h2.r4 r4Var, String str, String str2, g50 g50Var, lv lvVar, List list) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, r4Var);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.f(parcelK0, g50Var);
        lk.d(parcelK0, lvVar);
        parcelK0.writeStringList(list);
        H0(14, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void a3(g3.a aVar, ac0 ac0Var, List list) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, ac0Var);
        parcelK0.writeStringList(list);
        H0(23, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void c3(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(39, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void f2(g3.a aVar, h2.r4 r4Var, String str, g50 g50Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, r4Var);
        parcelK0.writeString(str);
        lk.f(parcelK0, g50Var);
        H0(32, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void i4(boolean z7) {
        Parcel parcelK0 = k0();
        int i8 = lk.f10749b;
        parcelK0.writeInt(z7 ? 1 : 0);
        H0(25, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void m3(g3.a aVar, h2.r4 r4Var, String str, g50 g50Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, r4Var);
        parcelK0.writeString(str);
        lk.f(parcelK0, g50Var);
        H0(28, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final h2.p2 o() {
        Parcel parcelV0 = v0(26, k0());
        h2.p2 p2VarO5 = h2.o2.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return p2VarO5;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void p2(g3.a aVar, h2.w4 w4Var, h2.r4 r4Var, String str, String str2, g50 g50Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, w4Var);
        lk.d(parcelK0, r4Var);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.f(parcelK0, g50Var);
        H0(35, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final p50 s() {
        p50 n50Var;
        Parcel parcelV0 = v0(27, k0());
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            n50Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            n50Var = iInterfaceQueryLocalInterface instanceof p50 ? (p50) iInterfaceQueryLocalInterface : new n50(strongBinder);
        }
        parcelV0.recycle();
        return n50Var;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final j50 t() {
        j50 h50Var;
        Parcel parcelV0 = v0(36, k0());
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            h50Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            h50Var = iInterfaceQueryLocalInterface instanceof j50 ? (j50) iInterfaceQueryLocalInterface : new h50(strongBinder);
        }
        parcelV0.recycle();
        return h50Var;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final m70 u() {
        Parcel parcelV0 = v0(33, k0());
        m70 m70Var = (m70) lk.a(parcelV0, m70.CREATOR);
        parcelV0.recycle();
        return m70Var;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final g3.a v() {
        Parcel parcelV0 = v0(2, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void w() {
        H0(5, k0());
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final m70 x() {
        Parcel parcelV0 = v0(34, k0());
        m70 m70Var = (m70) lk.a(parcelV0, m70.CREATOR);
        parcelV0.recycle();
        return m70Var;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void z4(g3.a aVar, h2.r4 r4Var, String str, String str2, g50 g50Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, r4Var);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        lk.f(parcelK0, g50Var);
        H0(7, parcelK0);
    }
}
