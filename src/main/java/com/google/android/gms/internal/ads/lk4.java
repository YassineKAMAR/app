package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class lk4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rk4 f10762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaFormat f10763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nb f10764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Surface f10765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCrypto f10766e = null;

    private lk4(rk4 rk4Var, MediaFormat mediaFormat, nb nbVar, Surface surface, MediaCrypto mediaCrypto, int i8) {
        this.f10762a = rk4Var;
        this.f10763b = mediaFormat;
        this.f10764c = nbVar;
        this.f10765d = surface;
    }

    public static lk4 a(rk4 rk4Var, MediaFormat mediaFormat, nb nbVar, MediaCrypto mediaCrypto) {
        return new lk4(rk4Var, mediaFormat, nbVar, null, null, 0);
    }

    public static lk4 b(rk4 rk4Var, MediaFormat mediaFormat, nb nbVar, Surface surface, MediaCrypto mediaCrypto) {
        return new lk4(rk4Var, mediaFormat, nbVar, surface, null, 0);
    }
}
