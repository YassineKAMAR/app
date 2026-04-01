package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class md3 extends OutputStream {
    md3() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i8) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i8, int i9) {
        bArr.getClass();
        l83.h(i8, i9 + i8, bArr.length);
    }
}
