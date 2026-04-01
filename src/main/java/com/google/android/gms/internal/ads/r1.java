package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1 f13855c = new r1(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13857b;

    public r1(long j8, long j9) {
        this.f13856a = j8;
        this.f13857b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f13856a == r1Var.f13856a && this.f13857b == r1Var.f13857b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f13856a) * 31) + ((int) this.f13857b);
    }

    public final String toString() {
        return "[timeUs=" + this.f13856a + ", position=" + this.f13857b + "]";
    }
}
