package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mj3 extends vi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jj3 f11344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij3 f11345f;

    /* synthetic */ mj3(int i8, int i9, int i10, int i11, jj3 jj3Var, ij3 ij3Var, lj3 lj3Var) {
        this.f11340a = i8;
        this.f11341b = i9;
        this.f11342c = i10;
        this.f11343d = i11;
        this.f11344e = jj3Var;
        this.f11345f = ij3Var;
    }

    public final int a() {
        return this.f11340a;
    }

    public final int b() {
        return this.f11341b;
    }

    public final int c() {
        return this.f11342c;
    }

    public final int d() {
        return this.f11343d;
    }

    public final ij3 e() {
        return this.f11345f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mj3)) {
            return false;
        }
        mj3 mj3Var = (mj3) obj;
        return mj3Var.f11340a == this.f11340a && mj3Var.f11341b == this.f11341b && mj3Var.f11342c == this.f11342c && mj3Var.f11343d == this.f11343d && mj3Var.f11344e == this.f11344e && mj3Var.f11345f == this.f11345f;
    }

    public final jj3 f() {
        return this.f11344e;
    }

    public final boolean g() {
        return this.f11344e != jj3.f9662d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mj3.class, Integer.valueOf(this.f11340a), Integer.valueOf(this.f11341b), Integer.valueOf(this.f11342c), Integer.valueOf(this.f11343d), this.f11344e, this.f11345f});
    }

    public final String toString() {
        ij3 ij3Var = this.f11345f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.f11344e) + ", hashType: " + String.valueOf(ij3Var) + ", " + this.f11342c + "-byte IV, and " + this.f11343d + "-byte tags, and " + this.f11340a + "-byte AES key, and " + this.f11341b + "-byte HMAC key)";
    }
}
