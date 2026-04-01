package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class w94 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f16666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z94 f16667b;

    public w94(z94 z94Var, Handler handler) {
        this.f16667b = z94Var;
        this.f16666a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i8) {
        this.f16666a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.v94
            @Override // java.lang.Runnable
            public final void run() {
                z94.c(this.f16078a.f16667b, i8);
            }
        });
    }
}
