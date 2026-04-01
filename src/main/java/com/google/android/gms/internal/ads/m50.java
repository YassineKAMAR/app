package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import g3.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m50 extends jk {
    m50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final boolean A() {
        Parcel parcelV0 = v0(12, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    public final void B() {
        H0(8, k0());
    }

    public final g3.a G5() {
        Parcel parcelV0 = v0(20, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    public final g3.a N5() {
        Parcel parcelV0 = v0(21, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    public final List O5() {
        Parcel parcelV0 = v0(3, k0());
        ArrayList arrayListB = lk.b(parcelV0);
        parcelV0.recycle();
        return arrayListB;
    }

    public final void P5(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(9, parcelK0);
    }

    public final void Q5(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(10, parcelK0);
    }

    public final void R5(g3.a aVar, g3.a aVar2, g3.a aVar3) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, aVar2);
        lk.f(parcelK0, aVar3);
        H0(22, parcelK0);
    }

    public final void S5(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(14, parcelK0);
    }

    public final boolean T5() {
        Parcel parcelV0 = v0(11, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    public final wv h5() {
        Parcel parcelV0 = v0(5, k0());
        wv wvVarO5 = vv.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return wvVarO5;
    }

    public final Bundle m() {
        Parcel parcelV0 = v0(13, k0());
        Bundle bundle = (Bundle) lk.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle;
    }

    public final h2.p2 q3() {
        Parcel parcelV0 = v0(16, k0());
        h2.p2 p2VarO5 = h2.o2.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return p2VarO5;
    }

    public final g3.a r() {
        Parcel parcelV0 = v0(15, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    public final String u() {
        Parcel parcelV0 = v0(7, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    public final String v() {
        Parcel parcelV0 = v0(6, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    public final String w() {
        Parcel parcelV0 = v0(2, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    public final String x() {
        Parcel parcelV0 = v0(4, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    public final pv y4() {
        Parcel parcelV0 = v0(19, k0());
        pv pvVarO5 = ov.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return pvVarO5;
    }
}
