package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b43 extends b3.a {
    public static final Parcelable.Creator<b43> CREATOR = new c43();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5603c;

    b43(int i8, byte[] bArr, int i9) {
        this.f5601a = i8;
        this.f5602b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f5603c = i9;
    }

    public b43(byte[] bArr, int i8) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f5601a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.f(parcel, 2, this.f5602b, false);
        b3.c.k(parcel, 3, this.f5603c);
        b3.c.b(parcel, iA);
    }
}
