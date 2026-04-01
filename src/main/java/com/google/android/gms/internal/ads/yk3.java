package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yk3 extends vi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17802b = 12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17803c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wk3 f17804d;

    /* synthetic */ yk3(int i8, int i9, int i10, wk3 wk3Var, xk3 xk3Var) {
        this.f17801a = i8;
        this.f17804d = wk3Var;
    }

    public final int a() {
        return this.f17801a;
    }

    public final wk3 b() {
        return this.f17804d;
    }

    public final boolean c() {
        return this.f17804d != wk3.f16783d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yk3)) {
            return false;
        }
        yk3 yk3Var = (yk3) obj;
        return yk3Var.f17801a == this.f17801a && yk3Var.f17804d == this.f17804d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{yk3.class, Integer.valueOf(this.f17801a), 12, 16, this.f17804d});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.f17804d) + ", 12-byte IV, 16-byte tag, and " + this.f17801a + "-byte key)";
    }
}
