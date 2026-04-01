package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class uk implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f15698p = ((Long) h2.y.c().b(ns.f12113k1)).longValue();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f15700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WindowManager f15701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PowerManager f15702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final KeyguardManager f15703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    BroadcastReceiver f15704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference f15705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final WeakReference f15706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private hl f15707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j2.e1 f15708j = new j2.e1(f15698p);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f15709k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f15710l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final HashSet f15711m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DisplayMetrics f15712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f15713o;

    public uk(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f15699a = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f15701c = windowManager;
        this.f15702d = (PowerManager) applicationContext.getSystemService("power");
        this.f15703e = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f15700b = application;
            this.f15707i = new hl(application, this);
        }
        this.f15712n = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f15713o = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f15706h;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.f15706h = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int h(int i8) {
        return (int) (i8 / this.f15712n.density);
    }

    private final void i(Activity activity, int i8) {
        Window window;
        if (this.f15706h == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.f15706h;
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f15710l = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r35) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uk.j(int):void");
    }

    private final void k() {
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.qk
            @Override // java.lang.Runnable
            public final void run() {
                this.f13536a.d();
            }
        });
    }

    private final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f15705g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f15704f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f15704f = new rk(this);
            g2.t.x().c(this.f15699a, this.f15704f, intentFilter);
        }
        Application application = this.f15700b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f15707i);
            } catch (Exception e8) {
                qg0.e("Error registering activity lifecycle callbacks.", e8);
            }
        }
    }

    private final void m(View view) {
        try {
            WeakReference weakReference = this.f15705g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f15705g = null;
            }
        } catch (Exception e8) {
            qg0.e("Error while unregistering listeners from the last ViewTreeObserver.", e8);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e9) {
            qg0.e("Error while unregistering listeners from the ViewTreeObserver.", e9);
        }
        if (this.f15704f != null) {
            try {
                g2.t.x().d(this.f15699a, this.f15704f);
            } catch (IllegalStateException e10) {
                qg0.e("Failed trying to unregister the receiver", e10);
            } catch (Exception e11) {
                g2.t.q().u(e11, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f15704f = null;
        }
        Application application = this.f15700b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f15707i);
            } catch (Exception e12) {
                qg0.e("Error registering activity lifecycle callbacks.", e12);
            }
        }
    }

    final Rect a(Rect rect) {
        return new Rect(h(rect.left), h(rect.top), h(rect.right), h(rect.bottom));
    }

    public final void c(tk tkVar) {
        this.f15711m.add(tkVar);
        j(3);
    }

    final /* synthetic */ void d() {
        j(3);
    }

    public final void e(tk tkVar) {
        this.f15711m.remove(tkVar);
    }

    public final void f() {
        this.f15708j.a(f15698p);
    }

    public final void g(long j8) {
        this.f15708j.a(j8);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f15710l = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f15710l = -1;
        j(3);
        k();
        m(view);
    }
}
