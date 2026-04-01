package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.d;
import androidx.lifecycle.u;

/* JADX INFO: loaded from: classes.dex */
public final class t implements i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f2676i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final t f2677j = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2679b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f2682e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2680c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2681d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f2683f = new j(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f2684g = new Runnable() { // from class: androidx.lifecycle.r
        @Override // java.lang.Runnable
        public final void run() {
            t.k(this.f2675a);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u.a f2685h = new d();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2686a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.q.f(activity, "activity");
            kotlin.jvm.internal.q.f(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i a() {
            return t.f2677j;
        }

        public final void b(Context context) {
            kotlin.jvm.internal.q.f(context, "context");
            t.f2677j.j(context);
        }
    }

    public static final class c extends androidx.lifecycle.b {

        public static final class a extends androidx.lifecycle.b {
            final /* synthetic */ t this$0;

            a(t tVar) {
                this.this$0 = tVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                kotlin.jvm.internal.q.f(activity, "activity");
                this.this$0.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                kotlin.jvm.internal.q.f(activity, "activity");
                this.this$0.g();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.q.f(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                u.f2688b.b(activity).f(t.this.f2685h);
            }
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.q.f(activity, "activity");
            t.this.e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.q.f(activity, "activity");
            a.a(activity, new a(t.this));
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.q.f(activity, "activity");
            t.this.i();
        }
    }

    public static final class d implements u.a {
        d() {
        }

        @Override // androidx.lifecycle.u.a
        public void a() {
            t.this.g();
        }

        @Override // androidx.lifecycle.u.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.u.a
        public void onResume() {
            t.this.f();
        }
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(t this$0) {
        kotlin.jvm.internal.q.f(this$0, "this$0");
        this$0.l();
        this$0.m();
    }

    public static final i n() {
        return f2676i.a();
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.d a() {
        return this.f2683f;
    }

    public final void e() {
        int i8 = this.f2679b - 1;
        this.f2679b = i8;
        if (i8 == 0) {
            Handler handler = this.f2682e;
            kotlin.jvm.internal.q.c(handler);
            handler.postDelayed(this.f2684g, 700L);
        }
    }

    public final void f() {
        int i8 = this.f2679b + 1;
        this.f2679b = i8;
        if (i8 == 1) {
            if (this.f2680c) {
                this.f2683f.h(d.a.ON_RESUME);
                this.f2680c = false;
            } else {
                Handler handler = this.f2682e;
                kotlin.jvm.internal.q.c(handler);
                handler.removeCallbacks(this.f2684g);
            }
        }
    }

    public final void g() {
        int i8 = this.f2678a + 1;
        this.f2678a = i8;
        if (i8 == 1 && this.f2681d) {
            this.f2683f.h(d.a.ON_START);
            this.f2681d = false;
        }
    }

    public final void i() {
        this.f2678a--;
        m();
    }

    public final void j(Context context) {
        kotlin.jvm.internal.q.f(context, "context");
        this.f2682e = new Handler();
        this.f2683f.h(d.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.q.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void l() {
        if (this.f2679b == 0) {
            this.f2680c = true;
            this.f2683f.h(d.a.ON_PAUSE);
        }
    }

    public final void m() {
        if (this.f2678a == 0 && this.f2680c) {
            this.f2683f.h(d.a.ON_STOP);
            this.f2681d = true;
        }
    }
}
