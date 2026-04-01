package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class jj1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final jj1 f9649e = new jj1(0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f9650f = Integer.toString(0, 36);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f9651g = Integer.toString(1, 36);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f9652h = Integer.toString(2, 36);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f9653i = Integer.toString(3, 36);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final cf4 f9654j = new cf4() { // from class: com.google.android.gms.internal.ads.ii1
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9658d;

    public jj1(int i8, int i9, int i10, float f8) {
        this.f9655a = i8;
        this.f9656b = i9;
        this.f9657c = i10;
        this.f9658d = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jj1) {
            jj1 jj1Var = (jj1) obj;
            if (this.f9655a == jj1Var.f9655a && this.f9656b == jj1Var.f9656b && this.f9657c == jj1Var.f9657c && this.f9658d == jj1Var.f9658d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f9655a + 217) * 31) + this.f9656b) * 31) + this.f9657c) * 31) + Float.floatToRawIntBits(this.f9658d);
    }
}
