package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class iv {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final iv f9368f = new iv(new ft());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f9369g = Integer.toString(0, 36);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f9370h = Integer.toString(1, 36);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f9371i = Integer.toString(2, 36);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f9372j = Integer.toString(3, 36);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f9373k = Integer.toString(4, 36);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final cf4 f9374l = new cf4() { // from class: com.google.android.gms.internal.ads.es
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9379e;

    private iv(ft ftVar) {
        this.f9375a = -9223372036854775807L;
        this.f9376b = -9223372036854775807L;
        this.f9377c = -9223372036854775807L;
        this.f9378d = -3.4028235E38f;
        this.f9379e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv)) {
            return false;
        }
        long j8 = ((iv) obj).f9375a;
        return true;
    }

    public final int hashCode() {
        int i8 = (int) (-9223372034707292159L);
        return (((((((i8 * 31) + i8) * 31) + i8) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
