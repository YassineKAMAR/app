package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wb0 extends b3.a {
    public static final Parcelable.Creator<wb0> CREATOR = new xb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2.r4 f16675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16676b;

    public wb0(h2.r4 r4Var, String str) {
        this.f16675a = r4Var;
        this.f16676b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        h2.r4 r4Var = this.f16675a;
        int iA = b3.c.a(parcel);
        b3.c.p(parcel, 2, r4Var, i8, false);
        b3.c.q(parcel, 3, this.f16676b, false);
        b3.c.b(parcel, iA);
    }
}
