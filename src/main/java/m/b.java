package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c<K, V> f24424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c<K, V> f24425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f24426c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24427d = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f24431d;
        }

        @Override // m.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f24430c;
        }
    }

    /* JADX INFO: renamed from: m.b$b, reason: collision with other inner class name */
    private static class C0146b<K, V> extends e<K, V> {
        C0146b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f24430c;
        }

        @Override // m.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f24431d;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f24428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final V f24429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c<K, V> f24430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c<K, V> f24431d;

        c(K k8, V v7) {
            this.f24428a = k8;
            this.f24429b = v7;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f24428a.equals(cVar.f24428a) && this.f24429b.equals(cVar.f24429b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f24428a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f24429b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f24428a.hashCode() ^ this.f24429b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v7) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f24428a + com.amazon.a.a.o.b.f.f3943b + this.f24429b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c<K, V> f24432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f24433b = true;

        d() {
        }

        @Override // m.b.f
        void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f24432a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f24431d;
                this.f24432a = cVar3;
                this.f24433b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f24433b) {
                this.f24433b = false;
                cVar = b.this.f24424a;
            } else {
                c<K, V> cVar2 = this.f24432a;
                cVar = cVar2 != null ? cVar2.f24430c : null;
            }
            this.f24432a = cVar;
            return this.f24432a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24433b) {
                return b.this.f24424a != null;
            }
            c<K, V> cVar = this.f24432a;
            return (cVar == null || cVar.f24430c == null) ? false : true;
        }
    }

    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c<K, V> f24435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c<K, V> f24436b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f24435a = cVar2;
            this.f24436b = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f24436b;
            c<K, V> cVar2 = this.f24435a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // m.b.f
        public void a(c<K, V> cVar) {
            if (this.f24435a == cVar && cVar == this.f24436b) {
                this.f24436b = null;
                this.f24435a = null;
            }
            c<K, V> cVar2 = this.f24435a;
            if (cVar2 == cVar) {
                this.f24435a = b(cVar2);
            }
            if (this.f24436b == cVar) {
                this.f24436b = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f24436b;
            this.f24436b = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24436b != null;
        }
    }

    public static abstract class f<K, V> {
        abstract void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f24424a;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0146b c0146b = new C0146b(this.f24425b, this.f24424a);
        this.f24426c.put(c0146b, Boolean.FALSE);
        return c0146b;
    }

    protected c<K, V> e(K k8) {
        c<K, V> cVar = this.f24424a;
        while (cVar != null && !cVar.f24428a.equals(k8)) {
            cVar = cVar.f24430c;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public b<K, V>.d g() {
        b<K, V>.d dVar = new d();
        this.f24426c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public Map.Entry<K, V> i() {
        return this.f24425b;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f24424a, this.f24425b);
        this.f24426c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    c<K, V> n(K k8, V v7) {
        c<K, V> cVar = new c<>(k8, v7);
        this.f24427d++;
        c<K, V> cVar2 = this.f24425b;
        if (cVar2 == null) {
            this.f24424a = cVar;
        } else {
            cVar2.f24430c = cVar;
            cVar.f24431d = cVar2;
        }
        this.f24425b = cVar;
        return cVar;
    }

    public V p(K k8, V v7) {
        c<K, V> cVarE = e(k8);
        if (cVarE != null) {
            return cVarE.f24429b;
        }
        n(k8, v7);
        return null;
    }

    public int size() {
        return this.f24427d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public V u(K k8) {
        c<K, V> cVarE = e(k8);
        if (cVarE == null) {
            return null;
        }
        this.f24427d--;
        if (!this.f24426c.isEmpty()) {
            Iterator<f<K, V>> it = this.f24426c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarE);
            }
        }
        c<K, V> cVar = cVarE.f24431d;
        c<K, V> cVar2 = cVarE.f24430c;
        if (cVar != null) {
            cVar.f24430c = cVar2;
        } else {
            this.f24424a = cVar2;
        }
        c<K, V> cVar3 = cVarE.f24430c;
        if (cVar3 != null) {
            cVar3.f24431d = cVar;
        } else {
            this.f24425b = cVar;
        }
        cVarE.f24430c = null;
        cVarE.f24431d = null;
        return cVarE.f24429b;
    }
}
