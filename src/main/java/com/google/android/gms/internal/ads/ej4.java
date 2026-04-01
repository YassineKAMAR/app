package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ej4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f7380d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f7381e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f7382a = nn1.f11925a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7384c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7383b = 2;

    private static final void c(ByteBuffer byteBuffer, long j8, int i8, int i9, boolean z7) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z7 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j8);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i8);
        byteBuffer.putInt(0);
        byteBuffer.put(vd3.a(i9));
    }

    public final void a(q94 q94Var, List list) {
        int length;
        ByteBuffer byteBuffer = q94Var.f13362d;
        byteBuffer.getClass();
        if (byteBuffer.limit() - q94Var.f13362d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f7383b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = q94Var.f13362d;
        int iPosition = byteBuffer2.position();
        int iLimit = byteBuffer2.limit();
        int i8 = iLimit - iPosition;
        int i9 = (i8 + 255) / 255;
        int i10 = i9 + 27 + i8;
        if (this.f7383b == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i10 += length + 44;
        } else {
            length = 0;
        }
        if (this.f7382a.capacity() < i10) {
            this.f7382a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f7382a.clear();
        }
        ByteBuffer byteBuffer3 = this.f7382a;
        if (this.f7383b == 2) {
            if (bArr != null) {
                c(byteBuffer3, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer3.put(vd3.a(length2));
                byteBuffer3.put(bArr);
                int i11 = length2 + 28;
                byteBuffer3.putInt(22, nz2.p(byteBuffer3.array(), byteBuffer3.arrayOffset(), i11, 0));
                byteBuffer3.position(i11);
            } else {
                byteBuffer3.put(f7380d);
            }
            byteBuffer3.put(f7381e);
        }
        int iC = this.f7384c + m1.c(byteBuffer2);
        this.f7384c = iC;
        c(byteBuffer3, iC, this.f7383b, i9, false);
        for (int i12 = 0; i12 < i9; i12++) {
            if (i8 >= 255) {
                byteBuffer3.put((byte) -1);
                i8 -= 255;
            } else {
                byteBuffer3.put((byte) i8);
                i8 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer3.put(byteBuffer2.get(iPosition));
            iPosition++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.f7383b == 2) {
            byteBuffer3.putInt(length + 66, nz2.p(byteBuffer3.array(), byteBuffer3.arrayOffset() + length + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, nz2.p(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.f7383b++;
        this.f7382a = byteBuffer3;
        q94Var.b();
        q94Var.i(this.f7382a.remaining());
        q94Var.f13362d.put(this.f7382a);
        q94Var.j();
    }

    public final void b() {
        this.f7382a = nn1.f11925a;
        this.f7384c = 0;
        this.f7383b = 2;
    }
}
