package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class td0 implements Parcelable {
    public static final Parcelable.Creator<td0> CREATOR = new sb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tc0[] f15057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15058b;

    public td0(long j8, tc0... tc0VarArr) {
        this.f15058b = j8;
        this.f15057a = tc0VarArr;
    }

    td0(Parcel parcel) {
        this.f15057a = new tc0[parcel.readInt()];
        int i8 = 0;
        while (true) {
            tc0[] tc0VarArr = this.f15057a;
            if (i8 >= tc0VarArr.length) {
                this.f15058b = parcel.readLong();
                return;
            } else {
                tc0VarArr[i8] = (tc0) parcel.readParcelable(tc0.class.getClassLoader());
                i8++;
            }
        }
    }

    public td0(List list) {
        this(-9223372036854775807L, (tc0[]) list.toArray(new tc0[0]));
    }

    public final int b() {
        return this.f15057a.length;
    }

    public final tc0 c(int i8) {
        return this.f15057a[i8];
    }

    public final td0 d(tc0... tc0VarArr) {
        int length = tc0VarArr.length;
        if (length == 0) {
            return this;
        }
        long j8 = this.f15058b;
        tc0[] tc0VarArr2 = this.f15057a;
        int i8 = nz2.f12300a;
        int length2 = tc0VarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(tc0VarArr2, length2 + length);
        System.arraycopy(tc0VarArr, 0, objArrCopyOf, length2, length);
        return new td0(j8, (tc0[]) objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final td0 e(td0 td0Var) {
        return td0Var == null ? this : d(td0Var.f15057a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && td0.class == obj.getClass()) {
            td0 td0Var = (td0) obj;
            if (Arrays.equals(this.f15057a, td0Var.f15057a) && this.f15058b == td0Var.f15058b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f15057a) * 31;
        long j8 = this.f15058b;
        return iHashCode + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        String str;
        long j8 = this.f15058b;
        String string = Arrays.toString(this.f15057a);
        if (j8 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j8;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f15057a.length);
        for (tc0 tc0Var : this.f15057a) {
            parcel.writeParcelable(tc0Var, 0);
        }
        parcel.writeLong(this.f15058b);
    }
}
