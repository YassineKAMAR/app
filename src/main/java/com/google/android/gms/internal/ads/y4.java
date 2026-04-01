package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class y4 extends o4 {
    public static final Parcelable.Creator<y4> CREATOR = new x4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17585c;

    /* JADX WARN: Illegal instructions before constructor call */
    y4(Parcel parcel) {
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        super(string);
        this.f17584b = parcel.readString();
        this.f17585c = parcel.readString();
    }

    public y4(String str, String str2, String str3) {
        super(str);
        this.f17584b = str2;
        this.f17585c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y4.class == obj.getClass()) {
            y4 y4Var = (y4) obj;
            if (this.f12359a.equals(y4Var.f12359a) && nz2.e(this.f17584b, y4Var.f17584b) && nz2.e(this.f17585c, y4Var.f17585c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f12359a.hashCode() + 527;
        String str = this.f17584b;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i8 = iHashCode * 31;
        String str2 = this.f17585c;
        return ((i8 + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.o4
    public final String toString() {
        return this.f12359a + ": url=" + this.f17585c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f12359a);
        parcel.writeString(this.f17584b);
        parcel.writeString(this.f17585c);
    }
}
