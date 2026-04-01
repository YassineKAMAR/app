package s7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f26274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f26275b;

    static {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        q.e(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
        f26274a = executorServiceNewCachedThreadPool;
        f26275b = new Handler(Looper.getMainLooper());
    }

    public static final Executor a() {
        return f26274a;
    }

    public static final Handler b() {
        return f26275b;
    }
}
