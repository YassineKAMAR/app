package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q4 extends o4 {
    public static final Parcelable.Creator<q4> CREATOR = new p4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13262d;

    q4(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f13260b = string;
        this.f13261c = parcel.readString();
        this.f13262d = parcel.readString();
    }

    public q4(String str, String str2, String str3) {
        super("----");
        this.f13260b = str;
        this.f13261c = str2;
        this.f13262d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q4.class == obj.getClass()) {
            q4 q4Var = (q4) obj;
            if (nz2.e(this.f13261c, q4Var.f13261c) && nz2.e(this.f13260b, q4Var.f13260b) && nz2.e(this.f13262d, q4Var.f13262d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13260b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f13261c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i8 = iHashCode + 527;
        String str3 = this.f13262d;
        return (((i8 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.o4
    public final String toString() {
        return this.f12359a + ": domain=" + this.f13260b + ", description=" + this.f13261c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f12359a);
        parcel.writeString(this.f13260b);
        parcel.writeString(this.f13262d);
    }
}
