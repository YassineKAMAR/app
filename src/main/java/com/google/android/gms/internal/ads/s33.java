package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s33 extends b3.a {
    public static final Parcelable.Creator<s33> CREATOR = new t33();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ze f14510b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f14511c;

    s33(int i8, byte[] bArr) {
        this.f14509a = i8;
        this.f14511c = bArr;
        k();
    }

    private final void k() {
        ze zeVar = this.f14510b;
        if (zeVar != null || this.f14511c == null) {
            if (zeVar == null || this.f14511c != null) {
                if (zeVar != null && this.f14511c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zeVar != null || this.f14511c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final ze g() {
        if (this.f14510b == null) {
            try {
                this.f14510b = ze.I0(this.f14511c, m04.a());
                this.f14511c = null;
            } catch (m14 | NullPointerException e8) {
                throw new IllegalStateException(e8);
            }
        }
        k();
        return this.f14510b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f14509a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        byte[] bArrG = this.f14511c;
        if (bArrG == null) {
            bArrG = this.f14510b.g();
        }
        b3.c.f(parcel, 2, bArrG, false);
        b3.c.b(parcel, iA);
    }
}
