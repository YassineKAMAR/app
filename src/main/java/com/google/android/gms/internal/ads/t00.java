package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t00 extends b3.a {
    public static final Parcelable.Creator<t00> CREATOR = new u00();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f14897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f14898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14900h;

    t00(boolean z7, String str, int i8, byte[] bArr, String[] strArr, String[] strArr2, boolean z8, long j8) {
        this.f14893a = z7;
        this.f14894b = str;
        this.f14895c = i8;
        this.f14896d = bArr;
        this.f14897e = strArr;
        this.f14898f = strArr2;
        this.f14899g = z8;
        this.f14900h = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z7 = this.f14893a;
        int iA = b3.c.a(parcel);
        b3.c.c(parcel, 1, z7);
        b3.c.q(parcel, 2, this.f14894b, false);
        b3.c.k(parcel, 3, this.f14895c);
        b3.c.f(parcel, 4, this.f14896d, false);
        b3.c.r(parcel, 5, this.f14897e, false);
        b3.c.r(parcel, 6, this.f14898f, false);
        b3.c.c(parcel, 7, this.f14899g);
        b3.c.n(parcel, 8, this.f14900h);
        b3.c.b(parcel, iA);
    }
}
