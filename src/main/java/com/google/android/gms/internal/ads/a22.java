package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
final class a22 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f4958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Timer f4959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ i2.s f4960c;

    a22(b22 b22Var, AlertDialog alertDialog, Timer timer, i2.s sVar) {
        this.f4958a = alertDialog;
        this.f4959b = timer;
        this.f4960c = sVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f4958a.dismiss();
        this.f4959b.cancel();
        i2.s sVar = this.f4960c;
        if (sVar != null) {
            sVar.k();
        }
    }
}
