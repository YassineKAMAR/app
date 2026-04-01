package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hq3 extends RuntimeException {
    public hq3(String str) {
        super(str);
    }

    public hq3(String str, Throwable th) {
        super("Creating a protokey serialization failed", th);
    }

    public hq3(Throwable th) {
        super(th);
    }

    public static Object a(gq3 gq3Var) {
        try {
            return gq3Var.j();
        } catch (Exception e8) {
            throw new hq3(e8);
        }
    }
}
