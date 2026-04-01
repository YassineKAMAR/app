package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class dl implements gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f6789a;

    dl(hl hlVar, Activity activity) {
        this.f6789a = activity;
    }

    @Override // com.google.android.gms.internal.ads.gl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f6789a);
    }
}
