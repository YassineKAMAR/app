package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e5 implements tc0 {
    public static final Parcelable.Creator<e5> CREATOR = new c5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7126b;

    public e5(float f8, int i8) {
        this.f7125a = f8;
        this.f7126b = i8;
    }

    /* synthetic */ e5(Parcel parcel, d5 d5Var) {
        this.f7125a = parcel.readFloat();
        this.f7126b = parcel.readInt();
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
        if (obj != null && e5.class == obj.getClass()) {
            e5 e5Var = (e5) obj;
            if (this.f7125a == e5Var.f7125a && this.f7126b == e5Var.f7126b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f7125a).hashCode() + 527) * 31) + this.f7126b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f7125a + ", svcTemporalLayerCount=" + this.f7126b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.f7125a);
        parcel.writeInt(this.f7126b);
    }
}
