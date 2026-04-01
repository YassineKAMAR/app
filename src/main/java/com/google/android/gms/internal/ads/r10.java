package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r10 extends b3.a {
    public static final Parcelable.Creator<r10> CREATOR = new s10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13861d;

    public r10(int i8, int i9, String str, int i10) {
        this.f13858a = i8;
        this.f13859b = i9;
        this.f13860c = str;
        this.f13861d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f13859b;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.q(parcel, 2, this.f13860c, false);
        b3.c.k(parcel, 3, this.f13861d);
        b3.c.k(parcel, 1000, this.f13858a);
        b3.c.b(parcel, iA);
    }
}
