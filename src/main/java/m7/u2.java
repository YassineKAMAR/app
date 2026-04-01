package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class u2 extends u1<e6.g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f25022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25023b;

    private u2(short[] sArr) {
        this.f25022a = sArr;
        this.f25023b = e6.g0.x(sArr);
        b(10);
    }

    public /* synthetic */ u2(short[] sArr, kotlin.jvm.internal.j jVar) {
        this(sArr);
    }

    @Override // m7.u1
    public /* bridge */ /* synthetic */ e6.g0 a() {
        return e6.g0.a(f());
    }

    @Override // m7.u1
    public void b(int i8) {
        if (e6.g0.x(this.f25022a) < i8) {
            short[] sArr = this.f25022a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, t6.l.b(i8, e6.g0.x(sArr) * 2));
            kotlin.jvm.internal.q.e(sArrCopyOf, "copyOf(this, newSize)");
            this.f25022a = e6.g0.g(sArrCopyOf);
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f25023b;
    }

    public final void e(short s8) {
        u1.c(this, 0, 1, null);
        short[] sArr = this.f25022a;
        int iD = d();
        this.f25023b = iD + 1;
        e6.g0.B(sArr, iD, s8);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f25022a, d());
        kotlin.jvm.internal.q.e(sArrCopyOf, "copyOf(this, newSize)");
        return e6.g0.g(sArrCopyOf);
    }
}
