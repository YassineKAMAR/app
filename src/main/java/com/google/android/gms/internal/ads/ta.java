package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
final class ta implements sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f15019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f15021c;

    public ta(FileChannel fileChannel, long j8, long j9) {
        this.f15019a = fileChannel;
        this.f15020b = j8;
        this.f15021c = j9;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(MessageDigest[] messageDigestArr, long j8, int i8) throws IOException {
        MappedByteBuffer map = this.f15019a.map(FileChannel.MapMode.READ_ONLY, this.f15020b + j8, i8);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final long j() {
        return this.f15021c;
    }
}
