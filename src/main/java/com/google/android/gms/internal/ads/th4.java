package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class th4 extends oo1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f15099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f15100j;

    th4() {
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f15100j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferD = d(((iLimit - iPosition) / this.f12575b.f10774d) * this.f12576c.f10774d);
        while (iPosition < iLimit) {
            for (int i8 : iArr) {
                byteBufferD.putShort(byteBuffer.getShort(i8 + i8 + iPosition));
            }
            iPosition += this.f12575b.f10774d;
        }
        byteBuffer.position(iLimit);
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final ll1 c(ll1 ll1Var) throws mm1 {
        int[] iArr = this.f15099i;
        if (iArr == null) {
            return ll1.f10770e;
        }
        if (ll1Var.f10773c != 2) {
            throw new mm1("Unhandled input format:", ll1Var);
        }
        boolean z7 = ll1Var.f10772b != iArr.length;
        int i8 = 0;
        while (true) {
            int length = iArr.length;
            if (i8 >= length) {
                return z7 ? new ll1(ll1Var.f10771a, length, 2) : ll1.f10770e;
            }
            int i9 = iArr[i8];
            if (i9 >= ll1Var.f10772b) {
                throw new mm1("Unhandled input format:", ll1Var);
            }
            z7 |= i9 != i8;
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.oo1
    protected final void e() {
        this.f15100j = this.f15099i;
    }

    @Override // com.google.android.gms.internal.ads.oo1
    protected final void g() {
        this.f15100j = null;
        this.f15099i = null;
    }

    public final void i(int[] iArr) {
        this.f15099i = iArr;
    }
}
