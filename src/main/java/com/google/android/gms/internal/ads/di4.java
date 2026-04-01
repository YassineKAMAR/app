package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
final class di4 {
    public static void a(AudioTrack audioTrack, pg4 pg4Var) {
        LogSessionId logSessionIdA = pg4Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdA);
    }
}
