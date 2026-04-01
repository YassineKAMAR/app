package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class k03 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f9862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j03 f9863c;

    private final void a(boolean z7) {
        if (this.f9862b != z7) {
            this.f9862b = z7;
            if (this.f9861a) {
                b(z7);
                j03 j03Var = this.f9863c;
                if (j03Var != null) {
                    j03Var.b(z7);
                }
            }
        }
    }

    private final boolean h() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || c();
    }

    protected void b(boolean z7) {
    }

    protected boolean c() {
        return false;
    }

    public final void d(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void e(j03 j03Var) {
        this.f9863c = j03Var;
    }

    public final void f() {
        this.f9861a = true;
        boolean zH = h();
        this.f9862b = zH;
        b(zH);
    }

    public final void g() {
        this.f9861a = false;
        this.f9863c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(h());
    }
}
