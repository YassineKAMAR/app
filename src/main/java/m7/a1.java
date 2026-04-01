package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends u1<long[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f24876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24877b;

    public a1(long[] bufferWithData) {
        kotlin.jvm.internal.q.f(bufferWithData, "bufferWithData");
        this.f24876a = bufferWithData;
        this.f24877b = bufferWithData.length;
        b(10);
    }

    @Override // m7.u1
    public void b(int i8) {
        long[] jArr = this.f24876a;
        if (jArr.length < i8) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, t6.l.b(i8, jArr.length * 2));
            kotlin.jvm.internal.q.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f24876a = jArrCopyOf;
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f24877b;
    }

    public final void e(long j8) {
        u1.c(this, 0, 1, null);
        long[] jArr = this.f24876a;
        int iD = d();
        this.f24877b = iD + 1;
        jArr[iD] = j8;
    }

    @Override // m7.u1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f24876a, d());
        kotlin.jvm.internal.q.e(jArrCopyOf, "copyOf(this, newSize)");
        return jArrCopyOf;
    }
}
