package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19747b;

    z0(Object obj, int i8) {
        this.f19746a = obj;
        this.f19747b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f19746a == z0Var.f19746a && this.f19747b == z0Var.f19747b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f19746a) * 65535) + this.f19747b;
    }
}
