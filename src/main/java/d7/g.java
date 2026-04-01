package d7;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection<y6.c0> f21019a = v6.h.e(v6.f.a(ServiceLoader.load(y6.c0.class, y6.c0.class.getClassLoader()).iterator()));

    public static final Collection<y6.c0> a() {
        return f21019a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
