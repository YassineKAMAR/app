package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ir3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wr3 f9327a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xy3 f9328b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f9329c = null;

    /* synthetic */ ir3(hr3 hr3Var) {
    }

    public final ir3 a(Integer num) {
        this.f9329c = num;
        return this;
    }

    public final ir3 b(xy3 xy3Var) {
        this.f9328b = xy3Var;
        return this;
    }

    public final ir3 c(wr3 wr3Var) {
        this.f9327a = wr3Var;
        return this;
    }

    public final kr3 d() throws GeneralSecurityException {
        xy3 xy3Var;
        wy3 wy3VarB;
        wr3 wr3Var = this.f9327a;
        if (wr3Var == null || (xy3Var = this.f9328b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (wr3Var.b() != xy3Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (wr3Var.g() && this.f9329c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f9327a.g() && this.f9329c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f9327a.f() == ur3.f15825e) {
            wy3VarB = wy3.b(new byte[0]);
        } else if (this.f9327a.f() == ur3.f15824d || this.f9327a.f() == ur3.f15823c) {
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f9329c.intValue()).array());
        } else {
            if (this.f9327a.f() != ur3.f15822b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f9327a.f())));
            }
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f9329c.intValue()).array());
        }
        return new kr3(this.f9327a, this.f9328b, wy3VarB, this.f9329c, null);
    }
}
