package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gk3 extends vi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8379c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ek3 f8380d;

    /* synthetic */ gk3(int i8, int i9, int i10, ek3 ek3Var, fk3 fk3Var) {
        this.f8377a = i8;
        this.f8378b = i9;
        this.f8380d = ek3Var;
    }

    public final int a() {
        return this.f8378b;
    }

    public final int b() {
        return this.f8377a;
    }

    public final ek3 c() {
        return this.f8380d;
    }

    public final boolean d() {
        return this.f8380d != ek3.f7389d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gk3)) {
            return false;
        }
        gk3 gk3Var = (gk3) obj;
        return gk3Var.f8377a == this.f8377a && gk3Var.f8378b == this.f8378b && gk3Var.f8380d == this.f8380d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{gk3.class, Integer.valueOf(this.f8377a), Integer.valueOf(this.f8378b), 16, this.f8380d});
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.f8380d) + ", " + this.f8378b + "-byte IV, 16-byte tag, and " + this.f8377a + "-byte key)";
    }
}
