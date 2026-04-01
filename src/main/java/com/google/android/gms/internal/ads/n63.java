package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n63 implements tc0 {
    public static final Parcelable.Creator<n63> CREATOR = new r43();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11709b;

    public n63(float f8, float f9) {
        boolean z7 = false;
        if (f8 >= -90.0f && f8 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f) {
            z7 = true;
        }
        uu1.e(z7, "Invalid latitude or longitude");
        this.f11708a = f8;
        this.f11709b = f9;
    }

    /* synthetic */ n63(Parcel parcel, m53 m53Var) {
        this.f11708a = parcel.readFloat();
        this.f11709b = parcel.readFloat();
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
        if (obj != null && n63.class == obj.getClass()) {
            n63 n63Var = (n63) obj;
            if (this.f11708a == n63Var.f11708a && this.f11709b == n63Var.f11709b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f11708a).hashCode() + 527) * 31) + Float.valueOf(this.f11709b).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.f11708a + ", longitude=" + this.f11709b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.f11708a);
        parcel.writeFloat(this.f11709b);
    }
}
