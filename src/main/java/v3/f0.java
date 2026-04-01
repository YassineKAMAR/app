package v3;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0<T> implements Comparator<T> {
    protected f0() {
    }

    public static <T> f0<T> a(Comparator<T> comparator) {
        return comparator instanceof f0 ? (f0) comparator : new j(comparator);
    }

    public static <C extends Comparable> f0<C> c() {
        return c0.f26850a;
    }

    public <E extends T> n<E> b(Iterable<E> iterable) {
        return n.A(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t7, T t8);

    <T2 extends T> f0<Map.Entry<T2, ?>> d() {
        return (f0<Map.Entry<T2, ?>>) e(y.b());
    }

    public <F> f0<F> e(u3.c<F, ? extends T> cVar) {
        return new e(cVar, this);
    }
}
