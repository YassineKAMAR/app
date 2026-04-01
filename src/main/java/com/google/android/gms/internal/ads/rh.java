package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class rh implements wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f14120a;

    rh(xh xhVar, Activity activity) {
        this.f14120a = activity;
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f14120a);
    }
}
