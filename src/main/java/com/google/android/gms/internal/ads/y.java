package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f17524d = new y(-3, -9223372036854775807L, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f17526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f17527c;

    private y(int i8, long j8, long j9) {
        this.f17525a = i8;
        this.f17526b = j8;
        this.f17527c = j9;
    }

    public static y d(long j8, long j9) {
        return new y(-1, j8, j9);
    }

    public static y e(long j8) {
        return new y(0, -9223372036854775807L, j8);
    }

    public static y f(long j8, long j9) {
        return new y(-2, j8, j9);
    }
}
