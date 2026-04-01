package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class hj4 extends oo1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f8797m = nz2.f12305f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f8799o;

    @Override // com.google.android.gms.internal.ads.nn1
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i8 = iLimit - iPosition;
        if (i8 == 0) {
            return;
        }
        int iMin = Math.min(i8, this.f8796l);
        this.f8799o += (long) (iMin / this.f12575b.f10774d);
        this.f8796l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f8796l > 0) {
            return;
        }
        int i9 = i8 - iMin;
        int length = (this.f8798n + i9) - this.f8797m.length;
        ByteBuffer byteBufferD = d(length);
        int iMax = Math.max(0, Math.min(length, this.f8798n));
        byteBufferD.put(this.f8797m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i9));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferD.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i10 = i9 - iMax2;
        int i11 = this.f8798n - iMax;
        this.f8798n = i11;
        byte[] bArr = this.f8797m;
        System.arraycopy(bArr, iMax, bArr, 0, i11);
        byteBuffer.get(this.f8797m, this.f8798n, i10);
        this.f8798n += i10;
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final ll1 c(ll1 ll1Var) throws mm1 {
        if (ll1Var.f10773c != 2) {
            throw new mm1("Unhandled input format:", ll1Var);
        }
        this.f8795k = true;
        return (this.f8793i == 0 && this.f8794j == 0) ? ll1.f10770e : ll1Var;
    }

    @Override // com.google.android.gms.internal.ads.oo1
    protected final void e() {
        if (this.f8795k) {
            this.f8795k = false;
            int i8 = this.f8794j;
            int i9 = this.f12575b.f10774d;
            this.f8797m = new byte[i8 * i9];
            this.f8796l = this.f8793i * i9;
        }
        this.f8798n = 0;
    }

    @Override // com.google.android.gms.internal.ads.oo1
    protected final void f() {
        if (this.f8795k) {
            int i8 = this.f8798n;
            if (i8 > 0) {
                this.f8799o += (long) (i8 / this.f12575b.f10774d);
            }
            this.f8798n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.oo1
    protected final void g() {
        this.f8797m = nz2.f12305f;
    }

    public final long i() {
        return this.f8799o;
    }

    public final void j() {
        this.f8799o = 0L;
    }

    @Override // com.google.android.gms.internal.ads.oo1, com.google.android.gms.internal.ads.nn1
    public final ByteBuffer k() {
        int i8;
        if (super.o() && (i8 = this.f8798n) > 0) {
            d(i8).put(this.f8797m, 0, this.f8798n).flip();
            this.f8798n = 0;
        }
        return super.k();
    }

    public final void m(int i8, int i9) {
        this.f8793i = i8;
        this.f8794j = i9;
    }

    @Override // com.google.android.gms.internal.ads.oo1, com.google.android.gms.internal.ads.nn1
    public final boolean o() {
        return super.o() && this.f8798n == 0;
    }
}
