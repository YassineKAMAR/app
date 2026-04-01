package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class g2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile g2 f18714j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final e3.e f18716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f18717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o3.a f18718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Pair<p3.u, Object>> f18719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f18722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile v1 f18723i;

    abstract class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f18724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f18725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f18726c;

        a(g2 g2Var) {
            this(true);
        }

        a(boolean z7) {
            this.f18724a = g2.this.f18716b.a();
            this.f18725b = g2.this.f18716b.b();
            this.f18726c = z7;
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g2.this.f18721g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e8) {
                g2.this.s(e8, false, this.f18726c);
                b();
            }
        }
    }

    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            g2.this.n(new m3(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            g2.this.n(new r3(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            g2.this.n(new q3(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            g2.this.n(new n3(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            t1 t1Var = new t1();
            g2.this.n(new s3(this, activity, t1Var));
            Bundle bundleV0 = t1Var.v0(50L);
            if (bundleV0 != null) {
                bundle.putAll(bundleV0);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            g2.this.n(new o3(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            g2.this.n(new p3(this, activity));
        }
    }

    private g2(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f18715a = (str == null || !K(str2, str3)) ? "FA" : str;
        this.f18716b = e3.h.d();
        this.f18717c = j1.a().a(new s2(this), s1.f19146a);
        this.f18718d = new o3.a(this);
        this.f18719e = new ArrayList();
        if (!(!F(context) || U())) {
            this.f18722h = null;
            this.f18721g = true;
            Log.w(this.f18715a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (K(str2, str3)) {
            this.f18722h = str2;
        } else {
            this.f18722h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f18715a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f18715a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        n(new j2(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f18715a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    private static boolean F(Context context) {
        return new p3.p(context, p3.p.a(context)).b("google_app_id") != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K(String str, String str2) {
        return (str2 == null || str == null || U()) ? false : true;
    }

    private final boolean U() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static g2 f(Context context) {
        return g(context, null, null, null, null);
    }

    public static g2 g(Context context, String str, String str2, String str3, Bundle bundle) {
        a3.o.j(context);
        if (f18714j == null) {
            synchronized (g2.class) {
                if (f18714j == null) {
                    f18714j = new g2(context, str, str2, str3, bundle);
                }
            }
        }
        return f18714j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(a aVar) {
        this.f18717c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Exception exc, boolean z7, boolean z8) {
        this.f18721g |= z7;
        if (z7) {
            Log.w(this.f18715a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z8) {
            j(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f18715a, "Error with data collection. Data lost.", exc);
    }

    private final void v(String str, String str2, Bundle bundle, boolean z7, boolean z8, Long l8) {
        n(new k3(this, l8, str, str2, bundle, z7, z8));
    }

    public final o3.a A() {
        return this.f18718d;
    }

    public final void B(Bundle bundle) {
        n(new o2(this, bundle));
    }

    public final void C(String str) {
        n(new v2(this, str));
    }

    public final void D(String str, String str2) {
        w(null, str, str2, false);
    }

    public final void E(String str, String str2, Bundle bundle) {
        v(str, str2, bundle, true, true, null);
    }

    public final Long G() {
        t1 t1Var = new t1();
        n(new g3(this, t1Var));
        return t1Var.k3(120000L);
    }

    public final void H(Bundle bundle) {
        n(new r2(this, bundle));
    }

    public final void I(String str) {
        n(new u2(this, str));
    }

    public final String L() {
        return this.f18722h;
    }

    public final void M(Bundle bundle) {
        n(new j3(this, bundle));
    }

    public final void N(String str) {
        n(new n2(this, str));
    }

    public final String O() {
        t1 t1Var = new t1();
        n(new h3(this, t1Var));
        return t1Var.q3(120000L);
    }

    public final String P() {
        t1 t1Var = new t1();
        n(new w2(this, t1Var));
        return t1Var.q3(50L);
    }

    public final String Q() {
        t1 t1Var = new t1();
        n(new c3(this, t1Var));
        return t1Var.q3(500L);
    }

    public final String R() {
        t1 t1Var = new t1();
        n(new y2(this, t1Var));
        return t1Var.q3(500L);
    }

    public final String S() {
        t1 t1Var = new t1();
        n(new x2(this, t1Var));
        return t1Var.q3(500L);
    }

    public final void T() {
        n(new q2(this));
    }

    public final int a(String str) {
        t1 t1Var = new t1();
        n(new f3(this, str, t1Var));
        Integer num = (Integer) t1.H0(t1Var.v0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        t1 t1Var = new t1();
        n(new z2(this, t1Var));
        Long lK3 = t1Var.k3(500L);
        if (lK3 != null) {
            return lK3.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f18716b.a()).nextLong();
        int i8 = this.f18720f + 1;
        this.f18720f = i8;
        return jNextLong + ((long) i8);
    }

    public final Bundle c(Bundle bundle, boolean z7) {
        t1 t1Var = new t1();
        n(new d3(this, bundle, t1Var));
        if (z7) {
            return t1Var.v0(5000L);
        }
        return null;
    }

    protected final v1 d(Context context, boolean z7) {
        try {
            return u1.asInterface(DynamiteModule.e(context, DynamiteModule.f4914e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e8) {
            s(e8, true, false);
            return null;
        }
    }

    public final List<Bundle> h(String str, String str2) {
        t1 t1Var = new t1();
        n(new k2(this, str, str2, t1Var));
        List<Bundle> list = (List) t1.H0(t1Var.v0(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> i(String str, String str2, boolean z7) {
        t1 t1Var = new t1();
        n(new a3(this, str, str2, z7, t1Var));
        Bundle bundleV0 = t1Var.v0(5000L);
        if (bundleV0 == null || bundleV0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleV0.size());
        for (String str3 : bundleV0.keySet()) {
            Object obj = bundleV0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void j(int i8, String str, Object obj, Object obj2, Object obj3) {
        n(new e3(this, false, 5, str, obj, null, null));
    }

    public final void k(long j8) {
        n(new t2(this, j8));
    }

    public final void l(Activity activity, String str, String str2) {
        n(new m2(this, activity, str, str2));
    }

    public final void m(Bundle bundle) {
        n(new i2(this, bundle));
    }

    public final void r(Boolean bool) {
        n(new p2(this, bool));
    }

    public final void t(String str, Bundle bundle) {
        v(null, str, bundle, false, true, null);
    }

    public final void u(String str, String str2, Bundle bundle) {
        n(new l2(this, str, str2, bundle));
    }

    public final void w(String str, String str2, Object obj, boolean z7) {
        n(new l3(this, str, str2, obj, z7));
    }

    public final void x(boolean z7) {
        n(new i3(this, z7));
    }
}
