package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes.dex */
final class wh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MediaPlayer f16734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ gi0 f16735b;

    wh0(gi0 gi0Var, MediaPlayer mediaPlayer) {
        this.f16735b = gi0Var;
        this.f16734a = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gi0.L(this.f16735b, this.f16734a);
        gi0 gi0Var = this.f16735b;
        if (gi0Var.f8350p != null) {
            gi0Var.f8350p.n();
        }
    }
}
