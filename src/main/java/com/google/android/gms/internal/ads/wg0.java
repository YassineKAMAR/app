package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wg0 extends b3.a {
    public static final Parcelable.Creator<wg0> CREATOR = new yg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16727e;

    public wg0(int i8, int i9, boolean z7, boolean z8) {
        this(233702000, i9, true, false, z8);
    }

    public wg0(int i8, int i9, boolean z7, boolean z8, boolean z9) {
        this("afma-sdk-a-v" + i8 + "." + i9 + "." + (z7 ? "0" : "1"), i8, i9, z7, z9);
    }

    wg0(String str, int i8, int i9, boolean z7, boolean z8) {
        this.f16723a = str;
        this.f16724b = i8;
        this.f16725c = i9;
        this.f16726d = z7;
        this.f16727e = z8;
    }

    public static wg0 g() {
        return new wg0(12451000, 12451000, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 2, this.f16723a, false);
        b3.c.k(parcel, 3, this.f16724b);
        b3.c.k(parcel, 4, this.f16725c);
        b3.c.c(parcel, 5, this.f16726d);
        b3.c.c(parcel, 6, this.f16727e);
        b3.c.b(parcel, iA);
    }
}
