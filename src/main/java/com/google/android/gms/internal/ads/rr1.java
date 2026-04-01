package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class rr1 extends oo1 {
    @Override // com.google.android.gms.internal.ads.nn1
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i8 = iLimit - iPosition;
        int i9 = this.f12575b.f10773c;
        if (i9 == 3) {
            i8 += i8;
        } else if (i9 == 4) {
            i8 /= 2;
        } else if (i9 != 268435456) {
            if (i9 != 536870912) {
                if (i9 != 805306368) {
                    if (i9 != 1342177280) {
                        if (i9 != 1610612736) {
                            throw new IllegalStateException();
                        }
                    }
                }
                i8 /= 2;
            }
            i8 /= 3;
            i8 += i8;
        }
        ByteBuffer byteBufferD = d(i8);
        int i10 = this.f12575b.f10773c;
        if (i10 == 3) {
            while (iPosition < iLimit) {
                byteBufferD.put((byte) 0);
                byteBufferD.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i10 == 4) {
            while (iPosition < iLimit) {
                short sMax = (short) (Math.max(-1.0f, Math.min(byteBuffer.getFloat(iPosition), 1.0f)) * 32767.0f);
                byteBufferD.put((byte) (sMax & 255));
                byteBufferD.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i10 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i10 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i10 == 805306368) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 2));
                byteBufferD.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i10 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i10 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final ll1 c(ll1 ll1Var) throws mm1 {
        int i8 = ll1Var.f10773c;
        if (i8 != 3) {
            if (i8 == 2) {
                return ll1.f10770e;
            }
            if (i8 != 268435456 && i8 != 536870912 && i8 != 1342177280 && i8 != 805306368 && i8 != 1610612736 && i8 != 4) {
                throw new mm1("Unhandled input format:", ll1Var);
            }
        }
        return new ll1(ll1Var.f10771a, ll1Var.f10772b, 2);
    }
}
