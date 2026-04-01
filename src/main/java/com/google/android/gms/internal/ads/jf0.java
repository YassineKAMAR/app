package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jf0 extends b3.a {
    public static final Parcelable.Creator<jf0> CREATOR = new kf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final h2.w4 f9592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2.r4 f9593d;

    public jf0(String str, String str2, h2.w4 w4Var, h2.r4 r4Var) {
        this.f9590a = str;
        this.f9591b = str2;
        this.f9592c = w4Var;
        this.f9593d = r4Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f9590a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, str, false);
        b3.c.q(parcel, 2, this.f9591b, false);
        b3.c.p(parcel, 3, this.f9592c, i8, false);
        b3.c.p(parcel, 4, this.f9593d, i8, false);
        b3.c.b(parcel, iA);
    }
}
