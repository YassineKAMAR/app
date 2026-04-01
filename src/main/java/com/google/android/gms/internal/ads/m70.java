package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m70 extends b3.a {
    public static final Parcelable.Creator<m70> CREATOR = new n70();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11197c;

    m70(int i8, int i9, int i10) {
        this.f11195a = i8;
        this.f11196b = i9;
        this.f11197c = i10;
    }

    public static m70 g(z1.x xVar) {
        return new m70(xVar.a(), xVar.c(), xVar.b());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m70)) {
            m70 m70Var = (m70) obj;
            if (m70Var.f11197c == this.f11197c && m70Var.f11196b == this.f11196b && m70Var.f11195a == this.f11195a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f11195a, this.f11196b, this.f11197c});
    }

    public final String toString() {
        return this.f11195a + "." + this.f11196b + "." + this.f11197c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f11195a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.k(parcel, 2, this.f11196b);
        b3.c.k(parcel, 3, this.f11197c);
        b3.c.b(parcel, iA);
    }
}
