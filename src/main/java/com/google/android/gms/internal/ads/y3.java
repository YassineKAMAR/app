package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y3 extends o4 {
    public static final Parcelable.Creator<y3> CREATOR = new x3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f17573e;

    y3(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f17570b = string;
        this.f17571c = parcel.readString();
        this.f17572d = parcel.readInt();
        this.f17573e = parcel.createByteArray();
    }

    public y3(String str, String str2, int i8, byte[] bArr) {
        super("APIC");
        this.f17570b = str;
        this.f17571c = str2;
        this.f17572d = i8;
        this.f17573e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.o4, com.google.android.gms.internal.ads.tc0
    public final void a(v80 v80Var) {
        v80Var.s(this.f17573e, this.f17572d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y3.class == obj.getClass()) {
            y3 y3Var = (y3) obj;
            if (this.f17572d == y3Var.f17572d && nz2.e(this.f17570b, y3Var.f17570b) && nz2.e(this.f17571c, y3Var.f17571c) && Arrays.equals(this.f17573e, y3Var.f17573e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17570b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i8 = this.f17572d;
        String str2 = this.f17571c;
        return ((((((i8 + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f17573e);
    }

    @Override // com.google.android.gms.internal.ads.o4
    public final String toString() {
        return this.f12359a + ": mimeType=" + this.f17570b + ", description=" + this.f17571c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f17570b);
        parcel.writeString(this.f17571c);
        parcel.writeInt(this.f17572d);
        parcel.writeByteArray(this.f17573e);
    }
}
