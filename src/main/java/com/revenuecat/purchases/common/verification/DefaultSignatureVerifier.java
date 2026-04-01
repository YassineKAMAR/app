package com.revenuecat.purchases.common.verification;

import a4.c;
import android.util.Base64;
import java.security.GeneralSecurityException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultSignatureVerifier implements SignatureVerifier {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_PUBLIC_KEY = "UC1upXWg5QVmyOSwozp755xLqquBKjjU+di6U8QhMlM=";
    private final c verifier;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultSignatureVerifier(String publicKey) {
        q.f(publicKey, "publicKey");
        byte[] bArrDecode = Base64.decode(publicKey, 0);
        q.e(bArrDecode, "decode(publicKey, Base64.DEFAULT)");
        this(bArrDecode);
    }

    public /* synthetic */ DefaultSignatureVerifier(String str, int i8, j jVar) {
        this((i8 & 1) != 0 ? DEFAULT_PUBLIC_KEY : str);
    }

    public DefaultSignatureVerifier(byte[] publicKeyBytes) {
        q.f(publicKeyBytes, "publicKeyBytes");
        this.verifier = new c(publicKeyBytes);
    }

    @Override // com.revenuecat.purchases.common.verification.SignatureVerifier
    public boolean verify(byte[] signatureToVerify, byte[] messageToVerify) {
        q.f(signatureToVerify, "signatureToVerify");
        q.f(messageToVerify, "messageToVerify");
        try {
            this.verifier.a(signatureToVerify, messageToVerify);
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
