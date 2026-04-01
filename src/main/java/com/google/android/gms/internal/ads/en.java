package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class en extends b3.a {
    public static final Parcelable.Creator<en> CREATOR = new fn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ParcelFileDescriptor f7430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f7433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7434e;

    public en() {
        this(null, false, false, 0L, false);
    }

    public en(ParcelFileDescriptor parcelFileDescriptor, boolean z7, boolean z8, long j8, boolean z9) {
        this.f7430a = parcelFileDescriptor;
        this.f7431b = z7;
        this.f7432c = z8;
        this.f7433d = j8;
        this.f7434e = z9;
    }

    public final synchronized long g() {
        return this.f7433d;
    }

    final synchronized ParcelFileDescriptor i() {
        return this.f7430a;
    }

    public final synchronized InputStream n() {
        if (this.f7430a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f7430a);
        this.f7430a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean p() {
        return this.f7431b;
    }

    public final synchronized boolean u() {
        return this.f7430a != null;
    }

    public final synchronized boolean v() {
        return this.f7432c;
    }

    public final synchronized boolean w() {
        return this.f7434e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.p(parcel, 2, i(), i8, false);
        b3.c.c(parcel, 3, p());
        b3.c.c(parcel, 4, v());
        b3.c.n(parcel, 5, g());
        b3.c.c(parcel, 6, w());
        b3.c.b(parcel, iA);
    }
}
