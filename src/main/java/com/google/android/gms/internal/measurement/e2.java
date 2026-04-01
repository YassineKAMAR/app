package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends b3.a {
    public static final Parcelable.Creator<e2> CREATOR = new h2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f18671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18672h;

    public e2(long j8, long j9, boolean z7, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f18665a = j8;
        this.f18666b = j9;
        this.f18667c = z7;
        this.f18668d = str;
        this.f18669e = str2;
        this.f18670f = str3;
        this.f18671g = bundle;
        this.f18672h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.n(parcel, 1, this.f18665a);
        b3.c.n(parcel, 2, this.f18666b);
        b3.c.c(parcel, 3, this.f18667c);
        b3.c.q(parcel, 4, this.f18668d, false);
        b3.c.q(parcel, 5, this.f18669e, false);
        b3.c.q(parcel, 6, this.f18670f, false);
        b3.c.e(parcel, 7, this.f18671g, false);
        b3.c.q(parcel, 8, this.f18672h, false);
        b3.c.b(parcel, iA);
    }
}
