package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
final class bi4 {
    public static void a(AudioTrack audioTrack, ei4 ei4Var) {
        audioTrack.setPreferredDevice(ei4Var == null ? null : ei4Var.f7350a);
    }
}
