package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class qh implements wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f13476a;

    qh(xh xhVar, Activity activity) {
        this.f13476a = activity;
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f13476a);
    }
}
