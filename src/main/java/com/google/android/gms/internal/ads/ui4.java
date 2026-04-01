package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class ui4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f15691a = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioTrack$StreamEventCallback f15692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ xi4 f15693c;

    public ui4(xi4 xi4Var) {
        this.f15693c = xi4Var;
        this.f15692b = new ri4(this, xi4Var);
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.f15691a;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.qi4
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f15692b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f15692b);
        this.f15691a.removeCallbacksAndMessages(null);
    }
}
