package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class hl implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f8811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f8812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8813c = false;

    public hl(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f8812b = new WeakReference(activityLifecycleCallbacks);
        this.f8811a = application;
    }

    protected final void a(gl glVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f8812b.get();
            if (activityLifecycleCallbacks != null) {
                glVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f8813c) {
                    return;
                }
                this.f8811a.unregisterActivityLifecycleCallbacks(this);
                this.f8813c = true;
            }
        } catch (Exception e8) {
            qg0.e("Error while dispatching lifecycle callback.", e8);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new zk(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new fl(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new cl(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new bl(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new el(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new al(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new dl(this, activity));
    }
}
