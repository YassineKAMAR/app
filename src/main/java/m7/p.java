package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends u1<char[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f24977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24978b;

    public p(char[] bufferWithData) {
        kotlin.jvm.internal.q.f(bufferWithData, "bufferWithData");
        this.f24977a = bufferWithData;
        this.f24978b = bufferWithData.length;
        b(10);
    }

    @Override // m7.u1
    public void b(int i8) {
        char[] cArr = this.f24977a;
        if (cArr.length < i8) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, t6.l.b(i8, cArr.length * 2));
            kotlin.jvm.internal.q.e(cArrCopyOf, "copyOf(this, newSize)");
            this.f24977a = cArrCopyOf;
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f24978b;
    }

    public final void e(char c8) {
        u1.c(this, 0, 1, null);
        char[] cArr = this.f24977a;
        int iD = d();
        this.f24978b = iD + 1;
        cArr[iD] = c8;
    }

    @Override // m7.u1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f24977a, d());
        kotlin.jvm.internal.q.e(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }
}
