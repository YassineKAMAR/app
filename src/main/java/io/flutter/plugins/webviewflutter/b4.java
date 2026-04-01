package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Object, Long> f23388a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<Long, WeakReference<Object>> f23389b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<Long, Object> f23390c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<Object> f23391d = new ReferenceQueue<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<WeakReference<Object>, Long> f23392e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f23393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f23394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23396i;

    public interface a {
        void a(long j8);
    }

    private b4(a aVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f23393f = handler;
        this.f23395h = 65536L;
        this.f23396i = false;
        this.f23394g = aVar;
        handler.postDelayed(new a4(this), 3000L);
    }

    private void d(Object obj, long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(String.format("Identifier must be >= 0: %d", Long.valueOf(j8)));
        }
        if (this.f23389b.containsKey(Long.valueOf(j8))) {
            throw new IllegalArgumentException(String.format("Identifier has already been added: %d", Long.valueOf(j8)));
        }
        WeakReference<Object> weakReference = new WeakReference<>(obj, this.f23391d);
        this.f23388a.put(obj, Long.valueOf(j8));
        this.f23389b.put(Long.valueOf(j8), weakReference);
        this.f23392e.put(weakReference, Long.valueOf(j8));
        this.f23390c.put(Long.valueOf(j8), obj);
    }

    public static b4 g(a aVar) {
        return new b4(aVar);
    }

    private void k() {
        if (j()) {
            Log.w("InstanceManager", "The manager was used after calls to the FinalizationListener have been stopped.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (j()) {
            return;
        }
        while (true) {
            WeakReference weakReference = (WeakReference) this.f23391d.poll();
            if (weakReference == null) {
                this.f23393f.postDelayed(new a4(this), 3000L);
                return;
            }
            Long lRemove = this.f23392e.remove(weakReference);
            if (lRemove != null) {
                this.f23389b.remove(lRemove);
                this.f23390c.remove(lRemove);
                this.f23394g.a(lRemove.longValue());
            }
        }
    }

    public void b(Object obj, long j8) {
        k();
        d(obj, j8);
    }

    public long c(Object obj) {
        k();
        if (!f(obj)) {
            long j8 = this.f23395h;
            this.f23395h = 1 + j8;
            d(obj, j8);
            return j8;
        }
        throw new IllegalArgumentException("Instance of " + obj.getClass() + " has already been added.");
    }

    public void e() {
        this.f23388a.clear();
        this.f23389b.clear();
        this.f23390c.clear();
        this.f23392e.clear();
    }

    public boolean f(Object obj) {
        k();
        return this.f23388a.containsKey(obj);
    }

    public Long h(Object obj) {
        k();
        Long l8 = this.f23388a.get(obj);
        if (l8 != null) {
            this.f23390c.put(l8, obj);
        }
        return l8;
    }

    public <T> T i(long j8) {
        k();
        WeakReference<Object> weakReference = this.f23389b.get(Long.valueOf(j8));
        if (weakReference != null) {
            return (T) weakReference.get();
        }
        return null;
    }

    public boolean j() {
        return this.f23396i;
    }

    public <T> T m(long j8) {
        k();
        return (T) this.f23390c.remove(Long.valueOf(j8));
    }

    public void n() {
        this.f23393f.removeCallbacks(new a4(this));
        this.f23396i = true;
    }
}
