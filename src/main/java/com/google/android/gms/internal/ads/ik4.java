package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
final class ik4 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f9259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f9260c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f9265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f9266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f9267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f9268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IllegalStateException f9270m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9258a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p.c f9261d = new p.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p.c f9262e = new p.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f9263f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f9264g = new ArrayDeque();

    ik4(HandlerThread handlerThread) {
        this.f9259b = handlerThread;
    }

    public static /* synthetic */ void d(ik4 ik4Var) {
        synchronized (ik4Var.f9258a) {
            if (ik4Var.f9269l) {
                return;
            }
            long j8 = ik4Var.f9268k - 1;
            ik4Var.f9268k = j8;
            if (j8 > 0) {
                return;
            }
            if (j8 >= 0) {
                ik4Var.i();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            synchronized (ik4Var.f9258a) {
                ik4Var.f9270m = illegalStateException;
            }
        }
    }

    private final void h(MediaFormat mediaFormat) {
        this.f9262e.a(-2);
        this.f9264g.add(mediaFormat);
    }

    private final void i() {
        if (!this.f9264g.isEmpty()) {
            this.f9266i = (MediaFormat) this.f9264g.getLast();
        }
        this.f9261d.b();
        this.f9262e.b();
        this.f9263f.clear();
        this.f9264g.clear();
    }

    private final void j() {
        IllegalStateException illegalStateException = this.f9270m;
        if (illegalStateException == null) {
            return;
        }
        this.f9270m = null;
        throw illegalStateException;
    }

    private final void k() {
        MediaCodec.CodecException codecException = this.f9267j;
        if (codecException == null) {
            return;
        }
        this.f9267j = null;
        throw codecException;
    }

    private final boolean l() {
        return this.f9268k > 0 || this.f9269l;
    }

    public final int a() {
        synchronized (this.f9258a) {
            j();
            k();
            int iE = -1;
            if (l()) {
                return -1;
            }
            if (!this.f9261d.d()) {
                iE = this.f9261d.e();
            }
            return iE;
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f9258a) {
            j();
            k();
            if (l()) {
                return -1;
            }
            if (this.f9262e.d()) {
                return -1;
            }
            int iE = this.f9262e.e();
            if (iE >= 0) {
                uu1.b(this.f9265h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f9263f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iE == -2) {
                this.f9265h = (MediaFormat) this.f9264g.remove();
                iE = -2;
            }
            return iE;
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f9258a) {
            mediaFormat = this.f9265h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.f9258a) {
            this.f9268k++;
            Handler handler = this.f9260c;
            int i8 = nz2.f12300a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gk4
                @Override // java.lang.Runnable
                public final void run() {
                    ik4.d(this.f8381a);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        uu1.f(this.f9260c == null);
        this.f9259b.start();
        Handler handler = new Handler(this.f9259b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f9260c = handler;
    }

    public final void g() {
        synchronized (this.f9258a) {
            this.f9269l = true;
            this.f9259b.quit();
            i();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f9258a) {
            this.f9267j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i8) {
        synchronized (this.f9258a) {
            this.f9261d.a(i8);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i8, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f9258a) {
            MediaFormat mediaFormat = this.f9266i;
            if (mediaFormat != null) {
                h(mediaFormat);
                this.f9266i = null;
            }
            this.f9262e.a(i8);
            this.f9263f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f9258a) {
            h(mediaFormat);
            this.f9266i = null;
        }
    }
}
