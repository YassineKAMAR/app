package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes.dex */
final class ri4 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ xi4 f14151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ui4 f14152b;

    ri4(ui4 ui4Var, xi4 xi4Var) {
        this.f14152b = ui4Var;
        this.f14151a = xi4Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i8) {
        if (audioTrack.equals(this.f14152b.f15693c.f17261q)) {
            xi4 xi4Var = this.f14152b.f15693c;
            if (xi4Var.f17257m == null || !xi4Var.N) {
                return;
            }
            xi4Var.f17257m.k();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f14152b.f15693c.f17261q)) {
            xi4 xi4Var = this.f14152b.f15693c;
            if (xi4Var.f17257m == null || !xi4Var.N) {
                return;
            }
            xi4Var.f17257m.k();
        }
    }
}
