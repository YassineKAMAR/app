package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ha0 extends jk implements ja0 {
    ha0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void M3(ya0 ya0Var, ua0 ua0Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, ya0Var);
        lk.f(parcelK0, ua0Var);
        H0(6, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void N4(ya0 ya0Var, ua0 ua0Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, ya0Var);
        lk.f(parcelK0, ua0Var);
        H0(4, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void m5(ya0 ya0Var, ua0 ua0Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, ya0Var);
        lk.f(parcelK0, ua0Var);
        H0(5, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void u3(String str, ua0 ua0Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        lk.f(parcelK0, ua0Var);
        H0(7, parcelK0);
    }
}
