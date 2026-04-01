package v3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import v3.o;
import v3.p;

/* JADX INFO: loaded from: classes.dex */
public class r<K, V> extends p<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient q<V> f26930c;

    public static final class a<K, V> extends p.a<K, V> {
        public r<K, V> a() {
            Collection collectionEntrySet = this.f26926a.entrySet();
            Comparator<? super K> comparator = this.f26927b;
            if (comparator != null) {
                collectionEntrySet = f0.a(comparator).d().b(collectionEntrySet);
            }
            return r.e(collectionEntrySet, this.f26928c);
        }
    }

    r(o<K, q<V>> oVar, int i8, Comparator<? super V> comparator) {
        super(oVar, i8);
        this.f26930c = d(comparator);
    }

    private static <V> q<V> d(Comparator<? super V> comparator) {
        return comparator == null ? q.A() : s.M(comparator);
    }

    static <K, V> r<K, V> e(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return f();
        }
        o.a aVar = new o.a(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            q qVarG = g(comparator, entry.getValue());
            if (!qVarG.isEmpty()) {
                aVar.e(key, qVarG);
                size += qVarG.size();
            }
        }
        return new r<>(aVar.b(), size, comparator);
    }

    public static <K, V> r<K, V> f() {
        return k.f26901d;
    }

    private static <V> q<V> g(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? q.x(collection) : s.I(comparator, collection);
    }
}
