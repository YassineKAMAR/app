package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b23 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final byte[] f5583c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final byte[] f5584d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f5585a = f5584d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f5586b = f5583c;

    public final boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrA = za.a(file.getAbsolutePath());
            if (x509CertificateArrA.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrA[0][0].getEncoded());
            if (Arrays.equals(this.f5586b, bArrDigest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.f5585a, bArrDigest);
        } catch (wa e8) {
            throw new GeneralSecurityException("Package is not signed", e8);
        } catch (IOException e9) {
            e = e9;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e10) {
            e = e10;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
