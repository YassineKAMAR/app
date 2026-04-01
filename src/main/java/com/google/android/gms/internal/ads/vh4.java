package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
final class vh4 {
    public static vg4 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z7) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return vg4.f16263d;
        }
        tg4 tg4Var = new tg4();
        tg4Var.a(true);
        tg4Var.c(z7);
        return tg4Var.d();
    }
}
