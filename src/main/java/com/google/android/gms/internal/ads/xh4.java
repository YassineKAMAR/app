package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
final class xh4 {
    public static vg4 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z7) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return vg4.f16263d;
        }
        tg4 tg4Var = new tg4();
        boolean z8 = false;
        if (nz2.f12300a > 32 && playbackOffloadSupport == 2) {
            z8 = true;
        }
        tg4Var.a(true);
        tg4Var.b(z8);
        tg4Var.c(z7);
        return tg4Var.d();
    }
}
