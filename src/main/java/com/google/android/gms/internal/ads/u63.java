package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class u63 extends jk implements w63 {
    u63(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.w63
    public final void N1(Bundle bundle, y63 y63Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, bundle);
        lk.f(parcelK0, y63Var);
        k3(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.w63
    public final void d3(Bundle bundle, y63 y63Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, bundle);
        lk.f(parcelK0, y63Var);
        k3(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.w63
    public final void j2(String str, Bundle bundle, y63 y63Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        lk.d(parcelK0, bundle);
        lk.f(parcelK0, y63Var);
        k3(1, parcelK0);
    }
}
