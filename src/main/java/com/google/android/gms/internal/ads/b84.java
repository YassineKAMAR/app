package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class b84 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b84 f5644j = new b84(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b84 f5645k = new b84(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b84 f5646l = new b84(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b84 f5647m = new b84(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f5649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f5650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f5651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f5652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f5653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f5654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f5655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f5656i;

    public b84(double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f5648a = d12;
        this.f5649b = d13;
        this.f5650c = d14;
        this.f5651d = d8;
        this.f5652e = d9;
        this.f5653f = d10;
        this.f5654g = d11;
        this.f5655h = d15;
        this.f5656i = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b84.class != obj.getClass()) {
            return false;
        }
        b84 b84Var = (b84) obj;
        return Double.compare(b84Var.f5651d, this.f5651d) == 0 && Double.compare(b84Var.f5652e, this.f5652e) == 0 && Double.compare(b84Var.f5653f, this.f5653f) == 0 && Double.compare(b84Var.f5654g, this.f5654g) == 0 && Double.compare(b84Var.f5655h, this.f5655h) == 0 && Double.compare(b84Var.f5656i, this.f5656i) == 0 && Double.compare(b84Var.f5648a, this.f5648a) == 0 && Double.compare(b84Var.f5649b, this.f5649b) == 0 && Double.compare(b84Var.f5650c, this.f5650c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f5648a);
        long j8 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f5649b);
        long j9 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f5650c);
        long j10 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f5651d);
        long j11 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f5652e);
        long j12 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f5653f);
        long j13 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f5654g);
        long j14 = jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f5655h);
        long j15 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f5656i);
        return (((((((((((((((((int) j8) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f5644j)) {
            return "Rotate 0°";
        }
        if (equals(f5645k)) {
            return "Rotate 90°";
        }
        if (equals(f5646l)) {
            return "Rotate 180°";
        }
        if (equals(f5647m)) {
            return "Rotate 270°";
        }
        double d8 = this.f5648a;
        double d9 = this.f5649b;
        double d10 = this.f5650c;
        double d11 = this.f5651d;
        double d12 = this.f5652e;
        double d13 = this.f5653f;
        double d14 = this.f5654g;
        double d15 = this.f5655h;
        double d16 = this.f5656i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d8);
        sb.append(", v=");
        sb.append(d9);
        sb.append(", w=");
        sb.append(d10);
        sb.append(", a=");
        sb.append(d11);
        sb.append(", b=");
        sb.append(d12);
        sb.append(", c=");
        sb.append(d13);
        sb.append(", d=");
        sb.append(d14);
        sb.append(", tx=");
        sb.append(d15);
        sb.append(", ty=");
        sb.append(d16);
        sb.append("}");
        return sb.toString();
    }
}
