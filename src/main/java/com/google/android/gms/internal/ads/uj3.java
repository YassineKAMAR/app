package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class uj3 extends ko3 {
    uj3() {
        super(xt3.class, new sj3(oy3.class));
    }

    public static final void l(xt3 xt3Var) throws GeneralSecurityException {
        uy3.b(xt3Var.M(), 0);
        uy3.a(xt3Var.S().n());
        m(xt3Var.R());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(du3 du3Var) throws GeneralSecurityException {
        if (du3Var.M() < 12 || du3Var.M() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final jo3 a() {
        return new tj3(this, au3.class);
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final uv3 b() {
        return uv3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* synthetic */ k24 c(rz3 rz3Var) {
        return xt3.Q(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* bridge */ /* synthetic */ void e(k24 k24Var) throws GeneralSecurityException {
        l((xt3) k24Var);
    }
}
