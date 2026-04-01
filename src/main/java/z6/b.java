package z6;

import android.os.Build;
import h6.g;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import y6.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends h6.a implements c0 {
    private volatile Object _preHandler;

    public b() {
        super(c0.U);
        this._preHandler = this;
    }

    private final Method e0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z7 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z7 = true;
                }
            }
            if (z7) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // y6.c0
    public void t(g gVar, Throwable th) {
        int i8 = Build.VERSION.SDK_INT;
        if (26 <= i8 && i8 < 28) {
            Method methodE0 = e0();
            Object objInvoke = methodE0 != null ? methodE0.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
