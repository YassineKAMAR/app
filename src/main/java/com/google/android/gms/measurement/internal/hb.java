package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class hb extends b3.a {
    public static final Parcelable.Creator<hb> CREATOR = new gb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f20073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Float f20074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f20077h;

    hb(int i8, String str, long j8, Long l8, Float f8, String str2, String str3, Double d8) {
        this.f20070a = i8;
        this.f20071b = str;
        this.f20072c = j8;
        this.f20073d = l8;
        this.f20074e = null;
        if (i8 == 1) {
            this.f20077h = f8 != null ? Double.valueOf(f8.doubleValue()) : null;
        } else {
            this.f20077h = d8;
        }
        this.f20075f = str2;
        this.f20076g = str3;
    }

    hb(jb jbVar) {
        this(jbVar.f20164c, jbVar.f20165d, jbVar.f20166e, jbVar.f20163b);
    }

    hb(String str, long j8, Object obj, String str2) {
        a3.o.f(str);
        this.f20070a = 2;
        this.f20071b = str;
        this.f20072c = j8;
        this.f20076g = str2;
        if (obj == null) {
            this.f20073d = null;
            this.f20074e = null;
            this.f20077h = null;
            this.f20075f = null;
            return;
        }
        if (obj instanceof Long) {
            this.f20073d = (Long) obj;
            this.f20074e = null;
            this.f20077h = null;
            this.f20075f = null;
            return;
        }
        if (obj instanceof String) {
            this.f20073d = null;
            this.f20074e = null;
            this.f20077h = null;
            this.f20075f = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.f20073d = null;
        this.f20074e = null;
        this.f20077h = (Double) obj;
        this.f20075f = null;
    }

    public final Object g() {
        Long l8 = this.f20073d;
        if (l8 != null) {
            return l8;
        }
        Double d8 = this.f20077h;
        if (d8 != null) {
            return d8;
        }
        String str = this.f20075f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, this.f20070a);
        b3.c.q(parcel, 2, this.f20071b, false);
        b3.c.n(parcel, 3, this.f20072c);
        b3.c.o(parcel, 4, this.f20073d, false);
        b3.c.i(parcel, 5, null, false);
        b3.c.q(parcel, 6, this.f20075f, false);
        b3.c.q(parcel, 7, this.f20076g, false);
        b3.c.g(parcel, 8, this.f20077h, false);
        b3.c.b(parcel, iA);
    }
}
