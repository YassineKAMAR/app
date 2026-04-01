package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class er2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final er2 f7474c = new er2(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final er2 f7475d = new er2(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7477b;

    public er2(int i8, int i9) {
        boolean z7 = false;
        if ((i8 == -1 || i8 >= 0) && (i9 == -1 || i9 >= 0)) {
            z7 = true;
        }
        uu1.d(z7);
        this.f7476a = i8;
        this.f7477b = i9;
    }

    public final int a() {
        return this.f7477b;
    }

    public final int b() {
        return this.f7476a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof er2) {
            er2 er2Var = (er2) obj;
            if (this.f7476a == er2Var.f7476a && this.f7477b == er2Var.f7477b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f7476a;
        return ((i8 >>> 16) | (i8 << 16)) ^ this.f7477b;
    }

    public final String toString() {
        return this.f7476a + "x" + this.f7477b;
    }
}
