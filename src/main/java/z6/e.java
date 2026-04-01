package z6;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import e6.s;
import e6.t;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f27772a;
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            s.a aVar = s.f21442b;
            objB = s.b(new c(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            s.a aVar2 = s.f21442b;
            objB = s.b(t.a(th));
        }
        f27772a = (d) (s.g(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z7) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (!z7) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            objNewInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            q.d(objNewInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                objNewInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) objNewInstance;
    }
}
