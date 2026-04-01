package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p3.n;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends d0.a implements n.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f19754c;

    @Override // p3.n.a
    public final void a(Context context, Intent intent) {
        d0.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f19754c == null) {
            this.f19754c = new n(this);
        }
        this.f19754c.a(context, intent);
    }
}
