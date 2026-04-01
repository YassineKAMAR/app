package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class o90 implements r90 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f12414f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static r90 f12415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static r90 f12416h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12418b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f12420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wg0 f12421e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12417a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f12419c = new WeakHashMap();

    protected o90(Context context, wg0 wg0Var) {
        d53.a();
        this.f12420d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f12418b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f12421e = wg0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:11:0x0033, B:12:0x003a), top: B:18:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.r90 c(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.o90.f12414f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.r90 r1 = com.google.android.gms.internal.ads.o90.f12415g     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L3a
            com.google.android.gms.internal.ads.ut r1 = com.google.android.gms.internal.ads.su.f14830e     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.B7     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L33
            com.google.android.gms.internal.ads.o90 r1 = new com.google.android.gms.internal.ads.o90     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.wg0 r2 = com.google.android.gms.internal.ads.wg0.g()     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.o90.f12415g = r1     // Catch: java.lang.Throwable -> L3e
            goto L3a
        L33:
            com.google.android.gms.internal.ads.p90 r3 = new com.google.android.gms.internal.ads.p90     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.o90.f12415g = r3     // Catch: java.lang.Throwable -> L3e
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.r90 r3 = com.google.android.gms.internal.ads.o90.f12415g
            return r3
        L3e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o90.c(android.content.Context):com.google.android.gms.internal.ads.r90");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[Catch: all -> 0x006b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0041, B:20:0x0050, B:21:0x0051, B:22:0x0060, B:23:0x0067, B:14:0x0039, B:15:0x0040), top: B:29:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.r90 d(android.content.Context r4, com.google.android.gms.internal.ads.wg0 r5) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.o90.f12414f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.r90 r1 = com.google.android.gms.internal.ads.o90.f12416h     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L67
            com.google.android.gms.internal.ads.ut r1 = com.google.android.gms.internal.ads.su.f14830e     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L60
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.B7     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L60
            com.google.android.gms.internal.ads.o90 r1 = new com.google.android.gms.internal.ads.o90     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6b
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L6b
            java.lang.Thread r4 = r4.getThread()     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L51
            java.lang.Object r5 = r1.f12417a     // Catch: java.lang.Throwable -> L6b
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6b
            java.util.WeakHashMap r2 = r1.f12419c     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4e
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Thread$UncaughtExceptionHandler r5 = r4.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.n90 r2 = new com.google.android.gms.internal.ads.n90     // Catch: java.lang.Throwable -> L6b
            r2.<init>(r1, r5)     // Catch: java.lang.Throwable -> L6b
            r4.setUncaughtExceptionHandler(r2)     // Catch: java.lang.Throwable -> L6b
            goto L51
        L4e:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L6b
        L51:
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.m90 r5 = new com.google.android.gms.internal.ads.m90     // Catch: java.lang.Throwable -> L6b
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r5)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.o90.f12416h = r1     // Catch: java.lang.Throwable -> L6b
            goto L67
        L60:
            com.google.android.gms.internal.ads.p90 r4 = new com.google.android.gms.internal.ads.p90     // Catch: java.lang.Throwable -> L6b
            r4.<init>()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.o90.f12416h = r4     // Catch: java.lang.Throwable -> L6b
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.r90 r4 = com.google.android.gms.internal.ads.o90.f12416h
            return r4
        L6b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o90.d(android.content.Context, com.google.android.gms.internal.ads.wg0):com.google.android.gms.internal.ads.r90");
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String f(Throwable th) {
        return b93.c(jg0.j(e(th)));
    }

    @Override // com.google.android.gms.internal.ads.r90
    public final void a(Throwable th, String str) {
        b(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.r90
    public final void b(Throwable th, String str, float f8) {
        Throwable th2;
        String packageName;
        Handler handler = jg0.f9600b;
        boolean zG = false;
        if (((Boolean) su.f14831f.e()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z7 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (jg0.s(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z7 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z7) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String strE = e(th);
        String strF = ((Boolean) h2.y.c().b(ns.A8)).booleanValue() ? f(th) : "";
        double d8 = f8;
        double dRandom = Math.random();
        int i8 = f8 > 0.0f ? (int) (1.0f / f8) : 1;
        if (dRandom < d8) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                zG = f3.e.a(this.f12418b).g();
            } catch (Throwable th4) {
                qg0.e("Error fetching instant app info", th4);
            }
            try {
                packageName = this.f12418b.getPackageName();
            } catch (Throwable unused) {
                qg0.g("Cannot obtain package name, proceeding.");
                packageName = "unknown";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zG)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (!str3.startsWith(str2)) {
                str3 = str2 + " " + str3;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", str3).appendQueryParameter("js", this.f12421e.f16723a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strE).appendQueryParameter("eids", TextUtils.join(com.amazon.a.a.o.b.f.f3942a, h2.y.a().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "575948185").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i8)).appendQueryParameter("pb_tm", String.valueOf(su.f14828c.e())).appendQueryParameter("gmscv", String.valueOf(x2.f.f().a(this.f12418b))).appendQueryParameter("lite", true != this.f12421e.f16727e ? "0" : "1");
            if (!TextUtils.isEmpty(strF)) {
                builderAppendQueryParameter2.appendQueryParameter("hash", strF);
            }
            arrayList2.add(builderAppendQueryParameter2.toString());
            for (final String str4 : arrayList2) {
                final vg0 vg0Var = new vg0(null);
                this.f12420d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.l90
                    @Override // java.lang.Runnable
                    public final void run() {
                        vg0Var.a(str4);
                    }
                });
            }
        }
    }

    protected final void g(Thread thread, Throwable th) {
        if (th != null) {
            boolean zS = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zS |= jg0.s(stackTraceElement.getClassName());
                    zEquals |= o90.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zS || zEquals) {
                return;
            }
            b(th, "", 1.0f);
        }
    }
}
