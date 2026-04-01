package v3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class k0<E> extends s<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final k0<Comparable> f26902f = new k0<>(n.y(), f0.c());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient n<E> f26903e;

    k0(n<E> nVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f26903e = nVar;
    }

    private int c0(Object obj) {
        return Collections.binarySearch(this.f26903e, obj, d0());
    }

    @Override // v3.s
    s<E> J() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f26931c);
        return isEmpty() ? s.M(comparatorReverseOrder) : new k0(this.f26903e.z(), comparatorReverseOrder);
    }

    @Override // v3.s, java.util.NavigableSet
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public q0<E> descendingIterator() {
        return this.f26903e.z().iterator();
    }

    @Override // v3.s
    s<E> P(E e8, boolean z7) {
        return Z(0, a0(e8, z7));
    }

    @Override // v3.s
    s<E> T(E e8, boolean z7, E e9, boolean z8) {
        return W(e8, z7).P(e9, z8);
    }

    @Override // v3.s
    s<E> W(E e8, boolean z7) {
        return Z(b0(e8, z7), size());
    }

    k0<E> Z(int i8, int i9) {
        return (i8 == 0 && i9 == size()) ? this : i8 < i9 ? new k0<>(this.f26903e.subList(i8, i9), this.f26931c) : s.M(this.f26931c);
    }

    @Override // v3.m
    int a(Object[] objArr, int i8) {
        return this.f26903e.a(objArr, i8);
    }

    int a0(E e8, boolean z7) {
        int iBinarySearch = Collections.binarySearch(this.f26903e, u3.h.i(e8), comparator());
        return iBinarySearch >= 0 ? z7 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    int b0(E e8, boolean z7) {
        int iBinarySearch = Collections.binarySearch(this.f26903e, u3.h.i(e8), comparator());
        return iBinarySearch >= 0 ? z7 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // v3.s, java.util.NavigableSet
    public E ceiling(E e8) {
        int iB0 = b0(e8, true);
        if (iB0 == size()) {
            return null;
        }
        return this.f26903e.get(iB0);
    }

    @Override // v3.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return c0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof b0) {
            collection = ((b0) collection).h();
        }
        if (!o0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        q0<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iX = X(next2, next);
                if (iX < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iX == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iX > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    Comparator<Object> d0() {
        return this.f26931c;
    }

    @Override // v3.m
    Object[] e() {
        return this.f26903e.e();
    }

    @Override // v3.q, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!o0.b(this.f26931c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            q0<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || X(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // v3.s, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f26903e.get(0);
    }

    @Override // v3.s, java.util.NavigableSet
    public E floor(E e8) {
        int iA0 = a0(e8, true) - 1;
        if (iA0 == -1) {
            return null;
        }
        return this.f26903e.get(iA0);
    }

    @Override // v3.m
    int g() {
        return this.f26903e.g();
    }

    @Override // v3.s, java.util.NavigableSet
    public E higher(E e8) {
        int iB0 = b0(e8, false);
        if (iB0 == size()) {
            return null;
        }
        return this.f26903e.get(iB0);
    }

    @Override // v3.m
    int i() {
        return this.f26903e.i();
    }

    @Override // v3.s, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f26903e.get(size() - 1);
    }

    @Override // v3.s, java.util.NavigableSet
    public E lower(E e8) {
        int iA0 = a0(e8, false) - 1;
        if (iA0 == -1) {
            return null;
        }
        return this.f26903e.get(iA0);
    }

    @Override // v3.m
    boolean n() {
        return this.f26903e.n();
    }

    @Override // v3.s, v3.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p */
    public q0<E> iterator() {
        return this.f26903e.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f26903e.size();
    }
}
