package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class pp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f12989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f12990b;

    /* synthetic */ pp3(Class cls, Class cls2, op3 op3Var) {
        this.f12989a = cls;
        this.f12990b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pp3)) {
            return false;
        }
        pp3 pp3Var = (pp3) obj;
        return pp3Var.f12989a.equals(this.f12989a) && pp3Var.f12990b.equals(this.f12990b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12989a, this.f12990b});
    }

    public final String toString() {
        Class cls = this.f12990b;
        return this.f12989a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
