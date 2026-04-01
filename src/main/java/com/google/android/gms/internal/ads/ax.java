package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ax extends jk implements cx {
    ax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.cx
    public final void E3(pw pwVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, pwVar);
        H0(1, parcelK0);
    }
}
