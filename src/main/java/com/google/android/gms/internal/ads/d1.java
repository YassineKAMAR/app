package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Parcelable {
    public static final Parcelable.Creator<d1> CREATOR = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f6536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6539e;

    d1(Parcel parcel) {
        this.f6536b = new UUID(parcel.readLong(), parcel.readLong());
        this.f6537c = parcel.readString();
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f6538d = string;
        this.f6539e = parcel.createByteArray();
    }

    public d1(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f6536b = uuid;
        this.f6537c = null;
        this.f6538d = str2;
        this.f6539e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        d1 d1Var = (d1) obj;
        return nz2.e(this.f6537c, d1Var.f6537c) && nz2.e(this.f6538d, d1Var.f6538d) && nz2.e(this.f6536b, d1Var.f6536b) && Arrays.equals(this.f6539e, d1Var.f6539e);
    }

    public final int hashCode() {
        int i8 = this.f6535a;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = this.f6536b.hashCode() * 31;
        String str = this.f6537c;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f6538d.hashCode()) * 31) + Arrays.hashCode(this.f6539e);
        this.f6535a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f6536b.getMostSignificantBits());
        parcel.writeLong(this.f6536b.getLeastSignificantBits());
        parcel.writeString(this.f6537c);
        parcel.writeString(this.f6538d);
        parcel.writeByteArray(this.f6539e);
    }
}
