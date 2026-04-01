package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class aj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mj3 f5288a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xy3 f5289b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private xy3 f5290c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f5291d = null;

    /* synthetic */ aj3(zi3 zi3Var) {
    }

    public final aj3 a(xy3 xy3Var) {
        this.f5289b = xy3Var;
        return this;
    }

    public final aj3 b(xy3 xy3Var) {
        this.f5290c = xy3Var;
        return this;
    }

    public final aj3 c(Integer num) {
        this.f5291d = num;
        return this;
    }

    public final aj3 d(mj3 mj3Var) {
        this.f5288a = mj3Var;
        return this;
    }

    public final cj3 e() throws GeneralSecurityException {
        wy3 wy3VarB;
        mj3 mj3Var = this.f5288a;
        if (mj3Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        xy3 xy3Var = this.f5289b;
        if (xy3Var == null || this.f5290c == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (mj3Var.a() != xy3Var.a()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (mj3Var.b() != this.f5290c.a()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.f5288a.g() && this.f5291d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f5288a.g() && this.f5291d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f5288a.f() == jj3.f9662d) {
            wy3VarB = wy3.b(new byte[0]);
        } else if (this.f5288a.f() == jj3.f9661c) {
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f5291d.intValue()).array());
        } else {
            if (this.f5288a.f() != jj3.f9660b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f5288a.f())));
            }
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f5291d.intValue()).array());
        }
        return new cj3(this.f5288a, this.f5289b, this.f5290c, wy3VarB, this.f5291d, null);
    }
}
