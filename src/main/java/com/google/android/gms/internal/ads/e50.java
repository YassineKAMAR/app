package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class e50 extends jk implements g50 {
    e50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void A() {
        H0(11, k0());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void D() {
        H0(20, k0());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void E() {
        H0(18, k0());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void E4(h2.z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(24, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void F(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void F1(fc0 fc0Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, fc0Var);
        H0(16, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void J() {
        H0(15, k0());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void K() {
        H0(13, k0());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void O2(h2.z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(23, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void U(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        H0(21, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void W3(bc0 bc0Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void h1(int i8, String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        parcelK0.writeString(str);
        H0(22, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void m() {
        H0(1, k0());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void n() {
        H0(2, k0());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void q4(int i8) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void v() {
        H0(4, k0());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void v5(pw pwVar, String str) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, pwVar);
        parcelK0.writeString(str);
        H0(10, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void w() {
        H0(6, k0());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void w4(String str, String str2) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        H0(9, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void x() {
        H0(8, k0());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void y() {
        H0(5, k0());
    }
}
