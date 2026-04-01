package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p3 implements tc0 {
    public static final Parcelable.Creator<p3> CREATOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final nb f12717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final nb f12718h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f12723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12724f;

    static {
        l9 l9Var = new l9();
        l9Var.u("application/id3");
        f12717g = l9Var.D();
        l9 l9Var2 = new l9();
        l9Var2.u("application/x-scte35");
        f12718h = l9Var2.D();
        CREATOR = new o3();
    }

    p3(Parcel parcel) {
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f12719a = string;
        this.f12720b = parcel.readString();
        this.f12721c = parcel.readLong();
        this.f12722d = parcel.readLong();
        this.f12723e = parcel.createByteArray();
    }

    public p3(String str, String str2, long j8, long j9, byte[] bArr) {
        this.f12719a = str;
        this.f12720b = str2;
        this.f12721c = j8;
        this.f12722d = j9;
        this.f12723e = bArr;
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
        if (obj != null && p3.class == obj.getClass()) {
            p3 p3Var = (p3) obj;
            if (this.f12721c == p3Var.f12721c && this.f12722d == p3Var.f12722d && nz2.e(this.f12719a, p3Var.f12719a) && nz2.e(this.f12720b, p3Var.f12720b) && Arrays.equals(this.f12723e, p3Var.f12723e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f12724f;
        if (i8 != 0) {
            return i8;
        }
        String str = this.f12719a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f12720b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j8 = this.f12721c;
        long j9 = this.f12722d;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + Arrays.hashCode(this.f12723e);
        this.f12724f = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f12719a + ", id=" + this.f12722d + ", durationMs=" + this.f12721c + ", value=" + this.f12720b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f12719a);
        parcel.writeString(this.f12720b);
        parcel.writeLong(this.f12721c);
        parcel.writeLong(this.f12722d);
        parcel.writeByteArray(this.f12723e);
    }
}
