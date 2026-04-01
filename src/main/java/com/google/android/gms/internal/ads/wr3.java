package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wr3 extends zr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ur3 f16914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tr3 f16915d;

    /* synthetic */ wr3(int i8, int i9, ur3 ur3Var, tr3 tr3Var, vr3 vr3Var) {
        this.f16912a = i8;
        this.f16913b = i9;
        this.f16914c = ur3Var;
        this.f16915d = tr3Var;
    }

    public static rr3 d() {
        return new rr3(null);
    }

    public final int a() {
        return this.f16913b;
    }

    public final int b() {
        return this.f16912a;
    }

    public final int c() {
        ur3 ur3Var = this.f16914c;
        if (ur3Var == ur3.f15825e) {
            return this.f16913b;
        }
        if (ur3Var == ur3.f15822b || ur3Var == ur3.f15823c || ur3Var == ur3.f15824d) {
            return this.f16913b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final tr3 e() {
        return this.f16915d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wr3)) {
            return false;
        }
        wr3 wr3Var = (wr3) obj;
        return wr3Var.f16912a == this.f16912a && wr3Var.c() == c() && wr3Var.f16914c == this.f16914c && wr3Var.f16915d == this.f16915d;
    }

    public final ur3 f() {
        return this.f16914c;
    }

    public final boolean g() {
        return this.f16914c != ur3.f15825e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{wr3.class, Integer.valueOf(this.f16912a), Integer.valueOf(this.f16913b), this.f16914c, this.f16915d});
    }

    public final String toString() {
        tr3 tr3Var = this.f16915d;
        return "HMAC Parameters (variant: " + String.valueOf(this.f16914c) + ", hashType: " + String.valueOf(tr3Var) + ", " + this.f16913b + "-byte tags, and " + this.f16912a + "-byte key)";
    }
}
