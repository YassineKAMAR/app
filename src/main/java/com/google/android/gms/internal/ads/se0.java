package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class se0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f14628a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f14629b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f14630c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f14631d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f14632e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f14633f = new AtomicInteger(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f14634g = new AtomicReference(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference f14635h = new AtomicReference(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ConcurrentMap f14636i = new ConcurrentHashMap(9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicReference f14637j = new AtomicReference(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final BlockingQueue f14638k = new ArrayBlockingQueue(20);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f14639l = new Object();

    static final boolean A(Context context) {
        if (!((Boolean) h2.y.c().b(ns.f12085h0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) h2.y.c().b(ns.f12094i0)).intValue()) {
            return false;
        }
        if (((Boolean) h2.y.c().b(ns.f12103j0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object B(String str, Object obj, qe0 qe0Var) {
        synchronized (this.f14637j) {
            if (((xn0) this.f14637j.get()) != null) {
                try {
                    return qe0Var.a((xn0) this.f14637j.get());
                } catch (Exception unused) {
                    c(str, false);
                }
            }
            return obj;
        }
    }

    private final Object C(String str, Context context) {
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", this.f14634g, true)) {
            return null;
        }
        try {
            return D(context, str).invoke(this.f14634g.get(), new Object[0]);
        } catch (Exception unused) {
            c(str, true);
            return null;
        }
    }

    private final Method D(Context context, String str) {
        Method method = (Method) this.f14636i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f14636i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            c(str, false);
            return null;
        }
    }

    private final ExecutorService E() {
        ExecutorService threadPoolExecutor;
        if (this.f14628a.get() == null) {
            if (e3.d.a()) {
                threadPoolExecutor = d53.a().a(((Integer) h2.y.c().b(ns.f12076g0)).intValue(), new pe0(this), 2);
            } else {
                fs fsVar = ns.f12076g0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) h2.y.c().b(fsVar)).intValue(), ((Integer) h2.y.c().b(fsVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new pe0(this));
            }
            be0.a(this.f14628a, null, threadPoolExecutor);
        }
        return (ExecutorService) this.f14628a.get();
    }

    private final void a(Context context, String str, String str2) {
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.f14634g, true)) {
            Method declaredMethod = (Method) this.f14636i.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f14636i.put(str2, declaredMethod);
                } catch (Exception unused) {
                    c(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f14634g.get(), str);
                j2.v1.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                c(str2, false);
            }
        }
    }

    private final void b(Context context, final String str, String str2, Bundle bundle) {
        if (z(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e8) {
                qg0.e("Invalid event ID: ".concat(String.valueOf(str2)), e8);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (A(context)) {
                d("logEventInternal", new re0() { // from class: com.google.android.gms.internal.ads.he0
                    @Override // com.google.android.gms.internal.ads.re0
                    public final void a(xn0 xn0Var) {
                        xn0Var.k4("am", str, bundle2);
                    }
                });
                return;
            }
            if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.f14634g, true)) {
                Method declaredMethod = (Method) this.f14636i.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f14636i.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        c("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f14634g.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    c("logEventInternal", true);
                }
            }
        }
    }

    private final void c(String str, boolean z7) {
        if (this.f14632e.get()) {
            return;
        }
        qg0.g("Invoke Firebase method " + str + " error.");
        if (z7) {
            qg0.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f14632e.set(true);
        }
    }

    private final void d(final String str, final re0 re0Var) {
        synchronized (this.f14637j) {
            FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.google.android.gms.internal.ads.je0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9576a.o(re0Var, str);
                }
            }, null);
            if (this.f14637j.get() != null) {
                futureTask.run();
            } else {
                this.f14638k.offer(futureTask);
            }
        }
    }

    private final boolean e(Context context, String str, AtomicReference atomicReference, boolean z7) {
        if (atomicReference.get() == null) {
            try {
                be0.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                c("getInstance", z7);
                return false;
            }
        }
        return true;
    }

    public final String f(Context context) {
        if (!z(context)) {
            return null;
        }
        if (A(context)) {
            Long l8 = (Long) B("getAdEventId", null, new qe0() { // from class: com.google.android.gms.internal.ads.me0
                @Override // com.google.android.gms.internal.ads.qe0
                public final Object a(xn0 xn0Var) {
                    return Long.valueOf(xn0Var.l());
                }
            });
            if (l8 != null) {
                return Long.toString(l8.longValue());
            }
            return null;
        }
        Object objC = C("generateEventId", context);
        if (objC != null) {
            return objC.toString();
        }
        return null;
    }

    public final String g(Context context) {
        if (!z(context)) {
            return null;
        }
        synchronized (this.f14629b) {
            String str = this.f14631d;
            if (str != null) {
                return str;
            }
            this.f14631d = A(context) ? (String) B("getAppIdOrigin", this.f14631d, new qe0() { // from class: com.google.android.gms.internal.ads.ge0
                @Override // com.google.android.gms.internal.ads.qe0
                public final Object a(xn0 xn0Var) {
                    return xn0Var.m();
                }
            }) : "fa";
            return this.f14631d;
        }
    }

    public final String h(final Context context) {
        if (!z(context)) {
            return null;
        }
        long jLongValue = ((Long) h2.y.c().b(ns.f12067f0)).longValue();
        if (A(context)) {
            try {
                return jLongValue < 0 ? (String) B("getAppInstanceId", null, ne0.f11830a) : (String) E().submit(new Callable() { // from class: com.google.android.gms.internal.ads.ee0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f7278a.k();
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) C("getAppInstanceId", context);
        }
        try {
            return (String) E().submit(new Callable() { // from class: com.google.android.gms.internal.ads.fe0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f7731a.l(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String i(Context context) {
        if (!z(context)) {
            return "";
        }
        if (A(context)) {
            return (String) B("getCurrentScreenNameOrScreenClass", "", new qe0() { // from class: com.google.android.gms.internal.ads.de0
                @Override // com.google.android.gms.internal.ads.qe0
                public final Object a(xn0 xn0Var) {
                    String strO = xn0Var.o();
                    return (strO == null && (strO = xn0Var.q()) == null) ? "" : strO;
                }
            });
        }
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", this.f14634g, true)) {
            return "";
        }
        try {
            String str = (String) D(context, "getCurrentScreenName").invoke(this.f14634g.get(), new Object[0]);
            if (str == null) {
                str = (String) D(context, "getCurrentScreenClass").invoke(this.f14634g.get(), new Object[0]);
            }
            return str == null ? "" : str;
        } catch (Exception unused) {
            c("getCurrentScreenName", false);
            return "";
        }
    }

    public final String j(Context context) {
        if (!z(context)) {
            return null;
        }
        synchronized (this.f14629b) {
            String str = this.f14630c;
            if (str != null) {
                return str;
            }
            this.f14630c = A(context) ? (String) B("getGmpAppId", this.f14630c, new qe0() { // from class: com.google.android.gms.internal.ads.le0
                @Override // com.google.android.gms.internal.ads.qe0
                public final Object a(xn0 xn0Var) {
                    return xn0Var.r();
                }
            }) : (String) C("getGmpAppId", context);
            return this.f14630c;
        }
    }

    final /* synthetic */ String k() {
        return (String) B("getAppInstanceId", null, ne0.f11830a);
    }

    final /* synthetic */ String l(Context context) {
        return (String) C("getAppInstanceId", context);
    }

    public final void m(Context context, final String str) {
        if (z(context)) {
            if (A(context)) {
                d("beginAdUnitExposure", new re0() { // from class: com.google.android.gms.internal.ads.ce0
                    @Override // com.google.android.gms.internal.ads.re0
                    public final void a(xn0 xn0Var) {
                        xn0Var.U(str);
                    }
                });
            } else {
                a(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void n(Context context, final String str) {
        if (z(context)) {
            if (A(context)) {
                d("endAdUnitExposure", new re0() { // from class: com.google.android.gms.internal.ads.ke0
                    @Override // com.google.android.gms.internal.ads.re0
                    public final void a(xn0 xn0Var) {
                        xn0Var.Z(str);
                    }
                });
            } else {
                a(context, str, "endAdUnitExposure");
            }
        }
    }

    final /* synthetic */ void o(re0 re0Var, String str) {
        if (((xn0) this.f14637j.get()) != null) {
            try {
                re0Var.a((xn0) this.f14637j.get());
            } catch (Exception unused) {
                c(str, false);
            }
        }
    }

    public final void p(Context context, String str) {
        b(context, "_aa", str, null);
    }

    public final void q(Context context, String str) {
        b(context, "_aq", str, null);
    }

    public final void r(Context context, String str) {
        b(context, "_ac", str, null);
    }

    public final void s(Context context, String str) {
        b(context, "_ai", str, null);
    }

    public final void t(Context context, String str, String str2, String str3, int i8) {
        if (z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i8);
            b(context, "_ar", str, bundle);
            j2.v1.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i8);
        }
    }

    public final void u(Context context, h2.r4 r4Var) {
        if (((Boolean) h2.y.c().b(ns.f12130m0)).booleanValue() && z(context) && A(context)) {
            synchronized (this.f14639l) {
            }
        }
    }

    public final void v(Context context, h2.f4 f4Var) {
        te0.d(context).b().d(f4Var);
        if (((Boolean) h2.y.c().b(ns.f12130m0)).booleanValue() && z(context) && A(context)) {
            synchronized (this.f14639l) {
            }
        }
    }

    public final void w(final Bundle bundle) {
        d("setConsent", new re0() { // from class: com.google.android.gms.internal.ads.oe0
            @Override // com.google.android.gms.internal.ads.re0
            public final void a(xn0 xn0Var) {
                xn0Var.A0(bundle);
            }
        });
    }

    @Deprecated
    public final void x(final Context context, final String str) {
        if (z(context) && (context instanceof Activity)) {
            if (A(context)) {
                d("setScreenName", new re0() { // from class: com.google.android.gms.internal.ads.ie0
                    @Override // com.google.android.gms.internal.ads.re0
                    public final void a(xn0 xn0Var) {
                        Context context2 = context;
                        xn0Var.b5(g3.b.k3(context2), str, context2.getPackageName());
                    }
                });
                return;
            }
            if (e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f14635h, false)) {
                Method declaredMethod = (Method) this.f14636i.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.f14636i.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        c("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f14635h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    c("setCurrentScreen", false);
                }
            }
        }
    }

    public final boolean y() {
        synchronized (this.f14639l) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(android.content.Context r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.f12022a0
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f14632e
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.f12112k0
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()
            java.lang.Object r0 = r2.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f14633f
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            h2.v.b()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = com.google.android.gms.internal.ads.jg0.w(r5, r0)
            if (r0 != 0) goto L59
            h2.v.b()
            boolean r5 = com.google.android.gms.internal.ads.jg0.x(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.google.android.gms.internal.ads.qg0.g(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f14633f
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f14633f
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f14633f
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.se0.z(android.content.Context):boolean");
    }
}
