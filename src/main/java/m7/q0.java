package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends u1<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f24983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24984b;

    public q0(int[] bufferWithData) {
        kotlin.jvm.internal.q.f(bufferWithData, "bufferWithData");
        this.f24983a = bufferWithData;
        this.f24984b = bufferWithData.length;
        b(10);
    }

    @Override // m7.u1
    public void b(int i8) {
        int[] iArr = this.f24983a;
        if (iArr.length < i8) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, t6.l.b(i8, iArr.length * 2));
            kotlin.jvm.internal.q.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f24983a = iArrCopyOf;
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f24984b;
    }

    public final void e(int i8) {
        u1.c(this, 0, 1, null);
        int[] iArr = this.f24983a;
        int iD = d();
        this.f24984b = iD + 1;
        iArr[iD] = i8;
    }

    @Override // m7.u1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f24983a, d());
        kotlin.jvm.internal.q.e(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }
}
