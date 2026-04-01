package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class na extends b3.a {
    public static final Parcelable.Creator<na> CREATOR = new qa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20304c;

    na(String str, long j8, int i8) {
        this.f20302a = str;
        this.f20303b = j8;
        this.f20304c = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, this.f20302a, false);
        b3.c.n(parcel, 2, this.f20303b);
        b3.c.k(parcel, 3, this.f20304c);
        b3.c.b(parcel, iA);
    }
}
