package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends o4 {
    public static final Parcelable.Creator<s4> CREATOR = new r4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f14515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f14516f;

    public s4(int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f14512b = i8;
        this.f14513c = i9;
        this.f14514d = i10;
        this.f14515e = iArr;
        this.f14516f = iArr2;
    }

    s4(Parcel parcel) {
        super("MLLT");
        this.f14512b = parcel.readInt();
        this.f14513c = parcel.readInt();
        this.f14514d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i8 = nz2.f12300a;
        this.f14515e = iArrCreateIntArray;
        this.f14516f = parcel.createIntArray();
    }

    @Override // com.google.android.gms.internal.ads.o4, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s4.class == obj.getClass()) {
            s4 s4Var = (s4) obj;
            if (this.f14512b == s4Var.f14512b && this.f14513c == s4Var.f14513c && this.f14514d == s4Var.f14514d && Arrays.equals(this.f14515e, s4Var.f14515e) && Arrays.equals(this.f14516f, s4Var.f14516f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f14512b + 527) * 31) + this.f14513c) * 31) + this.f14514d) * 31) + Arrays.hashCode(this.f14515e)) * 31) + Arrays.hashCode(this.f14516f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f14512b);
        parcel.writeInt(this.f14513c);
        parcel.writeInt(this.f14514d);
        parcel.writeIntArray(this.f14515e);
        parcel.writeIntArray(this.f14516f);
    }
}
