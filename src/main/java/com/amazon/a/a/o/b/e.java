package com.amazon.a.a.o.b;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3940a = "SHA384withRSA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3941b = new com.amazon.a.a.o.c("SignatureVerifier");

    public static boolean a(String str, String str2, PublicKey publicKey) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3941b.a("Verifying signature of data: '" + str + "', signature: '" + str2 + "', with key: '" + publicKey.toString());
        }
        try {
            byte[] bArrC = com.amazon.c.a.a.c.c(str2.getBytes());
            Signature signature = Signature.getInstance(f3940a);
            signature.initVerify(publicKey);
            signature.update(str.getBytes());
            return signature.verify(bArrC);
        } catch (IOException | GeneralSecurityException unused) {
            return false;
        }
    }
}
