package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class ok4 extends o94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rk4 f12526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12527b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok4(Throwable th, rk4 rk4Var) {
        super("Decoder failed: ".concat(String.valueOf(rk4Var == null ? null : rk4Var.f14176a)), th);
        String diagnosticInfo = null;
        this.f12526a = rk4Var;
        if (nz2.f12300a >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f12527b = diagnosticInfo;
    }
}
