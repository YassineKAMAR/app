package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class hj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f8787a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f8788b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f8789c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f8790d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ij3 f8791e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private jj3 f8792f = jj3.f9662d;

    /* synthetic */ hj3(gj3 gj3Var) {
    }

    public final hj3 a(int i8) throws InvalidAlgorithmParameterException {
        if (i8 != 16 && i8 != 24 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f8787a = Integer.valueOf(i8);
        return this;
    }

    public final hj3 b(ij3 ij3Var) {
        this.f8791e = ij3Var;
        return this;
    }

    public final hj3 c(int i8) throws InvalidAlgorithmParameterException {
        if (i8 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i8)));
        }
        this.f8788b = Integer.valueOf(i8);
        return this;
    }

    public final hj3 d(int i8) throws GeneralSecurityException {
        if (i8 < 12 || i8 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i8)));
        }
        this.f8789c = Integer.valueOf(i8);
        return this;
    }

    public final hj3 e(int i8) throws GeneralSecurityException {
        if (i8 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i8)));
        }
        this.f8790d = Integer.valueOf(i8);
        return this;
    }

    public final hj3 f(jj3 jj3Var) {
        this.f8792f = jj3Var;
        return this;
    }

    public final mj3 g() throws GeneralSecurityException {
        if (this.f8787a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f8788b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f8789c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f8790d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f8791e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f8792f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        ij3 ij3Var = this.f8791e;
        if (ij3Var == ij3.f9247b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
            }
        } else if (ij3Var == ij3.f9248c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
            }
        } else if (ij3Var == ij3.f9249d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
            }
        } else if (ij3Var == ij3.f9250e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
            }
        } else {
            if (ij3Var != ij3.f9251f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
            }
        }
        return new mj3(this.f8787a.intValue(), this.f8788b.intValue(), this.f8789c.intValue(), this.f8790d.intValue(), this.f8792f, this.f8791e, null);
    }
}
