package com.google.android.gms.common.api;

import a3.o;
import android.os.Parcel;
import android.os.Parcelable;
import b3.c;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends b3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f4783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4784b;

    Scope(int i8, String str) {
        o.g(str, "scopeUri must not be null or empty");
        this.f4783a = i8;
        this.f4784b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f4784b.equals(((Scope) obj).f4784b);
        }
        return false;
    }

    public String g() {
        return this.f4784b;
    }

    public int hashCode() {
        return this.f4784b.hashCode();
    }

    public String toString() {
        return this.f4784b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.k(parcel, 1, this.f4783a);
        c.q(parcel, 2, g(), false);
        c.b(parcel, iA);
    }
}
