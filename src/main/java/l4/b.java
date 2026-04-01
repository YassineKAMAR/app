package l4;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f24388a = 0;

    b() {
    }

    long a() {
        return this.f24388a;
    }

    @Override // java.io.OutputStream
    public void write(int i8) {
        this.f24388a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f24388a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) {
        int i10;
        if (i8 < 0 || i8 > bArr.length || i9 < 0 || (i10 = i8 + i9) > bArr.length || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f24388a += (long) i9;
    }
}
