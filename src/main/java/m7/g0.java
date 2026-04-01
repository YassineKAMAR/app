package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends u1<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f24921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24922b;

    public g0(float[] bufferWithData) {
        kotlin.jvm.internal.q.f(bufferWithData, "bufferWithData");
        this.f24921a = bufferWithData;
        this.f24922b = bufferWithData.length;
        b(10);
    }

    @Override // m7.u1
    public void b(int i8) {
        float[] fArr = this.f24921a;
        if (fArr.length < i8) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, t6.l.b(i8, fArr.length * 2));
            kotlin.jvm.internal.q.e(fArrCopyOf, "copyOf(this, newSize)");
            this.f24921a = fArrCopyOf;
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f24922b;
    }

    public final void e(float f8) {
        u1.c(this, 0, 1, null);
        float[] fArr = this.f24921a;
        int iD = d();
        this.f24922b = iD + 1;
        fArr[iD] = f8;
    }

    @Override // m7.u1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f24921a, d());
        kotlin.jvm.internal.q.e(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }
}
