package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class x74 extends a84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Logger f17102a;

    public x74(String str) {
        this.f17102a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.a84
    public final void a(String str) {
        this.f17102a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
