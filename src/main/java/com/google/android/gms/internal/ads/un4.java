package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class un4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15782b;

    public un4(int i8, boolean z7) {
        this.f15781a = i8;
        this.f15782b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && un4.class == obj.getClass()) {
            un4 un4Var = (un4) obj;
            if (this.f15781a == un4Var.f15781a && this.f15782b == un4Var.f15782b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f15781a * 31) + (this.f15782b ? 1 : 0);
    }
}
