package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class uh implements wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f15659b;

    uh(xh xhVar, Activity activity, Bundle bundle) {
        this.f15658a = activity;
        this.f15659b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f15658a, this.f15659b);
    }
}
