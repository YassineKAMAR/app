package a3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f104a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static l1 f105b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static HandlerThread f106c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Executor f107d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f108e = false;

    public static int a() {
        return 4225;
    }

    public static h b(Context context) {
        synchronized (f104a) {
            if (f105b == null) {
                f105b = new l1(context.getApplicationContext(), f108e ? c().getLooper() : context.getMainLooper(), f107d);
            }
        }
        return f105b;
    }

    public static HandlerThread c() {
        synchronized (f104a) {
            HandlerThread handlerThread = f106c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f106c = handlerThread2;
            handlerThread2.start();
            return f106c;
        }
    }

    protected abstract void d(g1 g1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i8, ServiceConnection serviceConnection, String str3, boolean z7) {
        d(new g1(str, str2, 4225, z7), serviceConnection, str3);
    }

    protected abstract boolean f(g1 g1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
