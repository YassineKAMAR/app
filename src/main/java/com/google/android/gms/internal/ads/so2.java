package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class so2 implements vf3 {
    so2(uo2 uo2Var) {
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        j2.v1.k("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* synthetic */ void b(@NullableDecl Object obj) {
        j2.v1.k("Notification of cache hit successful.");
    }
}
