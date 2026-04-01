package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class bk3 extends ko3 {
    bk3() {
        super(gu3.class, new zj3(fh3.class));
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final jo3 a() {
        return new ak3(this, ju3.class);
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final uv3 b() {
        return uv3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* synthetic */ k24 c(rz3 rz3Var) {
        return gu3.P(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* bridge */ /* synthetic */ void e(k24 k24Var) throws GeneralSecurityException {
        gu3 gu3Var = (gu3) k24Var;
        uy3.b(gu3Var.M(), 0);
        uy3.a(gu3Var.R().n());
        if (gu3Var.Q().M() != 12 && gu3Var.Q().M() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
