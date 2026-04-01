package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class bl implements gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f5859a;

    bl(hl hlVar, Activity activity) {
        this.f5859a = activity;
    }

    @Override // com.google.android.gms.internal.ads.gl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f5859a);
    }
}
