package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f4814e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f4815a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f4816b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f4817c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4818d = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0074a {
        void a(boolean z7);
    }

    private a() {
    }

    public static a b() {
        return f4814e;
    }

    public static void c(Application application) {
        a aVar = f4814e;
        synchronized (aVar) {
            if (!aVar.f4818d) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f4818d = true;
            }
        }
    }

    private final void f(boolean z7) {
        synchronized (f4814e) {
            Iterator it = this.f4817c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0074a) it.next()).a(z7);
            }
        }
    }

    public void a(InterfaceC0074a interfaceC0074a) {
        synchronized (f4814e) {
            this.f4817c.add(interfaceC0074a);
        }
    }

    public boolean d() {
        return this.f4815a.get();
    }

    @TargetApi(com.amazon.c.a.a.c.f4052g)
    public boolean e(boolean z7) {
        if (!this.f4816b.get()) {
            if (!e3.m.b()) {
                return z7;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f4816b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f4815a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f4815a.compareAndSet(true, false);
        this.f4816b.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f4815a.compareAndSet(true, false);
        this.f4816b.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i8) {
        if (i8 == 20 && this.f4815a.compareAndSet(false, true)) {
            this.f4816b.set(true);
            f(true);
        }
    }
}
