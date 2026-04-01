package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
final class ts4 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ts4 f15317f = new ts4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f15318a = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f15319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HandlerThread f15320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Choreographer f15321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15322e;

    private ts4() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f15320c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f15319b = handler;
        handler.sendEmptyMessage(0);
    }

    public static ts4 a() {
        return f15317f;
    }

    public final void b() {
        this.f15319b.sendEmptyMessage(1);
    }

    public final void c() {
        this.f15319b.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        this.f15318a = j8;
        Choreographer choreographer = this.f15321d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 0) {
            try {
                this.f15321d = Choreographer.getInstance();
            } catch (RuntimeException e8) {
                pf2.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e8);
            }
            return true;
        }
        if (i8 == 1) {
            Choreographer choreographer = this.f15321d;
            if (choreographer != null) {
                int i9 = this.f15322e + 1;
                this.f15322e = i9;
                if (i9 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i8 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f15321d;
        if (choreographer2 != null) {
            int i10 = this.f15322e - 1;
            this.f15322e = i10;
            if (i10 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f15318a = -9223372036854775807L;
            }
        }
        return true;
    }
}
