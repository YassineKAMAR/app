package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vx3 implements fh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oy3 f16520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ei3 f16521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16522c;

    public vx3(oy3 oy3Var, ei3 ei3Var, int i8) {
        this.f16520a = oy3Var;
        this.f16521b = ei3Var;
        this.f16522c = i8;
    }

    @Override // com.google.android.gms.internal.ads.fh3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i8 = this.f16522c;
        if (length < i8) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length - i8);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length - this.f16522c, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f16521b.a(bArrCopyOfRange2, tx3.b(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f16520a.b(bArrCopyOfRange);
    }
}
