package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b5 implements tc0 {
    public static final Parcelable.Creator<b5> CREATOR = new z4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5608e;

    public b5(long j8, long j9, long j10, long j11, long j12) {
        this.f5604a = j8;
        this.f5605b = j9;
        this.f5606c = j10;
        this.f5607d = j11;
        this.f5608e = j12;
    }

    /* synthetic */ b5(Parcel parcel, a5 a5Var) {
        this.f5604a = parcel.readLong();
        this.f5605b = parcel.readLong();
        this.f5606c = parcel.readLong();
        this.f5607d = parcel.readLong();
        this.f5608e = parcel.readLong();
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
        if (obj != null && b5.class == obj.getClass()) {
            b5 b5Var = (b5) obj;
            if (this.f5604a == b5Var.f5604a && this.f5605b == b5Var.f5605b && this.f5606c == b5Var.f5606c && this.f5607d == b5Var.f5607d && this.f5608e == b5Var.f5608e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f5608e;
        long j9 = this.f5604a;
        int i8 = ((int) (j9 ^ (j9 >>> 32))) + 527;
        long j10 = j8 ^ (j8 >>> 32);
        long j11 = this.f5607d;
        long j12 = j11 ^ (j11 >>> 32);
        long j13 = this.f5606c;
        long j14 = j13 ^ (j13 >>> 32);
        long j15 = this.f5605b;
        return (((((((i8 * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) j14)) * 31) + ((int) j12)) * 31) + ((int) j10);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f5604a + ", photoSize=" + this.f5605b + ", photoPresentationTimestampUs=" + this.f5606c + ", videoStartPosition=" + this.f5607d + ", videoSize=" + this.f5608e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f5604a);
        parcel.writeLong(this.f5605b);
        parcel.writeLong(this.f5606c);
        parcel.writeLong(this.f5607d);
        parcel.writeLong(this.f5608e);
    }
}
