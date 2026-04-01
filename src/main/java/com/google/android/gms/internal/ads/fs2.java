package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class fs2 implements vv1 {
    protected fs2() {
    }

    @Override // com.google.android.gms.internal.ads.vv1
    public final g62 a(Looper looper, Handler.Callback callback) {
        return new iv2(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.vv1
    public final long j() {
        return SystemClock.elapsedRealtime();
    }
}
