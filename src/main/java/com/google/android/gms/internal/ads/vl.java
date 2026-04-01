package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public abstract class vl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static MessageDigest f16335b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f16336a = new Object();

    protected final MessageDigest a() {
        synchronized (this.f16336a) {
            MessageDigest messageDigest = f16335b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i8 = 0; i8 < 2; i8++) {
                try {
                    f16335b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f16335b;
        }
    }

    abstract byte[] b(String str);
}
