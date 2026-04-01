package r;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected a f25825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f25826b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected float[] f25827c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f25829e;

    public float a(float f8) {
        return (float) this.f25825a.a(f8, 0);
    }

    public String toString() {
        String str = this.f25829e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i8 = 0; i8 < this.f25828d; i8++) {
            str = str + "[" + this.f25826b[i8] + " , " + decimalFormat.format(this.f25827c[i8]) + "] ";
        }
        return str;
    }
}
