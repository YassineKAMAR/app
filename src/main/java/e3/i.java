package e3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f21378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f21379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f21380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f21381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Boolean f21382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Boolean f21383f;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f21382e == null) {
            boolean z7 = false;
            if (m.i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z7 = true;
            }
            f21382e = Boolean.valueOf(z7);
        }
        return f21382e.booleanValue();
    }

    public static boolean b(Context context) {
        if (f21383f == null) {
            boolean z7 = false;
            if (m.k() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z7 = true;
            }
            f21383f = Boolean.valueOf(z7);
        }
        return f21383f.booleanValue();
    }

    public static boolean c(Context context) {
        if (f21380c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z7 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z7 = true;
            }
            f21380c = Boolean.valueOf(z7);
        }
        return f21380c.booleanValue();
    }

    @TargetApi(21)
    public static boolean d(Context context) {
        return h(context);
    }

    public static boolean e() {
        int i8 = x2.i.f27267a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean f(Context context) {
        return j(context.getPackageManager());
    }

    @TargetApi(26)
    public static boolean g(Context context) {
        if (f(context) && !m.h()) {
            return true;
        }
        if (h(context)) {
            return !m.i() || m.k();
        }
        return false;
    }

    @TargetApi(21)
    public static boolean h(Context context) {
        if (f21379b == null) {
            boolean z7 = false;
            if (m.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z7 = true;
            }
            f21379b = Boolean.valueOf(z7);
        }
        return f21379b.booleanValue();
    }

    public static boolean i(Context context) {
        if (f21381d == null) {
            boolean z7 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z7 = false;
            }
            f21381d = Boolean.valueOf(z7);
        }
        return f21381d.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean j(PackageManager packageManager) {
        if (f21378a == null) {
            boolean z7 = false;
            if (m.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z7 = true;
            }
            f21378a = Boolean.valueOf(z7);
        }
        return f21378a.booleanValue();
    }
}
