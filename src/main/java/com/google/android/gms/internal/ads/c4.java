package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c4 extends o4 {
    public static final Parcelable.Creator<c4> CREATOR = new b4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o4[] f6144g;

    c4(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f6139b = string;
        this.f6140c = parcel.readInt();
        this.f6141d = parcel.readInt();
        this.f6142e = parcel.readLong();
        this.f6143f = parcel.readLong();
        int i9 = parcel.readInt();
        this.f6144g = new o4[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            this.f6144g[i10] = (o4) parcel.readParcelable(o4.class.getClassLoader());
        }
    }

    public c4(String str, int i8, int i9, long j8, long j9, o4[] o4VarArr) {
        super("CHAP");
        this.f6139b = str;
        this.f6140c = i8;
        this.f6141d = i9;
        this.f6142e = j8;
        this.f6143f = j9;
        this.f6144g = o4VarArr;
    }

    @Override // com.google.android.gms.internal.ads.o4, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4.class == obj.getClass()) {
            c4 c4Var = (c4) obj;
            if (this.f6140c == c4Var.f6140c && this.f6141d == c4Var.f6141d && this.f6142e == c4Var.f6142e && this.f6143f == c4Var.f6143f && nz2.e(this.f6139b, c4Var.f6139b) && Arrays.equals(this.f6144g, c4Var.f6144g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6139b;
        return ((((((((this.f6140c + 527) * 31) + this.f6141d) * 31) + ((int) this.f6142e)) * 31) + ((int) this.f6143f)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f6139b);
        parcel.writeInt(this.f6140c);
        parcel.writeInt(this.f6141d);
        parcel.writeLong(this.f6142e);
        parcel.writeLong(this.f6143f);
        parcel.writeInt(this.f6144g.length);
        for (o4 o4Var : this.f6144g) {
            parcel.writeParcelable(o4Var, 0);
        }
    }
}
