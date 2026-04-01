package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class kq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private xq3 f10238a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xy3 f10239b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f10240c = null;

    /* synthetic */ kq3(jq3 jq3Var) {
    }

    public final kq3 a(xy3 xy3Var) {
        this.f10239b = xy3Var;
        return this;
    }

    public final kq3 b(Integer num) {
        this.f10240c = num;
        return this;
    }

    public final kq3 c(xq3 xq3Var) {
        this.f10238a = xq3Var;
        return this;
    }

    public final mq3 d() throws GeneralSecurityException {
        xy3 xy3Var;
        wy3 wy3VarB;
        xq3 xq3Var = this.f10238a;
        if (xq3Var == null || (xy3Var = this.f10239b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (xq3Var.b() != xy3Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (xq3Var.e() && this.f10240c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f10238a.e() && this.f10240c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f10238a.d() == vq3.f16422e) {
            wy3VarB = wy3.b(new byte[0]);
        } else if (this.f10238a.d() == vq3.f16421d || this.f10238a.d() == vq3.f16420c) {
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f10240c.intValue()).array());
        } else {
            if (this.f10238a.d() != vq3.f16419b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f10238a.d())));
            }
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f10240c.intValue()).array());
        }
        return new mq3(this.f10238a, this.f10239b, wy3VarB, this.f10240c, null);
    }
}
