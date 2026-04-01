package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class vk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f16326a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f16327b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f16328c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private wk3 f16329d = wk3.f16783d;

    /* synthetic */ vk3(uk3 uk3Var) {
    }

    public final vk3 a(int i8) {
        this.f16327b = 12;
        return this;
    }

    public final vk3 b(int i8) throws InvalidAlgorithmParameterException {
        if (i8 != 16 && i8 != 24 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f16326a = Integer.valueOf(i8);
        return this;
    }

    public final vk3 c(int i8) {
        this.f16328c = 16;
        return this;
    }

    public final vk3 d(wk3 wk3Var) {
        this.f16329d = wk3Var;
        return this;
    }

    public final yk3 e() throws GeneralSecurityException {
        Integer num = this.f16326a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f16329d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f16327b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f16328c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.f16327b.intValue();
        this.f16328c.intValue();
        return new yk3(iIntValue, 12, 16, this.f16329d, null);
    }
}
