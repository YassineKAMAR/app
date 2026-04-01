package r;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected a f25830a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f25834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f25835f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f25838i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f25831b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int[] f25832c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float[][] f25833d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected float[] f25836g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f25837h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f25839j = Float.NaN;

    public String toString() {
        String str = this.f25835f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i8 = 0; i8 < this.f25834e; i8++) {
            str = str + "[" + this.f25832c[i8] + " , " + decimalFormat.format(this.f25833d[i8]) + "] ";
        }
        return str;
    }
}
