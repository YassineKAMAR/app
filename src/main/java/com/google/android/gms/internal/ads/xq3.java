package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xq3 extends zr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vq3 f17431c;

    /* synthetic */ xq3(int i8, int i9, vq3 vq3Var, wq3 wq3Var) {
        this.f17429a = i8;
        this.f17430b = i9;
        this.f17431c = vq3Var;
    }

    public final int a() {
        return this.f17430b;
    }

    public final int b() {
        return this.f17429a;
    }

    public final int c() {
        vq3 vq3Var = this.f17431c;
        if (vq3Var == vq3.f16422e) {
            return this.f17430b;
        }
        if (vq3Var == vq3.f16419b || vq3Var == vq3.f16420c || vq3Var == vq3.f16421d) {
            return this.f17430b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final vq3 d() {
        return this.f17431c;
    }

    public final boolean e() {
        return this.f17431c != vq3.f16422e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xq3)) {
            return false;
        }
        xq3 xq3Var = (xq3) obj;
        return xq3Var.f17429a == this.f17429a && xq3Var.c() == c() && xq3Var.f17431c == this.f17431c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{xq3.class, Integer.valueOf(this.f17429a), Integer.valueOf(this.f17430b), this.f17431c});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.f17431c) + ", " + this.f17430b + "-byte tags, and " + this.f17429a + "-byte key)";
    }
}
