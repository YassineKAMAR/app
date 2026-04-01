package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f2696a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Closeable> f2697b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f2698c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    final void a() {
        this.f2698c = true;
        Map<String, Object> map = this.f2696a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f2696a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        Set<Closeable> set = this.f2697b;
        if (set != null) {
            synchronized (set) {
                Iterator<Closeable> it2 = this.f2697b.iterator();
                while (it2.hasNext()) {
                    b(it2.next());
                }
            }
        }
        d();
    }

    <T> T c(String str) {
        T t7;
        Map<String, Object> map = this.f2696a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t7 = (T) this.f2696a.get(str);
        }
        return t7;
    }

    protected void d() {
    }
}
