package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1870c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Set<String> f1871d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f1872e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f1874b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private o0(Context context) {
        this.f1873a = context;
        this.f1874b = (NotificationManager) context.getSystemService("notification");
    }

    public static o0 b(Context context) {
        return new o0(context);
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f1874b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f1873a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f1873a.getApplicationInfo();
        String packageName = this.f1873a.getApplicationContext().getPackageName();
        int i8 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i8), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
