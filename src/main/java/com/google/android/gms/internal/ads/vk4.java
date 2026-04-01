package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class vk4 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rk4 f16332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vk4 f16334e;

    public vk4(nb nbVar, Throwable th, boolean z7, int i8) {
        this("Decoder init failed: [" + i8 + "], " + String.valueOf(nbVar), th, nbVar.f11793l, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i8), null);
    }

    public vk4(nb nbVar, Throwable th, boolean z7, rk4 rk4Var) {
        this("Decoder init failed: " + rk4Var.f14176a + ", " + String.valueOf(nbVar), th, nbVar.f11793l, false, rk4Var, (nz2.f12300a < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }

    private vk4(String str, Throwable th, String str2, boolean z7, rk4 rk4Var, String str3, vk4 vk4Var) {
        super(str, th);
        this.f16330a = str2;
        this.f16331b = false;
        this.f16332c = rk4Var;
        this.f16333d = str3;
        this.f16334e = vk4Var;
    }

    static /* bridge */ /* synthetic */ vk4 a(vk4 vk4Var, vk4 vk4Var2) {
        return new vk4(vk4Var.getMessage(), vk4Var.getCause(), vk4Var.f16330a, false, vk4Var.f16332c, vk4Var.f16333d, vk4Var2);
    }
}
