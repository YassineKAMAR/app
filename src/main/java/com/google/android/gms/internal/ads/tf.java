package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
final class tf implements Runnable {
    /* synthetic */ tf(sf sfVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            uf.f15637b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            uf.f15640e.countDown();
            throw th;
        }
        uf.f15640e.countDown();
    }
}
