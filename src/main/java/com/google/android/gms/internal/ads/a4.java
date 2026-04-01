package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a4 extends o4 {
    public static final Parcelable.Creator<a4> CREATOR = new z3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5013b;

    /* JADX WARN: Illegal instructions before constructor call */
    a4(Parcel parcel) {
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        super(string);
        this.f5013b = parcel.createByteArray();
    }

    public a4(String str, byte[] bArr) {
        super(str);
        this.f5013b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a4.class == obj.getClass()) {
            a4 a4Var = (a4) obj;
            if (this.f12359a.equals(a4Var.f12359a) && Arrays.equals(this.f5013b, a4Var.f5013b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12359a.hashCode() + 527) * 31) + Arrays.hashCode(this.f5013b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f12359a);
        parcel.writeByteArray(this.f5013b);
    }
}
