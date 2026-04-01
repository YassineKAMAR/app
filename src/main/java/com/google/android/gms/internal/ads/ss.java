package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
public final class ss {
    public static Object a(c93 c93Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return c93Var.j();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
