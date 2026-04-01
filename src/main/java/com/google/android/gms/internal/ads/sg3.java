package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class sg3 {
    static void a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
