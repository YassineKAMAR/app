package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class dm0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dm0 f6807d = new dm0(1.0f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f6808e = Integer.toString(0, 36);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f6809f = Integer.toString(1, 36);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cf4 f6810g = new cf4() { // from class: com.google.android.gms.internal.ads.cl0
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6813c;

    public dm0(float f8, float f9) {
        uu1.d(f8 > 0.0f);
        uu1.d(f9 > 0.0f);
        this.f6811a = f8;
        this.f6812b = f9;
        this.f6813c = Math.round(f8 * 1000.0f);
    }

    public final long a(long j8) {
        return j8 * ((long) this.f6813c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dm0.class == obj.getClass()) {
            dm0 dm0Var = (dm0) obj;
            if (this.f6811a == dm0Var.f6811a && this.f6812b == dm0Var.f6812b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f6811a) + 527) * 31) + Float.floatToRawIntBits(this.f6812b);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f6811a), Float.valueOf(this.f6812b));
    }
}
