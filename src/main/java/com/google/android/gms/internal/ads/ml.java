package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ml implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f11363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f11364b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Runnable f11370h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f11372j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f11365c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11366d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11367e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f11368f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f11369g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11371i = false;

    ml() {
    }

    private final void k(Activity activity) {
        synchronized (this.f11365c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f11363a = activity;
            }
        }
    }

    public final Activity a() {
        return this.f11363a;
    }

    public final Context b() {
        return this.f11364b;
    }

    public final void f(nl nlVar) {
        synchronized (this.f11365c) {
            this.f11368f.add(nlVar);
        }
    }

    public final void g(Application application, Context context) {
        if (this.f11371i) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.f11364b = application;
        this.f11372j = ((Long) h2.y.c().b(ns.R0)).longValue();
        this.f11371i = true;
    }

    public final void h(nl nlVar) {
        synchronized (this.f11365c) {
            this.f11368f.remove(nlVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f11365c) {
            Activity activity2 = this.f11363a;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f11363a = null;
                }
                Iterator it = this.f11369g.iterator();
                while (it.hasNext()) {
                    try {
                        if (((cm) it.next()).j()) {
                            it.remove();
                        }
                    } catch (Exception e8) {
                        g2.t.q().u(e8, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        qg0.e("", e8);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.f11365c) {
            Iterator it = this.f11369g.iterator();
            while (it.hasNext()) {
                try {
                    ((cm) it.next()).k();
                } catch (Exception e8) {
                    g2.t.q().u(e8, "AppActivityTracker.ActivityListener.onActivityPaused");
                    qg0.e("", e8);
                }
            }
        }
        this.f11367e = true;
        Runnable runnable = this.f11370h;
        if (runnable != null) {
            j2.k2.f23991k.removeCallbacks(runnable);
        }
        e53 e53Var = j2.k2.f23991k;
        ll llVar = new ll(this);
        this.f11370h = llVar;
        e53Var.postDelayed(llVar, this.f11372j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.f11367e = false;
        boolean z7 = !this.f11366d;
        this.f11366d = true;
        Runnable runnable = this.f11370h;
        if (runnable != null) {
            j2.k2.f23991k.removeCallbacks(runnable);
        }
        synchronized (this.f11365c) {
            Iterator it = this.f11369g.iterator();
            while (it.hasNext()) {
                try {
                    ((cm) it.next()).l();
                } catch (Exception e8) {
                    g2.t.q().u(e8, "AppActivityTracker.ActivityListener.onActivityResumed");
                    qg0.e("", e8);
                }
            }
            if (z7) {
                Iterator it2 = this.f11368f.iterator();
                while (it2.hasNext()) {
                    try {
                        ((nl) it2.next()).a(true);
                    } catch (Exception e9) {
                        qg0.e("", e9);
                    }
                }
            } else {
                qg0.b("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
