package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class om3 extends ko3 {
    om3() {
        super(yw3.class, new lm3(fh3.class));
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final jo3 a() {
        return new mm3(this, bx3.class);
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final uv3 b() {
        return uv3.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* synthetic */ k24 c(rz3 rz3Var) {
        return yw3.P(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* bridge */ /* synthetic */ void e(k24 k24Var) throws GeneralSecurityException {
        yw3 yw3Var = (yw3) k24Var;
        uy3.b(yw3Var.M(), 0);
        if (km3.b(yw3Var.Q().M().R())) {
            return;
        }
        throw new GeneralSecurityException("Unsupported DEK key type: " + yw3Var.Q().M().R() + ". Only Tink AEAD key types are supported.");
    }
}
