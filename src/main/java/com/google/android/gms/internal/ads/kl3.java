package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public final class kl3 extends ko3 {
    kl3() {
        super(wu3.class, new il3(fh3.class));
    }

    public static void k(boolean z7) {
        if (l()) {
            qi3.f(new kl3(), true);
            int i8 = vl3.f16349f;
            vl3.a(yo3.b());
        }
    }

    private static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final jo3 a() {
        return new jl3(this, zu3.class);
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final uv3 b() {
        return uv3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* synthetic */ k24 c(rz3 rz3Var) {
        return wu3.P(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.ko3
    public final /* bridge */ /* synthetic */ void e(k24 k24Var) throws GeneralSecurityException {
        wu3 wu3Var = (wu3) k24Var;
        uy3.b(wu3Var.M(), 0);
        uy3.a(wu3Var.Q().n());
    }
}
