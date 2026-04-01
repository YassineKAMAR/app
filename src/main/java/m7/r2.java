package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r2 extends u1<e6.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f25006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25007b;

    private r2(long[] jArr) {
        this.f25006a = jArr;
        this.f25007b = e6.d0.x(jArr);
        b(10);
    }

    public /* synthetic */ r2(long[] jArr, kotlin.jvm.internal.j jVar) {
        this(jArr);
    }

    @Override // m7.u1
    public /* bridge */ /* synthetic */ e6.d0 a() {
        return e6.d0.a(f());
    }

    @Override // m7.u1
    public void b(int i8) {
        if (e6.d0.x(this.f25006a) < i8) {
            long[] jArr = this.f25006a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, t6.l.b(i8, e6.d0.x(jArr) * 2));
            kotlin.jvm.internal.q.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f25006a = e6.d0.g(jArrCopyOf);
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f25007b;
    }

    public final void e(long j8) {
        u1.c(this, 0, 1, null);
        long[] jArr = this.f25006a;
        int iD = d();
        this.f25007b = iD + 1;
        e6.d0.B(jArr, iD, j8);
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f25006a, d());
        kotlin.jvm.internal.q.e(jArrCopyOf, "copyOf(this, newSize)");
        return e6.d0.g(jArrCopyOf);
    }
}
