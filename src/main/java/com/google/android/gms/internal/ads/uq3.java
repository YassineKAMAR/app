package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class uq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f15814a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f15815b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private vq3 f15816c = vq3.f16422e;

    /* synthetic */ uq3(tq3 tq3Var) {
    }

    public final uq3 a(int i8) throws InvalidAlgorithmParameterException {
        if (i8 != 16 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i8 * 8)));
        }
        this.f15814a = Integer.valueOf(i8);
        return this;
    }

    public final uq3 b(int i8) throws GeneralSecurityException {
        if (i8 >= 10 && i8 <= 16) {
            this.f15815b = Integer.valueOf(i8);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i8);
    }

    public final uq3 c(vq3 vq3Var) {
        this.f15816c = vq3Var;
        return this;
    }

    public final xq3 d() throws GeneralSecurityException {
        Integer num = this.f15814a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f15815b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.f15816c != null) {
            return new xq3(num.intValue(), this.f15815b.intValue(), this.f15816c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
