package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class pi implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Handler f12884m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f12886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager f12887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final KeyguardManager f12888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f12889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bi f12890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference f12891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference f12892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private xh f12893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte f12894j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f12895k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f12896l = -3;

    public pi(Context context, bi biVar) {
        Context applicationContext = context.getApplicationContext();
        this.f12885a = applicationContext;
        this.f12890f = biVar;
        this.f12887c = (PowerManager) applicationContext.getSystemService("power");
        this.f12888d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f12886b = application;
            this.f12893i = new xh(application, this);
        }
        d(null);
    }

    private final void e(Activity activity, int i8) {
        Window window;
        if (this.f12892h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewB = b();
        if (viewB == null || viewPeekDecorView == null || viewB.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f12895k = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.f12892h
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r0 = r9.b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L13
            r9.f12896l = r2
            r9.f12894j = r1
            return
        L13:
            int r4 = r0.getVisibility()
            r5 = 0
            if (r4 == 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            boolean r6 = r0.isShown()
            if (r6 != 0) goto L25
            r4 = r4 | 2
        L25:
            android.os.PowerManager r6 = r9.f12887c
            if (r6 == 0) goto L31
            boolean r6 = r6.isScreenOn()
            if (r6 != 0) goto L31
            r4 = r4 | 4
        L31:
            com.google.android.gms.internal.ads.bi r6 = r9.f12890f
            boolean r6 = r6.a()
            if (r6 != 0) goto L83
            android.app.KeyguardManager r6 = r9.f12888d
            if (r6 == 0) goto L81
            boolean r6 = r6.inKeyguardRestrictedInputMode()
            if (r6 == 0) goto L81
            int r6 = com.google.android.gms.internal.ads.li.f10731b
            android.view.View r6 = r0.getRootView()
            if (r6 != 0) goto L4c
            r6 = r0
        L4c:
            android.content.Context r6 = r6.getContext()
        L50:
            boolean r7 = r6 instanceof android.content.ContextWrapper
            r8 = 0
            if (r7 == 0) goto L69
            r7 = 10
            if (r5 >= r7) goto L69
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L60
            android.app.Activity r6 = (android.app.Activity) r6
            goto L6a
        L60:
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            int r5 = r5 + 1
            goto L50
        L69:
            r6 = r8
        L6a:
            if (r6 != 0) goto L6d
            goto L81
        L6d:
            android.view.Window r5 = r6.getWindow()
            if (r5 != 0) goto L74
            goto L78
        L74:
            android.view.WindowManager$LayoutParams r8 = r5.getAttributes()
        L78:
            if (r8 == 0) goto L81
            int r5 = r8.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L83
        L81:
            r4 = r4 | 8
        L83:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L90
            r4 = r4 | 16
        L90:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L9d
            r4 = r4 | 32
        L9d:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.f12895k
            if (r5 == r1) goto La6
            r0 = r5
        La6:
            if (r0 == 0) goto Laa
            r4 = r4 | 64
        Laa:
            byte r0 = r9.f12894j
            if (r0 == r4) goto Lbd
            byte r0 = (byte) r4
            r9.f12894j = r0
            if (r4 != 0) goto Lb8
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lbb
        Lb8:
            long r0 = (long) r4
            long r0 = r2 - r0
        Lbb:
            r9.f12896l = r0
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pi.f():void");
    }

    private final void g() {
        f12884m.post(new ni(this));
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f12891g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f12889e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            oi oiVar = new oi(this);
            this.f12889e = oiVar;
            this.f12885a.registerReceiver(oiVar, intentFilter);
        }
        Application application = this.f12886b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f12893i);
            } catch (Exception unused) {
            }
        }
    }

    private final void i(View view) {
        try {
            WeakReference weakReference = this.f12891g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f12891g = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f12889e;
        if (broadcastReceiver != null) {
            try {
                this.f12885a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f12889e = null;
        }
        Application application = this.f12886b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f12893i);
            } catch (Exception unused4) {
            }
        }
    }

    public final long a() {
        if (this.f12896l <= -2 && b() == null) {
            this.f12896l = -3L;
        }
        return this.f12896l;
    }

    final View b() {
        WeakReference weakReference = this.f12892h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    final void d(View view) {
        long j8;
        View viewB = b();
        if (viewB != null) {
            viewB.removeOnAttachStateChangeListener(this);
            i(viewB);
        }
        this.f12892h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j8 = -2;
        } else {
            j8 = -3;
        }
        this.f12896l = j8;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e(activity, 4);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity, 0);
        f();
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f12895k = -1;
        h(view);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f12895k = -1;
        f();
        g();
        i(view);
    }
}
