package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class w3 implements tc0 {
    public static final Parcelable.Creator<w3> CREATOR = new v3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16607f;

    public w3(int i8, String str, String str2, String str3, boolean z7, int i9) {
        boolean z8 = true;
        if (i9 != -1 && i9 <= 0) {
            z8 = false;
        }
        uu1.d(z8);
        this.f16602a = i8;
        this.f16603b = str;
        this.f16604c = str2;
        this.f16605d = str3;
        this.f16606e = z7;
        this.f16607f = i9;
    }

    w3(Parcel parcel) {
        this.f16602a = parcel.readInt();
        this.f16603b = parcel.readString();
        this.f16604c = parcel.readString();
        this.f16605d = parcel.readString();
        int i8 = nz2.f12300a;
        this.f16606e = parcel.readInt() != 0;
        this.f16607f = parcel.readInt();
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public final void a(v80 v80Var) {
        String str = this.f16604c;
        if (str != null) {
            v80Var.H(str);
        }
        String str2 = this.f16603b;
        if (str2 != null) {
            v80Var.A(str2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w3.class == obj.getClass()) {
            w3 w3Var = (w3) obj;
            if (this.f16602a == w3Var.f16602a && nz2.e(this.f16603b, w3Var.f16603b) && nz2.e(this.f16604c, w3Var.f16604c) && nz2.e(this.f16605d, w3Var.f16605d) && this.f16606e == w3Var.f16606e && this.f16607f == w3Var.f16607f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16603b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i8 = this.f16602a;
        String str2 = this.f16604c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i9 = ((i8 + 527) * 31) + iHashCode;
        String str3 = this.f16605d;
        return (((((((i9 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f16606e ? 1 : 0)) * 31) + this.f16607f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f16604c + "\", genre=\"" + this.f16603b + "\", bitrate=" + this.f16602a + ", metadataInterval=" + this.f16607f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f16602a);
        parcel.writeString(this.f16603b);
        parcel.writeString(this.f16604c);
        parcel.writeString(this.f16605d);
        int i9 = nz2.f12300a;
        parcel.writeInt(this.f16606e ? 1 : 0);
        parcel.writeInt(this.f16607f);
    }
}
