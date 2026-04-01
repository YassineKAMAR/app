package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class nl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f11915a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ol3 f11916b = ol3.f12539d;

    /* synthetic */ nl3(ll3 ll3Var) {
    }

    public final nl3 a(int i8) throws InvalidAlgorithmParameterException {
        if (i8 != 16 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f11915a = Integer.valueOf(i8);
        return this;
    }

    public final nl3 b(ol3 ol3Var) {
        this.f11916b = ol3Var;
        return this;
    }

    public final ql3 c() throws GeneralSecurityException {
        Integer num = this.f11915a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f11916b != null) {
            return new ql3(num.intValue(), this.f11916b, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
