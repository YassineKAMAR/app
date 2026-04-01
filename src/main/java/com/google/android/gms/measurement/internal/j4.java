package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends com.google.android.gms.internal.measurement.w0 implements p3.i {
    j4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p3.i
    public final List<hb> B4(String str, String str2, boolean z7, lb lbVar) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        com.google.android.gms.internal.measurement.y0.e(parcelK0, z7);
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        Parcel parcelV0 = v0(14, parcelK0);
        ArrayList arrayListCreateTypedArrayList = parcelV0.createTypedArrayList(hb.CREATOR);
        parcelV0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p3.i
    public final void H3(d dVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, dVar);
        H0(13, parcelK0);
    }

    @Override // p3.i
    public final void J2(long j8, String str, String str2, String str3) {
        Parcel parcelK0 = k0();
        parcelK0.writeLong(j8);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        H0(10, parcelK0);
    }

    @Override // p3.i
    public final List<d> K0(String str, String str2, lb lbVar) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        Parcel parcelV0 = v0(16, parcelK0);
        ArrayList arrayListCreateTypedArrayList = parcelV0.createTypedArrayList(d.CREATOR);
        parcelV0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p3.i
    public final byte[] L2(d0 d0Var, String str) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, d0Var);
        parcelK0.writeString(str);
        Parcel parcelV0 = v0(9, parcelK0);
        byte[] bArrCreateByteArray = parcelV0.createByteArray();
        parcelV0.recycle();
        return bArrCreateByteArray;
    }

    @Override // p3.i
    public final void N2(lb lbVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        H0(4, parcelK0);
    }

    @Override // p3.i
    public final List<d> P2(String str, String str2, String str3) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        Parcel parcelV0 = v0(17, parcelK0);
        ArrayList arrayListCreateTypedArrayList = parcelV0.createTypedArrayList(d.CREATOR);
        parcelV0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p3.i
    public final void P4(d0 d0Var, String str, String str2) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, d0Var);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        H0(5, parcelK0);
    }

    @Override // p3.i
    public final void S0(lb lbVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        H0(18, parcelK0);
    }

    @Override // p3.i
    public final List<na> T4(lb lbVar, Bundle bundle) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        com.google.android.gms.internal.measurement.y0.d(parcelK0, bundle);
        Parcel parcelV0 = v0(24, parcelK0);
        ArrayList arrayListCreateTypedArrayList = parcelV0.createTypedArrayList(na.CREATOR);
        parcelV0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p3.i
    public final String Y1(lb lbVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        Parcel parcelV0 = v0(11, parcelK0);
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // p3.i
    public final p3.c e4(lb lbVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        Parcel parcelV0 = v0(21, parcelK0);
        p3.c cVar = (p3.c) com.google.android.gms.internal.measurement.y0.a(parcelV0, p3.c.CREATOR);
        parcelV0.recycle();
        return cVar;
    }

    @Override // p3.i
    public final void k2(d0 d0Var, lb lbVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, d0Var);
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        H0(1, parcelK0);
    }

    @Override // p3.i
    public final List<hb> o1(String str, String str2, String str3, boolean z7) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        com.google.android.gms.internal.measurement.y0.e(parcelK0, z7);
        Parcel parcelV0 = v0(15, parcelK0);
        ArrayList arrayListCreateTypedArrayList = parcelV0.createTypedArrayList(hb.CREATOR);
        parcelV0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p3.i
    public final void u1(lb lbVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        H0(20, parcelK0);
    }

    @Override // p3.i
    public final void v1(Bundle bundle, lb lbVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, bundle);
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        H0(19, parcelK0);
    }

    @Override // p3.i
    public final void w1(lb lbVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        H0(6, parcelK0);
    }

    @Override // p3.i
    public final void x5(d dVar, lb lbVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, dVar);
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        H0(12, parcelK0);
    }

    @Override // p3.i
    public final void y5(hb hbVar, lb lbVar) {
        Parcel parcelK0 = k0();
        com.google.android.gms.internal.measurement.y0.d(parcelK0, hbVar);
        com.google.android.gms.internal.measurement.y0.d(parcelK0, lbVar);
        H0(2, parcelK0);
    }
}
