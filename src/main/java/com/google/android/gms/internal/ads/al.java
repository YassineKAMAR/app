package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class al implements gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f5305a;

    al(hl hlVar, Activity activity) {
        this.f5305a = activity;
    }

    @Override // com.google.android.gms.internal.ads.gl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f5305a);
    }
}
