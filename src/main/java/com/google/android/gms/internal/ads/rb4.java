package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
final class rb4 {
    public static pg4 a(Context context, bc4 bc4Var, boolean z7) {
        lg4 lg4VarM = lg4.m(context);
        if (lg4VarM == null) {
            pf2.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new pg4(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z7) {
            bc4Var.f(lg4VarM);
        }
        return new pg4(lg4VarM.j());
    }
}
