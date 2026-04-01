package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends o4 {
    public static final Parcelable.Creator<h4> CREATOR = new f4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8621d;

    h4(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f8619b = string;
        this.f8620c = parcel.readString();
        this.f8621d = parcel.readString();
    }

    public h4(String str, String str2, String str3) {
        super("COMM");
        this.f8619b = str;
        this.f8620c = str2;
        this.f8621d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h4.class == obj.getClass()) {
            h4 h4Var = (h4) obj;
            if (nz2.e(this.f8620c, h4Var.f8620c) && nz2.e(this.f8619b, h4Var.f8619b) && nz2.e(this.f8621d, h4Var.f8621d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8619b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f8620c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i8 = iHashCode + 527;
        String str3 = this.f8621d;
        return (((i8 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.o4
    public final String toString() {
        return this.f12359a + ": language=" + this.f8619b + ", description=" + this.f8620c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f12359a);
        parcel.writeString(this.f8619b);
        parcel.writeString(this.f8621d);
    }
}
