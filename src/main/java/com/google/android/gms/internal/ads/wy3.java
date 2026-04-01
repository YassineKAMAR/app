package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f16979a;

    private wy3(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        this.f16979a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i9);
    }

    public static wy3 b(byte[] bArr) {
        if (bArr != null) {
            return new wy3(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final int a() {
        return this.f16979a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.f16979a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wy3) {
            return Arrays.equals(((wy3) obj).f16979a, this.f16979a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16979a);
    }

    public final String toString() {
        return "Bytes(" + ny3.a(this.f16979a) + ")";
    }
}
