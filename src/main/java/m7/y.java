package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends u1<double[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f25038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25039b;

    public y(double[] bufferWithData) {
        kotlin.jvm.internal.q.f(bufferWithData, "bufferWithData");
        this.f25038a = bufferWithData;
        this.f25039b = bufferWithData.length;
        b(10);
    }

    @Override // m7.u1
    public void b(int i8) {
        double[] dArr = this.f25038a;
        if (dArr.length < i8) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, t6.l.b(i8, dArr.length * 2));
            kotlin.jvm.internal.q.e(dArrCopyOf, "copyOf(this, newSize)");
            this.f25038a = dArrCopyOf;
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f25039b;
    }

    public final void e(double d8) {
        u1.c(this, 0, 1, null);
        double[] dArr = this.f25038a;
        int iD = d();
        this.f25039b = iD + 1;
        dArr[iD] = d8;
    }

    @Override // m7.u1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f25038a, d());
        kotlin.jvm.internal.q.e(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }
}
