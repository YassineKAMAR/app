package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class wm3 extends ui3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn3 f16817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xy3 f16818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wy3 f16819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f16820d;

    private wm3(bn3 bn3Var, xy3 xy3Var, wy3 wy3Var, Integer num) {
        this.f16817a = bn3Var;
        this.f16818b = xy3Var;
        this.f16819c = wy3Var;
        this.f16820d = num;
    }

    public static wm3 a(an3 an3Var, xy3 xy3Var, Integer num) throws GeneralSecurityException {
        wy3 wy3VarB;
        an3 an3Var2 = an3.f5350d;
        if (an3Var != an3Var2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + an3Var.toString() + " the value of idRequirement must be non-null");
        }
        if (an3Var == an3Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (xy3Var.a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + xy3Var.a());
        }
        bn3 bn3VarB = bn3.b(an3Var);
        if (bn3VarB.a() == an3Var2) {
            wy3VarB = wy3.b(new byte[0]);
        } else if (bn3VarB.a() == an3.f5349c) {
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (bn3VarB.a() != an3.f5348b) {
                throw new IllegalStateException("Unknown Variant: ".concat(bn3VarB.a().toString()));
            }
            wy3VarB = wy3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new wm3(bn3VarB, xy3Var, wy3VarB, num);
    }
}
