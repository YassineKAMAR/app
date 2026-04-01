package x2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class w extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f27290b;

    w(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f27290b = bArr;
    }

    @Override // x2.v
    final byte[] k3() {
        return this.f27290b;
    }
}
