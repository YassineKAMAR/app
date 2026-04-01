package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g3.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qx extends jk implements sx {
    qx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final List A() {
        Parcel parcelV0 = v0(23, k0());
        ArrayList arrayListB = lk.b(parcelV0);
        parcelV0.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String C() {
        Parcel parcelV0 = v0(10, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void D() {
        H0(13, k0());
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final List E() {
        Parcel parcelV0 = v0(3, k0());
        ArrayList arrayListB = lk.b(parcelV0);
        parcelV0.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String G() {
        Parcel parcelV0 = v0(9, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final double m() {
        Parcel parcelV0 = v0(8, k0());
        double d8 = parcelV0.readDouble();
        parcelV0.recycle();
        return d8;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final h2.p2 o() {
        Parcel parcelV0 = v0(11, k0());
        h2.p2 p2VarO5 = h2.o2.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return p2VarO5;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final h2.m2 q() {
        Parcel parcelV0 = v0(31, k0());
        h2.m2 m2VarO5 = h2.l2.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return m2VarO5;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final pv r() {
        pv nvVar;
        Parcel parcelV0 = v0(14, k0());
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            nvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            nvVar = iInterfaceQueryLocalInterface instanceof pv ? (pv) iInterfaceQueryLocalInterface : new nv(strongBinder);
        }
        parcelV0.recycle();
        return nvVar;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final wv s() {
        wv uvVar;
        Parcel parcelV0 = v0(5, k0());
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            uvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            uvVar = iInterfaceQueryLocalInterface instanceof wv ? (wv) iInterfaceQueryLocalInterface : new uv(strongBinder);
        }
        parcelV0.recycle();
        return uvVar;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final g3.a u() {
        Parcel parcelV0 = v0(19, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String v() {
        Parcel parcelV0 = v0(7, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String w() {
        Parcel parcelV0 = v0(4, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final g3.a x() {
        Parcel parcelV0 = v0(18, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String y() {
        Parcel parcelV0 = v0(6, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void y2(h2.f2 f2Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, f2Var);
        H0(32, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String z() {
        Parcel parcelV0 = v0(2, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }
}
