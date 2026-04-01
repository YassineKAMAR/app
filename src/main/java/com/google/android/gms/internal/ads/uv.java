package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class uv extends jk implements wv {
    uv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final double k() {
        Parcel parcelV0 = v0(3, k0());
        double d8 = parcelV0.readDouble();
        parcelV0.recycle();
        return d8;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int l() {
        Parcel parcelV0 = v0(5, k0());
        int i8 = parcelV0.readInt();
        parcelV0.recycle();
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final Uri m() {
        Parcel parcelV0 = v0(2, k0());
        Uri uri = (Uri) lk.a(parcelV0, Uri.CREATOR);
        parcelV0.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final g3.a n() {
        Parcel parcelV0 = v0(1, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int p() {
        Parcel parcelV0 = v0(4, k0());
        int i8 = parcelV0.readInt();
        parcelV0.recycle();
        return i8;
    }
}
