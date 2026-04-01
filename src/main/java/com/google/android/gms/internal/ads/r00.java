package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r00 extends b3.a {
    public static final Parcelable.Creator<r00> CREATOR = new s00();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f13821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f13822c;

    r00(String str, String[] strArr, String[] strArr2) {
        this.f13820a = str;
        this.f13821b = strArr;
        this.f13822c = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f13820a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, str, false);
        b3.c.r(parcel, 2, this.f13821b, false);
        b3.c.r(parcel, 3, this.f13822c, false);
        b3.c.b(parcel, iA);
    }
}
