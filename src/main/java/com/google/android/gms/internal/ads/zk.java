package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class zk implements gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f18262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f18263b;

    zk(hl hlVar, Activity activity, Bundle bundle) {
        this.f18262a = activity;
        this.f18263b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.gl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f18262a, this.f18263b);
    }
}
