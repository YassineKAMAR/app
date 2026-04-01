package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class xc0 extends b3.a {
    public static final Parcelable.Creator<xc0> CREATOR = new yc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17167b;

    public xc0(String str, String str2) {
        this.f17166a = str;
        this.f17167b = str2;
    }

    public xc0(r2.e eVar) {
        this(eVar.b(), eVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f17166a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, str, false);
        b3.c.q(parcel, 2, this.f17167b, false);
        b3.c.b(parcel, iA);
    }
}
