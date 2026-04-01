package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bm3 extends vi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final am3 f5883a;

    private bm3(am3 am3Var) {
        this.f5883a = am3Var;
    }

    public static bm3 b(am3 am3Var) {
        return new bm3(am3Var);
    }

    public final am3 a() {
        return this.f5883a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bm3) && ((bm3) obj).f5883a == this.f5883a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{bm3.class, this.f5883a});
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f5883a.toString() + ")";
    }
}
