package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s3 implements tc0 {
    public static final Parcelable.Creator<s3> CREATOR = new r3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f14501h;

    public s3(int i8, String str, String str2, int i9, int i10, int i11, int i12, byte[] bArr) {
        this.f14494a = i8;
        this.f14495b = str;
        this.f14496c = str2;
        this.f14497d = i9;
        this.f14498e = i10;
        this.f14499f = i11;
        this.f14500g = i12;
        this.f14501h = bArr;
    }

    s3(Parcel parcel) {
        this.f14494a = parcel.readInt();
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f14495b = string;
        this.f14496c = parcel.readString();
        this.f14497d = parcel.readInt();
        this.f14498e = parcel.readInt();
        this.f14499f = parcel.readInt();
        this.f14500g = parcel.readInt();
        this.f14501h = parcel.createByteArray();
    }

    public static s3 b(dq2 dq2Var) {
        int iO = dq2Var.o();
        String strH = dq2Var.H(dq2Var.o(), x73.f17096a);
        String strH2 = dq2Var.H(dq2Var.o(), x73.f17098c);
        int iO2 = dq2Var.o();
        int iO3 = dq2Var.o();
        int iO4 = dq2Var.o();
        int iO5 = dq2Var.o();
        int iO6 = dq2Var.o();
        byte[] bArr = new byte[iO6];
        dq2Var.c(bArr, 0, iO6);
        return new s3(iO, strH, strH2, iO2, iO3, iO4, iO5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public final void a(v80 v80Var) {
        v80Var.s(this.f14501h, this.f14494a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s3.class == obj.getClass()) {
            s3 s3Var = (s3) obj;
            if (this.f14494a == s3Var.f14494a && this.f14495b.equals(s3Var.f14495b) && this.f14496c.equals(s3Var.f14496c) && this.f14497d == s3Var.f14497d && this.f14498e == s3Var.f14498e && this.f14499f == s3Var.f14499f && this.f14500g == s3Var.f14500g && Arrays.equals(this.f14501h, s3Var.f14501h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f14494a + 527) * 31) + this.f14495b.hashCode()) * 31) + this.f14496c.hashCode()) * 31) + this.f14497d) * 31) + this.f14498e) * 31) + this.f14499f) * 31) + this.f14500g) * 31) + Arrays.hashCode(this.f14501h);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f14495b + ", description=" + this.f14496c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f14494a);
        parcel.writeString(this.f14495b);
        parcel.writeString(this.f14496c);
        parcel.writeInt(this.f14497d);
        parcel.writeInt(this.f14498e);
        parcel.writeInt(this.f14499f);
        parcel.writeInt(this.f14500g);
        parcel.writeByteArray(this.f14501h);
    }
}
