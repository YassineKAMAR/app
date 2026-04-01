package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class l2 extends u1<e6.z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f24965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24966b;

    private l2(byte[] bArr) {
        this.f24965a = bArr;
        this.f24966b = e6.z.x(bArr);
        b(10);
    }

    public /* synthetic */ l2(byte[] bArr, kotlin.jvm.internal.j jVar) {
        this(bArr);
    }

    @Override // m7.u1
    public /* bridge */ /* synthetic */ e6.z a() {
        return e6.z.a(f());
    }

    @Override // m7.u1
    public void b(int i8) {
        if (e6.z.x(this.f24965a) < i8) {
            byte[] bArr = this.f24965a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, t6.l.b(i8, e6.z.x(bArr) * 2));
            kotlin.jvm.internal.q.e(bArrCopyOf, "copyOf(this, newSize)");
            this.f24965a = e6.z.g(bArrCopyOf);
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f24966b;
    }

    public final void e(byte b8) {
        u1.c(this, 0, 1, null);
        byte[] bArr = this.f24965a;
        int iD = d();
        this.f24966b = iD + 1;
        e6.z.B(bArr, iD, b8);
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f24965a, d());
        kotlin.jvm.internal.q.e(bArrCopyOf, "copyOf(this, newSize)");
        return e6.z.g(bArrCopyOf);
    }
}
