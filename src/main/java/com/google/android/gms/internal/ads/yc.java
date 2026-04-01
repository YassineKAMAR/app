package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class yc extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lc f17728a;

    public yc(lc lcVar, int i8) {
        this.f17728a = lcVar;
        ((ByteArrayOutputStream) this).buf = lcVar.b(Math.max(i8, 256));
    }

    private final void a(int i8) {
        int i9 = ((ByteArrayOutputStream) this).count;
        if (i9 + i8 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i10 = i9 + i8;
        byte[] bArrB = this.f17728a.b(i10 + i10);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrB, 0, ((ByteArrayOutputStream) this).count);
        this.f17728a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrB;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17728a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f17728a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i8) {
        a(1);
        super.write(i8);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i8, int i9) {
        a(i9);
        super.write(bArr, i8, i9);
    }
}
