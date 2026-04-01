package f7;

import d7.i0;
import d7.k0;
import java.util.concurrent.Executor;
import y6.b0;
import y6.b1;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends b1 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f21840d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b0 f21841e = m.f21861c.g0(k0.e("kotlinx.coroutines.io.parallelism", t6.l.b(64, i0.a()), 0, 0, 12, null));

    private b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // y6.b0
    public void e0(h6.g gVar, Runnable runnable) {
        f21841e.e0(gVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        e0(h6.h.f22443a, runnable);
    }

    @Override // y6.b0
    public String toString() {
        return "Dispatchers.IO";
    }
}
