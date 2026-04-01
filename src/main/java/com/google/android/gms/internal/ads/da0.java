package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class da0 extends b3.a {
    public static final Parcelable.Creator<da0> CREATOR = new ea0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6634b;

    public da0(boolean z7, List list) {
        this.f6633a = z7;
        this.f6634b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z7 = this.f6633a;
        int iA = b3.c.a(parcel);
        b3.c.c(parcel, 2, z7);
        b3.c.s(parcel, 3, this.f6634b, false);
        b3.c.b(parcel, iA);
    }
}
