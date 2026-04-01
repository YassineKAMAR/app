package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
final class ra implements sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f13995a;

    public ra(ByteBuffer byteBuffer) {
        this.f13995a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(MessageDigest[] messageDigestArr, long j8, int i8) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f13995a) {
            int i9 = (int) j8;
            this.f13995a.position(i9);
            this.f13995a.limit(i9 + i8);
            byteBufferSlice = this.f13995a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final long j() {
        return this.f13995a.capacity();
    }
}
