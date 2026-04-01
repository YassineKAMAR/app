package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class x63 extends kk implements y63 {
    public x63() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) lk.a(parcel, Bundle.CREATOR);
        lk.c(parcel);
        c4(bundle);
        return true;
    }
}
