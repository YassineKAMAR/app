package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z33 extends b3.a {
    public static final Parcelable.Creator<z33> CREATOR = new a43();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17998e;

    z33(int i8, int i9, int i10, String str, String str2) {
        this.f17994a = i8;
        this.f17995b = i9;
        this.f17996c = str;
        this.f17997d = str2;
        this.f17998e = i10;
    }

    public z33(int i8, int i9, String str, String str2) {
        this(1, 1, i9 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f17994a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.k(parcel, 2, this.f17995b);
        b3.c.q(parcel, 3, this.f17996c, false);
        b3.c.q(parcel, 4, this.f17997d, false);
        b3.c.k(parcel, 5, this.f17998e);
        b3.c.b(parcel, iA);
    }
}
