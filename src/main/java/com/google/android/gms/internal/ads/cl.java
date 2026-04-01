package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class cl implements gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f6387a;

    cl(hl hlVar, Activity activity) {
        this.f6387a = activity;
    }

    @Override // com.google.android.gms.internal.ads.gl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f6387a);
    }
}
