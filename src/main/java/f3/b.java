package f3;

import android.content.Context;
import e3.m;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f21702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f21703b;

    public static synchronized boolean a(Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f21702a;
        if (context2 != null && (bool = f21703b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f21703b = null;
        if (!m.i()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f21703b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
                f21703b = boolValueOf;
            }
            f21702a = applicationContext;
            return f21703b.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f21703b = boolValueOf;
        f21702a = applicationContext;
        return f21703b.booleanValue();
    }
}
