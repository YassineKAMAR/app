package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z extends b3.a implements Iterable<String> {
    public static final Parcelable.Creator<z> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f20741a;

    z(Bundle bundle) {
        this.f20741a = bundle;
    }

    public final int g() {
        return this.f20741a.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new c0(this);
    }

    final Double n(String str) {
        return Double.valueOf(this.f20741a.getDouble(str));
    }

    public final Bundle p() {
        return new Bundle(this.f20741a);
    }

    public final String toString() {
        return this.f20741a.toString();
    }

    final Long u(String str) {
        return Long.valueOf(this.f20741a.getLong(str));
    }

    final Object v(String str) {
        return this.f20741a.get(str);
    }

    final String w(String str) {
        return this.f20741a.getString(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.e(parcel, 2, p(), false);
        b3.c.b(parcel, iA);
    }
}
