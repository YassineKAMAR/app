package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends u1<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f24942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24943b;

    public j(byte[] bufferWithData) {
        kotlin.jvm.internal.q.f(bufferWithData, "bufferWithData");
        this.f24942a = bufferWithData;
        this.f24943b = bufferWithData.length;
        b(10);
    }

    @Override // m7.u1
    public void b(int i8) {
        byte[] bArr = this.f24942a;
        if (bArr.length < i8) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, t6.l.b(i8, bArr.length * 2));
            kotlin.jvm.internal.q.e(bArrCopyOf, "copyOf(this, newSize)");
            this.f24942a = bArrCopyOf;
        }
    }

    @Override // m7.u1
    public int d() {
        return this.f24943b;
    }

    public final void e(byte b8) {
        u1.c(this, 0, 1, null);
        byte[] bArr = this.f24942a;
        int iD = d();
        this.f24943b = iD + 1;
        bArr[iD] = b8;
    }

    @Override // m7.u1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f24942a, d());
        kotlin.jvm.internal.q.e(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }
}
