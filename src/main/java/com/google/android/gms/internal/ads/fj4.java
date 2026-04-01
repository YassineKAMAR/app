package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class fj4 extends oo1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f7779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f7780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f7785q;

    public fj4() {
        byte[] bArr = nz2.f12305f;
        this.f7779k = bArr;
        this.f7780l = bArr;
    }

    private final int m(long j8) {
        return (int) ((j8 * ((long) this.f12575b.f10771a)) / 1000000);
    }

    private final int r(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > 1024) {
                int i8 = this.f7777i;
                return i8 * (iPosition / i8);
            }
        }
        return byteBuffer.limit();
    }

    private final void s(byte[] bArr, int i8) {
        d(i8).put(bArr, 0, i8).flip();
        if (i8 > 0) {
            this.f7784p = true;
        }
    }

    private final void t(ByteBuffer byteBuffer, byte[] bArr, int i8) {
        int iMin = Math.min(byteBuffer.remaining(), this.f7783o);
        int i9 = this.f7783o - iMin;
        System.arraycopy(bArr, i8 - i9, this.f7780l, 0, i9);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f7780l, i9, iMin);
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final void b(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !h()) {
            int i8 = this.f7781m;
            int i9 = 1;
            if (i8 == 0) {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f7779k.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > 1024) {
                        int i10 = this.f7777i;
                        iPosition = ((iLimit2 / i10) * i10) + i10;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f7781m = i9;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    d(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f7784p = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i8 != 1) {
                iLimit = byteBuffer.limit();
                int iR = r(byteBuffer);
                byteBuffer.limit(iR);
                this.f7785q += (long) (byteBuffer.remaining() / this.f7777i);
                t(byteBuffer, this.f7780l, this.f7783o);
                if (iR < iLimit) {
                    s(this.f7780l, this.f7783o);
                    this.f7781m = 0;
                    byteBuffer.limit(iLimit);
                }
            } else {
                iLimit = byteBuffer.limit();
                int iR2 = r(byteBuffer);
                int iPosition2 = iR2 - byteBuffer.position();
                byte[] bArr = this.f7779k;
                int length = bArr.length;
                int i11 = this.f7782n;
                int i12 = length - i11;
                if (iR2 >= iLimit || iPosition2 >= i12) {
                    int iMin = Math.min(iPosition2, i12);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f7779k, this.f7782n, iMin);
                    int i13 = this.f7782n + iMin;
                    this.f7782n = i13;
                    byte[] bArr2 = this.f7779k;
                    if (i13 == bArr2.length) {
                        if (this.f7784p) {
                            s(bArr2, this.f7783o);
                            long j8 = this.f7785q;
                            int i14 = this.f7782n;
                            int i15 = this.f7783o;
                            this.f7785q = j8 + ((long) ((i14 - (i15 + i15)) / this.f7777i));
                            i13 = i14;
                        } else {
                            this.f7785q += (long) ((i13 - this.f7783o) / this.f7777i);
                        }
                        t(byteBuffer, this.f7779k, i13);
                        this.f7782n = 0;
                        i9 = 2;
                        this.f7781m = i9;
                    }
                    byteBuffer.limit(iLimit);
                } else {
                    s(bArr, i11);
                    this.f7782n = 0;
                    this.f7781m = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final ll1 c(ll1 ll1Var) throws mm1 {
        if (ll1Var.f10773c == 2) {
            return this.f7778j ? ll1Var : ll1.f10770e;
        }
        throw new mm1("Unhandled input format:", ll1Var);
    }

    @Override // com.google.android.gms.internal.ads.oo1
    protected final void e() {
        if (this.f7778j) {
            this.f7777i = this.f12575b.f10774d;
            int iM = m(150000L) * this.f7777i;
            if (this.f7779k.length != iM) {
                this.f7779k = new byte[iM];
            }
            int iM2 = m(20000L) * this.f7777i;
            this.f7783o = iM2;
            if (this.f7780l.length != iM2) {
                this.f7780l = new byte[iM2];
            }
        }
        this.f7781m = 0;
        this.f7785q = 0L;
        this.f7782n = 0;
        this.f7784p = false;
    }

    @Override // com.google.android.gms.internal.ads.oo1
    protected final void f() {
        int i8 = this.f7782n;
        if (i8 > 0) {
            s(this.f7779k, i8);
        }
        if (this.f7784p) {
            return;
        }
        this.f7785q += (long) (this.f7783o / this.f7777i);
    }

    @Override // com.google.android.gms.internal.ads.oo1
    protected final void g() {
        this.f7778j = false;
        this.f7783o = 0;
        byte[] bArr = nz2.f12305f;
        this.f7779k = bArr;
        this.f7780l = bArr;
    }

    public final long i() {
        return this.f7785q;
    }

    public final void j(boolean z7) {
        this.f7778j = z7;
    }

    @Override // com.google.android.gms.internal.ads.oo1, com.google.android.gms.internal.ads.nn1
    public final boolean q() {
        return this.f7778j;
    }
}
