package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class dk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f6784a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f6785b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f6786c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ek3 f6787d = ek3.f7389d;

    /* synthetic */ dk3(ck3 ck3Var) {
    }

    public final dk3 a(int i8) throws GeneralSecurityException {
        if (i8 != 12 && i8 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i8)));
        }
        this.f6785b = Integer.valueOf(i8);
        return this;
    }

    public final dk3 b(int i8) throws InvalidAlgorithmParameterException {
        if (i8 != 16 && i8 != 24 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f6784a = Integer.valueOf(i8);
        return this;
    }

    public final dk3 c(int i8) {
        this.f6786c = 16;
        return this;
    }

    public final dk3 d(ek3 ek3Var) {
        this.f6787d = ek3Var;
        return this;
    }

    public final gk3 e() throws GeneralSecurityException {
        Integer num = this.f6784a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f6785b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f6787d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f6786c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.f6785b.intValue();
        this.f6786c.intValue();
        return new gk3(iIntValue, iIntValue2, 16, this.f6787d, null);
    }
}
