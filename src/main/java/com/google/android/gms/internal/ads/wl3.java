package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class wl3 extends ui3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bm3 f16803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xy3 f16804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wy3 f16805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f16806d;

    private wl3(bm3 bm3Var, xy3 xy3Var, wy3 wy3Var, Integer num) {
        this.f16803a = bm3Var;
        this.f16804b = xy3Var;
        this.f16805c = wy3Var;
        this.f16806d = num;
    }

    public static wl3 a(am3 am3Var, xy3 xy3Var, Integer num) throws GeneralSecurityException {
        wy3 wy3VarB;
        am3 am3Var2 = am3.f5334d;
        if (am3Var != am3Var2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + am3Var.toString() + " the value of idRequirement must be non-null");
        }
        if (am3Var == am3Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (xy3Var.a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + xy3Var.a());
        }
        bm3 bm3VarB = bm3.b(am3Var);
        if (bm3VarB.a() == am3Var2) {
            wy3VarB = wy3.b(new byte[0]);
        } else if (bm3VarB.a() == am3.f5333c) {
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (bm3VarB.a() != am3.f5332b) {
                throw new IllegalStateException("Unknown Variant: ".concat(bm3VarB.a().toString()));
            }
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new wl3(bm3VarB, xy3Var, wy3VarB, num);
    }
}
