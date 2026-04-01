package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class xh implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f17224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f17225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17226c = false;

    public xh(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f17225b = new WeakReference(activityLifecycleCallbacks);
        this.f17224a = application;
    }

    protected final void a(wh whVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17225b.get();
            if (activityLifecycleCallbacks != null) {
                whVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f17226c) {
                    return;
                }
                this.f17224a.unregisterActivityLifecycleCallbacks(this);
                this.f17226c = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new oh(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new vh(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new rh(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new qh(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new uh(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new ph(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new th(this, activity));
    }
}
