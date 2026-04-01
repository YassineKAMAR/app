package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class bk4 implements nk4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f5854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ik4 f5855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fk4 f5856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5858e = 0;

    /* synthetic */ bk4(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z7, zj4 zj4Var) {
        this.f5854a = mediaCodec;
        this.f5855b = new ik4(handlerThread);
        this.f5856c = new fk4(mediaCodec, handlerThread2);
    }

    static /* synthetic */ void m(bk4 bk4Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i8) {
        bk4Var.f5855b.f(bk4Var.f5854a);
        int i9 = nz2.f12300a;
        Trace.beginSection("configureCodec");
        bk4Var.f5854a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        bk4Var.f5856c.g();
        Trace.beginSection("startCodec");
        bk4Var.f5854a.start();
        Trace.endSection();
        bk4Var.f5858e = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n(int i8, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i8 == 1) {
            str2 = "Audio";
        } else if (i8 == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i8);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final boolean B() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final ByteBuffer F(int i8) {
        return this.f5854a.getOutputBuffer(i8);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void V(Bundle bundle) {
        this.f5854a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final ByteBuffer c(int i8) {
        return this.f5854a.getInputBuffer(i8);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void d(int i8, long j8) {
        this.f5854a.releaseOutputBuffer(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void e(int i8, int i9, int i10, long j8, int i11) {
        this.f5856c.d(i8, 0, i10, j8, i11);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void f(Surface surface) {
        this.f5854a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void g(int i8, int i9, n94 n94Var, long j8, int i10) {
        this.f5856c.e(i8, 0, n94Var, j8, 0);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void h(int i8) {
        this.f5854a.setVideoScalingMode(i8);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void i(int i8, boolean z7) {
        this.f5854a.releaseOutputBuffer(i8, z7);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final int j() {
        this.f5856c.c();
        return this.f5855b.a();
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final int k(MediaCodec.BufferInfo bufferInfo) {
        this.f5856c.c();
        return this.f5855b.b(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final MediaFormat l() {
        return this.f5855b.c();
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void r() {
        this.f5856c.b();
        this.f5854a.flush();
        this.f5855b.e();
        this.f5854a.start();
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void u() {
        try {
            if (this.f5858e == 1) {
                this.f5856c.f();
                this.f5855b.g();
            }
            this.f5858e = 2;
            if (this.f5857d) {
                return;
            }
            this.f5854a.release();
            this.f5857d = true;
        } catch (Throwable th) {
            if (!this.f5857d) {
                this.f5854a.release();
                this.f5857d = true;
            }
            throw th;
        }
    }
}
