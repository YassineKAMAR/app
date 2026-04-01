package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class gj4 extends oo1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f8371i = Float.floatToIntBits(Float.NaN);

    gj4() {
    }

    private static void i(int i8, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i8) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f8371i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferD;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i8 = iLimit - iPosition;
        int i9 = this.f12575b.f10773c;
        if (i9 == 536870912) {
            byteBufferD = d((i8 / 3) * 4);
            while (iPosition < iLimit) {
                i(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferD);
                iPosition += 3;
            }
        } else if (i9 == 805306368) {
            byteBufferD = d(i8);
            while (iPosition < iLimit) {
                int i10 = byteBuffer.get(iPosition) & 255;
                int i11 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                i(i10 | i11 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferD);
                iPosition += 4;
            }
        } else if (i9 == 1342177280) {
            byteBufferD = d((i8 / 3) * 4);
            while (iPosition < iLimit) {
                i(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferD);
                iPosition += 3;
            }
        } else {
            if (i9 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferD = d(i8);
            while (iPosition < iLimit) {
                int i12 = byteBuffer.get(iPosition + 3) & 255;
                int i13 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                i(i12 | i13 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferD);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final ll1 c(ll1 ll1Var) throws mm1 {
        int i8 = ll1Var.f10773c;
        int i9 = nz2.f12300a;
        if (i8 == 536870912 || i8 == 1342177280 || i8 == 805306368 || i8 == 1610612736) {
            return new ll1(ll1Var.f10771a, ll1Var.f10772b, 4);
        }
        if (i8 == 4) {
            return ll1.f10770e;
        }
        throw new mm1("Unhandled input format:", ll1Var);
    }
}
