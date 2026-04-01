package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class g<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    g<K, V>.b f25437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g<K, V>.c f25438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    g<K, V>.e f25439c;

    final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f25440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f25443d = false;

        a(int i8) {
            this.f25440a = i8;
            this.f25441b = g.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25442c < this.f25441b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t7 = (T) g.this.b(this.f25442c, this.f25440a);
            this.f25442c++;
            this.f25443d = true;
            return t7;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f25443d) {
                throw new IllegalStateException();
            }
            int i8 = this.f25442c - 1;
            this.f25442c = i8;
            this.f25441b--;
            this.f25443d = false;
            g.this.h(i8);
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iD = g.this.d();
            for (Map.Entry<K, V> entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return iD != g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = g.this.e(entry.getKey());
            if (iE < 0) {
                return false;
            }
            return p.d.c(g.this.b(iE, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = g.this.d() - 1; iD >= 0; iD--) {
                Object objB = g.this.b(iD, 0);
                Object objB2 = g.this.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k8) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return g.j(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = g.this.d() - 1; iD >= 0; iD--) {
                Object objB = g.this.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = g.this.e(obj);
            if (iE < 0) {
                return false;
            }
            g.this.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return g.o(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return g.p(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return g.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.r(tArr, 0);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25447a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f25449c = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25448b = -1;

        d() {
            this.f25447a = g.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f25448b++;
            this.f25449c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f25449c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return p.d.c(entry.getKey(), g.this.b(this.f25448b, 0)) && p.d.c(entry.getValue(), g.this.b(this.f25448b, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f25449c) {
                return (K) g.this.b(this.f25448b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f25449c) {
                return (V) g.this.b(this.f25448b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25448b < this.f25447a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f25449c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = g.this.b(this.f25448b, 0);
            Object objB2 = g.this.b(this.f25448b, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f25449c) {
                throw new IllegalStateException();
            }
            g.this.h(this.f25448b);
            this.f25448b--;
            this.f25447a--;
            this.f25449c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v7) {
            if (this.f25449c) {
                return (V) g.this.i(this.f25448b, v7);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + com.amazon.a.a.o.b.f.f3943b + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v7) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iF = g.this.f(obj);
            if (iF < 0) {
                return false;
            }
            g.this.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iD = g.this.d();
            int i8 = 0;
            boolean z7 = false;
            while (i8 < iD) {
                if (collection.contains(g.this.b(i8, 1))) {
                    g.this.h(i8);
                    i8--;
                    iD--;
                    z7 = true;
                }
                i8++;
            }
            return z7;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iD = g.this.d();
            int i8 = 0;
            boolean z7 = false;
            while (i8 < iD) {
                if (!collection.contains(g.this.b(i8, 1))) {
                    g.this.h(i8);
                    i8--;
                    iD--;
                    z7 = true;
                }
                i8++;
            }
            return z7;
        }

        @Override // java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return g.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.r(tArr, 1);
        }
    }

    g() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i8, int i9);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k8, V v7);

    protected abstract void h(int i8);

    protected abstract V i(int i8, V v7);

    public Set<Map.Entry<K, V>> l() {
        if (this.f25437a == null) {
            this.f25437a = new b();
        }
        return this.f25437a;
    }

    public Set<K> m() {
        if (this.f25438b == null) {
            this.f25438b = new c();
        }
        return this.f25438b;
    }

    public Collection<V> n() {
        if (this.f25439c == null) {
            this.f25439c = new e();
        }
        return this.f25439c;
    }

    public Object[] q(int i8) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i9 = 0; i9 < iD; i9++) {
            objArr[i9] = b(i9, i8);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i8) {
        int iD = d();
        if (tArr.length < iD) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iD));
        }
        for (int i9 = 0; i9 < iD; i9++) {
            tArr[i9] = b(i9, i8);
        }
        if (tArr.length > iD) {
            tArr[iD] = null;
        }
        return tArr;
    }
}
