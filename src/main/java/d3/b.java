package d3;

import a3.m1;
import a3.o;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import e3.m;
import f3.e;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f20986b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile b f20987c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f20988a = new ConcurrentHashMap();

    private b() {
    }

    public static b b() {
        if (f20987c == null) {
            synchronized (f20986b) {
                if (f20987c == null) {
                    f20987c = new b();
                }
            }
        }
        b bVar = f20987c;
        o.j(bVar);
        return bVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i8, boolean z7, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i8, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f20988a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zH = h(context, intent, serviceConnection, i8, executor);
            if (zH) {
                return zH;
            }
            return false;
        } finally {
            this.f20988a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof m1);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i8, Executor executor) {
        return (!m.j() || executor == null) ? context.bindService(intent, serviceConnection, i8) : context.bindService(intent, i8, executor, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i8) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i8, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f20988a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f20988a.get(serviceConnection));
        } finally {
            this.f20988a.remove(serviceConnection);
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i8, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
