package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class s3 extends RuntimeException {
    public s3(r2 r2Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final u1 a() {
        return new u1(getMessage());
    }
}
