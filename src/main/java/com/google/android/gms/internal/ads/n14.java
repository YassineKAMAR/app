package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class n14 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f11600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f11601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11602c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f11606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f11608i;

    n14(Iterable iterable) {
        this.f11600a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f11602c++;
        }
        this.f11603d = -1;
        if (c()) {
            return;
        }
        this.f11601b = k14.f9888e;
        this.f11603d = 0;
        this.f11604e = 0;
        this.f11608i = 0L;
    }

    private final void a(int i8) {
        int i9 = this.f11604e + i8;
        this.f11604e = i9;
        if (i9 == this.f11601b.limit()) {
            c();
        }
    }

    private final boolean c() {
        this.f11603d++;
        if (!this.f11600a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f11600a.next();
        this.f11601b = byteBuffer;
        this.f11604e = byteBuffer.position();
        if (this.f11601b.hasArray()) {
            this.f11605f = true;
            this.f11606g = this.f11601b.array();
            this.f11607h = this.f11601b.arrayOffset();
        } else {
            this.f11605f = false;
            this.f11608i = g44.m(this.f11601b);
            this.f11606g = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f11603d == this.f11602c) {
            return -1;
        }
        int i8 = (this.f11605f ? this.f11606g[this.f11604e + this.f11607h] : g44.i(((long) this.f11604e) + this.f11608i)) & 255;
        a(1);
        return i8;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) {
        if (this.f11603d == this.f11602c) {
            return -1;
        }
        int iLimit = this.f11601b.limit();
        int i10 = this.f11604e;
        int i11 = iLimit - i10;
        if (i9 > i11) {
            i9 = i11;
        }
        if (this.f11605f) {
            System.arraycopy(this.f11606g, i10 + this.f11607h, bArr, i8, i9);
        } else {
            int iPosition = this.f11601b.position();
            this.f11601b.position(this.f11604e);
            this.f11601b.get(bArr, i8, i9);
            this.f11601b.position(iPosition);
        }
        a(i9);
        return i9;
    }
}
