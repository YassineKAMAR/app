package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class wj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gk3 f16769a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xy3 f16770b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f16771c = null;

    /* synthetic */ wj3(vj3 vj3Var) {
    }

    public final wj3 a(Integer num) {
        this.f16771c = num;
        return this;
    }

    public final wj3 b(xy3 xy3Var) {
        this.f16770b = xy3Var;
        return this;
    }

    public final wj3 c(gk3 gk3Var) {
        this.f16769a = gk3Var;
        return this;
    }

    public final yj3 d() throws GeneralSecurityException {
        xy3 xy3Var;
        wy3 wy3VarB;
        gk3 gk3Var = this.f16769a;
        if (gk3Var == null || (xy3Var = this.f16770b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (gk3Var.b() != xy3Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (gk3Var.d() && this.f16771c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f16769a.d() && this.f16771c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f16769a.c() == ek3.f7389d) {
            wy3VarB = wy3.b(new byte[0]);
        } else if (this.f16769a.c() == ek3.f7388c) {
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f16771c.intValue()).array());
        } else {
            if (this.f16769a.c() != ek3.f7387b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f16769a.c())));
            }
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f16771c.intValue()).array());
        }
        return new yj3(this.f16769a, this.f16770b, wy3VarB, this.f16771c, null);
    }
}
