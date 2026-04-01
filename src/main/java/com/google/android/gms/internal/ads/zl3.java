package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zl3 extends ko3 {
    zl3() {
        super(cv3.class, new xl3(fh3.class));
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final jo3 a() {
        return new yl3(this, fv3.class);
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final uv3 b() {
        return uv3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* synthetic */ k24 c(rz3 rz3Var) {
        return cv3.P(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* bridge */ /* synthetic */ void e(k24 k24Var) throws GeneralSecurityException {
        cv3 cv3Var = (cv3) k24Var;
        uy3.b(cv3Var.M(), 0);
        if (cv3Var.Q().n() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
