package f4;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class y<T> implements o4.b<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set<T> f21781b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set<o4.b<T>> f21780a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection<o4.b<T>> collection) {
        this.f21780a.addAll(collection);
    }

    static y<?> b(Collection<o4.b<?>> collection) {
        return new y<>((Set) collection);
    }

    private synchronized void d() {
        Iterator<o4.b<T>> it = this.f21780a.iterator();
        while (it.hasNext()) {
            this.f21781b.add(it.next().get());
        }
        this.f21780a = null;
    }

    synchronized void a(o4.b<T> bVar) {
        Set set;
        if (this.f21781b == null) {
            set = this.f21780a;
        } else {
            set = this.f21781b;
            bVar = (o4.b<T>) bVar.get();
        }
        set.add(bVar);
    }

    @Override // o4.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f21781b == null) {
            synchronized (this) {
                if (this.f21781b == null) {
                    this.f21781b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f21781b);
    }
}
