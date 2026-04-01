package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class rr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f14290a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f14291b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tr3 f14292c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ur3 f14293d = ur3.f15825e;

    /* synthetic */ rr3(qr3 qr3Var) {
    }

    public final rr3 a(tr3 tr3Var) {
        this.f14292c = tr3Var;
        return this;
    }

    public final rr3 b(int i8) {
        this.f14290a = Integer.valueOf(i8);
        return this;
    }

    public final rr3 c(int i8) {
        this.f14291b = Integer.valueOf(i8);
        return this;
    }

    public final rr3 d(ur3 ur3Var) {
        this.f14293d = ur3Var;
        return this;
    }

    public final wr3 e() throws GeneralSecurityException {
        Integer num = this.f14290a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f14291b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f14292c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f14293d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f14290a));
        }
        int iIntValue = this.f14291b.intValue();
        tr3 tr3Var = this.f14292c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iIntValue)));
        }
        if (tr3Var == tr3.f15256b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
            }
        } else if (tr3Var == tr3.f15257c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
            }
        } else if (tr3Var == tr3.f15258d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
            }
        } else if (tr3Var == tr3.f15259e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
            }
        } else {
            if (tr3Var != tr3.f15260f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
            }
        }
        return new wr3(this.f14290a.intValue(), this.f14291b.intValue(), this.f14293d, this.f14292c, null);
    }
}
