package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class oh implements wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f12479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f12480b;

    oh(xh xhVar, Activity activity, Bundle bundle) {
        this.f12479a = activity;
        this.f12480b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f12479a, this.f12480b);
    }
}
