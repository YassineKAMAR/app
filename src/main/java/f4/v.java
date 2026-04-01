package f4;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class v implements m4.d, m4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<m4.b<Object>, Executor>> f21774a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<m4.a<?>> f21775b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f21776c;

    v(Executor executor) {
        this.f21776c = executor;
    }

    private synchronized Set<Map.Entry<m4.b<Object>, Executor>> e(m4.a<?> aVar) {
        ConcurrentHashMap<m4.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f21774a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, m4.a aVar) {
        ((m4.b) entry.getKey()).a(aVar);
    }

    @Override // m4.c
    public void a(final m4.a<?> aVar) {
        d0.b(aVar);
        synchronized (this) {
            Queue<m4.a<?>> queue = this.f21775b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<m4.b<Object>, Executor> entry : e(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: f4.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.f(entry, aVar);
                    }
                });
            }
        }
    }

    @Override // m4.d
    public synchronized <T> void b(Class<T> cls, Executor executor, m4.b<? super T> bVar) {
        d0.b(cls);
        d0.b(bVar);
        d0.b(executor);
        if (!this.f21774a.containsKey(cls)) {
            this.f21774a.put(cls, new ConcurrentHashMap<>());
        }
        this.f21774a.get(cls).put(bVar, executor);
    }

    void d() {
        Queue<m4.a<?>> queue;
        synchronized (this) {
            queue = this.f21775b;
            if (queue != null) {
                this.f21775b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<m4.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }
}
