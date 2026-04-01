package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class<?> f1847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f1848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f1849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f1850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f1851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f1852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f1853g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f1854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1855b;

        a(d dVar, Object obj) {
            this.f1854a = dVar;
            this.f1855b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1854a.f1860a = this.f1855b;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f1856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f1857b;

        b(Application application, d dVar) {
            this.f1856a = application;
            this.f1857b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1856a.unregisterActivityLifecycleCallbacks(this.f1857b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f1858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1859b;

        c(Object obj, Object obj2) {
            this.f1858a = obj;
            this.f1859b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = f.f1850d;
                if (method != null) {
                    method.invoke(this.f1858a, this.f1859b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    f.f1851e.invoke(this.f1858a, this.f1859b, Boolean.FALSE);
                }
            } catch (RuntimeException e8) {
                if (e8.getClass() == RuntimeException.class && e8.getMessage() != null && e8.getMessage().startsWith("Unable to stop")) {
                    throw e8;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f1861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1863d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1864e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1865f = false;

        d(Activity activity) {
            this.f1861b = activity;
            this.f1862c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1861b == activity) {
                this.f1861b = null;
                this.f1864e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1864e || this.f1865f || this.f1863d || !f.h(this.f1860a, this.f1862c, activity)) {
                return;
            }
            this.f1865f = true;
            this.f1860a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1861b == activity) {
                this.f1863d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f1847a = clsA;
        f1848b = b();
        f1849c = f();
        f1850d = d(clsA);
        f1851e = c(clsA);
        f1852f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i8 = Build.VERSION.SDK_INT;
        return i8 == 26 || i8 == 27;
    }

    protected static boolean h(Object obj, int i8, Activity activity) {
        try {
            Object obj2 = f1849c.get(activity);
            if (obj2 == obj && activity.hashCode() == i8) {
                f1853g.postAtFrontOfQueue(new c(f1848b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f1852f == null) {
            return false;
        }
        if (f1851e == null && f1850d == null) {
            return false;
        }
        try {
            Object obj2 = f1849c.get(activity);
            if (obj2 == null || (obj = f1848b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f1853g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f1852f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f1853g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
