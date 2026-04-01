package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class wp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f16850a = new vp3();

    static /* synthetic */ SecureRandom a() {
        SecureRandom secureRandomC = c();
        secureRandomC.nextLong();
        return secureRandomC;
    }

    public static byte[] b(int i8) {
        byte[] bArr = new byte[i8];
        ((SecureRandom) f16850a.get()).nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom c() {
        try {
            try {
                try {
                    try {
                        try {
                            return SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
                        } catch (ClassNotFoundException e8) {
                            e = e8;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (IllegalAccessException e9) {
                            e = e9;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (IllegalArgumentException e10) {
                            e = e10;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (NoSuchMethodException e11) {
                            e = e11;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (InvocationTargetException e12) {
                            e = e12;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        }
                    } catch (GeneralSecurityException unused) {
                        return SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]));
                    }
                } catch (GeneralSecurityException unused2) {
                    return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
                }
            } catch (GeneralSecurityException unused3) {
                return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
            }
        } catch (GeneralSecurityException unused4) {
            return new SecureRandom();
        }
    }
}
