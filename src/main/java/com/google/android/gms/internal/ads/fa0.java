package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends b3.a {
    public static final Parcelable.Creator<fa0> CREATOR = new ga0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f7684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f7685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7688g;

    public fa0(String str, int i8, Bundle bundle, byte[] bArr, boolean z7, String str2, String str3) {
        this.f7682a = str;
        this.f7683b = i8;
        this.f7684c = bundle;
        this.f7685d = bArr;
        this.f7686e = z7;
        this.f7687f = str2;
        this.f7688g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7682a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, str, false);
        b3.c.k(parcel, 2, this.f7683b);
        b3.c.e(parcel, 3, this.f7684c, false);
        b3.c.f(parcel, 4, this.f7685d, false);
        b3.c.c(parcel, 5, this.f7686e);
        b3.c.q(parcel, 6, this.f7687f, false);
        b3.c.q(parcel, 7, this.f7688g, false);
        b3.c.b(parcel, iA);
    }
}
