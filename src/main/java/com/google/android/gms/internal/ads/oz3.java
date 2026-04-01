package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class oz3 extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f12673f = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12676c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12678e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12674a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f12675b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f12677d = new byte[128];

    oz3(int i8) {
    }

    private final void h(int i8) {
        this.f12675b.add(new nz3(this.f12677d));
        int length = this.f12676c + this.f12677d.length;
        this.f12676c = length;
        this.f12677d = new byte[Math.max(this.f12674a, Math.max(i8, length >>> 1))];
        this.f12678e = 0;
    }

    public final synchronized int a() {
        return this.f12676c + this.f12678e;
    }

    public final synchronized rz3 c() {
        int i8 = this.f12678e;
        byte[] bArr = this.f12677d;
        if (i8 >= bArr.length) {
            this.f12675b.add(new nz3(this.f12677d));
            this.f12677d = f12673f;
        } else if (i8 > 0) {
            this.f12675b.add(new nz3(Arrays.copyOf(bArr, i8)));
        }
        this.f12676c += this.f12678e;
        this.f12678e = 0;
        return rz3.K(this.f12675b);
    }

    public final synchronized void d() {
        this.f12675b.clear();
        this.f12676c = 0;
        this.f12678e = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i8) {
        if (this.f12678e == this.f12677d.length) {
            h(1);
        }
        byte[] bArr = this.f12677d;
        int i9 = this.f12678e;
        this.f12678e = i9 + 1;
        bArr[i9] = (byte) i8;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = this.f12677d;
        int length = bArr2.length;
        int i10 = this.f12678e;
        int i11 = length - i10;
        if (i9 <= i11) {
            System.arraycopy(bArr, i8, bArr2, i10, i9);
            this.f12678e += i9;
            return;
        }
        System.arraycopy(bArr, i8, bArr2, i10, i11);
        int i12 = i9 - i11;
        h(i12);
        System.arraycopy(bArr, i8 + i11, this.f12677d, 0, i12);
        this.f12678e = i12;
    }
}
