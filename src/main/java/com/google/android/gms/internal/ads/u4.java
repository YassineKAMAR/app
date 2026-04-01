package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u4 extends o4 {
    public static final Parcelable.Creator<u4> CREATOR = new t4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f15472c;

    u4(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f15471b = string;
        this.f15472c = parcel.createByteArray();
    }

    public u4(String str, byte[] bArr) {
        super("PRIV");
        this.f15471b = str;
        this.f15472c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u4.class == obj.getClass()) {
            u4 u4Var = (u4) obj;
            if (nz2.e(this.f15471b, u4Var.f15471b) && Arrays.equals(this.f15472c, u4Var.f15472c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15471b;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f15472c);
    }

    @Override // com.google.android.gms.internal.ads.o4
    public final String toString() {
        return this.f12359a + ": owner=" + this.f15471b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f15471b);
        parcel.writeByteArray(this.f15472c);
    }
}
