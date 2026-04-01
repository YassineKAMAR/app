package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m33 extends b3.a {
    public static final Parcelable.Creator<m33> CREATOR = new n33();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11148b;

    m33(int i8, byte[] bArr) {
        this.f11147a = i8;
        this.f11148b = bArr;
    }

    public m33(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f11147a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.f(parcel, 2, this.f11148b, false);
        b3.c.b(parcel, iA);
    }
}
