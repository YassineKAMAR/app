package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vy3 implements fh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qn3 f16533a;

    public vy3(byte[] bArr) {
        this.f16533a = new qn3(bArr);
    }

    @Override // com.google.android.gms.internal.ads.fh3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f16533a.b(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }
}
