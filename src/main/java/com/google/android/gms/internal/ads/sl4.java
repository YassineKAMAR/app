package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class sl4 implements nk4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f14760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f14761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f14762c;

    /* synthetic */ sl4(MediaCodec mediaCodec, rl4 rl4Var) {
        this.f14760a = mediaCodec;
        if (nz2.f12300a < 21) {
            this.f14761b = mediaCodec.getInputBuffers();
            this.f14762c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final boolean B() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final ByteBuffer F(int i8) {
        return nz2.f12300a >= 21 ? this.f14760a.getOutputBuffer(i8) : this.f14762c[i8];
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void V(Bundle bundle) {
        this.f14760a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final ByteBuffer c(int i8) {
        return nz2.f12300a >= 21 ? this.f14760a.getInputBuffer(i8) : this.f14761b[i8];
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void d(int i8, long j8) {
        this.f14760a.releaseOutputBuffer(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void e(int i8, int i9, int i10, long j8, int i11) {
        this.f14760a.queueInputBuffer(i8, 0, i10, j8, i11);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void f(Surface surface) {
        this.f14760a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void g(int i8, int i9, n94 n94Var, long j8, int i10) {
        this.f14760a.queueSecureInputBuffer(i8, 0, n94Var.a(), j8, 0);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void h(int i8) {
        this.f14760a.setVideoScalingMode(i8);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void i(int i8, boolean z7) {
        this.f14760a.releaseOutputBuffer(i8, z7);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final int j() {
        return this.f14760a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final int k(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f14760a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                if (nz2.f12300a < 21) {
                    this.f14762c = this.f14760a.getOutputBuffers();
                }
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final MediaFormat l() {
        return this.f14760a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void r() {
        this.f14760a.flush();
    }

    @Override // com.google.android.gms.internal.ads.nk4
    public final void u() {
        this.f14761b = null;
        this.f14762c = null;
        this.f14760a.release();
    }
}
