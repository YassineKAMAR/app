package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ex extends jk implements gx {
    ex(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void f3(h2.s0 s0Var, g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, s0Var);
        lk.f(parcelK0, aVar);
        H0(1, parcelK0);
    }
}
