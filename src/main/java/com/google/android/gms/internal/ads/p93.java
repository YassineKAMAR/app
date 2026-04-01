package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p93 implements tc0 {
    public static final Parcelable.Creator<p93> CREATOR = new o73();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12799c;

    public p93(long j8, long j9, long j10) {
        this.f12797a = j8;
        this.f12798b = j9;
        this.f12799c = j10;
    }

    /* synthetic */ p93(Parcel parcel, p83 p83Var) {
        this.f12797a = parcel.readLong();
        this.f12798b = parcel.readLong();
        this.f12799c = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public final /* synthetic */ void a(v80 v80Var) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p93)) {
            return false;
        }
        p93 p93Var = (p93) obj;
        return this.f12797a == p93Var.f12797a && this.f12798b == p93Var.f12798b && this.f12799c == p93Var.f12799c;
    }

    public final int hashCode() {
        long j8 = this.f12799c;
        long j9 = this.f12797a;
        int i8 = ((int) (j9 ^ (j9 >>> 32))) + 527;
        long j10 = j8 ^ (j8 >>> 32);
        long j11 = this.f12798b;
        return (((i8 * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) j10);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f12797a + ", modification time=" + this.f12798b + ", timescale=" + this.f12799c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f12797a);
        parcel.writeLong(this.f12798b);
        parcel.writeLong(this.f12799c);
    }
}
