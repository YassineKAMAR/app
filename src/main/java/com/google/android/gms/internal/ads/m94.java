package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;

/* JADX INFO: loaded from: classes.dex */
final class m94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f11216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaCodec$CryptoInfo$Pattern f11217b = new MediaCodec$CryptoInfo$Pattern(0, 0);

    static /* bridge */ /* synthetic */ void a(m94 m94Var, int i8, int i9) {
        m94Var.f11217b.set(i8, i9);
        m94Var.f11216a.setPattern(m94Var.f11217b);
    }
}
