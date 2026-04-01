package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class pc extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f12815b;

    pc(InputStream inputStream, long j8) {
        super(inputStream);
        this.f12814a = j8;
    }

    final long a() {
        return this.f12814a - this.f12815b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i8 = super.read();
        if (i8 != -1) {
            this.f12815b++;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) throws IOException {
        int i10 = super.read(bArr, i8, i9);
        if (i10 != -1) {
            this.f12815b += (long) i10;
        }
        return i10;
    }
}
