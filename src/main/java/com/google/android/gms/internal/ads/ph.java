package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class ph implements wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f12870a;

    ph(xh xhVar, Activity activity) {
        this.f12870a = activity;
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f12870a);
    }
}
