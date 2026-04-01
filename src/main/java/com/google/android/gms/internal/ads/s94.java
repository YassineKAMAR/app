package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class s94 extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t94 f14576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f14577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ u94 f14578c;

    public s94(u94 u94Var, Handler handler, t94 t94Var) {
        this.f14578c = u94Var;
        this.f14577b = handler;
        this.f14576a = t94Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f14577b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
