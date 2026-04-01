package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 extends u1<short[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f24902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24903b;

    public d2(short[] bufferWithData) {
        kotlin.jvm.internal.q.f(bufferWithData, "bufferWithData");
        this.f24902a = bufferWithData;
        this.f24903b = bufferWithData.length;
        b(10);
    }

    @Override // m7.u1
    public void b(int i8) {
        short[] sArr = this.f24902a;
        if (sArr.length < i8) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, t6.l.b(i8, sArr.length * 2));
            kotlin.jvm.internal.q.e(sArrCopyOf, "copyOf(this, newSize)");
            this.f24902a = sArrCopyOf;
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f24903b;
    }

    public final void e(short s8) {
        u1.c(this, 0, 1, null);
        short[] sArr = this.f24902a;
        int iD = d();
        this.f24903b = iD + 1;
        sArr[iD] = s8;
    }

    @Override // m7.u1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f24902a, d());
        kotlin.jvm.internal.q.e(sArrCopyOf, "copyOf(this, newSize)");
        return sArrCopyOf;
    }
}
