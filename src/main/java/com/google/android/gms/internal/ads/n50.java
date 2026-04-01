package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import g3.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n50 extends jk implements p50 {
    n50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final List A() {
        Parcel parcelV0 = v0(3, k0());
        ArrayList arrayListB = lk.b(parcelV0);
        parcelV0.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final void A5(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(20, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String B() {
        Parcel parcelV0 = v0(6, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String C() {
        Parcel parcelV0 = v0(2, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final void D() {
        H0(19, k0());
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String E() {
        Parcel parcelV0 = v0(9, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String G() {
        Parcel parcelV0 = v0(10, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final void I3(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(22, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final void Q1(g3.a aVar, g3.a aVar2, g3.a aVar3) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, aVar2);
        lk.f(parcelK0, aVar3);
        H0(21, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final boolean R() {
        Parcel parcelV0 = v0(18, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final boolean f0() {
        Parcel parcelV0 = v0(17, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final double m() {
        Parcel parcelV0 = v0(8, k0());
        double d8 = parcelV0.readDouble();
        parcelV0.recycle();
        return d8;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final float n() {
        Parcel parcelV0 = v0(23, k0());
        float f8 = parcelV0.readFloat();
        parcelV0.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final float o() {
        Parcel parcelV0 = v0(24, k0());
        float f8 = parcelV0.readFloat();
        parcelV0.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final float q() {
        Parcel parcelV0 = v0(25, k0());
        float f8 = parcelV0.readFloat();
        parcelV0.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final Bundle r() {
        Parcel parcelV0 = v0(16, k0());
        Bundle bundle = (Bundle) lk.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final pv s() {
        Parcel parcelV0 = v0(12, k0());
        pv pvVarO5 = ov.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return pvVarO5;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final h2.p2 t() {
        Parcel parcelV0 = v0(11, k0());
        h2.p2 p2VarO5 = h2.o2.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return p2VarO5;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final wv u() {
        Parcel parcelV0 = v0(5, k0());
        wv wvVarO5 = vv.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return wvVarO5;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final g3.a v() {
        Parcel parcelV0 = v0(14, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final g3.a w() {
        Parcel parcelV0 = v0(15, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final g3.a x() {
        Parcel parcelV0 = v0(13, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String y() {
        Parcel parcelV0 = v0(7, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String z() {
        Parcel parcelV0 = v0(4, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }
}
