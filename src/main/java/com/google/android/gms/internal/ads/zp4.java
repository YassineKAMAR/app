package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zp4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spatializer f18371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f18372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f18373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Spatializer.OnSpatializerStateChangedListener f18374d;

    private zp4(Spatializer spatializer) {
        this.f18371a = spatializer;
        this.f18372b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static zp4 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new zp4(audioManager.getSpatializer());
    }

    public final void b(gq4 gq4Var, Looper looper) {
        if (this.f18374d == null && this.f18373c == null) {
            this.f18374d = new yp4(this, gq4Var);
            final Handler handler = new Handler(looper);
            this.f18373c = handler;
            this.f18371a.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.wp4
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f18374d);
        }
    }

    public final void c() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f18374d;
        if (onSpatializerStateChangedListener == null || this.f18373c == null) {
            return;
        }
        this.f18371a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        Handler handler = this.f18373c;
        int i8 = nz2.f12300a;
        handler.removeCallbacksAndMessages(null);
        this.f18373c = null;
        this.f18374d = null;
    }

    public final boolean d(zb4 zb4Var, nb nbVar) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(nz2.s(("audio/eac3-joc".equals(nbVar.f11793l) && nbVar.f11806y == 16) ? 12 : nbVar.f11806y));
        int i8 = nbVar.f11807z;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        return this.f18371a.canBeSpatialized(zb4Var.a().f17143a, channelMask.build());
    }

    public final boolean e() {
        return this.f18371a.isAvailable();
    }

    public final boolean f() {
        return this.f18371a.isEnabled();
    }

    public final boolean g() {
        return this.f18372b;
    }
}
