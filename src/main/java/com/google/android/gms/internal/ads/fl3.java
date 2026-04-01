package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class fl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ql3 f7807a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xy3 f7808b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f7809c = null;

    /* synthetic */ fl3(el3 el3Var) {
    }

    public final fl3 a(Integer num) {
        this.f7809c = num;
        return this;
    }

    public final fl3 b(xy3 xy3Var) {
        this.f7808b = xy3Var;
        return this;
    }

    public final fl3 c(ql3 ql3Var) {
        this.f7807a = ql3Var;
        return this;
    }

    public final hl3 d() throws GeneralSecurityException {
        xy3 xy3Var;
        wy3 wy3VarB;
        ql3 ql3Var = this.f7807a;
        if (ql3Var == null || (xy3Var = this.f7808b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ql3Var.a() != xy3Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ql3Var.c() && this.f7809c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f7807a.c() && this.f7809c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f7807a.b() == ol3.f12539d) {
            wy3VarB = wy3.b(new byte[0]);
        } else if (this.f7807a.b() == ol3.f12538c) {
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f7809c.intValue()).array());
        } else {
            if (this.f7807a.b() != ol3.f12537b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f7807a.b())));
            }
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f7809c.intValue()).array());
        }
        return new hl3(this.f7807a, this.f7808b, wy3VarB, this.f7809c, null);
    }
}
