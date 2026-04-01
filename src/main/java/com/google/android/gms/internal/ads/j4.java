package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends o4 {
    public static final Parcelable.Creator<j4> CREATOR = new i4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f9479e;

    j4(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f9476b = string;
        this.f9477c = parcel.readString();
        this.f9478d = parcel.readString();
        this.f9479e = parcel.createByteArray();
    }

    public j4(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f9476b = str;
        this.f9477c = str2;
        this.f9478d = str3;
        this.f9479e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j4.class == obj.getClass()) {
            j4 j4Var = (j4) obj;
            if (nz2.e(this.f9476b, j4Var.f9476b) && nz2.e(this.f9477c, j4Var.f9477c) && nz2.e(this.f9478d, j4Var.f9478d) && Arrays.equals(this.f9479e, j4Var.f9479e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9476b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f9477c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i8 = iHashCode + 527;
        String str3 = this.f9478d;
        return (((((i8 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9479e);
    }

    @Override // com.google.android.gms.internal.ads.o4
    public final String toString() {
        return this.f12359a + ": mimeType=" + this.f9476b + ", filename=" + this.f9477c + ", description=" + this.f9478d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f9476b);
        parcel.writeString(this.f9477c);
        parcel.writeString(this.f9478d);
        parcel.writeByteArray(this.f9479e);
    }
}
