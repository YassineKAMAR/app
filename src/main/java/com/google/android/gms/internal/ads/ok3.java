package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ok3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yk3 f12523a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xy3 f12524b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f12525c = null;

    /* synthetic */ ok3(nk3 nk3Var) {
    }

    public final ok3 a(Integer num) {
        this.f12525c = num;
        return this;
    }

    public final ok3 b(xy3 xy3Var) {
        this.f12524b = xy3Var;
        return this;
    }

    public final ok3 c(yk3 yk3Var) {
        this.f12523a = yk3Var;
        return this;
    }

    public final qk3 d() throws GeneralSecurityException {
        xy3 xy3Var;
        wy3 wy3VarB;
        yk3 yk3Var = this.f12523a;
        if (yk3Var == null || (xy3Var = this.f12524b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (yk3Var.a() != xy3Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (yk3Var.c() && this.f12525c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f12523a.c() && this.f12525c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f12523a.b() == wk3.f16783d) {
            wy3VarB = wy3.b(new byte[0]);
        } else if (this.f12523a.b() == wk3.f16782c) {
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f12525c.intValue()).array());
        } else {
            if (this.f12523a.b() != wk3.f16781b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f12523a.b())));
            }
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f12525c.intValue()).array());
        }
        return new qk3(this.f12523a, this.f12524b, wy3VarB, this.f12525c, null);
    }
}
