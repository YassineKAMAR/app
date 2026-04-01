package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o2 extends u1<e6.b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f24975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24976b;

    private o2(int[] iArr) {
        this.f24975a = iArr;
        this.f24976b = e6.b0.x(iArr);
        b(10);
    }

    public /* synthetic */ o2(int[] iArr, kotlin.jvm.internal.j jVar) {
        this(iArr);
    }

    @Override // m7.u1
    public /* bridge */ /* synthetic */ e6.b0 a() {
        return e6.b0.a(f());
    }

    @Override // m7.u1
    public void b(int i8) {
        if (e6.b0.x(this.f24975a) < i8) {
            int[] iArr = this.f24975a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, t6.l.b(i8, e6.b0.x(iArr) * 2));
            kotlin.jvm.internal.q.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f24975a = e6.b0.g(iArrCopyOf);
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f24976b;
    }

    public final void e(int i8) {
        u1.c(this, 0, 1, null);
        int[] iArr = this.f24975a;
        int iD = d();
        this.f24976b = iD + 1;
        e6.b0.B(iArr, iD, i8);
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f24975a, d());
        kotlin.jvm.internal.q.e(iArrCopyOf, "copyOf(this, newSize)");
        return e6.b0.g(iArrCopyOf);
    }
}
