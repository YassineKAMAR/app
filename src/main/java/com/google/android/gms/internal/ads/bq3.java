package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class bq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f5988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wy3 f5989b;

    /* synthetic */ bq3(Class cls, wy3 wy3Var, aq3 aq3Var) {
        this.f5988a = cls;
        this.f5989b = wy3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bq3)) {
            return false;
        }
        bq3 bq3Var = (bq3) obj;
        return bq3Var.f5988a.equals(this.f5988a) && bq3Var.f5989b.equals(this.f5989b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5988a, this.f5989b});
    }

    public final String toString() {
        wy3 wy3Var = this.f5989b;
        return this.f5988a.getSimpleName() + ", object identifier: " + String.valueOf(wy3Var);
    }
}
