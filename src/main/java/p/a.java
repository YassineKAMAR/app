package p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g<K, V> f25404h;

    /* JADX INFO: renamed from: p.a$a, reason: collision with other inner class name */
    class C0156a extends g<K, V> {
        C0156a() {
        }

        @Override // p.g
        protected void a() {
            a.this.clear();
        }

        @Override // p.g
        protected Object b(int i8, int i9) {
            return a.this.f25457b[(i8 << 1) + i9];
        }

        @Override // p.g
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // p.g
        protected int d() {
            return a.this.f25458c;
        }

        @Override // p.g
        protected int e(Object obj) {
            return a.this.g(obj);
        }

        @Override // p.g
        protected int f(Object obj) {
            return a.this.i(obj);
        }

        @Override // p.g
        protected void g(K k8, V v7) {
            a.this.put(k8, v7);
        }

        @Override // p.g
        protected void h(int i8) {
            a.this.l(i8);
        }

        @Override // p.g
        protected V i(int i8, V v7) {
            return a.this.m(i8, v7);
        }
    }

    public a() {
    }

    public a(int i8) {
        super(i8);
    }

    private g<K, V> o() {
        if (this.f25404h == null) {
            this.f25404h = new C0156a();
        }
        return this.f25404h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return o().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return o().m();
    }

    public boolean p(Collection<?> collection) {
        return g.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f25458c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return o().n();
    }
}
