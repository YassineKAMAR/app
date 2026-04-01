package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class wd4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wd4 f16695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wd4 f16696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wd4 f16697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wd4 f16698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wd4 f16699g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16701b;

    static {
        wd4 wd4Var = new wd4(0L, 0L);
        f16695c = wd4Var;
        f16696d = new wd4(Long.MAX_VALUE, Long.MAX_VALUE);
        f16697e = new wd4(Long.MAX_VALUE, 0L);
        f16698f = new wd4(0L, Long.MAX_VALUE);
        f16699g = wd4Var;
    }

    public wd4(long j8, long j9) {
        uu1.d(j8 >= 0);
        uu1.d(j9 >= 0);
        this.f16700a = j8;
        this.f16701b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wd4.class == obj.getClass()) {
            wd4 wd4Var = (wd4) obj;
            if (this.f16700a == wd4Var.f16700a && this.f16701b == wd4Var.f16701b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16700a) * 31) + ((int) this.f16701b);
    }
}
