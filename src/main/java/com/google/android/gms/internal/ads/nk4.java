package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface nk4 {
    boolean B();

    ByteBuffer F(int i8);

    void V(Bundle bundle);

    ByteBuffer c(int i8);

    void d(int i8, long j8);

    void e(int i8, int i9, int i10, long j8, int i11);

    void f(Surface surface);

    void g(int i8, int i9, n94 n94Var, long j8, int i10);

    void h(int i8);

    void i(int i8, boolean z7);

    int j();

    int k(MediaCodec.BufferInfo bufferInfo);

    MediaFormat l();

    void r();

    void u();
}
