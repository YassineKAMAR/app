package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zd2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f18171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f18172b;

    public zd2(lg3 lg3Var, Context context) {
        this.f18171a = lg3Var;
        this.f18172b = context;
    }

    final /* synthetic */ ae2 a() {
        int iJ;
        AudioManager audioManager = (AudioManager) this.f18172b.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = -1;
        if (((Boolean) h2.y.c().b(ns.ba)).booleanValue()) {
            iJ = g2.t.s().j(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iJ = -1;
        }
        return new ae2(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iJ, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), g2.t.t().a(), g2.t.t().e());
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f18171a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.yd2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f17736a.a();
            }
        });
    }
}
