package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class yj0 implements u74 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f17782a;

    yj0(ByteBuffer byteBuffer) {
        this.f17782a = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final int a0(ByteBuffer byteBuffer) {
        if (this.f17782a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.f17782a.remaining());
        byte[] bArr = new byte[iMin];
        this.f17782a.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final void b(long j8) {
        this.f17782a.position((int) j8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final ByteBuffer e(long j8, long j9) {
        ByteBuffer byteBuffer = this.f17782a;
        int i8 = (int) j8;
        int iPosition = byteBuffer.position();
        byteBuffer.position(i8);
        ByteBuffer byteBufferSlice = this.f17782a.slice();
        byteBufferSlice.limit((int) j9);
        this.f17782a.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final long k() {
        return this.f17782a.position();
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final long l() {
        return this.f17782a.limit();
    }
}
