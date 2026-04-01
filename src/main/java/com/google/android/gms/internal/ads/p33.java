package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p33 extends b3.a {
    public static final Parcelable.Creator<p33> CREATOR = new q33();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12735c;

    p33(int i8, String str, String str2) {
        this.f12733a = i8;
        this.f12734b = str;
        this.f12735c = str2;
    }

    public p33(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f12733a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.q(parcel, 2, this.f12734b, false);
        b3.c.q(parcel, 3, this.f12735c, false);
        b3.c.b(parcel, iA);
    }
}
