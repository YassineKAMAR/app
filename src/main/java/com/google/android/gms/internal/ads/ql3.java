package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ql3 extends vi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ol3 f13561b;

    /* synthetic */ ql3(int i8, ol3 ol3Var, pl3 pl3Var) {
        this.f13560a = i8;
        this.f13561b = ol3Var;
    }

    public final int a() {
        return this.f13560a;
    }

    public final ol3 b() {
        return this.f13561b;
    }

    public final boolean c() {
        return this.f13561b != ol3.f12539d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ql3)) {
            return false;
        }
        ql3 ql3Var = (ql3) obj;
        return ql3Var.f13560a == this.f13560a && ql3Var.f13561b == this.f13561b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{ql3.class, Integer.valueOf(this.f13560a), this.f13561b});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f13561b) + ", " + this.f13560a + "-byte key)";
    }
}
