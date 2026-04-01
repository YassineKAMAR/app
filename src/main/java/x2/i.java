package x2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f27267a = 12451000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f27269c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f27270d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    static final AtomicBoolean f27268b = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f27271e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String b(int i8) {
        return b.v(i8);
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(Context context) {
        try {
            if (!f27270d) {
                try {
                    PackageInfo packageInfoF = f3.e.a(context).f("com.google.android.gms", 64);
                    j.a(context);
                    if (packageInfoF == null || j.e(packageInfoF, false) || !j.e(packageInfoF, true)) {
                        f27269c = false;
                    } else {
                        f27269c = true;
                    }
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e8);
                }
            }
            return f27269c || !e3.i.e();
        } finally {
            f27270d = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.i.f(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean g(Context context, int i8) {
        if (i8 == 18) {
            return true;
        }
        if (i8 == 1) {
            return k(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean h(Context context) {
        if (!e3.m.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        a3.o.j(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && com.amazon.a.a.o.b.ac.equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean i(int i8) {
        return i8 == 1 || i8 == 2 || i8 == 3 || i8 == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean j(Context context, int i8, String str) {
        return e3.r.b(context, i8, str);
    }

    @TargetApi(21)
    static boolean k(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (e3.m.f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !h(context);
    }
}
