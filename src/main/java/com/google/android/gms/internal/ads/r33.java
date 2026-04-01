package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r33 implements tc0 {
    public static final Parcelable.Creator<r33> CREATOR = new p13();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13886d;

    /* synthetic */ r33(Parcel parcel, q23 q23Var) {
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f13883a = string;
        this.f13884b = parcel.createByteArray();
        this.f13885c = parcel.readInt();
        this.f13886d = parcel.readInt();
    }

    public r33(String str, byte[] bArr, int i8, int i9) {
        this.f13883a = str;
        this.f13884b = bArr;
        this.f13885c = i8;
        this.f13886d = i9;
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public final /* synthetic */ void a(v80 v80Var) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r33.class == obj.getClass()) {
            r33 r33Var = (r33) obj;
            if (this.f13883a.equals(r33Var.f13883a) && Arrays.equals(this.f13884b, r33Var.f13884b) && this.f13885c == r33Var.f13885c && this.f13886d == r33Var.f13886d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13883a.hashCode() + 527) * 31) + Arrays.hashCode(this.f13884b)) * 31) + this.f13885c) * 31) + this.f13886d;
    }

    public final String toString() {
        String str;
        int i8 = this.f13886d;
        if (i8 != 1) {
            if (i8 == 23) {
                byte[] bArr = this.f13884b;
                int i9 = nz2.f12300a;
                uu1.d(bArr.length == 4);
                str = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | ((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8)));
            } else if (i8 != 67) {
                byte[] bArr2 = this.f13884b;
                int length = bArr2.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (int i10 = 0; i10 < bArr2.length; i10++) {
                    sb.append(Character.forDigit((bArr2[i10] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr2[i10] & 15, 16));
                }
                str = sb.toString();
            } else {
                byte[] bArr3 = this.f13884b;
                int i11 = nz2.f12300a;
                uu1.d(bArr3.length == 4);
                str = String.valueOf(bArr3[3] | (bArr3[1] << 16) | (bArr3[0] << 24) | (bArr3[2] << 8));
            }
        } else {
            str = new String(this.f13884b, x73.f17098c);
        }
        return "mdta: key=" + this.f13883a + ", value=" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f13883a);
        parcel.writeByteArray(this.f13884b);
        parcel.writeInt(this.f13885c);
        parcel.writeInt(this.f13886d);
    }
}
