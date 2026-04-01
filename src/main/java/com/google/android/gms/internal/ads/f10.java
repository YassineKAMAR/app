package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f10 extends b3.a {
    public static final Parcelable.Creator<f10> CREATOR = new g10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7570d;

    public f10(String str, boolean z7, int i8, String str2) {
        this.f7567a = str;
        this.f7568b = z7;
        this.f7569c = i8;
        this.f7570d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7567a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, str, false);
        b3.c.c(parcel, 2, this.f7568b);
        b3.c.k(parcel, 3, this.f7569c);
        b3.c.q(parcel, 4, this.f7570d, false);
        b3.c.b(parcel, iA);
    }
}
