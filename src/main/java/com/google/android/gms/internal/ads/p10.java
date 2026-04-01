package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p10 extends b3.a {
    public static final Parcelable.Creator<p10> CREATOR = new q10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f12698b;

    public p10(String str, Bundle bundle) {
        this.f12697a = str;
        this.f12698b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f12697a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, str, false);
        b3.c.e(parcel, 2, this.f12698b, false);
        b3.c.b(parcel, iA);
    }
}
