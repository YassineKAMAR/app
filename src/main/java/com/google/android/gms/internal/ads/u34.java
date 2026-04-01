package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class u34 extends RuntimeException {
    public u34(k24 k24Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final m14 a() {
        return new m14(getMessage());
    }
}
