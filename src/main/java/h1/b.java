package h1;

import android.os.Handler;
import android.os.Looper;
import g1.i;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b implements h1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f22136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22137b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f22138c = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f22136a = new i(executor);
    }

    @Override // h1.a
    public Executor a() {
        return this.f22138c;
    }

    @Override // h1.a
    public void b(Runnable runnable) {
        this.f22136a.execute(runnable);
    }

    @Override // h1.a
    public i c() {
        return this.f22136a;
    }

    public void d(Runnable runnable) {
        this.f22137b.post(runnable);
    }
}
