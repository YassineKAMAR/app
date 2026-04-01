package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e4 extends o4 {
    public static final Parcelable.Creator<e4> CREATOR = new d4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f7115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o4[] f7116f;

    e4(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f7112b = string;
        this.f7113c = parcel.readByte() != 0;
        this.f7114d = parcel.readByte() != 0;
        this.f7115e = parcel.createStringArray();
        int i9 = parcel.readInt();
        this.f7116f = new o4[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            this.f7116f[i10] = (o4) parcel.readParcelable(o4.class.getClassLoader());
        }
    }

    public e4(String str, boolean z7, boolean z8, String[] strArr, o4[] o4VarArr) {
        super("CTOC");
        this.f7112b = str;
        this.f7113c = z7;
        this.f7114d = z8;
        this.f7115e = strArr;
        this.f7116f = o4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e4.class == obj.getClass()) {
            e4 e4Var = (e4) obj;
            if (this.f7113c == e4Var.f7113c && this.f7114d == e4Var.f7114d && nz2.e(this.f7112b, e4Var.f7112b) && Arrays.equals(this.f7115e, e4Var.f7115e) && Arrays.equals(this.f7116f, e4Var.f7116f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7112b;
        return (((((this.f7113c ? 1 : 0) + 527) * 31) + (this.f7114d ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f7112b);
        parcel.writeByte(this.f7113c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7114d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f7115e);
        parcel.writeInt(this.f7116f.length);
        for (o4 o4Var : this.f7116f) {
            parcel.writeParcelable(o4Var, 0);
        }
    }
}
