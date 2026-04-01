package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ht2 {
    public ht2() {
        try {
            ti3.a();
        } catch (GeneralSecurityException e8) {
            j2.v1.k("Failed to Configure Aead. ".concat(e8.toString()));
            g2.t.q().u(e8, "CryptoUtils.registerAead");
        }
    }

    public static final String a() {
        oz3 oz3VarJ = rz3.J();
        try {
            jh3.b(bi3.c(uh3.a("AES128_GCM").b()), hh3.b(oz3VarJ));
        } catch (IOException | GeneralSecurityException e8) {
            j2.v1.k("Failed to generate key".concat(e8.toString()));
            g2.t.q().u(e8, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(oz3VarJ.c().a(), 11);
        oz3VarJ.d();
        return strEncodeToString;
    }

    public static final String b(byte[] bArr, byte[] bArr2, String str, zp1 zp1Var) {
        bi3 bi3VarC = c(str);
        if (bi3VarC == null) {
            return null;
        }
        try {
            byte[] bArrA = ((fh3) bi3VarC.e(xp3.a(), fh3.class)).a(bArr, bArr2);
            zp1Var.a().put("ds", "1");
            return new String(bArrA, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e8) {
            j2.v1.k("Failed to decrypt ".concat(e8.toString()));
            g2.t.q().u(e8, "CryptoUtils.decrypt");
            zp1Var.a().put("dsf", e8.toString());
            return null;
        }
    }

    private static final bi3 c(String str) {
        try {
            return jh3.a(gh3.b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e8) {
            j2.v1.k("Failed to get keysethandle".concat(e8.toString()));
            g2.t.q().u(e8, "CryptoUtils.getHandle");
            return null;
        }
    }
}
