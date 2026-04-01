package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends u1<boolean[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean[] f24919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24920b;

    public g(boolean[] bufferWithData) {
        kotlin.jvm.internal.q.f(bufferWithData, "bufferWithData");
        this.f24919a = bufferWithData;
        this.f24920b = bufferWithData.length;
        b(10);
    }

    @Override // m7.u1
    public void b(int i8) {
        boolean[] zArr = this.f24919a;
        if (zArr.length < i8) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, t6.l.b(i8, zArr.length * 2));
            kotlin.jvm.internal.q.e(zArrCopyOf, "copyOf(this, newSize)");
            this.f24919a = zArrCopyOf;
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f24920b;
    }

    public final void e(boolean z7) {
        u1.c(this, 0, 1, null);
        boolean[] zArr = this.f24919a;
        int iD = d();
        this.f24920b = iD + 1;
        zArr[iD] = z7;
    }

    @Override // m7.u1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f24919a, d());
        kotlin.jvm.internal.q.e(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }
}
