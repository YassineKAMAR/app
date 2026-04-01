package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bn3 extends vi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final an3 f5904a;

    private bn3(an3 an3Var) {
        this.f5904a = an3Var;
    }

    public static bn3 b(an3 an3Var) {
        return new bn3(an3Var);
    }

    public final an3 a() {
        return this.f5904a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bn3) && ((bn3) obj).f5904a == this.f5904a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{bn3.class, this.f5904a});
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f5904a.toString() + ")";
    }
}
