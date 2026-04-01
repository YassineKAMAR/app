package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
final class uk4 {
    public static void a(lk4 lk4Var, pg4 pg4Var) {
        LogSessionId logSessionIdA = pg4Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        lk4Var.f10763b.setString("log-session-id", logSessionIdA.getStringId());
    }
}
