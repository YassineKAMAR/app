package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class h0 extends k0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19561f;

    h0(byte[] bArr, int i8, int i9) {
        super(bArr);
        n0.w(0, i9, bArr.length);
        this.f19561f = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.k0
    protected final int A() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.k0, com.google.android.gms.internal.play_billing.n0
    public final byte a(int i8) {
        int i9 = this.f19561f;
        if (((i9 - (i8 + 1)) | i8) >= 0) {
            return this.f19606e[i8];
        }
        if (i8 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
    }

    @Override // com.google.android.gms.internal.play_billing.k0, com.google.android.gms.internal.play_billing.n0
    final byte e(int i8) {
        return this.f19606e[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.k0, com.google.android.gms.internal.play_billing.n0
    public final int g() {
        return this.f19561f;
    }
}
