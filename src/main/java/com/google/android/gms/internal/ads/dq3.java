package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class dq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f6869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f6870b;

    /* synthetic */ dq3(Class cls, Class cls2, cq3 cq3Var) {
        this.f6869a = cls;
        this.f6870b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dq3)) {
            return false;
        }
        dq3 dq3Var = (dq3) obj;
        return dq3Var.f6869a.equals(this.f6869a) && dq3Var.f6870b.equals(this.f6870b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6869a, this.f6870b});
    }

    public final String toString() {
        Class cls = this.f6870b;
        return this.f6869a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
