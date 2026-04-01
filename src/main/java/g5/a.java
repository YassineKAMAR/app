package g5;

import io.flutter.embedding.engine.FlutterJNI;
import j5.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f22042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f22043f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f22044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i5.a f22045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FlutterJNI.c f22046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f22047d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f22048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i5.a f22049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private FlutterJNI.c f22050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ExecutorService f22051d;

        /* JADX INFO: renamed from: g5.a$b$a, reason: collision with other inner class name */
        private class ThreadFactoryC0112a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f22052a;

            private ThreadFactoryC0112a() {
                this.f22052a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i8 = this.f22052a;
                this.f22052a = i8 + 1;
                sb.append(i8);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f22050c == null) {
                this.f22050c = new FlutterJNI.c();
            }
            if (this.f22051d == null) {
                this.f22051d = Executors.newCachedThreadPool(new ThreadFactoryC0112a());
            }
            if (this.f22048a == null) {
                this.f22048a = new d(this.f22050c.a(), this.f22051d);
            }
        }

        public a a() {
            b();
            return new a(this.f22048a, this.f22049b, this.f22050c, this.f22051d);
        }
    }

    private a(d dVar, i5.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f22044a = dVar;
        this.f22045b = aVar;
        this.f22046c = cVar;
        this.f22047d = executorService;
    }

    public static a e() {
        f22043f = true;
        if (f22042e == null) {
            f22042e = new b().a();
        }
        return f22042e;
    }

    public i5.a a() {
        return this.f22045b;
    }

    public ExecutorService b() {
        return this.f22047d;
    }

    public d c() {
        return this.f22044a;
    }

    public FlutterJNI.c d() {
        return this.f22046c;
    }
}
