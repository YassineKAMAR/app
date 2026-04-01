package com.amazon.a.a.b;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.a.a.o.e;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable {
    private static final String A = "deviceDisplay";
    private static final String B = "deviceBrand";
    private static final String C = "deviceBoard";
    private static final String D = "androidVersion";
    private static final String E = "deviceModel";
    private static final String F = "packageFilePath";
    private static final String G = "packageName";
    private static final String H = "packageVersionName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3568a = new com.amazon.a.a.o.c("CrashReport");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f3569b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3570c = "([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3571d = "SHA1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f3572e = "crashTime";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f3573f = "UTF-8";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f3574g = "crashId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f3575h = "threadDump";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f3576i = "stackTrace";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f3577j = "threadAllocSize";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f3578k = "threadAllocCount";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f3579l = "nativeHeapFreeSize";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f3580m = "nativeHeapSize";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f3581n = "memLowThreshold";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f3582o = "memLowFlag";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f3583p = "availableInternalMemorySize";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f3584q = "totalInternalMemorySize";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f3585r = "deviceUser";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f3586s = "deviceType";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f3587t = "deviceTime";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f3588u = "deviceTags";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f3589v = "deviceProduct";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f3590w = "deviceManufacturer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f3591x = "deviceId";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f3592y = "deviceHost";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f3593z = "deviceFingerPrint";
    private final HashMap<String, String> I = new LinkedHashMap();

    public c(Application application, Throwable th) {
        try {
            a(application, th);
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f3948b) {
                f3568a.b("Error collection crash report details", th2);
            }
        }
    }

    private void a(Application application) {
        PackageInfo packageInfoB = b(application);
        if (packageInfoB == null) {
            return;
        }
        this.I.put(H, packageInfoB.versionName);
        this.I.put(G, packageInfoB.packageName);
        this.I.put(F, application.getFilesDir().getAbsolutePath());
    }

    private void a(Application application, Throwable th) {
        b();
        a(application);
        c(application);
        a(th);
        e();
        f();
    }

    private void a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        sb.append(stringWriter.toString());
        sb.append("\n");
        Throwable cause = th.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            sb.append(stringWriter.toString());
            cause = cause.getCause();
            sb.append("\n\n");
        }
        printWriter.close();
        this.I.put(f3576i, sb.toString());
    }

    private PackageInfo b(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e8) {
            if (!com.amazon.a.a.o.c.f3948b) {
                return null;
            }
            f3568a.b("Unable to fetch package info", e8);
            return null;
        }
    }

    private void b() {
        this.I.put(f3572e, new Date().toString());
    }

    private long c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    private void c(Application application) {
        this.I.put(E, Build.MODEL);
        this.I.put(D, Build.VERSION.RELEASE);
        this.I.put(C, Build.BOARD);
        this.I.put(B, Build.BRAND);
        this.I.put(A, Build.DISPLAY);
        this.I.put(f3593z, Build.FINGERPRINT);
        this.I.put(f3592y, Build.HOST);
        this.I.put(f3591x, Build.ID);
        this.I.put(f3590w, Build.MANUFACTURER);
        this.I.put(f3589v, Build.PRODUCT);
        this.I.put(f3588u, Build.TAGS);
        this.I.put(f3587t, Long.toString(Build.TIME));
        this.I.put(f3586s, Build.TYPE);
        this.I.put(f3585r, Build.USER);
        this.I.put(f3584q, Long.toString(d()));
        this.I.put(f3583p, Long.toString(c()));
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.I.put(f3582o, Boolean.toString(memoryInfo.lowMemory));
            this.I.put(f3581n, Long.toString(memoryInfo.threshold));
        }
        this.I.put(f3580m, Long.toString(Debug.getNativeHeapSize()));
        this.I.put(f3579l, Long.toString(Debug.getNativeHeapAllocatedSize()));
        this.I.put(f3578k, Long.toString(Debug.getThreadAllocCount()));
        this.I.put(f3577j, Long.toString(Debug.getThreadAllocSize()));
    }

    private long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    private void e() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            sb.append("Thread : " + key.getId());
            if (!e.a(key.getName())) {
                sb.append("/" + key.getName());
            }
            sb.append("\n");
            sb.append("isAlive : " + key.isAlive() + "\n");
            sb.append("isInterrupted : " + key.isInterrupted() + "\n");
            sb.append("isDaemon : " + key.isDaemon() + "\n");
            for (StackTraceElement stackTraceElement : value) {
                sb.append("\tat " + stackTraceElement + "\n");
            }
            sb.append("\n\n");
        }
        this.I.put(f3575h, sb.toString());
    }

    private void f() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.I.get(G));
            sb.append(this.I.get(H));
            sb.append(this.I.get(D));
            String str = this.I.get(f3576i);
            if (str != null) {
                Matcher matcher = Pattern.compile(f3570c).matcher(str);
                while (matcher.find()) {
                    sb.append(matcher.group());
                }
            }
            this.I.put(f3574g, new BigInteger(MessageDigest.getInstance(f3571d).digest(sb.toString().getBytes(f3573f))).abs().toString(16));
        } catch (Exception e8) {
            if (com.amazon.a.a.o.c.f3948b) {
                f3568a.b("Error capturing crash id", e8);
            }
        }
    }

    public Map<String, String> a() {
        return this.I;
    }
}
